package UI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Database.DBController;
import Database.EventsDA;
import Entity.BuildTableModel;

import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.Font;


public class DayEventView extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayEventView frame = new DayEventView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws SQLException 
	 */
	@SuppressWarnings("null")
	public DayEventView() throws FileNotFoundException, IOException, SQLException {
		setTitle("View Events");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setState(JFrame.NORMAL);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ResultSet rs = null;
		String name = null, time, date = Events.Date, description, location;
		DBController db=new DBController();
		
		String dbQuery = "SELECT name, time, date, description, location FROM events WHERE date='" + date + "'";
		
		rs = db.readRequest(dbQuery);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton button = new JButton(back);
		button.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JLabel lblTodaysDate = new JLabel("Today's Date");
		lblTodaysDate.setFont(new Font("Roboto Condensed", Font.PLAIN, 15));
		lblTodaysDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodaysDate.setBounds(109, 11, 315, 23);
		String selecteddate = Events.Date;
		contentPane.add(lblTodaysDate);
		lblTodaysDate.setText(selecteddate);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 414, 8);
		contentPane.add(separator);
		
		DefaultTableModel model = BuildTableModel.buildTableModel(rs);
		JTable table = new JTable(model);
		table.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		table.setEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.getColumnModel().getColumn(1).setPreferredWidth(128);
		table.getColumnModel().getColumn(1).setMaxWidth(2147483637);
		table.getColumnModel().getColumn(3).setPreferredWidth(104);
		table.setBounds(10, 55, 399, 195);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 55, 414, 195);
		contentPane.add(scrollPane);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Events event = new Events();
				setVisible(false);
				event.setVisible(true);
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
			    if (e.getClickCount() == 1) {
			    	int row = 0, column = 0;
			    	String event = null;
			      
			      row = table.getSelectedRow();
			      column = table.getSelectedColumn();
			      event = table.getValueAt(row, 3).toString();
			      System.out.println(row);
			      System.out.println(event);
			      
			      String attendees = EventsDA.returnAttendee(event);
			      
				  JOptionPane.showMessageDialog(DayEventView.this, "People attending " + event + ":\n\n" + attendees);
			    }
			  }
			});
	}
}

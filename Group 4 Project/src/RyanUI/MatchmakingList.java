package RyanUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Database.DBController;
import Database.MatchmakingDA;

public class MatchmakingList extends JFrame {

	private JPanel contentPane;
	public static String partner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchmakingList frame = new MatchmakingList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public MatchmakingList() throws SQLException {
		setTitle("Matchmaking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ResultSet rs = MatchmakingDA.returnDetails(Matchmaking.preferedage, Matchmaking.preferedgender);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton button = new JButton(back);
		button.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 414, 8);
		contentPane.add(separator);
		
		ListTableModel model = ListTableModel.createModelFromResultSet(rs);
		JTable table = new JTable(model);
		table.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		table.setEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.getColumnModel().getColumn(1).setPreferredWidth(128);
		table.getColumnModel().getColumn(1).setMaxWidth(2147483637);
		table.setBounds(10, 55, 399, 195);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 55, 414, 195);
		contentPane.add(scrollPane);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Matchmaking matchmaking = null;
				try {
					matchmaking = new Matchmaking();
				} catch (IOException | FontFormatException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				matchmaking.setVisible(true);
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
			    if (e.getClickCount() == 1) {
			    	int row = 0, column = 0;
			      
			      row = table.getSelectedRow();
			      column = table.getSelectedColumn();
			      partner = table.getValueAt(row, 0).toString();
			      System.out.println(partner);
			      
			      int reply = JOptionPane.showConfirmDialog(MatchmakingList.this, "You have selected " + partner +" as your partner.\n\nDo you wish to continue?", "Alert", JOptionPane.YES_NO_OPTION);
			      if (reply == JOptionPane.YES_OPTION) {
			    	  PrivateChat privatechat = null;
					try {
						privatechat = new PrivateChat();
					} catch (FontFormatException | IOException e1) {
						e1.printStackTrace();
					}
			    	  setVisible(false);
			    	  privatechat.setVisible(true);
			      }
			      else {
			    	  JOptionPane.getRootFrame().dispose();
			      }
			    }
			  }
			});
	}

}

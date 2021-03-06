package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.MutableComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Database.DBController;
import Database.EventsDA;

public class DayEventDelete extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private String selectedevent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayEventDelete frame = new DayEventDelete();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DayEventDelete() {
		setTitle("Delete Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setState(JFrame.NORMAL);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton button = new JButton(back);
		button.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JLabel lblTodaysDate = new JLabel("Today's Date");
		lblTodaysDate.setFont(new Font("Roboto Condensed", Font.PLAIN, 15));
		lblTodaysDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodaysDate.setBounds(109, 15, 296, 14);
		String selecteddate = Events.Date;
		contentPane.add(lblTodaysDate);
		lblTodaysDate.setText(selecteddate);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 414, 8);
		contentPane.add(separator);
		
		JLabel lblSelectTimeslot = new JLabel("Select Timeslot:");
		lblSelectTimeslot.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblSelectTimeslot.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectTimeslot.setBounds(10, 61, 95, 14);
		contentPane.add(lblSelectTimeslot);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"6AM to 7AM", "7AM to 8AM", "8AM to 9AM", "9AM to 10AM", "10AM to 11AM", "11AM to 12PM", "12PM to 1PM", "1PM to 2PM", "2PM to 3PM", "3PM to 4PM", "4PM to 5PM", "5PM to 6PM", "6PM to 7PM", "7PM to 8PM", "8PM to 9PM", "9PM to 10PM", "10PM to 11PM", "11PM to 12PM"}));
		comboBox.setMaximumRowCount(18);
		comboBox.setBounds(109, 60, 133, 17);
		contentPane.add(comboBox);
		
		ImageIcon delete = new ImageIcon("Images/deleteevent.png");
		JButton btnDelete = new JButton(delete);
		btnDelete.setEnabled(false);
		btnDelete.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnDelete.setBounds(136, 198, 169, 23);
		contentPane.add(btnDelete);
		
		JLabel lblSelectEvent = new JLabel("Name of Event:");
		lblSelectEvent.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblSelectEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectEvent.setBounds(10, 86, 89, 14);
		contentPane.add(lblSelectEvent);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocation.setBounds(10, 115, 89, 14);
		contentPane.add(lblLocation);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(109, 113, 133, 17);
		contentPane.add(textField_2);
		
		JLabel lblNameOfOrganiser = new JLabel("Name of Organiser:");
		lblNameOfOrganiser.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameOfOrganiser.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblNameOfOrganiser.setBounds(10, 143, 89, 14);
		contentPane.add(lblNameOfOrganiser);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(109, 141, 133, 17);
		contentPane.add(textField_3);
		
		ImageIcon validate = new ImageIcon("Images/validate.png");
		JButton btnValidateUser = new JButton(validate);
		btnValidateUser.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnValidateUser.setBounds(262, 138, 162, 23);
		contentPane.add(btnValidateUser);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		comboBox_1.setBounds(109, 84, 133, 18);
		contentPane.add(comboBox_1);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Events event = new Events();
				setVisible(false);
				event.setVisible(true);
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				((DefaultComboBoxModel<String>)comboBox_1.getModel()).removeAllElements();
				textField_2.setText("");
				textField_3.setText("");
				
				String selectedtime = comboBox.getSelectedItem().toString();
				
				MutableComboBoxModel<String> model = (DefaultComboBoxModel<String>)comboBox_1.getModel();
				
				String events = EventsDA.returnAllEvents(selectedtime);
				
				model.addElement(events);
			}
		});
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedtime = comboBox.getSelectedItem().toString();
				String selectedevent = comboBox_1.getSelectedItem().toString();
				
				String name = EventsDA.returnEventOrganiser(selectedtime, selectedevent);
				String location = EventsDA.returnEventLocation(selectedtime, selectedevent);
				
				textField_2.setText(location);
				textField_3.setText(name);
			}
		});
		
		btnValidateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String organiser = textField_3.getText();
				String name = Login.user;
				
				if (name.equals(organiser)) {
					btnDelete.setEnabled(true);
				}
				else if (name.equals("Admin")) {
					btnDelete.setEnabled(true);
				}
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(DayEventDelete.this, "Are you sure?\n\nThis will PERMANENTLY delete your booking","Alert", JOptionPane.OK_CANCEL_OPTION);
				System.out.print(result);
				
				if (result == 0) {
					EventsDA.deleteEvent();
				}
			}
		});
	}
}

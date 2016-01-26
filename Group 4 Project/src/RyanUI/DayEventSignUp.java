package RyanUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Database.DBController;
import Database.SignUpConstructor;
import Database.SignUpDA;
import Main.Login;

import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import java.awt.Font;

public class DayEventSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayEventSignUp frame = new DayEventSignUp();
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
	public DayEventSignUp() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"6AM to 7AM", "7AM to 8AM", "8AM to 9AM", "9AM to 10AM", "10AM to 11AM", "11AM to 12PM", "12PM to 1PM", "1PM to 2PM", "2PM to 3PM", "3PM to 4PM", "4PM to 5PM", "5PM to 6PM", "6PM to 7PM", "7PM to 8PM", "8PM to 9PM", "9PM to 10PM", "10PM to 11PM", "11PM to 12PM"}));
		comboBox.setMaximumRowCount(18);
		comboBox.setBounds(109, 60, 133, 17);
		contentPane.add(comboBox);
		
		JLabel lblDetails = new JLabel("Name:");
		lblDetails.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblDetails.setBounds(10, 204, 95, 14);
		contentPane.add(lblDetails);
		
		textField = new JTextField();
		textField.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		textField.setEditable(false);
		textField.setBounds(109, 202, 133, 17);
		textField.setText(Login.user);
		contentPane.add(textField);
		textField.setColumns(10);
		
		ImageIcon going = new ImageIcon("Images/going.png");
		JButton btnIAmGoing = new JButton(going);
		btnIAmGoing.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnIAmGoing.setBounds(285, 200, 120, 23);
		contentPane.add(btnIAmGoing);
		
		JLabel lblSelectEvent = new JLabel("Name of Event:");
		lblSelectEvent.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblSelectEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectEvent.setBounds(10, 86, 89, 14);
		contentPane.add(lblSelectEvent);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		textField_1.setEditable(false);
		textField_1.setBounds(109, 85, 133, 17);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocation.setBounds(10, 115, 89, 14);
		contentPane.add(lblLocation);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
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
		textField_3.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(109, 141, 133, 17);
		contentPane.add(textField_3);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Events event = new Events();
				setVisible(false);
				event.setVisible(true);
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String selectedtime = comboBox.getSelectedItem().toString();
				
				ResultSet rs = null;
				String name = null, date = Events.Date, description = null, location = null;
				DBController db=new DBController();
				
				String dbQuery = "SELECT * FROM events WHERE date='" + date + "' AND time='" + selectedtime + "'";
				
				rs = db.readRequest(dbQuery);
				
				try {
					while (rs.next()) {
					    name = rs.getString("name");
					    date = rs.getString("date");
					    description = rs.getString("description");
					    location = rs.getString("location");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				textField_1.setText(description);
				textField_2.setText(location);
				textField_3.setText(name);
				
				
			}
		});
		
		btnIAmGoing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String attendee = textField.getText();
				String event = textField_1.getText();
				String databaseAttendee = null;
				String databaseEvent = null;
				DBController db=new DBController();
				ResultSet rs2;
				
				String dbQuery = "SELECT * FROM attendee WHERE attendee='" + attendee + "' AND event='" + event + "'";
				
				rs2 = db.readRequest(dbQuery);
				
				try {
					while (rs2.next()) {
					    databaseAttendee = rs2.getString("attendee");
					    databaseEvent = rs2.getString("event");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				String organisername = textField_3.getText();
				
				if (attendee.equals(organisername)) {
					JOptionPane.showMessageDialog(DayEventSignUp.this, "You are the organiser of this event!");
				}
				else if (event.equals("")) {
					JOptionPane.showMessageDialog(DayEventSignUp.this, "No such event!");
				}
				else {
					if (attendee.equals(databaseAttendee) && event.equals(databaseEvent)) {
						JOptionPane.showMessageDialog(DayEventSignUp.this, "You are already signed up for this event!");
					}
					else {
						SignUpConstructor constructor = new SignUpConstructor(attendee, event);
						int id= SignUpDA.signup(constructor);
						
						if (id>0) {
				    		constructor.setId(id);
				    		JOptionPane.showMessageDialog(DayEventSignUp.this, "You are going!");
				    		//System.out.println("Entry was created");
				    	}
					}
				}
			}
		});
	}
}

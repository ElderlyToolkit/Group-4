package RyanUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Database.DBController;
import Database.EventsDA;
import Entity.EventConsructor;
import Main.Login;

import javax.swing.JTextField;
import java.awt.Font;

public class DayEventCreate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayEventCreate frame = new DayEventCreate();
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
	public DayEventCreate() {
		setTitle("Create Event");
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
		lblTodaysDate.setBounds(109, 15, 313, 14);
		String selecteddate = Events.Date;
		contentPane.add(lblTodaysDate);
		lblTodaysDate.setText(selecteddate);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 414, 8);
		contentPane.add(separator);
		
		ImageIcon createevent = new ImageIcon("Images/createevent.png");
		JButton btnSave = new JButton(createevent);
		btnSave.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnSave.setBounds(168, 194, 127, 23);
		contentPane.add(btnSave);
		
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
		
		ImageIcon checkavail = new ImageIcon("Images/checkavail.png");
		
		JLabel lblNameOfEvent = new JLabel("Name of Event:");
		lblNameOfEvent.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblNameOfEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameOfEvent.setBounds(10, 88, 95, 14);
		contentPane.add(lblNameOfEvent);
		
		textField = new JTextField();
		textField.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		textField.setBounds(109, 88, 133, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocation.setBounds(10, 115, 95, 14);
		contentPane.add(lblLocation);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(109, 115, 133, 17);
		contentPane.add(textField_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(10, 147, 95, 14);
		contentPane.add(lblName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(109, 145, 133, 17);
		textField_2.setText(Login.user);
		contentPane.add(textField_2);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Events event = new Events();
				setVisible(false);
				event.setVisible(true);
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = 0;
				String name = textField_2.getText();
				String time = comboBox.getSelectedItem().toString();
				String description = textField.getText();
				String location = textField_1.getText();
				String organiser = textField_2.getText();
				String date = lblTodaysDate.getText();
				
				EventConsructor constructor = new EventConsructor(name, time, date, description, location, organiser);
				id= EventsDA.createEvent(constructor);
				
				if (id>0) {
		    		constructor.setId(id);
		    		JOptionPane.showMessageDialog(DayEventCreate.this, "Event created!");
		    		//System.out.println("Entry was created");
		    	}
			}
		});
	}
}

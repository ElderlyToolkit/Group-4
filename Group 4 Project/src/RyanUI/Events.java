package RyanUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Events extends JFrame {

	protected static String Date = null;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Events frame = new Events();
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
	public Events() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(10, 45, 414, 103);
		contentPane.add(imagelabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(100, 159, 252, 20);
		contentPane.add(dateChooser);
		
		JButton button = new JButton("< Back");
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(100, 190, 252, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSelectedDate = new JLabel("Selected Date:");
		lblSelectedDate.setBounds(24, 193, 75, 14);
		contentPane.add(lblSelectedDate);
		
		JButton btnViewEvents = new JButton("View Events");
		btnViewEvents.setBounds(153, 221, 141, 23);
		contentPane.add(btnViewEvents);
		
		dateChooser.addPropertyChangeListener (new PropertyChangeListener() {
			public void propertyChange (PropertyChangeEvent e) {
				
				if ("date".equals(e.getPropertyName())) {
	                System.out.println(e.getPropertyName() + ": " + (Date) e.getNewValue());
	                String output = e.getPropertyName() + ": " + (Date) e.getNewValue();
	                Date = output.substring(6, 16);
	                textField.setText(Date);
			}
			}
		});
		
		btnViewEvents.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				DayEvent dayevent = null;
				try {
					dayevent = new DayEvent();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				dayevent.setVisible(true);
			}
		});
	}
}

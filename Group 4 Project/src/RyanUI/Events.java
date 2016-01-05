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
import java.awt.Font;

public class Events extends JFrame {

	protected static String Date = null;
	private JPanel contentPane;

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
		dateChooser.setBounds(66, 159, 319, 20);
		contentPane.add(dateChooser);
		
		JButton button = new JButton("< Back");
		button.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JButton btnSignUpFor = new JButton("Sign Up for Events");
		btnSignUpFor.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnSignUpFor.setBounds(239, 190, 146, 23);
		contentPane.add(btnSignUpFor);
		
		JButton button_2 = new JButton("View Events");
		button_2.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		button_2.setBounds(66, 190, 146, 23);
		contentPane.add(button_2);
		
		JButton btnCreateAnEvent = new JButton("Create an Event");
		btnCreateAnEvent.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnCreateAnEvent.setBounds(66, 224, 146, 23);
		contentPane.add(btnCreateAnEvent);
		
		JButton btnDeleteAnEvent = new JButton("Delete an Event");
		btnDeleteAnEvent.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnDeleteAnEvent.setBounds(239, 224, 146, 23);
		contentPane.add(btnDeleteAnEvent);
		
		dateChooser.addPropertyChangeListener (new PropertyChangeListener() {
			public void propertyChange (PropertyChangeEvent e) {
				
				if ("date".equals(e.getPropertyName())) {
	                System.out.println(e.getPropertyName() + ": " + (Date) e.getNewValue());
	                String output = e.getPropertyName() + ": " + (Date) e.getNewValue();
			}
			}
		});
	}
}

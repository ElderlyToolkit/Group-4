package RyanUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import com.toedter.calendar.JDateChooser;
import Main.Homepage;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class Events extends JFrame {

	public static String Date = null;
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
		setTitle("Events");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setState(JFrame.NORMAL);
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
		dateChooser.setBounds(10, 159, 414, 20);
		Date date = new Date();
		dateChooser.setDate(date);
		System.out.println(date);
		//Date = date.toString().substring(0, 10);
		contentPane.add(dateChooser);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton button = new JButton(back);
		button.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		ImageIcon signup = new ImageIcon("Images/signup.png");
		JButton btnSignUpFor = new JButton(signup);
		btnSignUpFor.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnSignUpFor.setBounds(229, 190, 195, 23);
		contentPane.add(btnSignUpFor);
		
		ImageIcon view = new ImageIcon("Images/view.png");
		JButton button_2 = new JButton(view);
		button_2.setBorder(BorderFactory.createEmptyBorder());
		button_2.setContentAreaFilled(false);
		button_2.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		button_2.setBounds(10, 190, 195, 23);
		contentPane.add(button_2);
		
		ImageIcon create = new ImageIcon("Images/create.png");
		JButton btnCreateAnEvent = new JButton(create);
		btnCreateAnEvent.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnCreateAnEvent.setBounds(10, 224, 195, 23);
		contentPane.add(btnCreateAnEvent);
		
		ImageIcon delete = new ImageIcon("Images/delete.png");
		JButton btnDeleteAnEvent = new JButton(delete);
		btnDeleteAnEvent.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnDeleteAnEvent.setBounds(229, 224, 195, 23);
		contentPane.add(btnDeleteAnEvent);
		
		dateChooser.addPropertyChangeListener (new PropertyChangeListener() {
			public void propertyChange (PropertyChangeEvent e) {
				if ("date".equals(e.getPropertyName())) {
	                System.out.println("Updated Date: " + (Date) e.getNewValue());
	                String output = "Updated Date: " + (Date) e.getNewValue();
	                Date = output.substring(14, 24);
			}
			}
		});
		
		btnSignUpFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DayEventSignUp signup = new DayEventSignUp();
				setVisible(false);
				signup.setVisible(true);
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DayEventView view = null;
				try {
					view = new DayEventView();
				} catch (IOException | SQLException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				view.setVisible(true);
			}
		});
		
		btnCreateAnEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DayEventCreate create = new DayEventCreate();
				setVisible(false);
				create.setVisible(true);
			}
		});
		
		btnDeleteAnEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DayEventDelete delete = new DayEventDelete();
				setVisible(false);
				delete.setVisible(true);
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage home = new Homepage();
				setVisible(false);
				home.setVisible(true);
			}
		});
	}
}

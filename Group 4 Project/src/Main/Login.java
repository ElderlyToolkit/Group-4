package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Database.DBController;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(16, 54, 408, 103);
		contentPane.add(imagelabel);
		
		JButton btnCreateAnAccount = new JButton("New Users");
		btnCreateAnAccount.setBounds(44, 188, 123, 23);
		contentPane.add(btnCreateAnAccount);
		
		JButton btnExistingUsers = new JButton("Existing Users");
		btnExistingUsers.setBounds(277, 188, 122, 23);
		contentPane.add(btnExistingUsers);
		
		JButton button = new JButton("< Back");
		button.setBounds(16, 11, 89, 23);
		contentPane.add(button);
		
		btnCreateAnAccount.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				NewUser newuser = new NewUser();
				setVisible(false);
				newuser.setVisible(true);
			}
		});
		
		btnExistingUsers.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				ExistingUser existinguser = new ExistingUser();
				setVisible(false);
				existinguser.setVisible(true);
			}
		});
	}
}

package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Database.DBController;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.*;
import Database.DBController;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.sql.DriverManager;

public class ExistingUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExistingUser frame = new ExistingUser();
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
	public ExistingUser() {
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
		
		JButton button = new JButton("< Back");
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(41, 168, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(97, 168, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(41, 199, 69, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 199, 155, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(300, 164, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(300, 195, 89, 23);
		contentPane.add(btnClear);
		
		JLabel lblLoginSucessful = new JLabel("Login Sucessful!");
		lblLoginSucessful.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginSucessful.setBounds(200, 225, 89, 14);
		lblLoginSucessful.setVisible(false);
		contentPane.add(lblLoginSucessful);
		
		JLabel lblLoginFailed = new JLabel("Login Failed!");
		lblLoginFailed.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginFailed.setBounds(200, 236, 89, 14);
		lblLoginFailed.setVisible(false);
		contentPane.add(lblLoginFailed);
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Login login = new Login();
				setVisible(false);
				login.setVisible(true);
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				String name = textField.getText();
				String password = textField_1.getText();
				String databaseUsername = null;
				String databasePassword = null;
				ResultSet rs = null;
				
				DBController db=new DBController();
				
				String dbQuery = "SELECT name, password FROM users WHERE name='" + name + "' AND password='" + password+ "'";
				
				//queries database
				rs = db.readRequest(dbQuery);
				
				//check username and password
				try {
					while (rs.next()) {
					    databaseUsername = rs.getString("name");
					    databasePassword = rs.getString("password");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			    if (name.equals(databaseUsername) && password.equals(databasePassword)) {
			        lblLoginSucessful.setVisible(true);
			        textField.setText("");
			        textField_1.setText("");
			    } else {
			        lblLoginFailed.setVisible(true);
			        textField_1.setText("");
			    }
			}
		});
	}

}

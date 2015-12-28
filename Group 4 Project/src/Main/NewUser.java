package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import Database.DBController;

public class NewUser extends JFrame {

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
					NewUser frame = new NewUser();
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
	public NewUser() {
		setTitle("Create Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		
		JButton button = new JButton("< Back");
		button.setBounds(10, 229, 109, 23);
		contentPane.add(button);
		
		JLabel lblAvatar = new JLabel("Avatar");
		lblAvatar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvatar.setBounds(10, 11, 109, 111);
		contentPane.add(lblAvatar);
		
		JButton btnNewButton = new JButton("Upload Picture");
		btnNewButton.setBounds(10, 122, 109, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(10, 161, 109, 23);
		contentPane.add(btnSubmit);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(170, 59, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(228, 56, 167, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(170, 84, 46, 14);
		contentPane.add(lblAge);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(233, 112, 47, 23);
		contentPane.add(rdbtnMale);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(226, 81, 75, 20);
		contentPane.add(spinner);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(170, 116, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(331, 112, 64, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblEmal = new JLabel("Email:");
		lblEmal.setBounds(170, 145, 46, 14);
		contentPane.add(lblEmal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 142, 167, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(170, 170, 56, 14);
		contentPane.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(228, 167, 167, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAccountCreated = new JLabel("Account Created!");
		lblAccountCreated.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountCreated.setBounds(187, 217, 167, 14);
		lblAccountCreated.setVisible(false);
		contentPane.add(lblAccountCreated);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(10, 195, 109, 23);
		contentPane.add(btnClear);
		
		Timer timer = new Timer(5000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
	        	setVisible(false);
	        	login.setVisible(true);
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				int id = 0;
				
				String name = textField.getText();
				int age = (int) spinner.getValue();
				String email = textField_1.getText();
				String password = textField_2.getText();
				btnClear.setEnabled(false);
				btnSubmit.setEnabled(false);
				
				NewUserConstructor constructor = new NewUserConstructor (name, age, 1, email, password);
				id = NewUserDA.createUser(constructor);
				
				if (id > 0) {
					lblAccountCreated.setVisible(true);	
				}
				
				Login login = new Login();
	        	setVisible(false);
	        	login.setVisible(true);
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Login login = new Login();
            	setVisible(false);
            	login.setVisible(true);
			}
		});
	}
}

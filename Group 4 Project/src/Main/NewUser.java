package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import Database.DBController;
import RyanUI.Matchmaking;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JFileChooser fc;
	private File file;

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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NewUser() {
		setTitle("Create Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setState(JFrame.NORMAL);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton button = new JButton(back);
		button.setBounds(30, 227, 101, 23);
		contentPane.add(button);
		
		JLabel lblAvatar = new JLabel("Avatar");
		lblAvatar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvatar.setBounds(10, 11, 109, 111);
		contentPane.add(lblAvatar);
		
		ImageIcon upload = new ImageIcon("Images/upload.png");
		JButton btnNewButton = new JButton(upload);
		btnNewButton.setBounds(10, 122, 140, 23);
		contentPane.add(btnNewButton);
		
		ImageIcon submit = new ImageIcon("Images/submit.png");
		JButton btnSubmit = new JButton(submit);
		btnSubmit.setBounds(30, 161, 101, 23);
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
		rdbtnMale.setBounds(233, 112, 64, 23);
		contentPane.add(rdbtnMale);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(228, 81, 167, 20);
		contentPane.add(spinner);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(170, 116, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(314, 112, 81, 23);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnMale);
		buttonGroup.add(rdbtnFemale);
		
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
		
		ImageIcon clear = new ImageIcon("Images/clear.png");
		JButton btnClear = new JButton(clear);
		btnClear.setBounds(30, 193, 101, 23);
		contentPane.add(btnClear);
		
		JLabel lblPriviledge = new JLabel("Permission:");
		lblPriviledge.setBounds(170, 199, 56, 14);
		contentPane.add(lblPriviledge);
		
		String[] comboTypes = {"Standard", "Organiser", "Administrator"};
		JComboBox comboBox = new JComboBox(comboTypes);
		comboBox.setEnabled(false);
		comboBox.setBounds(228, 197, 81, 18);
		contentPane.add(comboBox);
		
		JButton btnAuthenticatePermission = new JButton("Enable");
		btnAuthenticatePermission.setBounds(319, 196, 76, 21);
		contentPane.add(btnAuthenticatePermission);
		
		Timer timer = new Timer(5000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
	        	setVisible(false);
	        	login.setVisible(true);
			}
		});
		
		btnAuthenticatePermission.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				JPanel panel = new JPanel(new BorderLayout(5, 5));

			    JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
			    label.add(new JLabel("Name", SwingConstants.RIGHT));
			    label.add(new JLabel("Password", SwingConstants.RIGHT));
			    panel.add(label, BorderLayout.WEST);

			    JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
			    JTextField username = new JTextField();
			    controls.add(username);
			    JTextField password = new JTextField();
			    controls.add(password);
			    panel.add(controls, BorderLayout.CENTER);

			    JOptionPane.showMessageDialog(NewUser.this, panel, "Login", JOptionPane.OK_CANCEL_OPTION);
			    
			    String name = username.getText();
			    String userpassword = password.getText();
			    
			    String databaseUsername = null;
				String databasePassword = null;
				ResultSet rs = null;
				
				DBController db=new DBController();
				
				String dbQuery = "SELECT name, password FROM users WHERE name='" + name + "' AND password='" + userpassword+ "'";
				
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
				
				if (name.equals("") || userpassword.equals("")) {
					JOptionPane.showMessageDialog(NewUser.this, "Empty fields detected.\n\nPlease enter details.");
				}
				else {
					if (databaseUsername.equals("Admin") && databasePassword.equals("admin")) {
						JOptionPane.showMessageDialog(NewUser.this, "Administrator Authenticated.\n\nPermissions granted.");
						comboBox.setEnabled(true);
					}
					else {
						JOptionPane.showMessageDialog(NewUser.this, "Your account is not an administrator.\n\nPlease contact an administrator to change permissions.");
					}
				}
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				int id = 0;
				
				String name = textField.getText();
				int age = (int) spinner.getValue();
				String email = textField_1.getText();
				String password = textField_2.getText();
				String permission = (String) comboBox.getSelectedItem();
				int gender = 0;
				btnClear.setEnabled(false);
				btnSubmit.setEnabled(false);
				
				if (rdbtnMale.isSelected()) {
					gender = 1;
				}
				else if (rdbtnFemale.isSelected()) {
					gender = 2;
				}
				else {
					JOptionPane.showMessageDialog(NewUser.this, "Please select a gender");
				}
				
				NewUserConstructor constructor = new NewUserConstructor (name, age, gender, email, password, permission);
				id = NewUserDA.createUser(constructor);
				
				if (id > 0) {
					//lblAccountCreated.setVisible(true);
					JOptionPane.showMessageDialog(NewUser.this, "Account Created!");
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
		
		btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e1) {
        		int retval = 0;
        		
        		JFileChooser fileChooser = new JFileChooser();
        		retval = fileChooser.showOpenDialog(NewUser.this);
				if (retval == JFileChooser.APPROVE_OPTION) {
				     file = fileChooser.getSelectedFile();
				     lblAvatar.setText("");
				     lblAvatar.setIcon(new ImageIcon(file.getAbsolutePath()));
			    }
				else {
					JOptionPane.showMessageDialog(NewUser.this, "No Image selected!");
				}
        	}
        });
	}
}

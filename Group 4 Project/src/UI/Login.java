package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import Database.LoginDA;
import Database.NewUserDA;
import Entity.LoginConstructor;
import Entity.NewUserConstructor;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private Connection con;
	public static String user;
	public static String permission;
	private String path;
	private JFileChooser fc;
	private File file;
	private JPasswordField passwordField;
	private JPasswordField passwordField_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Existing Users", null, panel, null);
		panel.setLayout(null);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(0, 11, 419, 103);
		panel.add(imagelabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(41, 145, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(111, 142, 155, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(41, 176, 69, 14);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(111, 173, 155, 20);
		panel.add(passwordField);
		passwordField.setColumns(10);
		
		ImageIcon submit = new ImageIcon("Images/submit.png");
		JButton btnSubmit = new JButton(submit);
		btnSubmit.setBounds(300, 136, 89, 23);
		panel.add(btnSubmit);
		
		ImageIcon clear = new ImageIcon("Images/clear.png");
		JButton btnClear = new JButton(clear);
		btnClear.setBounds(300, 167, 89, 23);
		panel.add(btnClear);
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed (ActionEvent e) {
				String name = textField.getText();
				String password = passwordField.getText();
				
				LoginConstructor login = LoginDA.authenticateUser(name, password);
				
				permission = login.getPermissions();

			    if (name.equals(login.getName()) && password.equals(login.getPassword())) {
			    	
			    	if (permission.equals("Administrator")) {
				    	JOptionPane.showMessageDialog(Login.this, "WARNING THIS IS AN ADMINISTRATOR ACCOUNT\n\nUSE EXTREME CAUTION.");
				    	
				        textField.setText("");
				        textField_1.setText("");
				        user = login.getName();
				        
				        Homepage home = new Homepage();
				        setVisible(false);
				        home.setVisible(true);
				    }
			    	
			    	else {
			    	JOptionPane.showMessageDialog(Login.this, "User authenticated.\n\nWelcome " + name + ".");
			    	
			        textField.setText("");
			        passwordField.setText("");
			        user = login.getName();
			        
			        Homepage home = new Homepage();
			        setVisible(false);
			        home.setVisible(true);
			    	}
			    }
			    
			    else {
			    	JOptionPane.showMessageDialog(Login.this, "Username and/or Password not found.\n\nPlease try again.", "Message", JOptionPane.WARNING_MESSAGE);
			        passwordField.setText("");
			    }
			}
		});
		
		passwordField.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String password = passwordField.getText();
				
				LoginConstructor login = LoginDA.authenticateUser(name, password);
				
				permission = login.getPermissions();

			    if (name.equals(login.getName()) && password.equals(login.getPassword())) {
			    	
			    	if (permission.equals("Administrator")) {
				    	JOptionPane.showMessageDialog(Login.this, "WARNING THIS IS AN ADMINISTRATOR ACCOUNT\n\nUSE EXTREME CAUTION.");
				    	
				        textField.setText("");
				        textField_1.setText("");
				        user = login.getName();
				        
				        Homepage home = new Homepage();
				        setVisible(false);
				        home.setVisible(true);
				    }
			    	
			    	else {
			    	JOptionPane.showMessageDialog(Login.this, "User authenticated.\n\nWelcome " + name + ".");
			    	
			        textField.setText("");
			        passwordField.setText("");
			        user = login.getName();
			        
			        Homepage home = new Homepage();
			        setVisible(false);
			        home.setVisible(true);
			    	}
			    }
			    
			    else {
			    	JOptionPane.showMessageDialog(Login.this, "Username and/or Password not found.\n\nPlease try again.", "Message", JOptionPane.WARNING_MESSAGE);
			        passwordField.setText("");
			    }
		}
		});
		
		//NEW PANEL BELOW
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New Users", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblAvatar = new JLabel("Avatar");
		lblAvatar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvatar.setBounds(22, 11, 109, 111);
		panel_1.add(lblAvatar);
		
		ImageIcon upload = new ImageIcon("Images/upload.png");
		JButton btnNewButton = new JButton(upload);
		btnNewButton.setBounds(10, 133, 140, 23);
		panel_1.add(btnNewButton);
		
		ImageIcon submit1 = new ImageIcon("Images/submit.png");
		JButton btnSubmit1 = new JButton(submit);
		btnSubmit1.setBounds(30, 161, 101, 23);
		panel_1.add(btnSubmit1);
		
		JLabel lblName1 = new JLabel("Name:");
		lblName1.setBounds(170, 14, 46, 14);
		panel_1.add(lblName1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(228, 11, 167, 20);
		panel_1.add(textField_3);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(170, 45, 46, 14);
		panel_1.add(lblAge);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(228, 69, 64, 23);
		panel_1.add(rdbtnMale);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(228, 42, 167, 20);
		panel_1.add(spinner);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(170, 70, 46, 14);
		panel_1.add(lblGender);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(308, 69, 81, 23);
		panel_1.add(rdbtnFemale);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnMale);
		buttonGroup.add(rdbtnFemale);
		
		JLabel lblEmal = new JLabel("Email:");
		lblEmal.setBounds(170, 95, 46, 14);
		panel_1.add(lblEmal);
		
		textField_4 = new JTextField();
		textField_4.setBounds(228, 92, 167, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPassword1 = new JLabel("Password: ");
		lblPassword1.setBounds(160, 126, 56, 14);
		panel_1.add(lblPassword1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(228, 123, 167, 20);
		panel_1.add(passwordField_2);
		passwordField_2.setColumns(10);
		
		ImageIcon clear1 = new ImageIcon("Images/clear.png");
		JButton btnClear1 = new JButton(clear);
		btnClear1.setBounds(30, 193, 101, 23);
		panel_1.add(btnClear1);
		
		JLabel lblPriviledge = new JLabel("Permission:");
		lblPriviledge.setBounds(160, 156, 56, 14);
		panel_1.add(lblPriviledge);
		
		String[] comboTypes = {"Standard", "Organiser", "Administrator"};
		JComboBox comboBox = new JComboBox(comboTypes);
		comboBox.setEnabled(false);
		comboBox.setBounds(228, 154, 81, 18);
		panel_1.add(comboBox);
		
		JButton btnAuthenticatePermission = new JButton("Enable");
		btnAuthenticatePermission.setBounds(319, 154, 76, 21);
		panel_1.add(btnAuthenticatePermission);
		
		Timer timer = new Timer(5000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	panel_1.setVisible(false);
	        	panel.setVisible(true);
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
			    JPasswordField password = new JPasswordField();
			    controls.add(password);
			    panel.add(controls, BorderLayout.CENTER);

			    JOptionPane.showMessageDialog(Login.this, panel, "Login", JOptionPane.OK_CANCEL_OPTION);
			    
			    String nameauthenticate = username.getText();
			    String userpasswordauthenticate = password.getText();
			    
			    LoginConstructor constructor = LoginDA.authenticateAdmin(nameauthenticate, userpasswordauthenticate);
				
				if (nameauthenticate.equals("") || userpasswordauthenticate.equals("")) {
					JOptionPane.showMessageDialog(Login.this, "Empty fields detected.\n\nPlease enter details.");
				}
				else {
					if (constructor.getPermissions().equals("Administrator")) {
						JOptionPane.showMessageDialog(Login.this, "Administrator Authenticated.\n\nPermissions granted.");
						comboBox.setEnabled(true);
					}
					else {
						JOptionPane.showMessageDialog(Login.this, "Your account is not an administrator.\n\nPlease contact an administrator to change permissions.");
					}
				}
			}
		});
		
		btnSubmit1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				int id = 0;
				
				String name = textField_3.getText();
				int age = (int) spinner.getValue();
				String email = textField_4.getText();
				String password = passwordField_2.getText();
				String permission = (String) comboBox.getSelectedItem();
				int gender = 0;
				btnClear1.setEnabled(false);
				btnSubmit1.setEnabled(false);
				
				if (rdbtnMale.isSelected()) {
					gender = 1;
				}
				else if (rdbtnFemale.isSelected()) {
					gender = 2;
				}
				else {
					JOptionPane.showMessageDialog(Login.this, "Please select a gender");
				}
				
				NewUserConstructor constructor = new NewUserConstructor (name, age, gender, email, password, permission, path);
				id = NewUserDA.createUser(constructor);
				
				if (id > 0) {
					//lblAccountCreated.setVisible(true);
					JOptionPane.showMessageDialog(Login.this, "Account Created!");
				}
				
				panel_1.setVisible(false);
	        	panel.setVisible(true);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e1) {
        		int retval = 0;
        		
        		JFileChooser fileChooser = new JFileChooser();
        		retval = fileChooser.showOpenDialog(Login.this);
				if (retval == JFileChooser.APPROVE_OPTION) {
				     file = fileChooser.getSelectedFile();
				     lblAvatar.setText("");
				     lblAvatar.setIcon(new ImageIcon(file.getAbsolutePath()));
				     path = file.getAbsolutePath();
			    }
				else {
					JOptionPane.showMessageDialog(Login.this, "No Image selected!");
				}
        	}
        });
	}
}

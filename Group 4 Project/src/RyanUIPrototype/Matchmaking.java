package RyanUIPrototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Matchmaking extends JFrame {

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
					Matchmaking frame = new Matchmaking();
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
	public Matchmaking() {
		setTitle("Matchmaker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("Search");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setBounds(14, 164, 116, 23);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(14, 198, 116, 23);
		contentPane.add(btnClear);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(14, 232, 116, 23);
		contentPane.add(btnBack);
		
		JLabel lblProfilePicture = new JLabel("Profile Picture");
		lblProfilePicture.setBackground(Color.YELLOW);
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(14, 11, 116, 106);
		contentPane.add(lblProfilePicture);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(167, 40, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(167, 65, 46, 14);
		contentPane.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(167, 90, 46, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(245, 86, 54, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(332, 86, 59, 23);
		contentPane.add(rdbtnFemale);
		
		textField = new JTextField();
		textField.setBounds(206, 37, 185, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 62, 185, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(167, 115, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPreference = new JLabel("Preference:");
		lblPreference.setBounds(167, 143, 59, 14);
		contentPane.add(lblPreference);
		
		JRadioButton radioButton = new JRadioButton("Male");
		radioButton.setBounds(245, 143, 54, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		radioButton_1.setBounds(332, 143, 59, 23);
		contentPane.add(radioButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 112, 185, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(167, 205, 224, 14);
		contentPane.add(progressBar);
		
		JButton step = new JButton("Step");
		
		JLabel lblSearchingForYour = new JLabel("Searching for your match...");
		lblSearchingForYour.setBounds(167, 181, 220, 14);
		contentPane.add(lblSearchingForYour);
		
		JLabel lblMatchFound = new JLabel("Match found!");
		lblMatchFound.setBounds(167, 236, 132, 14);
		contentPane.add(lblMatchFound);
		
		JButton btnProceedToChat = new JButton("Proceed to chat >");
		btnProceedToChat.setBounds(245, 232, 146, 23);
		contentPane.add(btnProceedToChat);
		
		JButton btnUploadPicture = new JButton("Upload Picture");
		btnUploadPicture.setBounds(14, 130, 116, 23);
		contentPane.add(btnUploadPicture);
	}
}

package RyanUIPrototype;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.*;
import javax.swing.Timer;


public class Matchmaking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public final static int FIVE_SECOND = 5000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException{
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
	 * @throws IOException 
	 */
	public Matchmaking() throws IOException {
		setTitle("Matchmaker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("Search");
		
		btnSubmit.setBounds(14, 164, 116, 23);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("Reset");
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
		rdbtnFemale.setBounds(307, 86, 84, 23);
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
		
		JRadioButton prefmale = new JRadioButton("Male");
		prefmale.setBounds(245, 139, 54, 23);
		contentPane.add(prefmale);
		
		JRadioButton preffemale = new JRadioButton("Female");
		preffemale.setBounds(307, 139, 84, 23);
		contentPane.add(preffemale);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnMale);
		group.add(rdbtnFemale);
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 112, 185, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JLabel lblSearchingForYour = new JLabel("Searching for your match...");
		lblSearchingForYour.setBounds(167, 181, 220, 14);
		contentPane.add(lblSearchingForYour);
		lblSearchingForYour.setVisible(false);
		
		final JLabel lblMatchFound = new JLabel("Match found!");
		lblMatchFound.setBounds(167, 202, 132, 14);
		contentPane.add(lblMatchFound);
		lblMatchFound.setVisible(false);
		
		JButton btnProceedToChat = new JButton("Proceed to chat >");
		btnProceedToChat.setBounds(245, 198, 146, 23);
		contentPane.add(btnProceedToChat);
		btnProceedToChat.setVisible(false);
		btnProceedToChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrivateChat privatechat = new PrivateChat();
				setVisible(false); //hide current frame
				privatechat.setVisible(true);
			}
		});
		
		JButton btnUploadPicture = new JButton("Upload Picture");
		btnUploadPicture.setBounds(14, 130, 116, 23);
		contentPane.add(btnUploadPicture);
		
		ImageIcon image = new ImageIcon("Images/245.GIF");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(167, 202, 224, 14);
		contentPane.add(imagelabel);
		imagelabel.setVisible(false);
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				group.clearSelection();
				prefmale.setSelected(false);
				preffemale.setSelected(false);
				lblSearchingForYour.setVisible(false);
				imagelabel.setVisible(false);
				lblMatchFound.setVisible(false);
				btnProceedToChat.setVisible(false);
			}
		});
		
		ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	lblSearchingForYour.setVisible(false);
				imagelabel.setVisible(false);
				lblMatchFound.setVisible(true);
				btnProceedToChat.setVisible(true);
            }
        };
        Timer timer = new Timer(5000, taskPerformer);
        
        btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSearchingForYour.setVisible(true);
				imagelabel.setVisible(true);
				btnClear.setEnabled(false);
				btnSubmit.setEnabled(false);
				btnUploadPicture.setEnabled(false);
				timer.start();
			}
		});
	}
}

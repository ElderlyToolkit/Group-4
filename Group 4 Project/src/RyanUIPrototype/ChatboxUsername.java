package RyanUIPrototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ChatboxUsername extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatboxUsername frame = new ChatboxUsername();
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
	public ChatboxUsername() {
		setTitle("Chatroom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon logo = new ImageIcon("Images/logo.png");
		JLabel lblwelcomeToThe = new JLabel(logo);
		lblwelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcomeToThe.setBounds(10, 33, 414, 89);
		contentPane.add(lblwelcomeToThe);
		
		textField = new JTextField();
		textField.setBounds(118, 158, 212, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterANickname = new JLabel("Enter a nickname:");
		lblEnterANickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterANickname.setBounds(118, 133, 212, 14);
		contentPane.add(lblEnterANickname);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(241, 189, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton button = new JButton("< Back");
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		ImageIcon image = new ImageIcon("Images/ajax-loader.gif");
		final JLabel loadingLabel = new JLabel(image);
		loadingLabel.setBounds(201, 189, 46, 35);
		contentPane.add(loadingLabel);
		loadingLabel.setVisible(false);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(118, 189, 89, 23);
		contentPane.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				textField.setText("");
			}
		});
		
		ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Chatbox chatbox = new Chatbox();
            	setVisible(false);
            	chatbox.setVisible(true);
            }
        };
        Timer timer = new Timer(5000, taskPerformer);
        
        btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				btnSubmit.setVisible(false);
				btnClear.setVisible(false);
				loadingLabel.setVisible(true);
				timer.start();
			}
		});
	}

}

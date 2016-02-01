package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.DBController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ChatboxUsername extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String nickname = null;

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
		setState(JFrame.NORMAL);
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
		textField.setText(Login.user);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterANickname = new JLabel("Enter a nickname:");
		lblEnterANickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterANickname.setBounds(118, 133, 212, 14);
		contentPane.add(lblEnterANickname);
		
		ImageIcon submit = new ImageIcon("Images/submit.png");
		JButton btnSubmit = new JButton(submit);
		btnSubmit.setBounds(241, 189, 89, 23);
		contentPane.add(btnSubmit);
		
		ImageIcon back = new ImageIcon("Images/Back.png");
		JButton button = new JButton(back);
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		ImageIcon image = new ImageIcon("Images/ajax-loader.gif");
		final JLabel loadingLabel = new JLabel(image);
		loadingLabel.setBounds(201, 189, 46, 35);
		contentPane.add(loadingLabel);
		loadingLabel.setVisible(false);
		
		ImageIcon clear = new ImageIcon("Images/clear.png");
		JButton btnClear = new JButton(clear);
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
        timer.setRepeats(false);
        
        btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(ChatboxUsername.this, "Please input a name");
				}
				else{
					btnSubmit.setVisible(false);
					btnClear.setVisible(false);
					loadingLabel.setVisible(true);
					nickname = textField.getText();
					timer.start();
				}
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

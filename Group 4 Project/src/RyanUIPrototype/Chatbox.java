package RyanUIPrototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Chatbox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chatbox frame = new Chatbox();
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
	public Chatbox() {
		setTitle("Chatroom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblwelcomeToThe = new JLabel("~Welcome to the chat centre~");
		lblwelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcomeToThe.setBounds(10, 11, 295, 14);
		contentPane.add(lblwelcomeToThe);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 32, 295, 195);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(10, 238, 295, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(367, 236, 57, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(307, 236, 60, 23);
		contentPane.add(btnClear);
		
		textField_1 = new JTextField();
		textField_1.setBounds(315, 32, 109, 195);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblonlineUsers = new JLabel("~Online Users~");
		lblonlineUsers.setHorizontalAlignment(SwingConstants.CENTER);
		lblonlineUsers.setBounds(317, 11, 107, 14);
		contentPane.add(lblonlineUsers);
	}
}

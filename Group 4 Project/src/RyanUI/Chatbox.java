package RyanUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.NewUserConstructor;
import Main.NewUserDA;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

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

		final JLabel lblwelcomeToThe = new JLabel("~Welcome to the chatroom!~");
		lblwelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcomeToThe.setBounds(10, 29, 295, 18);
		contentPane.add(lblwelcomeToThe);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 51, 295, 176);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(10, 238, 257, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
				String input = textField.getText();
				textArea.append(timeStamp + " " + input + "\n");
				textField.setText("");
				
				ChatboxConstructor constructor = new ChatboxConstructor(input);
				int id = ChatboxDA.createItem(constructor);
			}
		});
		btnNewButton.setBounds(356, 236, 68, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(277, 236, 74, 23);
		contentPane.add(btnClear);
		
		textField_1 = new JTextField();
		textField_1.setBounds(315, 51, 109, 176);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblonlineUsers = new JLabel("~Online Users~");
		lblonlineUsers.setHorizontalAlignment(SwingConstants.CENTER);
		lblonlineUsers.setBounds(317, 31, 107, 14);
		contentPane.add(lblonlineUsers);
		
		JButton button = new JButton("< Back");
		button.setBounds(10, 9, 89, 19);
		contentPane.add(button);
		button.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				ChatboxUsername chatboxusername = new ChatboxUsername();
            	setVisible(false);
            	chatboxusername.setVisible(true);
			}
		});
		
		Action action =  new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
			String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
			String input = textField.getText();
			textArea.append(timeStamp + " " + input + "\n");
			textField.setText("");
		}
		};
		textField.addActionListener(action);
	}
}

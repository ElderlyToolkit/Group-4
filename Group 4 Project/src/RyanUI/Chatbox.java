package RyanUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.ChatboxDA;
import Database.NewUserDA;
import Entity.ChatboxConstructor;
import Entity.NewUserConstructor;

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
import javax.swing.Timer;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Chatbox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int i = 0;

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
		setState(JFrame.NORMAL);
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
		textArea.setEditable(false);
		textArea.setBounds(10, 51, 295, 176);
		
		textField = new JTextField();
		textField.setBounds(10, 238, 257, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		ImageIcon send = new ImageIcon("Images/send.png");
		JButton btnNewButton = new JButton(send);
		//btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
				String input = textField.getText();
				textArea.append(timeStamp + " " + ChatboxUsername.nickname + ": " +input + "\n");
				textField.setText("");
				
				ChatboxConstructor constructor = new ChatboxConstructor(input);
				int id = ChatboxDA.createItem(constructor);
			}
		});
		btnNewButton.setBounds(356, 236, 68, 23);
		contentPane.add(btnNewButton);
		
		ImageIcon clear = new ImageIcon("Images/clear.png");
		JButton btnClear = new JButton(clear);
		btnClear.setBounds(277, 236, 74, 23);
		contentPane.add(btnClear);
		
		JLabel lblonlineUsers = new JLabel("~Online Users~");
		lblonlineUsers.setHorizontalAlignment(SwingConstants.CENTER);
		lblonlineUsers.setBounds(317, 31, 107, 14);
		contentPane.add(lblonlineUsers);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton button = new JButton(back);
		button.setBounds(10, 9, 89, 19);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 51, 295, 176);
		contentPane.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(315, 51, 109, 176);
		textArea_1.append(ChatboxUsername.nickname + "\n");
		textArea_1.append("SwagGrandpa\n");
		textArea_1.append("Ah Seng\n");
		
		JScrollPane scrollPane_1 = new JScrollPane(textArea_1);
		scrollPane_1.setBounds(315, 51, 109, 176);
		contentPane.add(scrollPane_1);
		
		button.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				ChatboxUsername chatboxusername = new ChatboxUsername();
            	setVisible(false);
            	chatboxusername.setVisible(true);
			}
		});
		
		ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String[] messages = {"Hello!\n", "I am doing good\n", "How about you?\n"};
            	String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
            	textArea.append(timeStamp + "SwagGrandpa: " + messages[i]);
            	i++;
            }
        };
        Timer timer = new Timer(5000, taskPerformer);
        timer.setRepeats(false);
		
		textField.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
			String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
			String input = textField.getText();
			textArea.append(timeStamp + " " + ChatboxUsername.nickname + ": " +input + "\n");
			textField.setText("");
			timer.start();
		}
		});
	}
}

package RyanUIPrototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class PrivateChat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrivateChat frame = new PrivateChat();
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
	public PrivateChat() {
		setTitle("Matchmaker Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 45, 414, 177);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(10, 230, 268, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(352, 229, 72, 23);
		contentPane.add(btnSend);
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
				String input = textField.getText();
				textArea.append(timeStamp + " " + input + "\n");
				textField.setText("");
			}
		});
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton.setBounds(285, 229, 67, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("< Back");
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Matchmaking matchmaking = null;
				try {
					matchmaking = new Matchmaking();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				matchmaking.setVisible(true);
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

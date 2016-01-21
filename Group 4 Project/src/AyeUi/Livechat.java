package AyeUi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Livechat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Livechat frame = new Livechat();
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
	public Livechat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnLiveChat = new JTextPane();
		txtpnLiveChat.setBackground(SystemColor.control);
		txtpnLiveChat.setForeground(new Color(240, 128, 128));
		txtpnLiveChat.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		txtpnLiveChat.setText("LIVE CHAT ");
		txtpnLiveChat.setBounds(157, 16, 205, 26);
		contentPane.add(txtpnLiveChat);
		
		JTextPane txtpnTypeYourMessage = new JTextPane();
		txtpnTypeYourMessage.setForeground(new Color(123, 104, 238));
		txtpnTypeYourMessage.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		txtpnTypeYourMessage.setBackground(SystemColor.control);
		txtpnTypeYourMessage.setText("Fill in your message below. Our available counsellor will reply you shortly!");
		txtpnTypeYourMessage.setBounds(37, 55, 427, 54);
		contentPane.add(txtpnTypeYourMessage);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(15, 125, 449, 194);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
				String input = textField.getText();
				textArea.append(timeStamp + " " + input + "\n");
				textField.setText("");
			}
		});
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(15, 336, 449, 48);
		contentPane.add(textField);
		textField.setColumns(10);
				
				
		
		btnNewButton.setBounds(247, 400, 115, 29);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnClear.setBounds(112, 400, 115, 29);
		contentPane.add(btnClear);
	}
}

package AyeUi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Login;
import RyanUI.MatchmakingList;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.Timer;

import java.awt.SystemColor;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

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
		
		JLabel txtpnLiveChat = new JLabel();
		txtpnLiveChat.setHorizontalAlignment(SwingConstants.CENTER);
		txtpnLiveChat.setBackground(SystemColor.control);
		txtpnLiveChat.setForeground(new Color(240, 128, 128));
		txtpnLiveChat.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		txtpnLiveChat.setText("LIVE CHAT ");
		txtpnLiveChat.setBounds(131, 54, 205, 26);
		contentPane.add(txtpnLiveChat);
		
		JLabel txtpnTypeYourMessage = new JLabel();
		txtpnTypeYourMessage.setHorizontalAlignment(SwingConstants.CENTER);
		txtpnTypeYourMessage.setForeground(new Color(123, 104, 238));
		txtpnTypeYourMessage.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		txtpnTypeYourMessage.setBackground(SystemColor.control);
		txtpnTypeYourMessage.setText("Fill in your message below. \r\nOur available counsellor will reply you shortly!");
		txtpnTypeYourMessage.setBounds(15, 91, 449, 26);
		contentPane.add(txtpnTypeYourMessage);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textArea.setBounds(15, 125, 449, 222);
		contentPane.add(textArea);
		
		ImageIcon send = new ImageIcon("Images/send.png");
		JButton btnNewButton = new JButton(send);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.setBounds(269, 400, 93, 29);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		textField.setText("");
		textField.setBounds(15, 358, 449, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		ImageIcon clear = new ImageIcon("Images/clear.png");
		JButton btnClear = new JButton(clear);
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnClear.setBounds(112, 400, 99, 29);
		contentPane.add(btnClear);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton button = new JButton(back);
		button.setBounds(15, 11, 99, 31);
		contentPane.add(button);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
            	textArea.append(timeStamp + " " + Login.user + ": Hello!\n");
            }
        };
        Timer timer = new Timer(5000, taskPerformer);
		
		Action action =  new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
			String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
			String input = textField.getText();
			textArea.append(timeStamp + " " + input + "\n");
			textField.setText("");
			timer.start();
			timer.stop();
		}
		};
		textField.addActionListener(action);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String timeStamp = new SimpleDateFormat("h:mm:ssa").format(Calendar.getInstance().getTime());
				String input = textField.getText();
				textArea.append(timeStamp + " " + input + "\n");
				textField.setText("");
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Counselling counselling = new Counselling();
				setVisible(false);
				counselling.setVisible(true);
			}
		});
	}
}

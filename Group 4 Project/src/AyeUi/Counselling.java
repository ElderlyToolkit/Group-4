package AyeUi;
import java.awt.Image;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Counselling extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counselling frame = new Counselling();
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
	public Counselling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 450);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		Image images = new ImageIcon(this.getClass().getResource("/call.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(images));
		btnNewButton.setBounds(106, 92, 268, 133);
		contentPane.add(btnNewButton);
		
		
		JButton btnChat = new JButton("CHAT");
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChat.setBackground(Color.WHITE);
		Image images2 = new ImageIcon(this.getClass().getResource("/msg.png")).getImage();
		btnChat.setIcon(new ImageIcon(images2));
		btnChat.setBounds(106, 253, 268, 125);
		contentPane.add(btnChat);
		
		JTextPane txtpnOnlineCounselling = new JTextPane();
		txtpnOnlineCounselling.setBackground(SystemColor.control);
		txtpnOnlineCounselling.setForeground(new Color(51, 153, 255));
		txtpnOnlineCounselling.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		txtpnOnlineCounselling.setText("Online Counselling");
		txtpnOnlineCounselling.setBounds(115, 31, 248, 45);
		contentPane.add(txtpnOnlineCounselling);
		Image images1 = new ImageIcon(this.getClass().getResource("/oc.png")).getImage();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livechat chat = new Livechat();
				setVisible(false);
				chat.setVisible(true);
			}
		});
	}
}

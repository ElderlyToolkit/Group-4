package AyeUi;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Homepage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Desktop;
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
		setBounds(100, 100, 510, 465);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.control);
		Image images = new ImageIcon(this.getClass().getResource("/call.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(images));
		btnNewButton.setBounds(106, 78, 268, 110);
		contentPane.add(btnNewButton);
		
		
		JButton btnChat = new JButton("CHAT");
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChat.setBackground(Color.WHITE);
		Image images2 = new ImageIcon(this.getClass().getResource("/msg.png")).getImage();
		btnChat.setIcon(new ImageIcon(images2));
		btnChat.setBounds(106, 194, 268, 103);
		contentPane.add(btnChat);
		
		JLabel txtpnOnlineCounselling = new JLabel();
		txtpnOnlineCounselling.setBackground(SystemColor.control);
		txtpnOnlineCounselling.setForeground(new Color(51, 153, 255));
		txtpnOnlineCounselling.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		txtpnOnlineCounselling.setText("Online Counselling");
		txtpnOnlineCounselling.setBounds(115, 31, 248, 45);
		contentPane.add(txtpnOnlineCounselling);
		
		ImageIcon back = new ImageIcon ("Images/Back.png");
		JButton button = new JButton(back);
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		ImageIcon image = new ImageIcon("Images/email.png");
		JButton btnMail = new JButton(image);
		btnMail.setBackground(Color.WHITE);
		btnMail.setBounds(106, 303, 268, 103);
		contentPane.add(btnMail);
		Image images1 = new ImageIcon(this.getClass().getResource("/oc.png")).getImage();
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { Runtime.getRuntime().exec(new String[] {"rundll32", "url.dll,FileProtocolHandler", "skype:echo123"}); 
				} catch (Exception e1) {
					
				}
			}
		});
		
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livechat chat = new Livechat();
				setVisible(false);
				chat.setVisible(true);
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage home = new Homepage();
				setVisible(false);
				home.setVisible(true);
			}
		});
		
 btnMail.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Desktop desktop;
		URI mailto = null;
		
		if (Desktop.isDesktopSupported() && (desktop = Desktop.getDesktop()).isSupported(Desktop.Action.MAIL)) {
			try {
				mailto = new URI("mailto:muchhelpfulcounsellorslol@example.com?subject=Sup%20Fella");
				desktop.mail(mailto);
			} catch (URISyntaxException | IOException e1) {
				e1.printStackTrace();
			}
		}
		else {
			throw new RuntimeException("Your computer doesn't have a Mail Application. Mail is dead anyway lol ;)");
		}
	}
 });
	}
}
 




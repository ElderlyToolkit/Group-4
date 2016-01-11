package Main;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RyanUI.ChatboxUsername;
import RyanUI.DayEventDelete;
import RyanUI.Events;
import RyanUI.Matchmaking;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setState(JFrame.NORMAL);
		setBounds(100, 100, 481, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("COUNSELLING");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		btnNewButton.setBounds(49, 179, 159, 34);
		contentPane.add(btnNewButton);
		
		JButton btnForums = new JButton("FORUMS");
		btnForums.setBackground(new Color(0, 191, 255));
		btnForums.setForeground(new Color(0, 0, 0));
		btnForums.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnForums.setBounds(249, 179, 159, 34);
		contentPane.add(btnForums);
		
		JButton btnEventsAndHobbies = new JButton("EVENTS & HOBBIES");
		btnEventsAndHobbies.setBackground(new Color(0, 191, 255));
		btnEventsAndHobbies.setFont(new Font("Century Schoolbook", Font.BOLD, 10));
		btnEventsAndHobbies.setForeground(new Color(0, 0, 0));
		btnEventsAndHobbies.setBounds(49, 233, 159, 34);
		contentPane.add(btnEventsAndHobbies);
		
		JButton btnChatBox = new JButton("CHAT BOX");
		btnChatBox.setBackground(new Color(0, 191, 255));
		btnChatBox.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnChatBox.setForeground(new Color(0, 0, 0));
		btnChatBox.setBounds(49, 291, 159, 34);
		contentPane.add(btnChatBox);
		
		JButton btnNews = new JButton("NEWS");
		btnNews.setBackground(new Color(0, 191, 255));
		btnNews.setForeground(new Color(0, 0, 0));
		btnNews.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnNews.setBounds(49, 349, 159, 34);
		contentPane.add(btnNews);
		
		JButton btnMatchMaking = new JButton("MATCH MAKING");
		btnMatchMaking.setBackground(new Color(0, 191, 255));
		btnMatchMaking.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		btnMatchMaking.setForeground(new Color(0, 0, 0));
		btnMatchMaking.setBounds(249, 233, 159, 34);
		contentPane.add(btnMatchMaking);
		
		JButton btnDictionary = new JButton("DICTIONARY");
		btnDictionary.setBackground(new Color(0, 191, 255));
		btnDictionary.setForeground(new Color(0, 0, 0));
		btnDictionary.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnDictionary.setBounds(249, 291, 159, 34);
		contentPane.add(btnDictionary);
		
		JButton btndtotoGenerator = new JButton("4D/TOTO\r\n GENERATOR");
		btndtotoGenerator.setBackground(new Color(0, 191, 255));
		btndtotoGenerator.setForeground(new Color(0, 0, 0));
		btndtotoGenerator.setFont(new Font("Century Schoolbook", Font.BOLD, 10));
		btndtotoGenerator.setBounds(249, 351, 159, 32);
		contentPane.add(btndtotoGenerator);
		
		JButton btnEbooks = new JButton("E-BOOKS");
		btnEbooks.setBackground(new Color(0, 191, 255));
		btnEbooks.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnEbooks.setForeground(new Color(0, 0, 0));
		btnEbooks.setBounds(249, 125, 159, 34);
		contentPane.add(btnEbooks);
		
		JButton btnGames = new JButton("GAMES");
		btnGames.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnGames.setBackground(new Color(0, 191, 255));
		btnGames.setForeground(new Color(0, 0, 0));
		btnGames.setBounds(49, 125, 159, 34);
		contentPane.add(btnGames);
		
		//JLabel lblNewLabel = new JLabel("");
		//Image images = new ImageIcon(this.getClass().getResource("/img1.png")).getImage();
		//lblNewLabel.setIcon(new ImageIcon(images));
		//lblNewLabel.setBounds(20, 11, 408, 103);
		//contentPane.add(lblNewLabel);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(20, 11, 408, 103);
		contentPane.add(imagelabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Roboto Condensed", Font.PLAIN, 14));
		btnExit.setBounds(153, 395, 159, 23);
		contentPane.add(btnExit);
		
		
		
		btnChatBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChatboxUsername username = new ChatboxUsername();
				setVisible(false);
				username.setVisible(true);
			}
		});
		
		btnEventsAndHobbies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Events events = new Events();
				setVisible(false);
				events.setVisible(true);
			}
		});
		
		btnMatchMaking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Matchmaking matchmaking = null;
				try {
					matchmaking = new Matchmaking();
				} catch (IOException | FontFormatException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				matchmaking.setVisible(true);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(Homepage.this, "This will end the app.\n\nAre you sure?","Alert", JOptionPane.OK_CANCEL_OPTION);
				System.out.print(result);
				
				if (result == 0) {
					Goodbye goodbye = new Goodbye();
					setVisible(false);
					goodbye.setVisible(true);
				}
			}
		});
	}
}

package Main;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DarylUI.News;
import DarylUI.NewsApp;
import DarylUI.Dictionary;
import DarylUI.DictionaryApp;
import DarylUI.NumGenerator;
import Database.DBController;
import RyanUI.ChatboxUsername;
import RyanUI.DayEventDelete;
import RyanUI.Events;
import RyanUI.Matchmaking;

import javax.swing.BorderFactory;
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
		
		ImageIcon counselling = new ImageIcon("Images/counsellingbutton.png");
		JButton btnNewButton = new JButton(counselling);
		btnNewButton.setBorder(BorderFactory.createEmptyBorder());
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnNewButton.setBounds(49, 179, 159, 34);
		contentPane.add(btnNewButton);
		
		ImageIcon forums = new ImageIcon("Images/forums.png");
		JButton btnForums = new JButton(forums);
		btnForums.setBorder(BorderFactory.createEmptyBorder());
		btnForums.setContentAreaFilled(false);
		btnForums.setBackground(new Color(0, 191, 255));
		btnForums.setForeground(new Color(0, 0, 0));
		btnForums.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnForums.setBounds(249, 179, 159, 34);
		contentPane.add(btnForums);
		
		ImageIcon events = new ImageIcon("Images/eventsbutton.png");
		JButton btnEventsAndHobbies = new JButton(events);
		btnEventsAndHobbies.setBorder(BorderFactory.createEmptyBorder());
		btnEventsAndHobbies.setContentAreaFilled(false);
		btnEventsAndHobbies.setBackground(new Color(0, 191, 255));
		btnEventsAndHobbies.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnEventsAndHobbies.setForeground(new Color(0, 0, 0));
		btnEventsAndHobbies.setBounds(49, 233, 159, 34);
		contentPane.add(btnEventsAndHobbies);
		
		ImageIcon chat = new ImageIcon("Images/chatroom.png");
		JButton btnChatBox = new JButton(chat);
		btnChatBox.setBorder(BorderFactory.createEmptyBorder());
		btnChatBox.setContentAreaFilled(false);
		btnChatBox.setBackground(new Color(0, 191, 255));
		btnChatBox.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnChatBox.setForeground(new Color(0, 0, 0));
		btnChatBox.setBounds(49, 291, 159, 34);
		contentPane.add(btnChatBox);
		
		ImageIcon news = new ImageIcon("Images/news.png");
		JButton btnNews = new JButton(news);
		btnNews.setBorder(BorderFactory.createEmptyBorder());
		btnNews.setContentAreaFilled(false);
		btnNews.setBackground(new Color(0, 191, 255));
		btnNews.setForeground(new Color(0, 0, 0));
		btnNews.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnNews.setBounds(49, 349, 159, 34);
		contentPane.add(btnNews);
		
		ImageIcon matchmaking = new ImageIcon("Images/matchmaking.png");
		JButton btnMatchMaking = new JButton(matchmaking);
		btnMatchMaking.setBorder(BorderFactory.createEmptyBorder());
		btnMatchMaking.setContentAreaFilled(false);
		btnMatchMaking.setBackground(new Color(0, 191, 255));
		btnMatchMaking.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnMatchMaking.setForeground(new Color(0, 0, 0));
		btnMatchMaking.setBounds(249, 233, 159, 34);
		contentPane.add(btnMatchMaking);
		
		ImageIcon dictionary = new ImageIcon("Images/dictionary.png");
		JButton btnDictionary = new JButton(dictionary);
		btnDictionary.setBorder(BorderFactory.createEmptyBorder());
		btnDictionary.setContentAreaFilled(false);
		btnDictionary.setBackground(new Color(0, 191, 255));
		btnDictionary.setForeground(new Color(0, 0, 0));
		btnDictionary.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnDictionary.setBounds(249, 291, 159, 34);
		contentPane.add(btnDictionary);
		
		ImageIcon generator = new ImageIcon("Images/generator.png");
		JButton btndtotoGenerator = new JButton(generator);
		btndtotoGenerator.setBorder(BorderFactory.createEmptyBorder());
		btndtotoGenerator.setContentAreaFilled(false);
		btndtotoGenerator.setBackground(new Color(0, 191, 255));
		btndtotoGenerator.setForeground(new Color(0, 0, 0));
		btndtotoGenerator.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btndtotoGenerator.setBounds(218, 351, 210, 32);
		contentPane.add(btndtotoGenerator);
		
		ImageIcon ebooks = new ImageIcon("Images/ebooks.png");
		JButton btnEbooks = new JButton(ebooks);
		btnEbooks.setBorder(BorderFactory.createEmptyBorder());
		btnEbooks.setContentAreaFilled(false);
		btnEbooks.setBackground(new Color(0, 191, 255));
		btnEbooks.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnEbooks.setForeground(new Color(0, 0, 0));
		btnEbooks.setBounds(249, 125, 159, 34);
		contentPane.add(btnEbooks);
		
		ImageIcon games = new ImageIcon("Images/games.png");
		JButton btnGames = new JButton(games);
		btnGames.setBorder(BorderFactory.createEmptyBorder());
		btnGames.setContentAreaFilled(false);
		btnGames.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnGames.setBackground(new Color(0, 191, 255));
		btnGames.setForeground(new Color(0, 0, 0));
		btnGames.setBounds(49, 125, 159, 34);
		contentPane.add(btnGames);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(20, 11, 408, 103);
		contentPane.add(imagelabel);
		
		ImageIcon exit = new ImageIcon("Images/exit.png");
		JButton btnExit = new JButton(exit);
		btnExit.setBorder(BorderFactory.createEmptyBorder());
		btnExit.setContentAreaFilled(false);
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		btnExit.setBackground(new Color(0, 191, 255));
		btnExit.setBounds(150, 397, 159, 21);
		contentPane.add(btnExit);
		
		if (ExistingUser.permission.equals("Organiser")) {
			btnNewButton.setEnabled(false);
			btnNews.setEnabled(false);
			btnMatchMaking.setEnabled(false);
			btnDictionary.setEnabled(false);
			btndtotoGenerator.setEnabled(false);
			btnEbooks.setEnabled(false);
			btnGames.setEnabled(false);
		}
		
		btnNews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NewsApp news = new NewsApp();
					news.setVisible(true);
				} catch (IOException | FontFormatException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnDictionary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DictionaryApp dic = new DictionaryApp();
					dic.setVisible(true);
				} catch (IOException | FontFormatException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btndtotoGenerator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NumGenerator generator = new NumGenerator();
					generator.setVisible(true);
				} catch (IOException | FontFormatException e1) {
					e1.printStackTrace();
				}
			}
		});
		
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

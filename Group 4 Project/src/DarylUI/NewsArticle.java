package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entity.News;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class NewsArticle extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	static News news = new News();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewsArticle frame = new NewsArticle(news);
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
	public NewsArticle(){}
	
	public NewsArticle(News news) throws FontFormatException, IOException {
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(18f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(22f);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel headline = new JLabel(news.getHeadline());
		headline.setBounds(25, 15, 525, 50);
		contentPane.add(headline);
		
		JSeparator line = new JSeparator();
		line.setBounds(25, 63, 525, 5);
		contentPane.add(line);
		
		JTextArea content = new JTextArea(news.getArticle());
		content.setBounds(25, 81, 525, 280);
		content.setLineWrap(true);
		content.setWrapStyleWord(true);
		content.setEditable(false);
		
		
		JScrollPane pane = new JScrollPane(content);
		pane.setBounds(25, 81, 525, 280);
		contentPane.add(pane);
		
		
		
		
		headline.setFont(headlineFont);
		content.setFont(sizedFont);
		
		
	}
}

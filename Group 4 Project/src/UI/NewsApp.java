package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Color;
import Database.DBController;
import Database.NewsDA;
import Entity.News;


public class NewsApp extends JFrame  {
	int page = 1;
	
	
	ArrayList<News> news2 = new ArrayList<News>();
	ArrayList<JTextPane> news = new ArrayList();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewsApp frame = new NewsApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static ImageIcon getIcon(String Image, int x) {
		ImageIcon z = new ImageIcon(Image);
		Image q =  z.getImage();
		Image w =  q.getScaledInstance(x,x, java.awt.Image.SCALE_SMOOTH);
		ImageIcon y = new ImageIcon(w);
		
		return y;
	}
	
	public static ImageIcon getIcon(String Image) {
		ImageIcon z = new ImageIcon(Image);
		Image q =  z.getImage();
		Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
		ImageIcon y = new ImageIcon(w);
		
		return y;
	}
	

	/**
	 * Create the frame.
	 */
	public NewsApp() throws IOException, FontFormatException {
		setBackground(Color.WHITE);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(14f);
		ImageIcon backie = new ImageIcon("Images/previous.png");
		ImageIcon nextie = new ImageIcon("Images/next.png");
		setTitle("News");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane News1 = new JTextPane();
		News1.setEditable(false);
		News1.setBounds(30, 90, 260, 225);
		contentPane.add(News1);
		
		JTextPane News2 = new JTextPane();
		News2.setEditable(false);
		News2.setBounds(320, 90, 260, 225);
		contentPane.add(News2);
		
		JTextPane News3 = new JTextPane();
		News3.setEditable(false);
		News3.setBounds(610, 90, 260, 225);
		contentPane.add(News3);
		
		JTextPane News4 = new JTextPane();
		News4.setEditable(false);
		News4.setBounds(30, 345, 260, 225);
		contentPane.add(News4);
		
		JTextPane News5 = new JTextPane();
		News5.setEditable(false);
		News5.setBounds(320, 345, 260, 225);
		contentPane.add(News5);
		
		JTextPane News6 = new JTextPane();
		News6.setEditable(false);
		News6.setBounds(610, 345, 260, 225);
		contentPane.add(News6);
		
		
		news.add(News1);
		news.add(News2);
		news.add(News3);
		news.add(News4);
		news.add(News5);
		news.add(News6);
		
		
		
		JComboBox Category = new JComboBox();
		Category.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBController db = new DBController();
				String selected = Category.getSelectedItem().toString();
				if (page == 1) {	
					if (selected == "World") {
						news2 = NewsDA.RetrieveFrontPage(page, selected);
						for (int i = 0; i < news.size() ; i++) {
												
						news.get(i).setText(news2.get(i).getHeadline() + "\n");
						news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
						
						
						//news.get(i).insertIcon(WorldImages.get(i));
						}
				}
					else {
						
						news2 = NewsDA.RetrieveFrontPage(page, selected);
						for (int i = 0; i < news.size() ; i++) {
						news.get(i).setText(news2.get(i).getHeadline() + "\n");
						news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
						}
					}
				}
			
			
			else {
				if(selected == "World") {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
					news.get(i).setText(news2.get(i).getHeadline() + "\n");
					news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
				}
				}
				else {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
					news.get(i).setText(news2.get(i).getHeadline() + "\n");
					news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
					}
				}
			}
				
			}
		});
		JButton Previous = new JButton(backie);
		Previous.setBorder(BorderFactory.createEmptyBorder());
		Previous.setContentAreaFilled(false);
		JButton Next = new JButton(nextie);

		Previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page--;
				Next.setEnabled(true);
				Previous.setEnabled(false);
				String selected = Category.getSelectedItem().toString();
				if(Category.getSelectedItem().toString() == "Economic") {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
					news.get(i).setText(news2.get(i).getHeadline() + "\n");
					news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
					}
				}
				else {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
					news.get(i).setText(news2.get(i).getHeadline() + "\n");
					news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
					}
				}
				}
			
		});
		Previous.setBounds(30, 30, 260, 30);
		contentPane.add(Previous);
		Previous.setFont(sizedFont);
		Next.setBorder(BorderFactory.createEmptyBorder());
		Next.setContentAreaFilled(false);
		
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Next.setEnabled(false);
			Previous.setEnabled(true);
			page++;
			String selected = Category.getSelectedItem().toString();
			if(Category.getSelectedItem().toString() == "Economic") {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
						news.get(i).setText(news2.get(i).getHeadline() + "\n");
						news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
						}
					}
					else {
						news2 = NewsDA.RetrieveFrontPage(page, selected);
						for (int i = 0; i < news.size() ; i++) {
						news.get(i).setText(news2.get(i).getHeadline() + "\n");
						news.get(i).insertIcon(getIcon(news2.get(i).getImage()));
						}
					}
					}
		
		});
		Next.setBounds(610, 30, 260, 30);
		contentPane.add(Next);
		Next.setFont(sizedFont);
		Category.setBounds(370, 30, 160, 30);
		contentPane.add(Category);
		Category.addItem("World");
		Category.addItem("Economic");
		
		if (page == 1) {
			Previous.setEnabled(false);
		}
		DBController db = new DBController();
		News news = new News();
		News1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				if (Category.getSelectedItem().toString() == "World") {
					int id = 1;
					ResultSet rs = null;
					String dbQuery = "SELECT Headline, Content, Pics FROM news WHERE id = '" + id + "'";
					rs = db.readRequest(dbQuery);
					String headline = "", content = "";
					
					try {
						while (rs.next()) {
					headline += rs.getString("Headline");
					content += rs.getString("Content");
						}
					}
					catch (SQLException z) { 
						z.printStackTrace();
					}
					news.setHeadline(headline);
					news.setArticle(content);
					
					NewsArticle article;
					try {
						article = new NewsArticle(news);
						article.setVisible(true);
					} catch (FontFormatException | IOException e1) {
						e1.printStackTrace();
					}
				}
				
				else {
					int id;
					if (page == 1) 
						id = 13;
					else
						id = 19;
					
					String selected = Category.getSelectedItem().toString();
					ResultSet rs = null;
					String dbQuery = "SELECT Headline, Content FROM news WHERE id = '" + id + 
							"'";
					rs = db.readRequest(dbQuery);
					String headline = "", content = "";
					
					try {
						while (rs.next()) {
					headline += rs.getString("Headline");
					content += rs.getString("Content");
						}
					}
					catch (SQLException z) { 
						z.printStackTrace();
					}
					news.setHeadline(headline);
					news.setArticle(content);
					
					NewsArticle article;
					try {
						article = new NewsArticle(news);
						article.setVisible(true);
					} catch (FontFormatException | IOException e1) {
						e1.printStackTrace();
					}
					
				}
				
			}
		});	
		
		News1.setFont(sizedFont);
		News2.setFont(sizedFont);
		News3.setFont(sizedFont);
		News4.setFont(sizedFont);
		News5.setFont(sizedFont);
		News6.setFont(sizedFont);
		Category.setFont(sizedFont);
	
	}
}

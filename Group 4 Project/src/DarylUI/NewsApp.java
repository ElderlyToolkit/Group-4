package DarylUI;

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


public class NewsApp extends JFrame  {
	int page = 1;
	
	ImageIcon testing;
	
	ArrayList<News> news2 = new ArrayList<News>();
	ArrayList<JTextPane> news = new ArrayList();
	ArrayList<ImageIcon> WorldImages = new ArrayList<ImageIcon>();
	ArrayList<ImageIcon> WorldImages2 = new ArrayList<ImageIcon>();
	ArrayList<ImageIcon> EconomicImages = new ArrayList<ImageIcon>();
	ArrayList<ImageIcon> EconomicImages2 = new ArrayList<ImageIcon>();
	
	ImageIcon australia = new ImageIcon("Images/australiafire.jpg");
	Image fire = australia.getImage();
	Image smallfire = fire.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon australia2 = new ImageIcon(smallfire);

	ImageIcon california = new ImageIcon("Images/california.jpeg");
	Image gas = california.getImage();
	Image methane = gas.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon california2 = new ImageIcon(methane);
	
	ImageIcon china = new ImageIcon("Images/chinacivilian.jpg");
	Image civilian = china.getImage();
	Image chinacivilian = civilian.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon china2 = new ImageIcon(chinacivilian);

	ImageIcon cologne = new ImageIcon("Images/cologne.jpeg");
	Image sexual = cologne.getImage();
	Image assasult = sexual.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon cologne2 = new ImageIcon(assasult);

	ImageIcon india = new ImageIcon("Images/indiabull.jpg");
	Image bull = india.getImage();
	Image fighting = bull.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon india2 = new ImageIcon(fighting);
	
	ImageIcon israeli = new ImageIcon("Images/israeli.jpg");
	Image reporter = israeli.getImage();
	Image stabbed = reporter.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon israeli2 = new ImageIcon(stabbed);
	
	ImageIcon jet = new ImageIcon("Images/jetsniffer.jpg");
	Image sniffer = jet.getImage();
	Image radiation = sniffer.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon jet2 = new ImageIcon(radiation);
	
	ImageIcon kim = new ImageIcon("Images/kimjongun.jpeg");
	Image jong = kim.getImage();
	Image unnie = jong.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon kimchi = new ImageIcon(jong);
	
	ImageIcon libya = new ImageIcon("Images/libyatank.jpg");
	Image tank = libya.getImage();
	Image explode = tank.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon IS = new ImageIcon(explode);
	
	ImageIcon nauru2 = new ImageIcon("Images/nauru.jpg");
	Image what = nauru2.getImage();
	Image is = what.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon nauru = new ImageIcon(is);
	
	ImageIcon nra = new ImageIcon("Images/nra.jpg");
	Image obama = nra.getImage();
	Image not = obama.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon happy = new ImageIcon(not);

	ImageIcon paris = new ImageIcon("Images/parisknife.jpg");
	Image knifer = paris.getImage();
	Image shot = knifer.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon down = new ImageIcon(shot);
	
	
	
	
	
	
	ImageIcon chinadrop = new ImageIcon("Images/china.jpg");
	Image again =  chinadrop.getImage();
	Image sad =  again.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon face = new ImageIcon(sad);
	
	ImageIcon chinaagain = new ImageIcon("Images/chinaagain.jpg");
	Image keep =  chinaagain.getImage();
	Image on =  keep.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon dropping = new ImageIcon(on);

	ImageIcon chinaworries = new ImageIcon("Images/chinaworries.jpg");
	Image why = chinaworries.getImage();
	Image so =  why.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon worried = new ImageIcon(so);
	
	ImageIcon feds = new ImageIcon("Images/feds.jpg");
	Image watch =  feds.getImage();
	Image rout =  watch.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon fed = new ImageIcon(rout);
	
	ImageIcon asia = new ImageIcon("Images/ipo.jpg");
	Image tops =  asia.getImage();
	Image global = tops.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon ipo = new ImageIcon(global);
	
	ImageIcon how = new ImageIcon("Images/irs.jpg");
	Image to =  how.getImage();
	Image skip =  to.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon irs = new ImageIcon(skip);
	
	ImageIcon olofmeister = new ImageIcon("Images/mester.jpg");
	Image boostmeister =  olofmeister.getImage();
	Image good =  boostmeister.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon mester = new ImageIcon(good);
	
	ImageIcon olofmeister2 = new ImageIcon("Images/mester2.jpg");
	Image boostmeister2 =  olofmeister2.getImage();
	Image gud =  boostmeister2.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon mester2 = new ImageIcon(gud);
	
	ImageIcon the = new ImageIcon("Images/prediction.jpg");
	Image god =  the.getImage();
	Image of =  god.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon predictions = new ImageIcon(of);
	
	ImageIcon random = new ImageIcon("Images/random.jpg");
	Image pic = random.getImage();
	Image ay =  pic.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon found = new ImageIcon(ay);
	
	ImageIcon sing = new ImageIcon("Images/singdollar.jpg");
	Image dollar =  sing.getImage();
	Image still =  dollar.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon strong = new ImageIcon(still);
	
	ImageIcon stocks = new ImageIcon("Images/stocks.jpg");
	Image going =  stocks.getImage();
	Image up =  going.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
	ImageIcon once = new ImageIcon(up);
	
	
	
	

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
		
		WorldImages.add(cologne2);
		WorldImages.add(california2);
		WorldImages.add(kimchi);
		WorldImages.add(IS);
		WorldImages.add(israeli2);
		WorldImages.add(china2);
		
		WorldImages2.add(down);
		WorldImages2.add(jet2);
		WorldImages2.add(nauru);
		WorldImages2.add(india2);
		WorldImages2.add(happy);
		WorldImages2.add(australia2);
		
		EconomicImages.add(face);
		EconomicImages.add(dropping);
		EconomicImages.add(predictions);
		EconomicImages.add(worried);
		EconomicImages.add(mester);
		EconomicImages.add(mester2);
		
		EconomicImages2.add(fed);
		EconomicImages2.add(irs);
		EconomicImages2.add(found);
		EconomicImages2.add(strong);
		EconomicImages2.add(ipo);
		EconomicImages2.add(once);
		
		JComboBox Category = new JComboBox();
		Category.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBController db = new DBController();
				String selected = Category.getSelectedItem().toString();
				if (page == 1) {	
					if (selected == "World") {
						news2 = NewsDA.RetrieveFrontPage(page, selected);
						for (int i = 0; i < news.size() ; i++) {
						ImageIcon d = new ImageIcon(news2.get(i).getImage());
						Image q =  d.getImage();
						Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
						ImageIcon y = new ImageIcon(w);
						
						news.get(i).setText(news2.get(i).getHeadline() + "\n");
						news.get(i).insertIcon(y);
						
						
						//news.get(i).insertIcon(WorldImages.get(i));
						}
				}
					else {
						
						news2 = NewsDA.RetrieveFrontPage(page, selected);
						for (int i = 0; i < news.size() ; i++) {
						news.get(i).setText(news2.get(i).getHeadline() + "\n");
						ImageIcon d = new ImageIcon(news2.get(i).getImage());
						Image q =  d.getImage();
						Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
						ImageIcon y = new ImageIcon(w);
						news.get(i).insertIcon(y);
						}
					}
				}
			
			
			else {
				if(selected == "World") {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
					news.get(i).setText(news2.get(i).getHeadline() + "\n");
					ImageIcon d = new ImageIcon(news2.get(i).getImage());
					Image q =  d.getImage();
					Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
					ImageIcon y = new ImageIcon(w);
					news.get(i).insertIcon(y);
				}
				}
				else {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
					news.get(i).setText(news2.get(i).getHeadline() + "\n");
					ImageIcon d = new ImageIcon(news2.get(i).getImage());
					Image q =  d.getImage();
					Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
					ImageIcon y = new ImageIcon(w);
					news.get(i).insertIcon(y);
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
					ImageIcon d = new ImageIcon(news2.get(i).getImage());
					Image q =  d.getImage();
					Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
					ImageIcon y = new ImageIcon(w);
					news.get(i).insertIcon(y);
					}
				}
				else {
					news2 = NewsDA.RetrieveFrontPage(page, selected);
					for (int i = 0; i < news.size() ; i++) {
					news.get(i).setText(news2.get(i).getHeadline() + "\n");
					ImageIcon d = new ImageIcon(news2.get(i).getImage());
					Image q =  d.getImage();
					Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
					ImageIcon y = new ImageIcon(w);
					news.get(i).insertIcon(y);
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
						ImageIcon d = new ImageIcon(news2.get(i).getImage());
						Image q =  d.getImage();
						Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
						ImageIcon y = new ImageIcon(w);
						news.get(i).insertIcon(y);
						}
					}
					else {
						news2 = NewsDA.RetrieveFrontPage(page, selected);
						for (int i = 0; i < news.size() ; i++) {
						news.get(i).setText(news2.get(i).getHeadline() + "\n");
						ImageIcon d = new ImageIcon(news2.get(i).getImage());
						Image q =  d.getImage();
						Image w =  q.getScaledInstance(260,180, java.awt.Image.SCALE_SMOOTH);
						ImageIcon y = new ImageIcon(w);
						news.get(i).insertIcon(y);
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

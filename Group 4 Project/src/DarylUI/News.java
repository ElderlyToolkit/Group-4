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
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.awt.Font;
import java.awt.FontFormatException;
import java.util.ArrayList;
import java.awt.Color;
import NewsArticles.*;

public class News extends JFrame  {
	int page = 1;
	String[] World = {"123","321","231","456","654","564"};
	String[] World2 = {"12","32","23","45","65","56"};
	String[] Economic = {"abc","cba","bca","def","fed","efd"};
	String[] Economic2 = {"ab","cb","bc","de","fe","ef"};
	ArrayList<JTextPane> news = new ArrayList();
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					News frame = new News();
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
	public News() throws IOException, FontFormatException {
		setBackground(Color.WHITE);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(14f);
		
		setTitle("News");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane News1 = new JTextPane();
		News1.setEditable(false);
		News1.setBounds(25, 58, 174, 129);
		contentPane.add(News1);
		
		JTextPane News2 = new JTextPane();
		News2.setEditable(false);
		News2.setBounds(237, 58, 174, 129);
		contentPane.add(News2);
		
		JTextPane News3 = new JTextPane();
		News3.setEditable(false);
		News3.setBounds(446, 58, 174, 129);
		contentPane.add(News3);
		
		JTextPane News4 = new JTextPane();
		News4.setEditable(false);
		News4.setBounds(25, 222, 174, 129);
		contentPane.add(News4);
		
		JTextPane News5 = new JTextPane();
		News5.setEditable(false);
		News5.setBounds(237, 222, 174, 129);
		contentPane.add(News5);
		
		JTextPane News6 = new JTextPane();
		News6.setEditable(false);
		News6.setBounds(446, 222, 174, 129);
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
				String selected = Category.getSelectedItem().toString();
			if (page == 1) {	
			
				if (selected == "World") {
					for (int i = 0; i < 6 ; i++) {
						news.get(i).setText(World[i]);
					}
				}
				else {
					for (int i = 0 ; i < 6 ; i++) {
						news.get(i).setText(Economic[i]);
					}
				}
			}
			
			else {
				if(selected == "World") {
					for (int i = 0; i < 6 ; i++) {
						news.get(i).setText(World2[i]);
					}
				}
				else {
					for (int i = 0; i < 6 ; i++) {
						news.get(i).setText(Economic2[i]);
					}
				}
			}
				
			}
		});
		Category.setBounds(268, 16, 113, 26);
		contentPane.add(Category);
		Category.addItem("World");
		Category.addItem("Economic");
		
		News1.setText(Economic1.returnHeadline());
		
		JButton Previous = new JButton("Previous Page <");
		
		JButton Next = new JButton("> Next Page");
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Next.setEnabled(false);
			Previous.setEnabled(true);
			page++;
			
					if(Category.getSelectedItem().toString() == "Economic") {
						for (int i = 0; i < 6 ; i++) {
							news.get(i).setText(Economic2[i]);
						}
					}
					else {
						for (int i = 0; i < 6 ; i++) {
							news.get(i).setText(World2[i]);
						}
					}
					}
				
				
		
		
		});
		Next.setBounds(446, 15, 174, 29);
		contentPane.add(Next);
		
		

		Previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page--;
				Next.setEnabled(true);
				Previous.setEnabled(false);
				if(Category.getSelectedItem().toString() == "Economic") {
					for (int i = 0; i < 6 ; i++) {
						news.get(i).setText(Economic[i]);
					}
				}
				else {
					for (int i = 0; i < 6 ; i++) {
						news.get(i).setText(World[i]);
					}
				}
				}
			
		});
		Previous.setBounds(25, 15, 174, 29);
		contentPane.add(Previous);
		if (page == 1) {
			Previous.setEnabled(false);
		}
		
		News1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				if (page == 1) {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(1,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(1,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				
				}
				
				else {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(7,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(7,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				}
			}
		});
		
		News2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				if (page == 1) {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(2,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(2,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				
				}
				
				else {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(8,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(8,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				}
			}
		});
		
		News3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				if (page == 1) {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(3,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(3,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				
				}
				
				else {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(9,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(9,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				}
			}
		});
		News4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				if (page == 1) {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(4,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(4,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				
				}
				
				else {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(10,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(10,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				}
			}
		});
		News5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				if (page == 1) {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(5,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(5,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				
				}
				
				else {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(11,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(11,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				}
			}
		});
		News6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				if (page == 1) {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(6,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(6,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
					}
					
				
				}
				
				else {
					if (Category.getSelectedItem() == "World") {
						Mainframe mf = null;
						try {
							mf = new Mainframe(12,"World");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
					}
					
					else {
						Mainframe mf = null;
						try {
							mf = new Mainframe(12,"Economic");
						} catch (IOException | FontFormatException e1) {
							e1.printStackTrace();
						}
						mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						mf.setVisible(true);
						
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
		Previous.setFont(sizedFont);
		Next.setFont(sizedFont);
		Category.setFont(sizedFont);
	
	}
}

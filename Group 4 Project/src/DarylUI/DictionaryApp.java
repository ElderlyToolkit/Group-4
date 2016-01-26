package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.DBController;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DictionaryApp extends JFrame {
	
	ImageIcon search = new ImageIcon("Images/search.png");

	private JPanel contentPane;
	private JTextField txt;
	private JTextArea Usage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryApp frame = new DictionaryApp();
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
	public DictionaryApp() throws IOException, FontFormatException {
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(16f);
		
		setTitle("Dictionary");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblText = new JLabel("Word/Phrases:\r\n");
		lblText.setBounds(15, 16, 133, 20);
		lblText.setFont(sizedFont);
		contentPane.add(lblText);
		
		txt = new JTextField();
		txt.setBounds(126, 13, 178, 26);
		contentPane.add(txt);
		txt.setColumns(10);
		txt.setFont(sizedFont);
		
		Usage = new JTextArea();
		Usage.setFont(new Font("Arial", Font.PLAIN, 16));
		Usage.setBounds(69, 55, 272, 152);
		contentPane.add(Usage);
		Usage.setFont(sizedFont);
		Usage.setEditable(false);
		
		JLabel lblUsage = new JLabel("Usage:");
		lblUsage.setBounds(15, 52, 69, 20);
		contentPane.add(lblUsage);
		lblUsage.setFont(sizedFont);
		
		JButton btnSearch = new JButton(search);
		btnSearch.setFont(sizedFont);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dictionary dic = DictionaryDA.retrieveMeaning(txt.getText());
				Usage.setText("");
				Usage.append(dic.getMeaning() + "\n");
				Usage.append(dic.getExample());
			}
		});
		
		btnSearch.setBounds(309, 15, 91, 23);
		contentPane.add(btnSearch);
	}
}


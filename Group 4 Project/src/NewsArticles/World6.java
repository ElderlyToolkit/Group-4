package NewsArticles;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import DarylUI.Masterpanel;

public class World6 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World6(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("China has landed two civilian planes on an artificial island built in the disputed South China Sea, days after an earlier landing there prompted international concern.\r\n\r\nXinhua state news agency released pictures of two commercial jets on the Fiery Cross Reef, which it called by its Chinese name Yongshu.\r\n\r\nVietnam and the US protested China's 2 January landing of a plane on the reef.\r\nThe resource-rich South China Sea is claimed by multiple countries.\r\n\r\nChina claims nearly the whole sea and is locked in a territorial dispute with other Asian nations such as Vietnam and the Philippines, who also claim parts of it.\r\n\r\nXinhua said that the China Southern and Hainan Airlines planes took off from Haikou airport on Wednesday morning and landed on Fiery Cross around 10:30am (02:30 GMT). They returned to mainland China in the afternoon.");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("China lands more civilian planes on Fiery Cross reef\r\n");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 524, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(24f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

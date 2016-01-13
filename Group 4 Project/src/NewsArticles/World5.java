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

public class World5 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World5(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("An Israeli journalist has been stabbed accidentally while demonstrating a protective vest for a TV report.\r\nEitam Lachover, of Israel's Channel 1, was asked to don the supposedly knife-proof jacket and be stabbed several times in front of the camera.\r\n\r\nBut the knife penetrated the vest and he suffered a slight cut to his back which required stitches.\r\nIsraeli soldiers are due to receive the same safety vest following a recent wave of stabbings by Palestinians.\r\n\r\nYaniv Montakyo, a vice president of the company that makes the vest, told Israel's Channel 2 that he had stabbed Mr Lachover in a section of the vest where there had been no protective material.\r\n\r\nHe said that an earlier recording had been successful and the reporter had not been harmed.\r\n\r\nLinda Bar, a spokeswoman for Israel's state broadcaster, said the report would be broadcast on Wednesday despite the mishap.\r\n\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Israeli TV reporter stabbed demonstrating 'knife-proof' vest");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 503, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(20f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

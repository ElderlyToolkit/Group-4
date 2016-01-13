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

public class World10 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World10(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("The Indian government has lifted a ban on Jallikattu, a version of bull fighting which has been popular for thousands of years in the southern state of Tamil Nadu.\r\n\r\nAt the annual festival held in January, thousands of men chase the bulls to grab prizes tied to their horns.\r\n\r\nThe Supreme Court imposed the ban in 2014 following objections from animal rights activists.\r\nThe sport will resume this month, after no events were held last year.\r\n\r\nWhile imposing the ban, the Supreme Court had said that use of bulls in the sport \"severely harmed\" the animals and was an offence under the Prevention of Cruelty to the Animals Act.\r\nThe Animal Welfare Board of India has said they will challenge the government order that lifted the ban.\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Jallikattu: India lifts ban on bullfighting in Tamil Nadu\r\n");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 449, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(22f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

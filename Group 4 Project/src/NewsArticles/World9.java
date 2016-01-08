package NewsArticles;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import DarylUI.Masterpanel;

public class World9 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World9(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("Nauru's police force has confirmed it is investigating an alleged sexual assault on a refugee child.\r\n\r\nThe reports said a six-year-old girl was allegedly assaulted by a person known to her and that the girl's father intervened to stop the act.\r\n\r\nA statement issued by Nauru police said the alleged assailant was also a refugee.\r\n\r\nAnyone who tries to reach Australia by boat to claim asylum is held in offshore centres, including on Nauru.\r\n\r\nAustralian government figures show that 92 children are in the Nauru centre, located about 4,500km (2,800 miles) northeast of Australia.\r\n\r\nThe government has been repeatedly urged to remove children from Nauru, with a Senate report last year saying conditions there were not \"appropriate or safe\".\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Nauru confirms refugee child assault investigation");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 546, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(14f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(22f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

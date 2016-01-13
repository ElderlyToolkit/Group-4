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

public class World12 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World12(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("A massive bushfire that devastated a small town is still burning out of control in Western Australia.\r\n\r\nAbout 95 houses in Yarloop, south of Perth, have been destroyed and three people are reported to be missing.\r\n\r\nWind gusts of up to 60km/h (37mph) overnight fanned the blaze, dubbed the Waroona fire, to heights of 50m.\r\n\r\nThe fire area is now 58,000 hectares and emergency warnings remain in place for Waroona, Harvey and surrounding areas including Preston Beach.\r\n\r\nA local politician told the BBC the fire \"could well be the end\" of Yarloop.");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Australia Waroona fire threatens more towns after devastating Yarloop\r\n");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 570, 33);
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

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

public class World7 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World7(JFrame mf)  throws IOException, FontFormatException{
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setLineWrap(true);
		Info.setWrapStyleWord(true);
		Info.setText("Paris, on edge after weathering a year of jihadist violence, faced a fresh scare Thursday as police shot dead a knife-wielding man on the anniversary of the Charlie Hebdo attacks.\r\n\r\nAn image of the ISIS flag, printed on paper, was found on the man's body, along with a handwritten note in Arabic from him claiming responsibility for the attack, the Paris prosecutor's office said in a statement. The office's anti-terror section is investigating.\r\n\r\nThe man, whose identity is not known, was shot as he attempted to enter a police station in the northern Paris neighborhood of Barbes, bearing a butcher's knife and yelling \"Allahu Akbar,\" the statement said. He was carrying a fake explosive device, it said.\r\n\r\nFrench Interior Minister Bernard Cazeneuve said at a press conference that investigations were underway to determine the identity of the attacker and his motivations.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		JLabel Headline = new JLabel("Man with knife killed by Paris police on anniversary of Charlie Hebdo attacks");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 557, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(18f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

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

public class World8 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World8(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("A U.S. Air Force radiation \"sniffer\" jet may soon be flying off the Korean Peninsula to help determine if North Korea's claims of a hydrogen bomb test are true, a U.S. military official says.\r\n\r\nThe White House said Wednesday it was skeptical of North Korea's claim that it successfully detonated a thermonuclear device.\r\n\r\n\"The initial analysis is not consistent with the North Korean claims,\" White House spokesman Josh Earnest said.\r\n\r\nBut the Pentagon has a way to be more certain whether a hydrogen bomb was tested.\r\n\r\nA U.S. official told CNN that a nuclear test of any type would emit distinctive elements into the air, and collected samples can be analyzed to determine exactly what occurred. That's exactly what the WC-135W jet, dubbed the \"Constant Phoenix,\" does.\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Air Force radiation 'sniffer' jet may be headed to Korea\r\n");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 496, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(15f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(21f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

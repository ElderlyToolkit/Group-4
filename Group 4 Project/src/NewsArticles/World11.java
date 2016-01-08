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

public class World11 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World11(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("US President Barack Obama has strongly criticised the most powerful US gun lobby during a televised public forum.\r\n\r\nHe said the National Rifle Association (NRA) had deliberately misrepresented proposed legislation on gun control.\r\n\r\nThe NRA declined to take part in the discussion, which it called a public relations spectacle.Meanwhile, US Republican presidential hopeful Donald Trump said he would eliminate gun-free zones in schools on his first day in office, if elected.\r\n\r\nAddressing the audience at George Mason University in Fairfax, Virginia, Mr Obama blamed the NRA and others for suggesting that \"somebody's going to come grab your guns\".\r\n\r\nHe said that all he was seeking to do was strengthen background checks - not seize all firearms.\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Barack Obama accuses NRA of misleading US over guns");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 515, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(14f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(21f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

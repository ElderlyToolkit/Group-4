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

public class World4 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World4(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("The fires are reported to be raging in Sidra and Ras Lanouf, on the coast between Sirte and Benghazi.\r\n\r\nOfficials said at least 10 guards had been killed since IS attacked the neighbouring ports on Monday.\r\nWarplanes from Libya's internationally recognised government have provided air support to help defend the area.\r\n\r\nLibya has been split between rival militias and two competing governments since the fall of Muammar Gaddafi in 2011.\r\n\r\nIS has been operating in Libya for about a year, and in December France warned that the group was aiming to seize the country's oil wells.\r\n\r\nAli al-Hassi, of the Petrol Facilities Guard militia, said on Wednesday that neither Sidra nor Ras Lanouf had fallen to IS so far.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Libya oil storage tanks ablaze after assault by IS");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 520, 33);
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

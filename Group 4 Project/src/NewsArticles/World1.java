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

public class World1 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World1(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("The mayor of Cologne has summoned police for crisis talks after about 80 women reported sexual assaults and muggings by men on New Year's Eve.\r\nThe scale of the attacks on women at the city's central railway station has shocked Germany. About 1,000 drunk and aggressive young men were involved.\r\nCity police chief Wolfgang Albers called it \"a completely new dimension of crime\". The men were of Arab or North African appearance, he said.\r\nWomen were also targeted in Hamburg.But the Cologne assaults - near the city's iconic cathedral - were the most serious, German media report. At least one woman was raped, and many were groped.\r\nMost of the crimes reported to police were robberies. A volunteer policewoman was among those sexually molested.\r\nCologne will stage carnival events in February, with hundreds of thousands of revellers expected in the streets, as on New Year's Eve.\r\nThe police chief said \"the assailants' behaviour is a real concern for me, also because of the carnival\".\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Germany shocked by Cologne New Year gang assaults on women");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 558, 33);
		add(Headline);
		
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(21f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

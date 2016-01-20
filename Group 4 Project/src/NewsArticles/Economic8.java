package NewsArticles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

import DarylUI.Masterpanel;

public class Economic8 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic8(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("Getting audited by the Internal Revenue Service\u2014and losing\u2014is devastating. You have to pay more in taxes, and, perhaps scared of a repeat defeat, you\u2019re likely to report much more income in future years.\r\n\r\nOnce bitten, twice shy.\r\n\r\nBut getting audited by the IRS and winning the fight with the taxman is a completely different experience, according to a study released this week by the IRS\u2019s National Taxpayer Advocate. Self-employed taxpayers who got audited and came out unscathed reported less income in future years, an average of 35% lower three years after the audit, the study says. Having learned where the edge is, they seem to skate closer to it.\r\n\r\nOnce bitten, twice sly.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("What Happens After You Beat the IRS in an Audit");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 570, 33);
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



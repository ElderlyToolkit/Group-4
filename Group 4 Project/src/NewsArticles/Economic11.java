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

public class Economic11 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic11(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("The Asia-Pacific region dominated global initial public offering (IPO) activity in the past 12 months, improving on its 2014 showing and promising a better 2016 as mainland China reopens its listings market with new rules in place.\r\n\r\nGlobal IPO listings volume fell by 2 per cent to 1,218, raising a total capital of US$195.5 billion (S$276.7 billion) - a 25 per cent nosedive from 2014 - according to EY's annual report on global IPO trends.\r\n\r\nWhile there was no single reason for the decline in activity, uncertainties over central bank monetary policies, concerns over a slowing China and a record year for mergers and acquisitions could have been among the factors. Firms also had a greater range of attractive financing options such as issuing bonds.\r\n\r\nIn the United States, the IPO market was disappointing with 169 filings raising only US$30 billion, according to Renaissance Capital IPO Centre's 2015 annual review. EY's figure was similar at 173 worth US$33.3 billion.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Asia-Pacific tops global IPO activity");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 504, 33);
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



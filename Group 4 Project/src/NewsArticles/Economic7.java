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

public class Economic7 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic7(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("Stocks across the globe fell on Wednesday to their lowest in nearly three months as a move to weaken China's currency fuelled fears about the strength of the world's second largest economy and as Brent crude hit its lowest since 2004.\r\n\r\nA nuclear test by North Korea added to a growing list of geopolitical worries including a row between Saudi Arabia and Iran that made any cooperation between major oil exporters to cut output even more unlikely.\r\n\r\nEnergy stocks led the slide on Wall Street, with the S&P 500 at a three-month low despite strong U.S. job market data. Losses deepened after minutes from the latest Federal Reserve meeting showed some Fed officials were worried that inflation could get stuck at dangerously low levels.\r\n\r\nThe U.S. dollar weakened and Treasury yields fell after the Fed minutes.\r\n\r\nTraders and economists feared the move from China to further depreciate the yuan may mean the world's second-biggest economy is even weaker than had been expected and could trigger another wave of competitive devaluations in the region.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Global stocks slide on China, oil; North Korea test adds to worries");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 509, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(19f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

	}



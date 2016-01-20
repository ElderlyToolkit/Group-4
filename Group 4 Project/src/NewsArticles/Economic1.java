package NewsArticles;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

import DarylUI.Masterpanel;
import javax.swing.JScrollPane;

public class Economic1 extends Masterpanel {

	

	/**
	 * Create the panel.
	 */
	public Economic1(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setWrapStyleWord(true);
		Info.setFont(new Font("Monospaced", Font.PLAIN, 16));
		Info.setLineWrap(true);
		Info.setText("OK, we know China did what China has done before \u2014 it took a big dump. It's not the first time, folks.\r\nChina has fallen before, China has rallied before.We've seen swings of 10 percent up and down from China, and   we're still here. They have banned short-selling in the past \u2014 and they will do it again. \r\nThey have cut and raised interest rates \u2014 and they will do it again. \r\n\r\nThey have bought back shares and applied quantitative   easing (QE) methods to the problem \u2014 and they will do itagain. China will continue to be volatile. These facts  we know.\r\n\r\nMeanwhile, Europe is still going to apply Super Mario's (ECB Head Mario Draghi's) $1 trillion of QE. The effects have begun to take hold. After the first six months of Draghi's QE, the European Central Bank's plan to flood the financial system with cash by purchasing bonds is making progress. Unemployment in the euro zone is falling. Germany, one of the most powerful economies on earth, showed its manufacturing sector was expanding at a better-than-expected pace. Most analysts still predict profits for companies in the currency bloc will increase 12 percent in 2016, according to a recent survey.\r\n\r\nI offer this for those doomsayers who insist that a severe decline in the U.S. and global markets like we're seeing on Monday marks the end of the world: The world isn't ending. The sky isn't falling. But those with naked long, unhedged exposure to the markets are certainly feeling the pain of being overexposed (\"Unhedged\" happens to be the title of one of \"Fast Money\" regular Stephen Weiss' books!). Some of you will promise yourselves \u2014 yet again \u2014 that you will learn to own some hedges, such as VIX futures, VIX call spreads, SPY, or IWM put spreads. But, sadly, most of you will abandon expanding your toolkit and instead will just take the pain whenever the market throws a 3-percent punch in your mouth. That's really not a good plan, but I know a majority of you will go down this route. \r\n\r\nMeanwhile, Europe is still going to apply Super Mario's (ECB Head Mario Draghi's) $1 trillion of QE. The effects have begun to take hold. After the first six months of Draghi's QE, the European Central Bank's plan to flood the financial system with cash by purchasing bonds is making progress. \r\n\r\nUnemployment in the euro zone is falling. Germany, one of the most powerful economies on earth, showed its manufacturing sector was expanding at a better-than-expected pace. Most analysts still predict profits for companies in the currency bloc will increase 12 percent in 2016, according to a recent survey.\r\n");
		Info.setBounds(15, 116, 570, 318);
		
		JLabel Headline = new JLabel("Market sell-off isn\u2019t the end of the world");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 443, 33);
		add(Headline);
		
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(22f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
		
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
	}
	}



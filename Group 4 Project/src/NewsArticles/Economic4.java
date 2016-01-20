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

public class Economic4 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic4(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("New data on Chinese factory activity sent a wave of financial concern across the Pacific Monday on the first day of stock trading in the new year, sending major U.S. indices sharply lower. The Dow Jones industrial average closed down 276 points, or nearly 1.6 percent of its total value.\r\n\r\nAll major U.S. stock exchanges and indexes plunged before opening on news that Chinese factory activity shrank sharply in December, and remained well in the red throughout the day. Middle East tensions, which briefly pushed up oil prices, added to the angst on Wall Street.\r\n\r\nThe Dow closed down closed down 276.09 points, or 1.58 percent; the S&P 500 lost 31.28 points, or 1.53 percent, and the Nasdaq Composite dropped 104.32 points, or 2.08 percent.\r\n\r\nEarlier, the Dow was briefly down more than 450 points, or more than 2.5 percent -- a percentage decline that would have made it the worst opening day of trading since 1932, in the midst of the Great Depression -- before mounting a late recovery.\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("China Worries Send U.S. Stocks Tumbling");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 558, 33);
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



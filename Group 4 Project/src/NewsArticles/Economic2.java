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

public class Economic2 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic2(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setLineWrap(true);
		Info.setWrapStyleWord(true);
		Info.setFont(new Font("Monospaced", Font.PLAIN, 16));
		Info.setText("China's stocks were suspended from all trade on Thursday after the CSI300 tumbled more than 7 percent in early trade, triggering the market's circuit breaker for a second time this week.\r\n\r\nThat drop-kicked stock markets across Asia, which were already wallowing after a weaker open amid concerns over China's swooning currency and economic slowdown as well as falling oil prices.\r\nOn the mainland, the Shanghai Composite had tumbled 7.32 percent by at the time of the halt, while the Shenzhen Composite plummeted 8.34 percent. The CSI300, the benchmark index against which China's new circuit breakers are set, plunged 7.21 percent. If that index rises or falls 5 percent, the market halts all trade for 15 minutes. If it subsequently falls by 7 percent, trading is suspended for the rest of the day.\r\n\r\nIn total Thursday, China shares only traded around 15 minutes.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Asian stocks steeply lower after China suspends trade early\r\n");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 516, 33);
		add(Headline);
		
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(14f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(19f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);

	}

	}



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
		Info.setLineWrap(true);
		Info.setWrapStyleWord(true);
		Info.setFont(new Font("Monospaced", Font.PLAIN, 16));
		Info.setText("Squawk Box Live is eyeing reaction after China's central bank attempted to buoy markets with a $20 billion cash injection on Tuesday.\r\n\r\nIt comes a day after Chinese stocks were halted for trade following a 7 percent slide in the CSI300 index. The rout resulted in trade being suspended for the day, triggering a global sell-off that left U.S. stocks with the worst start-of-year session since the financial crisis.");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("China injects $20B after market sell-off");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 516, 33);
		add(Headline);
		
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(12f);
		Info.setFont(sizedFont);
		Headline.setFont(sizedFont);

	}

	}



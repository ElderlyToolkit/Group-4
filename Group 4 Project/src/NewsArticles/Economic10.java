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

public class Economic10 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic10(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("The Singapore dollar hit a six-year low against the greenback yesterday amid turmoil on currency markets ignited by China's move to accelerate the yuan's depreciation.\r\n\r\nThe Singdollar fell as low as $1.4432 to the US dollar yesterday morning - a level not seen since June 2009 amid the financial crisis.\r\n\r\nBut it is staying strong against other currencies, buying RM3.06 and about A$1.\r\n\r\nDBS economist Irvin Seah said Singapore exports will now be pricier.\r\n\r\n\"This will have an impact on the purchasing power of the consumers over in China, as things from Singapore become more expensive,\" he said. However, he noted the yuan had devalued against all currencies, so any country exporting to China will be affected.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Six-year low to US$, but Sing$ still strong against other currencies\r\n");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 570, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(15f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(20f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

	}



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

public class Economic6 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic6(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setLineWrap(true);
		Info.setWrapStyleWord(true);
		Info.setText("The economy should grow at a slight faster pace in 2016 than last year, and the risks to the outlook are small, said Cleveland Fed President Loretta Mester on Sunday.\r\n\r\nIn a speech to the American Economic Association annual meeting in San Francisco, Mester forecast growth at a 2.5% to 2.75% pace in 2016.\r\n\r\nThis is faster than the 2.25% pace seen over the first three quarters of 2015.\r\n\r\n\u201COf course there are risks around any economic forecast...I see the risks as balanced and not overly large,\u201D Mester said.\r\n\r\nOn the downside, she said the dollar could strengthen further in foreign exchange markets or oil prices could drop further, which would push down already low inflation.\r\n\r\nOn the upside, consumer spending may get a boost from low gasoline prices, which could boost inflationary pressures, Mester said. She noted that over the past 15 years several highly regarded inflation models have underestimated actual inflation.");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Fed\u2019s Mester sees pickup in growth in 2016 ");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 339, 33);
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



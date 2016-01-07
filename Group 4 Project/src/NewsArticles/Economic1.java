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

public class Economic1 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic1(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(12f);
		
		JTextArea Info = new JTextArea();
		Info.setFont(new Font("Monospaced", Font.PLAIN, 16));
		Info.setLineWrap(true);
		Info.setText("OK, we know China did what China has done before \u2014 it took a big dump. It's not the first time, folks.\r\nChina has fallen before, China has rallied before.We've seen swings of 10 percent up and down from China, and   we're still here. They have banned short-selling in the past \u2014 and they will do it again. \r\nThey have cut and raised interest rates \u2014 and they will do it again. \r\nThey have bought back shares and applied quantitative   easing (QE) methods to the problem \u2014 and they will do itagain. China will continue to be volatile. These facts  we know.");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Market sell-off isn\u2019t the end of the world");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 443, 33);
		add(Headline);
		
		Info.setFont(sizedFont);
		Headline.setFont(sizedFont);

	}

	}



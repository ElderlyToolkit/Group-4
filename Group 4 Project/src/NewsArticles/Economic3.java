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
import javax.swing.JScrollBar;

public class Economic3 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic3(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		
		
		JTextArea Info = new JTextArea();
		Info.setRows(20);
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("The first week of 2016 has brought sinking temperatures and stocks\u2013and now weaker estimates of economic growth for the fourth quarter.\r\n\r\nBefore Monday, the U.S. economy appeared to have ended 2015 on solid, though unspectacular, footing. Many economists were estimating that the nation\u2019s gross domestic product\u2013or the sum of all goods and services produced\u2013grew at an annual pace of roughly 2% in October through December. That would match the third quarter\u2019s pace and fall roughly in line with average growth throughout the current expansion.\r\n\r\nBut those estimates are falling, due to weak readings Monday morning on the nation\u2019s manufacturing and construction activity, two key drivers of economic growth.\r\n\r\nThe Federal Reserve Bank of Atlanta said Monday it now believes fourth-quarter GDP grew at just a 0.7% pace, down from a prior estimate of 1.3% growth. J.P. Morgan Chase cut its estimate in half to 1% growth from 2%. Forecasting firm Macroeconomic Advisers lowered its estimate by three-tenths of a percentage point to 1.1%.\r\n\r\nIf those estimates pan out, it would mean the economy ended 2015 in roughly the same precarious state in which it began the year. GDP grew 0.6% in the first quarter of 2015 before rebounding in the spring and summer.\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("The market will drop more than 20%");
		Headline.setToolTipText("");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 554, 33);
		add(Headline);

		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(12f);
		Info.setFont(sizedFont);
		Headline.setFont(sizedFont);
	}
	}



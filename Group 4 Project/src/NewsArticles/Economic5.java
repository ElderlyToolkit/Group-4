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

public class Economic5 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic5(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setFont(new Font("Monospaced", Font.PLAIN, 13));
		Info.setLineWrap(true);
		Info.setWrapStyleWord(true);
		Info.setText("Weakness in China\u2019s economy is not a big risk to the U.S. economic outlook, Cleveland Fed President Loretta Mester said Monday, a day on which weak Chinese manufacturing data triggered a global stock-market selloff.\r\n\r\nIn an interview with Bloomberg Television, Mester said the Fed has already built a weakening Chinese economy into its forecast, and growth has been slowing in the Asian giant \u201Cfor a while.\u201D\r\n\r\n\u201CI don\u2019t see that as a significant risk to the forecast, but it is certainly a risk,\u201D Mester said.\r\n\r\n\u201CUnderlying fundamentals of the U.S. economy remain very sound,\u201D she added.\r\n\r\nOne piece of data on China\u2019s economy can move markets because it has been hard for economists to understand the actual scope of the downturn in the world\u2019s second-largest economy, she noted.\r\n\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Loretta Mester:China isn\u2019t a big risk to U.S. economy");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 570, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(12f);
		Info.setFont(sizedFont);
		Headline.setFont(sizedFont);
	}

	}



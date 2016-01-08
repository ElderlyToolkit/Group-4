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

public class Economic12 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic12(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("MOST banks wouldn\u2019t lend to Roberta. She arrived in New York from Mexico with papers but no credit history. But Neighborhood Trust Federal Credit Union, which specialises in lending to immigrants, gave her advice and a $2,000 loan. She started out selling Mexican food from a cart. She now runs a food truck, employs five people and has plans to expand.\r\n\r\nMany immigrants, like Roberta, want to save or start a business. But they struggle to get finance. In America 23% of households headed by a non-citizen, and 35% of households where only Spanish is spoken, have no bank accounts\u2014compared with 8% for the population as a whole. There are multiple barriers: not just low incomes, which make it hard to meet minimum-balance requirements, but also trouble with language, identification and trust.\r\n\r\nNeighborhood Trust is trying to change that. More than half its members are Latino, largely from the Dominican Republic, and many are undocumented. Most of the staff are themselves immigrants, and know their members well: they visit borrowers\u2019 businesses often and offer workshops on financial literacy. The hands-on approach keeps default rates low.");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Banking for immigrants");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 414, 33);
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



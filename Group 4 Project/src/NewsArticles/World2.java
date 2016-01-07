package NewsArticles;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import DarylUI.Masterpanel;

public class World2 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World2(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setEditable(false);
		Info.setLineWrap(true);
		Info.setWrapStyleWord(true);
		Info.setText("The governor of California has declared a state of emergency in a suburb of Los Angeles over the leaking of methane gas from an underground storage field.\r\n\r\nJerry Brown ordered \"all necessary and viable actions\" be taken to stop it.\r\nMore than 2,000 families have been moved from their homes and many people have reported feeling ill because of the leakage, which began in October.\r\n\r\nIt stems from a vast underground storage field in Porter Ranch, on the outskirts of Los Angeles.\r\nGas is spewing into the atmosphere at a rate so fast that the well now accounts for about a quarter of the state's total emissions of methane - an extremely potent greenhouse gas.\r\n\r\nThe well is situated in a mountainous area more than a mile away from residential areas, but residents have complained of health effects like headaches, nausea, vomiting and trouble breathing.\r\n\r\n\"Let's call it an environmental and public health catastrophe,\" Tim O'Connor, a lawyer with the Environmental Defense Fund, told the BBC's environment correspondent, Matt McGrath.\r\n\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("California state of emergency over methane leak");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 523, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(13f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(22f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

}

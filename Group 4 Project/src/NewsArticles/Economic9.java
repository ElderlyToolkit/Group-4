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

public class Economic9 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public Economic9(JFrame mf) throws IOException, FontFormatException {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setWrapStyleWord(true);
		Info.setLineWrap(true);
		Info.setText("The Federal Reserve was closely monitoring the sell-off in stocks that shook world markets on Thursday (Jan 7), while US Republican presidential candidates took aim at Chinese policies they claimed are designed to gain a trade advantage.\r\n\r\nUS lawmakers, meanwhile, were uncharacteristically silent about a further deterioration in the value of China's currency, after the yuan fell for an eighth day on investor fears about China's economy.\r\n\r\nOhio Governor John Kasich and US Senator Marco Rubio of Florida, both Republican contenders for the White House, said the recent dive in the value of the yuan against the US dollar was ultimately about making the country's exports cheaper.\r\n\r\n\"They're now rapidly trying to goose up exports,\" Mr Rubio told reporters on the campaign trail in New Hampshire.\r\n\r\n");
		Info.setBounds(15, 116, 570, 318);
		JScrollPane scrollPane = new JScrollPane(Info);
		scrollPane.setBounds(15, 116, 570, 318);
		add(scrollPane);
		
		JLabel Headline = new JLabel("Fed watching China stocks rout, Republicans slam yuan slump");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 516, 33);
		add(Headline);
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(20f);
		File font2_file = new File("Fonts/RobotoCondensed-Bold.ttf");
		Font font2 = Font.createFont(Font.TRUETYPE_FONT, font2_file);
		Font headlineFont = font2.deriveFont(20f);
		Info.setFont(sizedFont);
		Headline.setFont(headlineFont);
	}

	}



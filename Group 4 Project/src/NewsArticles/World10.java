package NewsArticles;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import DarylUI.Masterpanel;

public class World10 extends Masterpanel {

	/**
	 * Create the panel.
	 */
	public World10(JFrame mf) {
		super(mf);
		
		JTextArea Info = new JTextArea();
		Info.setText("Hello");
		Info.setBounds(15, 116, 570, 318);
		add(Info);
		
		JLabel Headline = new JLabel("Justin Bieber dies");
		Headline.setFont(new Font("Malgun Gothic", Font.PLAIN, 24));
		Headline.setBounds(15, 40, 188, 33);
		add(Headline);
	}

}

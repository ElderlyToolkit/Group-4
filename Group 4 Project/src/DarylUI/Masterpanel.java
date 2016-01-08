package DarylUI;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Masterpanel extends JPanel {

	private static final long serialVersionUID = 1L;
	protected JFrame myFrame = null;

	/**
	 * Create the panel.
	 */
	public Masterpanel(JFrame mf) {
		myFrame = mf;
		setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(15, 94, 570, 2);
		add(separator);

	}
}

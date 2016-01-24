package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class NumGenTab extends JFrame {
	
	ImageIcon generate = new ImageIcon("Images/generate.png");
	ImageIcon clear = new ImageIcon("Images/clear2.png");

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumGenTab frame = new NumGenTab();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FontFormatException 
	 */
	public NumGenTab() throws FontFormatException, IOException {
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(17f);
		setTitle("4D and Toto Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("4D", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblSetOfNumbers = new JLabel("Set of numbers:");
		lblSetOfNumbers.setBounds(10, 11, 118, 33);
		panel.add(lblSetOfNumbers);
		
		JComboBox set = new JComboBox();
		set.setBounds(138, 14, 43, 26);
		panel.add(set);
		set.addItem("1");
		set.addItem("2");
		set.addItem("3");
		set.addItem("4");
		set.addItem("5");
		set.addItem("6");
		set.addItem("7");
		set.addItem("8");
		set.addItem("9");
		set.addItem("10");
		
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(10, 48, 409, 174);
		panel.add(textArea);
		
		JButton HUAT = new JButton(generate);
		HUAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x;
				String y;
				for (int i = 0; i <= set.getSelectedIndex() ; i++){ 
					x = (int) (Math.random() * 10000);
					if (x < 1000) {
						y = "0" + x + " \n";
					}
					else {
						y = x + " \n";
					}
					textArea.append(y);
				}
			}
		});
		
		HUAT.setBounds(308, 14, 94, 26);
		panel.add(HUAT);
		
		JButton Clear = new JButton(clear);
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		Clear.setBounds(223, 13, 69, 29);
		panel.add(Clear);
		Clear.setFont(sizedFont);
		HUAT.setFont(sizedFont);
		lblSetOfNumbers.setFont(sizedFont);
		textArea.setFont(sizedFont);
		set.setFont(sizedFont);
		
		//END OF PANEL 1
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Toto", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblSetOfNumbers1 = new JLabel("Set of numbers:");
		lblSetOfNumbers1.setBounds(10, 11, 118, 33);
		panel_1.add(lblSetOfNumbers1);
		
		JComboBox set1 = new JComboBox();
		set1.setBounds(138, 14, 43, 26);
		panel_1.add(set1);
		set1.addItem("1");
		set1.addItem("2");
		set1.addItem("3");
		set1.addItem("4");
		set1.addItem("5");
		set1.addItem("6");
		set1.addItem("7");
		set1.addItem("8");
		set1.addItem("9");
		set1.addItem("10");
		
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setEditable(false);
		textArea1.setWrapStyleWord(true);
		textArea1.setLineWrap(true);
		textArea1.setBounds(10, 48, 409, 174);
		panel_1.add(textArea1);
		
		JButton HUAT1 = new JButton(generate);
		HUAT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x;
				String y;
				for (int i = 0; i <= set1.getSelectedIndex() ; i++) {
					x = (int) (Math.random() * 49) + 1;
					y = x + " ";
					textArea1.append(y);
				}
			}
		});
		
		HUAT1.setBounds(308, 14, 93, 26);
		panel_1.add(HUAT1);
		
		JButton Clear1 = new JButton(clear);
		Clear1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea1.setText("");
			}
		});
		Clear1.setBounds(223, 13, 69, 29);
		panel_1.add(Clear1);
		Clear1.setFont(sizedFont);
		HUAT1.setFont(sizedFont);
		lblSetOfNumbers1.setFont(sizedFont);
		textArea1.setFont(sizedFont);
		set1.setFont(sizedFont);
	}

}

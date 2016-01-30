package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class NumGenTab extends JFrame {
	
	ImageIcon generate = new ImageIcon("Images/generate.png");
	ImageIcon clear = new ImageIcon("Images/clear2.png");
	
	ArrayList<JLabel> labels = new ArrayList<JLabel>();

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JComboBox<String> set = new JComboBox<String>();
		set.setBounds(138, 14, 43, 26);
		panel.add(set);
		set.addItem("1");
		set.addItem("2");
		set.addItem("3");
		set.addItem("4");
		set.addItem("5");
		
		JTextPane textpane = new JTextPane();
		textpane.setEditable(false);
		textpane.setBounds(10, 48, 409, 174);
		panel.add(textpane);
		
		JScrollPane pane = new JScrollPane(textpane);
		pane.setBounds(10, 48, 409, 174);
		panel.add(pane);
		
		JButton HUAT = new JButton(generate);
		HUAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int y = 48;
				for (int i = 0; i <= set.getSelectedIndex() ; i++){ 
					JLabel l = new JLabel();
					textpane.insertComponent(l);
					l.setVisible(true);
					Numbers num = new Numbers ((int) (Math.random() * 10000));
					
					if (num.getNumbers() < 1000) 
						l.setText("0" + num.getNumbers() + " \n");
					else 
						l.setText(num.getNumbers()+ " \n");
					
					y+=30;
					}		
			}
		});
		
		HUAT.setBounds(308, 14, 94, 26);
		panel.add(HUAT);
		
		JButton Clear = new JButton(clear);
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textpane.setText("");
			}
		});
		Clear.setBounds(223, 13, 69, 29);
		panel.add(Clear);
		Clear.setFont(sizedFont);
		HUAT.setFont(sizedFont);
		lblSetOfNumbers.setFont(sizedFont);
		textpane.setFont(sizedFont);
		
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
		
		JTextPane textArea1 = new JTextPane();
		textArea1.setEditable(false);
		textArea1.setBounds(10, 48, 409, 174);
		
		JScrollPane pane1 = new JScrollPane(textArea1);
		pane1.setBounds(10, 48, 409, 174);
		panel_1.add(pane1);
		
		JButton HUAT1 = new JButton(generate);
		HUAT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i <= set1.getSelectedIndex() ; i++) {
					Numbers num = new Numbers((int) (Math.random() * 49) + 1);
					textArea1.setText(num.getNumbers() + " ");
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

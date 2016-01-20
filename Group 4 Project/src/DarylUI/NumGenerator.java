package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.lang.Math;
import javax.swing.JOptionPane;

public class NumGenerator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumGenerator frame = new NumGenerator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NumGenerator() throws IOException, FontFormatException {
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(17f);
		setTitle("Number Generator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 620, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton b2 = new JRadioButton("Toto");
		b2.setBounds(105, 29, 155, 29);
		contentPane.add(b2);
		
		
		JRadioButton b1 = new JRadioButton("4D");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b1.setBounds(41, 29, 57, 29);
		contentPane.add(b1);
		
		ButtonGroup category = new ButtonGroup();
		category.add(b1);
		category.add(b2);
		
		
		JLabel lblSetOfNumbers = new JLabel("Set of numbers:");
		lblSetOfNumbers.setBounds(41, 73, 119, 33);
		contentPane.add(lblSetOfNumbers);
		
		JComboBox set = new JComboBox();
		set.setBounds(164, 76, 43, 26);
		contentPane.add(set);
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
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(41, 122, 506, 226);
		contentPane.add(textArea);
		
		JButton HUAT = new JButton("Generate");
		HUAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x;
				String y;
				if (b1.isSelected()) {
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
				else if (b2.isSelected() ){
					for (int i = 0; i <= set.getSelectedIndex() ; i++) {
						x = (int) (Math.random() * 49) + 1;
						y = x + " ";
						textArea.append(y);;
					}
				}
				
				else {
					infoBox("Please select 4D/Toto.","Error");
				}
					
			}
		});
		HUAT.setBounds(452, 75, 95, 29);
		contentPane.add(HUAT);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		Clear.setBounds(366, 75, 69, 29);
		contentPane.add(Clear);
		Clear.setFont(sizedFont);
		HUAT.setFont(sizedFont);
		b1.setFont(sizedFont);
		b2.setFont(sizedFont);
		lblSetOfNumbers.setFont(sizedFont);
		textArea.setFont(sizedFont);
		set.setFont(sizedFont);
	}
}

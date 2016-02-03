package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Entity.Numbers;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class NumGenTab extends JFrame {
	
	
	ImageIcon generate = new ImageIcon("Images/generate.png");
	ImageIcon clear = new ImageIcon("Images/clear2.png");
	int axe = 0;

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
		Font labelFont = font.deriveFont(19f);
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
		axe = 0;
		
		JLabel lblSetOfNumbers = new JLabel("Set of numbers:");
		lblSetOfNumbers.setBounds(10, 11, 118, 33);
		panel.add(lblSetOfNumbers);
		
		JComboBox<String> set = new JComboBox<String>();
		set.setBounds(138, 14, 43, 26);
		panel.add(set);
		set.addItem("1");
		set.addItem("2");
		set.addItem("3");
		
		JTextPane textpane = new JTextPane();
		textpane.setBounds(1, 1, 407, 172);
		textpane.setEditable(false);
		panel.add(textpane);
		
		JLabel f = new JLabel("Winning Numbers for today: ");
		textpane.insertComponent(f);
		f.setFont(sizedFont);
		f.setVisible(false);
		
		JScrollPane pane = new JScrollPane(textpane);
		pane.setBounds(10, 48, 409, 174);
		panel.add(pane);
		
		JButton HUAT = new JButton(generate);
		HUAT.setBounds(308, 14, 94, 26);
		HUAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> list = new ArrayList<String>();
				f.setVisible(true);
				for (int i = 0; i <= set.getSelectedIndex() ; i++){ 
					Numbers num = new Numbers ((int) (Math.random() * 9999));
						if (num.getNumbers() < 100)
							list.add("00" + num.getNumbers());
						else if (num.getNumbers() < 1000) {
							list.add("0" + num.getNumbers());
						}
						else
							list.add(num.getNumbers() + "");
				}
				
				
				for (int i = 0; i < list.size() ; i++) {
						if (axe == 0) {
							JLabel l = new JLabel();
							l.setFont(labelFont);
							textpane.insertComponent(l);
							l.setText(list.get(i));
							l.setIcon(NewsApp.getIcon("Images/bronze.png",30));
							}
						if (axe == 1) {
							JLabel l = new JLabel();
							l.setFont(labelFont);
							textpane.insertComponent(l);
							l.setText(list.get(i));
							l.setIcon(NewsApp.getIcon("Images/silver.png",30));
							}
						if (axe == 2) {
							JLabel l = new JLabel();
							l.setFont(labelFont);
							textpane.insertComponent(l);
							l.setText(list.get(i));
							l.setIcon(NewsApp.getIcon("Images/gold.png",30));
						}
						
						if (axe == 3) {
							textpane.setText("");
							textpane.insertComponent(f);
							axe = 0;
							JLabel l = new JLabel();
							l.setFont(labelFont);
							textpane.insertComponent(l);
							l.setText(list.get(i));
							l.setIcon(NewsApp.getIcon("Images/bronze.png",30));
							
						}
						axe++;
						
					}
					
				
			}
		});
		panel.add(HUAT);
		
		
		JButton Clear = new JButton(clear);
		Clear.setBounds(223, 13, 69, 29);
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textpane.setText("");
				textpane.insertComponent(f);
				f.setVisible(false);
				axe = 0;
			}
		});
		panel.add(Clear);
		Clear.setFont(sizedFont);
		HUAT.setFont(sizedFont);
		lblSetOfNumbers.setFont(sizedFont);
		textpane.setFont(sizedFont);
		
		//END OF PANEL 1
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Toto", null, panel_1, null);
		panel_1.setLayout(null);
		axe = 0;
		
		JLabel lblSetOfNumbers1 = new JLabel("Set of numbers:");
		lblSetOfNumbers1.setBounds(10, 11, 118, 33);
		panel_1.add(lblSetOfNumbers1);
		
		JComboBox set1 = new JComboBox();
		set1.setBounds(138, 14, 43, 26);
		panel_1.add(set1);
		set1.addItem("1");
		set1.addItem("2");
		set1.addItem("3");
		
		JTextPane textPane1 = new JTextPane();
		textPane1.setEditable(false);
		textPane1.setBounds(10, 48, 409, 174);
		
		JScrollPane pane1 = new JScrollPane(textPane1);
		pane1.setBounds(10, 48, 409, 174);
		panel_1.add(pane1);
		
		JLabel f1 = new JLabel("Winning Numbers for today: ");
		textPane1.insertComponent(f1);
		f1.setFont(sizedFont);
		f1.setVisible(false);
		
		JButton HUAT1 = new JButton(generate);
		HUAT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setVisible(true);
				ArrayList<String> list = new ArrayList<String>();
				for (int i = 0; i <= set1.getSelectedIndex() ; i++) {
					Numbers num = new Numbers((int) (Math.random() * 49) + 1);
					list.add(num.getNumbers() + "");
				}
				for (int i = 0; i < list.size() ; i++) {
					if (axe == 0) {
						JLabel t = new JLabel();
						t.setFont(labelFont);
						textPane1.insertComponent(t);
						t.setText(list.get(i));
						t.setIcon(NewsApp.getIcon("Images/bronze.png",30));
						}
					if (axe == 1) {
						JLabel t = new JLabel();
						t.setFont(labelFont);
						textPane1.insertComponent(t);
						t.setText(list.get(i));
						t.setIcon(NewsApp.getIcon("Images/silver.png",30));
						}
					if (axe == 2) {
						JLabel t = new JLabel();
						t.setFont(labelFont);
						textPane1.insertComponent(t);
						t.setText(list.get(i));
						t.setIcon(NewsApp.getIcon("Images/gold.png",30));
						
						}
					if (axe == 3) {
						textPane1.setText("");
						textPane1.insertComponent(f1);
						axe = 0;
						JLabel t = new JLabel();
						t.setFont(labelFont);
						textPane1.insertComponent(t);
						t.setText(list.get(i));
						t.setIcon(NewsApp.getIcon("Images/bronze.png",30));
						
					}
					axe++;
					
				}
			}
		});
		
		HUAT1.setBounds(308, 14, 93, 26);
		panel_1.add(HUAT1);
		
		JButton Clear1 = new JButton(clear);
		Clear1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane1.setText("");
				textPane1.insertComponent(f1);
				f1.setVisible(false);
				axe = 0;
			}
		});
		Clear1.setBounds(223, 13, 69, 29);
		panel_1.add(Clear1);
		Clear1.setFont(sizedFont);
		HUAT1.setFont(sizedFont);
		lblSetOfNumbers1.setFont(sizedFont);
		textPane1.setFont(sizedFont);
		set1.setFont(sizedFont);

	}
}

package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class NumGenerator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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
	public NumGenerator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(41, 30, 129, 26);
		contentPane.add(comboBox);
		
		JLabel lblSetOfNumbers = new JLabel("Set of numbers:");
		lblSetOfNumbers.setBounds(41, 73, 119, 33);
		contentPane.add(lblSetOfNumbers);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(164, 76, 43, 26);
		contentPane.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(41, 122, 506, 226);
		contentPane.add(textArea);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setBounds(452, 75, 95, 29);
		contentPane.add(btnGenerate);
	}
}

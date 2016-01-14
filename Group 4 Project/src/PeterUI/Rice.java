package PeterUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class Rice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rice frame = new Rice();
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
	public Rice() {
		setTitle("Rice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextPane txtpnToRice = new JTextPane();
		txtpnToRice.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToRice.setBackground(SystemColor.control);
		txtpnToRice.setText("To hard-boil eggs, place as many eggs as you'd like in a pot with cold water (the water should entirely cover all the eggs). Bring to a boil and cover the pot. Turn off stove, remove the pot from the stove and let sit, covered, for 10 to 12 minutes. Using a slotted spoon, remove the eggs and place them in a bowl of ice water until eggs are completely cooled.");
		txtpnToRice.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToRice);
	}
}

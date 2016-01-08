package PeterUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Scrambled extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scrambled frame = new Scrambled();
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
	public Scrambled() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/scrambled.jpg");
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToScrambledEggs = new JTextPane();
		txtpnToScrambledEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToScrambledEggs.setBackground(SystemColor.control);
		txtpnToScrambledEggs.setText("To cook soft-boiled eggs, use the same technique as hard-boiling and simply steep the eggs in hot water for a bit less time: Put your eggs in a pan and cover with cold water. Bring to a boil over high heat, then take the pan off the stove and cover. Let stand for 4 minutes.");
		txtpnToScrambledEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToScrambledEggs);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(605, 502, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Eggs egg = new Eggs();
        		setVisible(false);
        	}
        });
	}

}

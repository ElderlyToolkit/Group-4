package PeterUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Scrambled2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scrambled2 frame = new Scrambled2();
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
	public Scrambled2() {
		setTitle("Scrambled eggs");
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
		txtpnToScrambledEggs.setText("Step 2:\nMelt butter in a skillet over medium heat, then pour eggs into pan. Let eggs cook for a minute before using a spatula to push the eggs into the center of the pan. Continuing stirring as the eggs cook to your desired consistency.");
		txtpnToScrambledEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToScrambledEggs);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(496, 502, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Scrambled s = new Scrambled();
        		setVisible(false);
        		s.setVisible(true);
        	}
        });
		
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(605, 502, 97, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Scrambled3 s3 = new Scrambled3();
        		setVisible(false);
        		s3.setVisible(true);
        	}
        });
		
	}

}

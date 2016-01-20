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

public class HardBoiledEggs2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardBoiledEggs2 frame = new HardBoiledEggs2();
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
	public HardBoiledEggs2() {
		setTitle("Hard-boiled eggs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/HBE2.jpg");
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToHardboilEggs = new JTextPane();
		txtpnToHardboilEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToHardboilEggs.setBackground(SystemColor.control);
		txtpnToHardboilEggs.setText("Step 2:\nTurn off stove, remove the pot from the stove and let sit, covered, for 10 to 12 minutes.");
		txtpnToHardboilEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToHardboilEggs);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(605, 502, 97, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HardBoiledEggs3 HBE3 = new HardBoiledEggs3();
        		setVisible(false);
        		HBE3.setVisible(true);
        	}
        });
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(495, 502, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HardBoiledEggs HBE = new HardBoiledEggs();
        		setVisible(false);
        		HBE.setVisible(true);
        	}
        });
	}

}

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

public class HardBoiledEggs3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardBoiledEggs3 frame = new HardBoiledEggs3();
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
	public HardBoiledEggs3() {
		setTitle("Hard-boiled eggs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/HBE3.jpg");
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToHardboilEggs = new JTextPane();
		txtpnToHardboilEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToHardboilEggs.setBackground(SystemColor.control);
		txtpnToHardboilEggs.setText("Step 3:\nUsing a slotted spoon, remove the eggs and place them in a bowl of ice water until eggs are completely cooled.");
		txtpnToHardboilEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToHardboilEggs);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(605, 502, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		HardBoiledEggs2 HBE2 = new HardBoiledEggs2();
        		setVisible(false);
        		HBE2.setVisible(true);
        	}
        });
		
	}

}

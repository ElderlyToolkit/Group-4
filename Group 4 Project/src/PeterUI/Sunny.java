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

public class Sunny extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sunny frame = new Sunny();
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
	public Sunny() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/sunny.jpg");
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToSunnyEggs = new JTextPane();
		txtpnToSunnyEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 23));
		txtpnToSunnyEggs.setBackground(SystemColor.control);
		txtpnToSunnyEggs.setText("This technique only takes 4 to 5 minutes! Heat oil or melt butter in a nonstick skillet over medium heat. Carefully crack eggs one at a time into the skillet. Wait for 1 to 2 minutes, then either cover the pan for a minute, or tilt the skillet and use a spoon to collect the fat and pour it over the egg white. Repeat to pour it over the yolk. Covering the pan or basting the egg helps the top to cook without flipping the egg. Total time: 4 to 5 minutes. ");
		txtpnToSunnyEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToSunnyEggs);
		
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

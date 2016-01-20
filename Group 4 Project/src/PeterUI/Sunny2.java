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

public class Sunny2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sunny2 frame = new Sunny2();
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
	public Sunny2() {
		setTitle("Sunny eggs");
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
		txtpnToSunnyEggs.setText("Step 2:\nWait for 1 to 2 minutes, then either cover the pan for a minute, or tilt the skillet and use a spoon to collect the fat and pour it over the egg white. Repeat to pour it over the yolk.");
		txtpnToSunnyEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToSunnyEggs);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(496, 502, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Sunny su = new Sunny();
        		setVisible(false);
        		su.setVisible(true);
        	}
        });
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(605, 502, 97, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Sunny3 su3 = new Sunny3();
        		setVisible(false);
        		su3.setVisible(true);
        	}
        });
	}

}

package PeterUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Homepage;

import javax.swing.JButton;

public class Eggs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eggs frame = new Eggs();
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
	public Eggs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHardBoiled = new JButton("Hard boiled");
		btnHardBoiled.setBounds(65, 55, 108, 25);
		contentPane.add(btnHardBoiled);
		btnHardBoiled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HardBoiledEggs hbe = new HardBoiledEggs();
				hbe.setVisible(true);
				
			}
		});
		
		JButton btnScrambled = new JButton("Scrambled");
		btnScrambled.setBounds(264, 55, 108, 25);
		contentPane.add(btnScrambled);
		btnScrambled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scrambled s = new Scrambled();
				s.setVisible(true);
				
			}
		});
		
		JButton btnSoftBoiled = new JButton("Soft boiled");
		btnSoftBoiled.setBounds(65, 162, 108, 25);
		contentPane.add(btnSoftBoiled);
		btnSoftBoiled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftBoiledEggs sb = new SoftBoiledEggs();
				sb.setVisible(true);
				
			}
		});
		
		JButton btnSunny = new JButton("Sunny");
		btnSunny.setBounds(264, 162, 108, 25);
		contentPane.add(btnSunny);
		btnSunny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sunny sn = new Sunny();
				sn.setVisible(true);
				
			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(171, 215, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cooking cook = new cooking();
        		setVisible(false);
        		
        	}
        });
	}

}

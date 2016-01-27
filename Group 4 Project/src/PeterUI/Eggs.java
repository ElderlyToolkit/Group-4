package PeterUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Homepage;

import javax.swing.ImageIcon;
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
		
		ImageIcon hb = new ImageIcon("Images/hardboiled.png");
		JButton btnHardBoiled = new JButton(hb);
		btnHardBoiled.setBounds(65, 55, 115, 35);
		contentPane.add(btnHardBoiled);
		btnHardBoiled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HardBoiledEggs hbe = new HardBoiledEggs();
				hbe.setVisible(true);
				setVisible(false);
				
			}
		});
		
		ImageIcon sc = new ImageIcon("Images/scrambled.png");
		JButton btnScrambled = new JButton(sc);
		btnScrambled.setBounds(264, 55, 115, 35);
		contentPane.add(btnScrambled);
		btnScrambled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scrambled s = new Scrambled();
				s.setVisible(true);
				setVisible(false);
				
			}
		});
		
		ImageIcon sb = new ImageIcon("Images/softboiled.png");
		JButton btnSoftBoiled = new JButton(sb);
		btnSoftBoiled.setBounds(65, 137, 115, 35);
		contentPane.add(btnSoftBoiled);
		btnSoftBoiled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftBoiledEggs sb = new SoftBoiledEggs();
				sb.setVisible(true);
				setVisible(false);
				
			}
		});
		
		ImageIcon sn = new ImageIcon("Images/sunny.png");
		JButton btnSunny = new JButton(sn);
		btnSunny.setBounds(264, 137, 115, 35);
		contentPane.add(btnSunny);
		btnSunny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sunny sn = new Sunny();
				sn.setVisible(true);
				setVisible(false);
			}
		});
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton btnBack = new JButton(back);
		btnBack.setBounds(171, 215, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cooking cook = new cooking();
        		cook.setVisible(true);
        		setVisible(false);
        		
        	}
        });
	}

}

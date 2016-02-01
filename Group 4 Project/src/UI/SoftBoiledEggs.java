package UI;

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

public class SoftBoiledEggs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftBoiledEggs frame = new SoftBoiledEggs();
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
	public SoftBoiledEggs() {
		setTitle("Soft-boiled eggs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/soft_boiled_egg.jpg");
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToSoftboilEggs = new JTextPane();
		txtpnToSoftboilEggs.setEditable(false);
		txtpnToSoftboilEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToSoftboilEggs.setBackground(SystemColor.control);
		txtpnToSoftboilEggs.setText("Step 1: \nUse the same technique as hard-boiling but let stand for 4 minutes instead of 10 minutes.");
		txtpnToSoftboilEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToSoftboilEggs);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton btnBack = new JButton(back);
		btnBack.setBounds(449, 502, 115, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Eggs egg = new Eggs();
        		egg.setVisible(true);
        		setVisible(false);
        	}
        });
		
		
		
	}

}

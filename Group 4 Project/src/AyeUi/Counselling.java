package AyeUi;
import java.awt.Image;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Counselling extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counselling frame = new Counselling();
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
	public Counselling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		Image images = new ImageIcon(this.getClass().getResource("/call.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(images));
		btnNewButton.setBounds(106, 92, 268, 133);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBackground(Color.WHITE);
		Image images2 = new ImageIcon(this.getClass().getResource("/msg.png")).getImage();
		button.setIcon(new ImageIcon(images2));
		button.setBounds(106, 241, 268, 125);
		contentPane.add(button);
		
	
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image images1 = new ImageIcon(this.getClass().getResource("/oc.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(images1));
		lblNewLabel_1.setBounds(38, 16, 435, 60);
		contentPane.add(lblNewLabel_1);
	}
}

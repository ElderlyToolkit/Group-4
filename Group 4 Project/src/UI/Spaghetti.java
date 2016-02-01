package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Spaghetti extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spaghetti frame = new Spaghetti();
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
	public Spaghetti() {
		setTitle("Spaghetti");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/Spaghetti.jpg");
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToSpaghetti = new JTextPane();
		txtpnToSpaghetti.setEditable(false);
		txtpnToSpaghetti.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToSpaghetti.setBackground(SystemColor.control);
		txtpnToSpaghetti.setText("Step 1: Fill a medium sized pot with cold water. Place it on a stove on high heat. Bring it to a boil\nStep2");
		txtpnToSpaghetti.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToSpaghetti);
		
		
	
	}
}

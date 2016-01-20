package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(10, 11, 408, 103);
		contentPane.add(imagelabel);
		
		JLabel lblWelcomeToGet = new JLabel("Welcome! To get started, click the button below!");
		lblWelcomeToGet.setFont(new Font("Roboto Condensed", Font.PLAIN, 15));
		lblWelcomeToGet.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToGet.setBounds(10, 125, 408, 23);
		contentPane.add(lblWelcomeToGet);
		
		ImageIcon go = new ImageIcon("Images/Go.png");
		JButton btnGo = new JButton(go);
		btnGo.setFont(new Font("Roboto Condensed", Font.PLAIN, 11));
		btnGo.setBounds(167, 171, 89, 23);
		contentPane.add(btnGo);
		
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Login cardframe = new Login();
				setVisible(false);
				cardframe.setVisible(true);
			}
		});
	}
}

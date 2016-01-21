package AyeUi;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;



import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;

public class Forum1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forum1 frame = new Forum1();
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
	public Forum1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnPopularCategories = new JTextPane();
		txtpnPopularCategories.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		txtpnPopularCategories.setForeground(new Color(30, 144, 255));
		txtpnPopularCategories.setBackground(Color.LIGHT_GRAY);
		txtpnPopularCategories.setText("Popular Categories");
		txtpnPopularCategories.setBounds(27, 104, 603, 31);
		contentPane.add(txtpnPopularCategories);
		
		JTextPane txtpnAllCategories = new JTextPane();
		txtpnAllCategories.setText("All Categories");
		txtpnAllCategories.setForeground(new Color(220, 20, 60));
		txtpnAllCategories.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		txtpnAllCategories.setBackground(Color.LIGHT_GRAY);
		txtpnAllCategories.setBounds(27, 359, 603, 31);
		contentPane.add(txtpnAllCategories);
		
		JLabel lblNewLabel = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("/img2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(images));
		lblNewLabel.setBounds(10, 16, 620, 79);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblHealth = new JLabel("");
		lblHealth.setHorizontalAlignment(SwingConstants.CENTER);
		Image images2 = new ImageIcon(this.getClass().getResource("/health.png")).getImage();
		lblHealth.setIcon(new ImageIcon(images2));
		lblHealth.setBounds(37, 158, 180, 164);
		contentPane.add(lblHealth);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image images3 = new ImageIcon(this.getClass().getResource("/family.png")).getImage();
		label_1.setIcon(new ImageIcon(images3));
		label_1.setBounds(437, 148, 180, 189);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		Image images1 = new ImageIcon(this.getClass().getResource("/Singapore.png")).getImage();
		label_2.setIcon(new ImageIcon(images1));
		label_2.setBounds(247, 148, 180, 195);
		contentPane.add(label_2);
		
		JTextPane txtpnHealth = new JTextPane();
		txtpnHealth.setForeground(new Color(0, 0, 0));
		txtpnHealth.setFont(new Font("Segoe UI", Font.BOLD, 16));
		txtpnHealth.setBackground(SystemColor.control);
		txtpnHealth.setText("HEALTH");
		txtpnHealth.setBounds(70, 321, 98, 26);
		contentPane.add(txtpnHealth);
		
		JTextPane txtpnSingapore = new JTextPane();
		txtpnSingapore.setForeground(new Color(220, 20, 60));
		txtpnSingapore.setFont(new Font("Segoe UI", Font.BOLD, 16));
		txtpnSingapore.setBackground(SystemColor.control);
		txtpnSingapore.setText("SINGAPORE");
		txtpnSingapore.setBounds(291, 321, 98, 26);
		contentPane.add(txtpnSingapore);
		
		JTextPane txtpnFamily = new JTextPane();
		txtpnFamily.setForeground(new Color(0, 0, 255));
		txtpnFamily.setFont(new Font("Segoe UI", Font.BOLD, 16));
		txtpnFamily.setBackground(SystemColor.control);
		txtpnFamily.setText("FAMILY");
		txtpnFamily.setBounds(484, 321, 98, 26);
		contentPane.add(txtpnFamily);
		
		JTextPane txtpnGeneral = new JTextPane();
		txtpnGeneral.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		txtpnGeneral.setBackground(new Color(245, 222, 179));
		txtpnGeneral.setText("General");
		txtpnGeneral.setBounds(27, 398, 603, 26);
		contentPane.add(txtpnGeneral);
		
		JTextPane txtpndtoto = new JTextPane();
		txtpndtoto.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		txtpndtoto.setBackground(new Color(224, 255, 255));
		txtpndtoto.setText("4D/TOTO");
		txtpndtoto.setBounds(27, 436, 603, 26);
		contentPane.add(txtpndtoto);
		
		JTextPane txtpnFood = new JTextPane();
		txtpnFood.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		txtpnFood.setBackground(new Color(245, 222, 179));
		txtpnFood.setText("Food");
		txtpnFood.setBounds(27, 466, 603, 26);
		contentPane.add(txtpnFood);
		
		JTextPane txtpnEntertainment = new JTextPane();
		txtpnEntertainment.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		txtpnEntertainment.setBackground(new Color(224, 255, 255));
		txtpnEntertainment.setText("Entertainment");
		txtpnEntertainment.setBounds(27, 501, 603, 26);
		contentPane.add(txtpnEntertainment);
		
		JTextPane txtpnWeather = new JTextPane();
		txtpnWeather.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		txtpnWeather.setBackground(new Color(245, 222, 179));
		txtpnWeather.setText("Weather");
		txtpnWeather.setBounds(27, 531, 603, 26);
		contentPane.add(txtpnWeather);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 427, 601, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 466, 601, 11);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(27, 493, 601, 11);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(27, 520, 601, 11);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(29, 562, 601, 11);
		contentPane.add(separator_4);
		
		JButton btnNewButton = new JButton("NEW POST");
		btnNewButton.setBackground(new Color(178, 34, 34));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(274, 573, 115, 29);
		contentPane.add(btnNewButton);
	}
}

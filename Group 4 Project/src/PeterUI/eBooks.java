package PeterUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


public class eBooks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eBooks frame = new eBooks();
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
	public eBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategories = new JLabel("Categories");
		lblCategories.setBounds(173, 13, 61, 50);
		contentPane.add(lblCategories);
		
		JLabel lblRomance = new JLabel("Romance");
		lblRomance.setBounds(10, 69, 53, 50);
		contentPane.add(lblRomance);
		
		JLabel lblMystery = new JLabel("Mystery");
		lblMystery.setBounds(183, 69, 50, 50);
		contentPane.add(lblMystery);
		
		JLabel lblFiction = new JLabel("Fiction");
		lblFiction.setBounds(359, 69, 61, 50);
		contentPane.add(lblFiction);
	}

}

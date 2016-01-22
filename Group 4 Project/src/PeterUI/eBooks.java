package PeterUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


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
		setTitle("eBooks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategories = new JLabel("Categories");
		lblCategories.setBounds(176, 13, 84, 33);
		contentPane.add(lblCategories);
		
		JButton btnKnitting = new JButton("Knitting");
		btnKnitting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKnitting.setBounds(67, 59, 97, 25);
		contentPane.add(btnKnitting);
		
		JButton btnCooking = new JButton("Cooking");
		btnCooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cooking cook = new cooking();
				cook.setVisible(true);
				
			}
		});
		btnCooking.setBounds(251, 59, 97, 25);
		contentPane.add(btnCooking);
		
		JButton btnNewButton = new JButton("Gardening");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(67, 129, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnJuggling = new JButton("Juggling");
		btnJuggling.setBounds(251, 129, 97, 25);
		contentPane.add(btnJuggling);
		
		JButton btnEmbroidery = new JButton("Embroidery");
		btnEmbroidery.setBounds(67, 199, 97, 25);
		contentPane.add(btnEmbroidery);
		
		JButton btnSewing = new JButton("Sewing");
		btnSewing.setBounds(251, 199, 97, 25);
		contentPane.add(btnSewing);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(159, 322, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
		
	}
}

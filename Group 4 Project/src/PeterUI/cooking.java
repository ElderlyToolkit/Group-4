package PeterUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.border.EmptyBorder;

import Main.Homepage;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class cooking extends JFrame {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cooking frame = new cooking();
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
	public cooking() {
		setTitle("Cooking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon eggs = new ImageIcon("Images/eggs.png");
		JButton btnEggs = new JButton(eggs);
		btnEggs.setBounds(67, 59, 125, 25);
		contentPane.add(btnEggs);
		btnEggs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eggs egg = new Eggs();
				egg.setVisible(true);
				setVisible(false);
				
			}
		});
		ImageIcon spaghetti = new ImageIcon("Images/spaghetti.png");
		JButton btnSpaghetti = new JButton(spaghetti);
		btnSpaghetti.setBounds(251, 129, 125, 25);
		contentPane.add(btnSpaghetti);
		btnSpaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spaghetti spaghetti = new Spaghetti();
				spaghetti.setVisible(true);
				
			}
		});
		ImageIcon salmon = new ImageIcon("Images/salmon.png");
		JButton btnSalmon = new JButton(salmon);
		btnSalmon.setBounds(67, 129, 125, 25);
		contentPane.add(btnSalmon);
		
		ImageIcon rice = new ImageIcon("Images/rice.png");
		JButton btnRice = new JButton(rice);
		btnRice.setBounds(251, 59, 125, 25);
		contentPane.add(btnRice);
		
		ImageIcon quinoa = new ImageIcon("Images/quinoa.png");
		JButton btnQuin = new JButton(quinoa);
		btnQuin.setBounds(67, 199, 125, 25);
		contentPane.add(btnQuin);
		
		ImageIcon cs = new ImageIcon("Images/chicksoup.png");
		JButton btnChickenSoup = new JButton(cs);
		btnChickenSoup.setBounds(251, 199, 125, 25);
		contentPane.add(btnChickenSoup);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton btnBack = new JButton(back);
		btnBack.setBounds(159, 322, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		eBooks eBooks = new eBooks();
        		eBooks.setVisible(true);
        		setVisible(false);
        	}
        });
	}
}

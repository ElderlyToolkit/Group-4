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
		setBounds(100, 100, 451, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEggs = new JButton("Eggs");
		btnEggs.setBounds(51, 48, 119, 25);
		contentPane.add(btnEggs);
		btnEggs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eggs egg = new Eggs();
				egg.setVisible(true);
				
			}
		});
		
		JButton btnSpaghetti = new JButton("Spaghetti");
		btnSpaghetti.setBounds(264, 210, 119, 25);
		contentPane.add(btnSpaghetti);
		btnSpaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spaghetti spaghetti = new Spaghetti();
				spaghetti.setVisible(true);
				
			}
		});
		
		JButton btnSalmon = new JButton("Salmon");
		btnSalmon.setBounds(51, 210, 119, 25);
		contentPane.add(btnSalmon);
		
		JButton btnRice = new JButton("Rice");
		btnRice.setBounds(264, 48, 119, 25);
		contentPane.add(btnRice);
		
		
		JButton btnQuin = new JButton("Quinoa");
		btnQuin.setBounds(51, 366, 119, 25);
		contentPane.add(btnQuin);
		
		JButton btnChickenSoup = new JButton("Chicken soup");
		btnChickenSoup.setBounds(264, 366, 119, 25);
		contentPane.add(btnChickenSoup);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(171, 444, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		eBooks eBooks = new eBooks();
        		setVisible(false);
        	}
        });
	}
}

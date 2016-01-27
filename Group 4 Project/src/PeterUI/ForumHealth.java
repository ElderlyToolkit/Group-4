package PeterUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.ForumsConstructor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ForumHealth extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForumHealth frame = new ForumHealth();
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
	public ForumHealth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		String[] columns = {"Subject", "Message"};
		String [] [] data = {{ForumsConstructor.getSubject(), ForumsConstructor.getMessage()},{"Dave","Dave"}};
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(538, 589, 97, 25);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnBack);
		
		table = new JTable(data,columns);
		table.setBounds(12, 13, 623, 570);
		table.setPreferredScrollableViewportSize(new Dimension(450, 63));
		table.setFillsViewportHeight(true);
		
		JScrollPane js = new JScrollPane(table);
		js.setBounds(12,13,623,570);
		contentPane.add(js);
		
		
		
		
	}
	
}

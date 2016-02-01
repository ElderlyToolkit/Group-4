package PeterUI;

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
import Database.DBController;
import Database.eBooksDA;
import Entity.eBooksConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;

public class Scrambled extends JFrame {
	private int steps = 1;
	public String category;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scrambled frame = new Scrambled();
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
	public Scrambled() {
		setTitle("Scrambled eggs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/scrambled.jpg");
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToScrambledEggs = new JTextPane();
		txtpnToScrambledEggs.setEditable(false);
		txtpnToScrambledEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToScrambledEggs.setBackground(SystemColor.control);
		txtpnToScrambledEggs.setText("Step 1:\nCrack eggs in a mixing bowl and whisk with a fork. Add a splash of milk and continue mixing.");
		txtpnToScrambledEggs.setBounds(12, 99, 299, 428);
		contentPane.add(txtpnToScrambledEggs);
		
		JLabel lblScrambled = new JLabel("Scrambled");
		lblScrambled.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblScrambled.setHorizontalAlignment(SwingConstants.CENTER);
		lblScrambled.setBounds(12, 13, 299, 73);
		contentPane.add(lblScrambled);
		
		DBController DBC = new DBController();
		
		
		ImageIcon next = new ImageIcon("Images/next.png");
		JButton btnNext = new JButton(next);
		btnNext.setBounds(571, 502, 120, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				steps++;
        		category = lblScrambled.getText();
        		if(steps == 3){
        			eBooksConstructor constructor = eBooksDA.nextPage(category);
            		txtpnToScrambledEggs.setText(constructor.getContent());
        			btnNext.setEnabled(false);
        		}
        		else{
        		eBooksConstructor constructor = eBooksDA.nextPage(category);
        		txtpnToScrambledEggs.setText(constructor.getContent());
        		}
        	}
        });
		
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton btnBack = new JButton(back);
		btnBack.setBounds(449, 502, 115, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				steps--;
        		category = lblScrambled.getText();
        		btnNext.setEnabled(true);
        		if(steps == 0){
        			eBooksConstructor constructor = eBooksDA.prevPage(category);
            		txtpnToScrambledEggs.setText(constructor.getContent());
        			Eggs egg = new Eggs();
        			egg.setVisible(true);
        			setVisible(false);
        		}
        		else{
        		eBooksConstructor constructor = eBooksDA.prevPage(category);
        		txtpnToScrambledEggs.setText(constructor.getContent());
        		}
        		
        		
        		
        	
        		
        	}
        });
		
		
		
		
		
		
		
		
	}

}

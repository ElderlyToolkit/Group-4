package UI;
import java.awt.BorderLayout;
import Database.DBController;
import Database.eBooksDA;
import Entity.eBooksConstructor;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class HardBoiledEggs extends JFrame {
	
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
					HardBoiledEggs frame = new HardBoiledEggs();
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
	public HardBoiledEggs() {
		setTitle("Hard-boiled eggs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/HBE.jpg");
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToHardboilEggs = new JTextPane();
		txtpnToHardboilEggs.setEditable(false);
		txtpnToHardboilEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToHardboilEggs.setBackground(UIManager.getColor("Button.background"));
		txtpnToHardboilEggs.setText("Step 1:\nTo hard-boil eggs, place as many eggs as you'd like in a pot with cold water (the water should entirely cover all the eggs). Bring to a boil and cover the pot.");
		txtpnToHardboilEggs.setBounds(12, 99, 299, 428);
		contentPane.add(txtpnToHardboilEggs);
		
		DBController DBC = new DBController();
		
		JLabel lblHbe = new JLabel("Hard boiled egg");
		lblHbe.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblHbe.setHorizontalAlignment(SwingConstants.CENTER);
		lblHbe.setBounds(12, 13, 299, 73);
		contentPane.add(lblHbe);
		
		
		
		ImageIcon next = new ImageIcon("Images/next.png");
		JButton btnNext = new JButton(next);
		btnNext.setBounds(571, 502, 120, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		steps++;
        		category = lblHbe.getText();
        		if(steps == 3){
        			eBooksConstructor constructor = eBooksDA.nextPage(category);
            		txtpnToHardboilEggs.setText(constructor.getContent());
        			btnNext.setEnabled(false);
        		}
        		else{
        		eBooksConstructor constructor = eBooksDA.nextPage(category);
        		txtpnToHardboilEggs.setText(constructor.getContent());
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
        		category = lblHbe.getText();
        		btnNext.setEnabled(true);
        		if(steps == 0){
        			eBooksConstructor constructor = eBooksDA.prevPage(category);
            		txtpnToHardboilEggs.setText(constructor.getContent());
        			Eggs egg = new Eggs();
        			egg.setVisible(true);
        			setVisible(false);
        		}
        		else{
        		eBooksConstructor constructor = eBooksDA.prevPage(category);
        		txtpnToHardboilEggs.setText(constructor.getContent());
        		}	
        	}
        });
		
		
		
		
		
		
		
		
}
}

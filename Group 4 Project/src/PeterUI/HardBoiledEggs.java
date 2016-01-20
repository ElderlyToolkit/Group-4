package PeterUI;

import java.awt.BorderLayout;
import Database.DBController;

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

public class HardBoiledEggs extends JFrame {
	int id = 1;

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
		txtpnToHardboilEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToHardboilEggs.setBackground(SystemColor.control);
		txtpnToHardboilEggs.setText("Step 1:\nTo hard-boil eggs, place as many eggs as you'd like in a pot with cold water (the water should entirely cover all the eggs). Bring to a boil and cover the pot.");
		txtpnToHardboilEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToHardboilEggs);
		
		DBController DBC = new DBController();
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(495, 502, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				--id;
        		ResultSet rs = null;
        		String s = "";
        		String dbQuery = "SELECT content FROM ebooks WHERE id = '" + id + "'";
        		rs = DBC.readRequest(dbQuery);
        		DBC.readRequest(dbQuery);
        		try{
        			while(rs.next()){
        				s = rs.getString("content");
        				txtpnToHardboilEggs.setText(s);
        			}
        			
        		}catch(SQLException f){
        			f.printStackTrace();
        		}
        	
        		
        	}
        });
		
		
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(605, 502, 97, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		id++;
        		ResultSet rs = null;
        		String s = "";
        		String dbQuery = "SELECT content FROM ebooks WHERE id = '" + id + "'";
        		rs = DBC.readRequest(dbQuery);
        		DBC.readRequest(dbQuery);
        		try{
        			while(rs.next()){
        				s = rs.getString("content");
        				txtpnToHardboilEggs.setText(s);
        			}
        			
        		}catch(SQLException f){
        			f.printStackTrace();
        		}
        	
        		
        	}
        });
		
}
}

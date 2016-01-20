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
import java.sql.ResultSet;
import java.sql.SQLException;

public class Scrambled extends JFrame {
	int id = 4;
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
		txtpnToScrambledEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 25));
		txtpnToScrambledEggs.setBackground(SystemColor.control);
		txtpnToScrambledEggs.setText("Step 1:\nCrack eggs in a mixing bowl and whisk with a fork. Add a splash of milk and continue mixing.");
		txtpnToScrambledEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToScrambledEggs);
		
		DBController DBC = new DBController();
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(496, 502, 97, 25);
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
        				txtpnToScrambledEggs.setText(s);
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
        				txtpnToScrambledEggs.setText(s);
        			}
        			
        		}catch(SQLException f){
        			f.printStackTrace();
        		}
        	
        		
        	}
        });
	}

}

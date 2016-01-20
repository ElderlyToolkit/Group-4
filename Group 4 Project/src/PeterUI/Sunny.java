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


public class Sunny extends JFrame {
	int id = 7;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sunny frame = new Sunny();
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
	public Sunny() {
		setTitle("Sunny eggs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Images/sunny.jpg");
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(361, 13, 341, 260);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnToSunnyEggs = new JTextPane();
		txtpnToSunnyEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 23));
		txtpnToSunnyEggs.setBackground(SystemColor.control);
		txtpnToSunnyEggs.setText("Step 1:\nHeat oil or melt butter in a nonstick skillet over medium heat. Carefully crack eggs one at a time into the skillet.");
		txtpnToSunnyEggs.setBounds(12, 13, 299, 514);
		contentPane.add(txtpnToSunnyEggs);
		
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
        				txtpnToSunnyEggs.setText(s);
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
        				txtpnToSunnyEggs.setText(s);
        			}
        			
        		}catch(SQLException f){
        			f.printStackTrace();
        		}
        	
        		
        	}
        });
	}

}

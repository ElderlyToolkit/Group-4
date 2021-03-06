package UI;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import Database.DBController;
import Database.eBooksDA;
import Entity.eBooksConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Sunny extends JFrame {
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
		txtpnToSunnyEggs.setEditable(false);
		txtpnToSunnyEggs.setFont(new Font("Century Schoolbook", Font.PLAIN, 23));
		txtpnToSunnyEggs.setBackground(SystemColor.control);
		txtpnToSunnyEggs.setText("Step 1:\nHeat oil or melt butter in a nonstick skillet over medium heat. Carefully crack eggs one at a time into the skillet.");
		txtpnToSunnyEggs.setBounds(12, 99, 299, 428);
		contentPane.add(txtpnToSunnyEggs);
		
		JLabel lblSunny = new JLabel("Sunny");
		lblSunny.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblSunny.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunny.setBounds(12, 13, 299, 73);
		contentPane.add(lblSunny);
		
		DBController DBC = new DBController();
		
		ImageIcon next = new ImageIcon("Images/next.png");
		JButton btnNext = new JButton(next);
		btnNext.setBounds(571, 502, 120, 25);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				steps++;
        		category = lblSunny.getText();
        		if(steps == 3){
        			eBooksConstructor constructor = eBooksDA.nextPage(category);
            		txtpnToSunnyEggs.setText(constructor.getContent());
        			btnNext.setEnabled(false);
        		}
        		else{
        		eBooksConstructor constructor = eBooksDA.nextPage(category);
        		txtpnToSunnyEggs.setText(constructor.getContent());
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
        		category = lblSunny.getText();
        		btnNext.setEnabled(true);
        		if(steps == 0){
        			eBooksConstructor constructor = eBooksDA.prevPage(category);
            		txtpnToSunnyEggs.setText(constructor.getContent());
        			Eggs egg = new Eggs();
        			egg.setVisible(true);
        			setVisible(false);
        		}
        		else{
        		eBooksConstructor constructor = eBooksDA.prevPage(category);
        		txtpnToSunnyEggs.setText(constructor.getContent());
        		}
        	}
        });
		
		
		
	}

}

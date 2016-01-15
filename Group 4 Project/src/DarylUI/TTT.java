package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TTT extends JFrame {
	int counter = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTT frame = new TTT();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void checkResult(int[][] table) {
		String result = "";
		if (table[0][0] + table[0][1] + table[0][2] == 3) 
			result = "Player O wins!";
		else if (table[1][0] + table[1][1] + table[1][2] == 3)
			result = "Player O wins!";
		else if (table[2][0] + table[2][1] + table[2][2] == 3)
			result = "Player O wins!";
		else if (table[0][0] + table[1][0] + table[2][0] == 3)
			result = "Player O wins!";
		else if (table[0][1] + table[1][1] + table[2][1] == 3)
			result = "Player O wins!";
		else if (table[0][2] + table[1][2] + table[2][2] == 3)
			result = "Player O wins!";
		else if (table[0][0] + table[1][1] + table[2][2] == 3)
			result = "Player O wins!";
		else if (table[2][0] + table[1][1] + table[0][2] == 3)
			result = "Player O wins!";
		else if (table[0][0] + table[0][1] + table[0][2] == 0) 
			result = "Player X wins!";
		else if (table[1][0] + table[1][1] + table[1][2] == 0)
			result = "Player X wins!";
		else if (table[2][0] + table[2][1] + table[2][2] == 0)
			result = "Player X wins!";
		else if (table[0][0] + table[1][0] + table[2][0] == 0)
			result = "Player X wins!";
		else if (table[0][1] + table[1][1] + table[2][1] == 0)
			result = "Player X wins!";
		else if (table[0][2] + table[1][2] + table[2][2] == 0)
			result = "Player X wins!";
		else if (table[0][0] + table[1][1] + table[2][2] == 0)
			result = "Player X wins!";
		else if (table[2][0] + table[1][1] + table[0][2] == 0)
			result = "Player X wins!";
		
		else 
			result = "No winner!";
		
		JOptionPane.showMessageDialog(null, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public TTT() {
		int[][] table = new int[3][3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon o = new ImageIcon("Images/circle.png");
		ImageIcon x = new ImageIcon("Images/x.png");
		ImageIcon tic = new ImageIcon("Images/tictaetoe.png");
		
		JLabel box1 = new JLabel("\r\n");
		box1.setBounds(15, 5, 170, 117);
		box1.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box1);
		
		JLabel box2 = new JLabel("");
		box2.setBounds(200, 15, 170, 93);
		box2.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box2);
		
		JLabel box3 = new JLabel("");
		box3.setBounds(385, 15, 170, 93);
		box3.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box3);
		
		JLabel box4 = new JLabel("\r\n");
		box4.setBounds(15, 125, 170, 93);
		box4.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box4);
		
		JLabel box5 = new JLabel("\r\n");
		box5.setBounds(200, 125, 170, 93);
		box5.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box5);
		
		JLabel box6 = new JLabel("\r\n");
		box6.setBounds(385, 125, 170, 93);
		box6.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box6);
		
		JLabel box7 = new JLabel("\r\n");
		box7.setBounds(15, 238, 170, 93);
		box7.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box7);
		
		JLabel box8 = new JLabel("\r\n");
		box8.setBounds(200, 238, 170, 93);
		box8.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box8);
		
		JLabel box9 = new JLabel("\r\n");
		box9.setBounds(385, 238, 170, 93);
		box9.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(box9);
		
		
			box1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2 != 0) {
						box1.setIcon(o);
						table[0][0] = 1;
					}
					
					else {
						box1.setIcon(x);
						table[0][0] = 0;
					}
					
					counter++;
				}
			});
			box2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box2.setIcon(o);
						table[0][1] = 1;
					}
					
					else {
						box2.setIcon(x);
						table[0][1] = 0;
					}
					
					counter++;
				}
			});
			box3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box3.setIcon(o);
						table[0][2] = 1;
					}
					
					else {
						box3.setIcon(x);
						table[0][2] = 0;
					}
					
					counter++;
				}
			});
			box4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box4.setIcon(o);
						table[1][0] = 1;
					}
					
					else {
						box4.setIcon(x);
						table[1][0] = 0;
					}
					
					counter++;
				}
			});
			box5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box5.setIcon(o);
						table[1][1] = 1;
					}
					
					else {
						box5.setIcon(x);
						table[1][1] = 0;
					}
					
					counter++;
				}
			});
			box6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box6.setIcon(o);
						table[1][2] = 1;
					}
					
					else {
						box6.setIcon(x);
						table[1][2] = 0;
					}
					
					counter++;
				}
			});
			box7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box7.setIcon(o);
						table[2][0] = 1;
					}
					
					else {
						box7.setIcon(x);
						table[2][0] = 0;
					}
					
					counter++;
				}
			});
			box8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box8.setIcon(o);
						table[2][1] = 1;
					}
					
					else {
						box8.setIcon(x);
						table[2][1] = 0;
					}
					
					counter++;
				}
			});
			box9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box9.setIcon(o);
						table[2][2] = 1;
					}
					
					else {
						box9.setIcon(x);
						table[2][2] = 0;
					}
					
					counter++;
				}
			});
			
			
		JLabel tac = new JLabel(tic);					
		tac.setBounds(15, 16, 548, 312);
		contentPane.add(tac);
		
		JButton Button = new JButton("New button");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkResult(table);
			}
		});
		Button.setBounds(448, 5, 115, 29);
		contentPane.add(Button);
		
	}
}
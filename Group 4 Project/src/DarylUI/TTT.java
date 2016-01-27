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
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TTT extends JFrame {
	int counter = 0;
	private JPanel contentPane;
	ArrayList<JLabel> tictacs = new ArrayList();
	
	ImageIcon check = new ImageIcon("Images/check.png");
	ImageIcon restart = new ImageIcon("Images/restart.png");

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
		if (table[0][0] * table[0][1] * table[0][2] == 1) 
			result = "Player O wins!";
		else if (table[1][0] * table[1][1] * table[1][2] == 1)
			result = "Player O wins!";
		else if (table[2][0] * table[2][1] * table[2][2] == 1)
			result = "Player O wins!";
		else if (table[0][0] * table[1][0] * table[2][0] == 1)
			result = "Player O wins!";
		else if (table[0][1] * table[1][1] * table[2][1] == 1)
			result = "Player O wins!";
		else if (table[0][2] * table[1][2] * table[2][2] == 1)
			result = "Player O wins!";
		else if (table[0][0] * table[1][1] * table[2][2] == 1)
			result = "Player O wins!";
		else if (table[2][0] * table[1][1] * table[0][2] == 1)
			result = "Player O wins!";
		else if (table[0][0] + table[0][1] + table[0][2] == 6) 
			result = "Player X wins!";
		else if (table[1][0] + table[1][1] + table[1][2] == 6)
			result = "Player X wins!";
		else if (table[2][0] + table[2][1] + table[2][2] == 6)
			result = "Player X wins!";
		else if (table[0][0] + table[1][0] + table[2][0] == 6)
			result = "Player X wins!";
		else if (table[0][1] + table[1][1] + table[2][1] == 6)
			result = "Player X wins!";
		else if (table[0][2] + table[1][2] + table[2][2] == 6)
			result = "Player X wins!";
		else if (table[0][0] + table[1][1] + table[2][2] == 6)
			result = "Player X wins!";
		else if (table[2][0] + table[1][1] + table[0][2] == 6)
			result = "Player X wins!";
		
		else 
			result = "No winner!";
		
		JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public TTT() {
		int[][] table = {
			{0,0,0},
			{0,0,0},
			{0,0,0},
		};
				
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 410);
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
		
		tictacs.add(box1);
		tictacs.add(box2);
		tictacs.add(box3);
		tictacs.add(box4);
		tictacs.add(box5);
		tictacs.add(box6);
		tictacs.add(box7);
		tictacs.add(box8);
		tictacs.add(box9);
		
		
			box1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2 != 0) {
						box1.setIcon(o);
						table[0][0] = 1;
						box1.removeMouseListener(this);
					}
					
					else {
						box1.setIcon(x);
						table[0][0] = 2;
						box1.removeMouseListener(this);
					}
					
					++counter;
					System.out.print(counter);
				}
			});

			box2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if (counter % 2  != 0) {
						box2.setIcon(o);
						table[0][1] = 1;
						box2.removeMouseListener(this);						
					}
					
					else {
						box2.setIcon(x);
						table[0][1] = 2;
						box2.removeMouseListener(this);
					}
					++counter;
					System.out.print(counter);
				}
			});
			box3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box3.setIcon(o);
						table[0][2] = 1;
						box3.removeMouseListener(this);
					}
					
					else {
						box3.setIcon(x);
						table[0][2] = 2;
						box3.removeMouseListener(this);
					}
					
					++counter;
					System.out.print(counter);
				}
			});
			box4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box4.setIcon(o);
						table[1][0] = 1;
						box4.removeMouseListener(this);
					}
					
					else {
						box4.setIcon(x);
						table[1][0] = 2;
						box4.removeMouseListener(this);
					}
					
					++counter;
					System.out.print(counter);
				}
			});
			box5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box5.setIcon(o);
						table[1][1] = 1;
						box5.removeMouseListener(this);
					}
					
					else {
						box5.setIcon(x);
						table[1][1] = 2;
						box5.removeMouseListener(this);
					}
					
					++counter;
					System.out.print(counter);
				}
			});
			box6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box6.setIcon(o);
						table[1][2] = 1;
						box6.removeMouseListener(this);
					}
					
					else {
						box6.setIcon(x);
						table[1][2] = 2;
						box6.removeMouseListener(this);
					}
					
					++counter;
					System.out.print(counter);
				}
			});
			box7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box7.setIcon(o);
						table[2][0] = 1;
						box7.removeMouseListener(this);
					}
					
					else {
						box7.setIcon(x);
						table[2][0] = 2;
						box7.removeMouseListener(this);
					}
					
					
					++counter;
					System.out.print(counter);
				}
			});
			box8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box8.setIcon(o);
						table[2][1] = 1;
						box8.removeMouseListener(this);
					}
					
					else {
						box8.setIcon(x);
						table[2][1] = 2;
						box8.removeMouseListener(this);
					}
					
					++counter;
					System.out.print(counter);
				}
			});
			box9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (counter % 2  != 0) {
						box9.setIcon(o);
						table[2][2] = 1;
						box9.removeMouseListener(this);
					}
					
					else {
						box9.setIcon(x);
						table[2][2] = 2;
						box9.removeMouseListener(this);
					}
					
					++counter;
					System.out.print(counter);
				}
			});
			
			
		JLabel tac = new JLabel(tic);					
		tac.setBounds(15, 16, 548, 312);
		contentPane.add(tac);
		
		JButton Button = new JButton(check);
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkResult(table);			
			}
		});
		Button.setBounds(570, 100, 100, 30);
		contentPane.add(Button);
		
		JButton Restart= new JButton(restart);
		Restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 0;
				for (int row = 0; row < 3; row++) {
					for (int col = 0; col < 3; col++) {
						table[row][col] = 0;
					}
				
					}

				for (JLabel i : tictacs) {
					i.setIcon(null);
					};


					box1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2 != 0) {
								box1.setIcon(o);
								table[0][0] = 1;
								box1.removeMouseListener(this);
							}
							
							else {
								box1.setIcon(x);
								table[0][0] = 2;
								box1.removeMouseListener(this);
							}
							
							++counter;
							System.out.print(counter);
						}
					});

					box2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							
							if (counter % 2  != 0) {
								box2.setIcon(o);
								table[0][1] = 1;
								box2.removeMouseListener(this);						
							}
							
							else {
								box2.setIcon(x);
								table[0][1] = 2;
								box2.removeMouseListener(this);
							}
							++counter;
							System.out.print(counter);
						}
					});
					box3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2  != 0) {
								box3.setIcon(o);
								table[0][2] = 1;
								box3.removeMouseListener(this);
							}
							
							else {
								box3.setIcon(x);
								table[0][2] = 2;
								box3.removeMouseListener(this);
							}
							
							++counter;;
							System.out.print(counter);
						}
					});
					box4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2  != 0) {
								box4.setIcon(o);
								table[1][0] = 1;
								box4.removeMouseListener(this);
							}
							
							else {
								box4.setIcon(x);
								table[1][0] = 2;
								box4.removeMouseListener(this);
							}
							
							++counter;
							System.out.print(counter);
						}
					});
					box5.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2  != 0) {
								box5.setIcon(o);
								table[1][1] = 1;
								box5.removeMouseListener(this);
							}
							
							else {
								box5.setIcon(x);
								table[1][1] = 2;
								box5.removeMouseListener(this);
							}
							
							++counter;
							System.out.print(counter);
						}
					});
					box6.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2  != 0) {
								box6.setIcon(o);
								table[1][2] = 1;
								box6.removeMouseListener(this);
							}
							
							else {
								box6.setIcon(x);
								table[1][2] = 2;
								box6.removeMouseListener(this);
							}
							
							++counter;
							System.out.print(counter);
						}
					});
					box7.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2  != 0) {
								box7.setIcon(o);
								table[2][0] = 1;
								box7.removeMouseListener(this);
							}
							
							else {
								box7.setIcon(x);
								table[2][0] = 2;
								box7.removeMouseListener(this);
							}
							
							
							++counter;
							System.out.print(counter);
						}
					});
					box8.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2  != 0) {
								box8.setIcon(o);
								table[2][1] = 1;
								box8.removeMouseListener(this);
							}
							
							else {
								box8.setIcon(x);
								table[2][1] = 2;
								box8.removeMouseListener(this);
							}
							
							++counter;
							System.out.print(counter);
						}
					});
					box9.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (counter % 2  != 0) {
								box9.setIcon(o);
								table[2][2] = 1;
								box9.removeMouseListener(this);
							}
							
							else {
								box9.setIcon(x);
								table[2][2] = 2;
								box9.removeMouseListener(this);
							}
							
							++counter;
							System.out.print(counter);
						}
					});
				}
			
		});
		Restart.setBounds(570, 200, 100, 30);
		contentPane.add(Restart);
	}
}

package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entity.Tac;
import Entity.Tic;
import Entity.Toes;

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
	boolean turn = false;
	private JPanel contentPane;
	ArrayList<JLabel> tictacs = new ArrayList<JLabel>();
	Toes toe = new Toes("e");
		
	Toes[][] table = {
			{toe,toe,toe},
			{toe,toe,toe},
			{toe,toe,toe},
	};
	
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

	public void checkResult(Toes[][] table) {
		String result = "";		
		
		if ((table[0][0].getSymbol() + table[0][1].getSymbol() + table[0][2].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[1][0].getSymbol() + table[1][1].getSymbol() + table[1][2].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[2][0].getSymbol() + table[2][1].getSymbol() + table[2][2].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][0].getSymbol() + table[1][0].getSymbol() + table[2][0].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][1].getSymbol() + table[1][1].getSymbol() + table[2][1].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][2].getSymbol() + table[1][2].getSymbol() + table[2][2].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][0].getSymbol() + table[1][1].getSymbol() + table[2][2].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[2][0].getSymbol() + table[1][1].getSymbol() + table[0][2].getSymbol()).equals("ooo")) {
			result = "Player O wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][0].getSymbol() + table[0][1].getSymbol() + table[0][2].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[1][0].getSymbol() + table[1][1].getSymbol() + table[1][2].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[2][0].getSymbol() + table[2][1].getSymbol() + table[2][2].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][0].getSymbol() + table[1][0].getSymbol() + table[2][0].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][1].getSymbol() + table[1][1].getSymbol() + table[2][1].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][2].getSymbol() + table[1][2].getSymbol() + table[2][2].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[0][0].getSymbol() + table[1][1].getSymbol() + table[2][2].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if ((table[2][0].getSymbol() + table[1][1].getSymbol() + table[0][2].getSymbol()).equals("xxx")) {
			result = "Player X wins!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (counter == 8) {
			result = "No winner!";
			JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public TTT() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon tics = new ImageIcon("Images/tictaetoe.png");
		
		JLabel box1 = new JLabel("\r\n");
		box1.setBounds(15, 15, 170, 93);
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
				if (turn == false) {
					Tac tac1 = new Tac("x");
					box1.setIcon(tac1.getIcon());
					table[0][0] = tac1;
					box1.removeMouseListener(this);
				}
				
				else {
					Tic tic1 = new Tic("o");
					box1.setIcon(tic1.getIcon());
					table[0][0] = tic1;
					box1.removeMouseListener(this);
					
				}
				
				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
			}
		});

		box2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac2 = new Tac("x");
					box2.setIcon(tac2.getIcon());
					table[0][1] = tac2;
					box2.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tic tic2 = new Tic("o");
					box2.setIcon(tic2.getIcon());
					table[0][1] = tic2;
					box2.removeMouseListener(this);
					
				}
				
				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
			}
		});
		box3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac3 = new Tac("x");
					box3.setIcon(tac3.getIcon());
					table[0][2] = tac3;
					box3.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tic tic3 = new Tic("o");
					box3.setIcon(tic3.getIcon());
					table[0][2] = tic3;
					box3.removeMouseListener(this);
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
			}
		});
		box4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac4 = new Tac("x");
					box4.setIcon(tac4.getIcon());
					table[1][0] = tac4;
					box4.removeMouseListener(this);
					
				}
				
				else if (turn == true) {
					Tic tic4 = new Tic("o");
					box4.setIcon(tic4.getIcon());
					table[1][0] = tic4;
					box4.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
			}
		});
		box5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac5 = new Tac("x");
					box5.setIcon(tac5.getIcon());
					table[1][1] = tac5;
					box5.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tic tic5 = new Tic("o");
					box5.setIcon(tic5.getIcon());
					table[1][1] = tic5;
					box5.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
			}
		});
		box6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac6 = new Tac("x");
					box6.setIcon(tac6.getIcon());
					table[1][2] = tac6;
					box6.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tic tic6 = new Tic("o");
					box6.setIcon(tic6.getIcon());
					table[1][2] = tic6;
					box6.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
			}
		});
		box7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac7 = new Tac("x");
					box7.setIcon(tac7.getIcon());
					table[2][0] = tac7;
					box7.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tic tic7 = new Tic("o");
					box7.setIcon(tic7.getIcon());
					table[2][0] = tic7;
					box7.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
			}
		});
		box8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac8 = new Tac("x");
					box8.setIcon(tac8.getIcon());
					table[2][1] = tac8;
					box8.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tic tic8 = new Tic("o");
					box8.setIcon(tic8.getIcon());
					table[2][1] = tic8;
					box8.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;					
				 
			}
		});
		box9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tac tac9 = new Tac("x");
					box9.setIcon(tac9.getIcon());
					table[2][2] = tac9;
					box9.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tic tic9 = new Tic("o");
					box9.setIcon(tic9.getIcon());
					table[2][2] = tic9;
					box9.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				checkResult(table);	
				counter++;
				 
				
			}
		});
			
			
		JLabel tac2 = new JLabel(tics);					
		tac2.setBounds(15, 16, 548, 312);
		contentPane.add(tac2);
		
		JButton Restart= new JButton(restart);
		Restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turn = true;
				counter = 0;
				for (int row = 0; row < 3; row++) {
					for (int col = 0; col < 3; col++) {
						table[row][col] = toe;
					}
				}

				for (JLabel i : tictacs) {
					i.setIcon(null);
					};


					box1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac1 = new Tac("x");
								box1.setIcon(tac1.getIcon());
								table[0][0] = tac1;
								box1.removeMouseListener(this);
							}
							
							else {
								Tic tic1 = new Tic("o");
								box1.setIcon(tic1.getIcon());
								table[0][0] = tic1;
								box1.removeMouseListener(this);
								
							}
							
							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
						}
					});

					box2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac2 = new Tac("x");
								box2.setIcon(tac2.getIcon());
								table[0][1] = tac2;
								box2.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tic tic2 = new Tic("o");
								box2.setIcon(tic2.getIcon());
								table[0][1] = tic2;
								box2.removeMouseListener(this);
								
							}
							
							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
						}
					});
					box3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac3 = new Tac("x");
								box3.setIcon(tac3.getIcon());
								table[0][2] = tac3;
								box3.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tic tic3 = new Tic("o");
								box3.setIcon(tic3.getIcon());
								table[0][2] = tic3;
								box3.removeMouseListener(this);
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
						}
					});
					box4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac4 = new Tac("x");
								box4.setIcon(tac4.getIcon());
								table[1][0] = tac4;
								box4.removeMouseListener(this);
								
							}
							
							else if (turn == true) {
								Tic tic4 = new Tic("o");
								box4.setIcon(tic4.getIcon());
								table[1][0] = tic4;
								box4.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
						}
					});
					box5.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac5 = new Tac("x");
								box5.setIcon(tac5.getIcon());
								table[1][1] = tac5;
								box5.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tic tic5 = new Tic("o");
								box5.setIcon(tic5.getIcon());
								table[1][1] = tic5;
								box5.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
						}
					});
					box6.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac6 = new Tac("x");
								box6.setIcon(tac6.getIcon());
								table[1][2] = tac6;
								box6.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tic tic6 = new Tic("o");
								box6.setIcon(tic6.getIcon());
								table[1][2] = tic6;
								box6.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
						}
					});
					box7.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac7 = new Tac("x");
								box7.setIcon(tac7.getIcon());
								table[2][0] = tac7;
								box7.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tic tic7 = new Tic("o");
								box7.setIcon(tic7.getIcon());
								table[2][0] = tic7;
								box7.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
						}
					});
					box8.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac8 = new Tac("x");
								box8.setIcon(tac8.getIcon());
								table[2][1] = tac8;
								box8.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tic tic8 = new Tic("o");
								box8.setIcon(tic8.getIcon());
								table[2][1] = tic8;
								box8.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;					
							 
						}
					});
					box9.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tac tac9 = new Tac("x");
								box9.setIcon(tac9.getIcon());
								table[2][2] = tac9;
								box9.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tic tic9 = new Tic("o");
								box9.setIcon(tic9.getIcon());
								table[2][2] = tic9;
								box9.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							checkResult(table);	
							counter++;
							 
							
						}
					});
					
				}
			
		});
		Restart.setBounds(570, 200, 100, 30);
		contentPane.add(Restart);
	}
}

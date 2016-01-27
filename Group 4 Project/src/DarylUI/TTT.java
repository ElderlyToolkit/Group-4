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
	boolean turn = false;
	private JPanel contentPane;
	ArrayList<JLabel> tictacs = new ArrayList<JLabel>();
	
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
		
		
		if (table[0][0] instanceof Tic && table[0][1] instanceof Tic && table[0][2] instanceof Tic) 
			result = "Player O wins! line 52";
		else if (table[1][0] instanceof Tic && table[1][1] instanceof Tic && table[1][2] instanceof Tic)
			result = "Player O wins! line 54";
		else if (table[2][0] instanceof Tic && table[2][1] instanceof Tic && table[2][2] instanceof Tic)
			result = "Player O wins! line 56";
		else if (table[0][0] instanceof Tic && table[1][0] instanceof Tic && table[2][0] instanceof Tic)
			result = "Player O wins! line 58";
		else if (table[0][1] instanceof Tic && table[1][1] instanceof Tic && table[2][1] instanceof Tic)
			result = "Player O wins! line 60";
		else if (table[0][2] instanceof Tic && table[1][2] instanceof Tic && table[2][2] instanceof Tic)
			result = "Player O wins! line 62";
		else if (table[0][0] instanceof Tic && table[1][1] instanceof Tic && table[2][2] instanceof Tic)
			result = "Player O wins! line 64";
		else if (table[2][0] instanceof Tic && table[1][1] instanceof Tic && table[0][2] instanceof Tic)
			result = "Player O wins! line 66";
		else if (table[0][0].getSymbol() == 'x' && table[0][1].getSymbol() == 'x' && table[0][2].getSymbol() == 'x') 
			result = "Player X wins!";
		else if (table[1][0].getSymbol() == 'x' && table[1][1].getSymbol() == 'x' && table[1][2].getSymbol() == 'x')
			result = "Player X wins!";
		else if (table[2][0].getSymbol() == 'x' && table[2][1].getSymbol() == 'x' && table[2][2].getSymbol() == 'x')
			result = "Player X wins!";
		else if (table[0][0].getSymbol() == 'x' && table[1][0].getSymbol() == 'x' && table[2][0].getSymbol() == 'x')
			result = "Player X wins!";
		else if (table[0][1].getSymbol() == 'x' && table[1][1].getSymbol() == 'x' && table[2][1].getSymbol() == 'x')
			result = "Player X wins!";
		else if (table[0][2].getSymbol() == 'x' && table[1][2].getSymbol() == 'x' && table[2][2].getSymbol() == 'x')
			result = "Player X wins!";
		else if (table[0][0].getSymbol() == 'x' && table[1][1].getSymbol() == 'x' && table[2][2].getSymbol() == 'x')
			result = "Player X wins!";
		else if (table[2][0].getSymbol() == 'x' && table[1][1].getSymbol() == 'x' && table[0][2].getSymbol() == 'x')
			result = "Player X wins!";
		
		else 
			result = "No winner!";
		
		JOptionPane.showMessageDialog(TTT.this, result, "Winner!", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public TTT() {
		Toes[][] table = {
				{null,null,null},
				{null,null,null},
				{null,null,null},
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
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box1.setIcon(tac.getIcon());
					table[0][0] = tac;
					box1.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box1.setIcon(tic.getIcon());
					table[0][0] = tic;
					box1.removeMouseListener(this);
					
				}
				
				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
			}
		});

		box2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box2.setIcon(tac.getIcon());
					table[0][1] = tac;
					box2.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box2.setIcon(tic.getIcon());
					table[0][1] = tic;
					box2.removeMouseListener(this);
					
				}
				
				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
			}
		});
		box3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box3.setIcon(tac.getIcon());
					table[0][2] = tac;
					box3.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box3.setIcon(tic.getIcon());
					table[0][2] = tic;
					box3.removeMouseListener(this);
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
			}
		});
		box4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box4.setIcon(tac.getIcon());
					table[1][0] = tac;
					box4.removeMouseListener(this);
					
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box4.setIcon(tic.getIcon());
					table[1][0] = tic;
					box4.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
			}
		});
		box5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box5.setIcon(tac.getIcon());
					table[1][1] = tac;
					box5.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box5.setIcon(tic.getIcon());
					table[1][1] = tic;
					box5.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
			}
		});
		box6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box6.setIcon(tac.getIcon());
					table[1][2] = tac;
					box6.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box6.setIcon(tic.getIcon());
					table[1][2] = tic;
					box6.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
			}
		});
		box7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box7.setIcon(tac.getIcon());
					table[2][0] = tac;
					box7.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box7.setIcon(tic.getIcon());
					table[2][0] = tic;
					box7.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
			}
		});
		box8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box8.setIcon(tac.getIcon());
					table[2][1] = tac;
					box8.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box8.setIcon(tic.getIcon());
					table[2][1] = tic;
					box8.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
										
				System.out.print(turn + ",");
			}
		});
		box9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (turn == false) {
					Tic tac = new Tic();
					tac.setSymbol('o');
					box9.setIcon(tac.getIcon());
					table[2][2] = tac;
					box9.removeMouseListener(this);
				}
				
				else if (turn == true) {
					Tac tic = new Tac();
					tic.setSymbol('x');
					box9.setIcon(tic.getIcon());
					table[2][2] = tic;
					box9.removeMouseListener(this);
					
				}

				if (turn == false)
					turn = true;
				else 
					turn = false;
				
				System.out.print(turn + ",");
				
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
				turn = false;
				for (int row = 0; row < 3; row++) {
					for (int col = 0; col < 3; col++) {
						System.out.print(table[row][col].symbol);
						table[row][col] = null;
					}
				}

				for (JLabel i : tictacs) {
					i.setIcon(null);
					};


					box1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box1.setIcon(tac.getIcon());
								table[0][0] = tac;
								box1.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box1.setIcon(tic.getIcon());
								table[0][0] = tic;
								box1.removeMouseListener(this);
								
							}
							
							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
						}
					});

					box2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box2.setIcon(tac.getIcon());
								table[0][1] = tac;
								box2.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box2.setIcon(tic.getIcon());
								table[0][1] = tic;
								box2.removeMouseListener(this);
								
							}
							
							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
						}
					});
					box3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box3.setIcon(tac.getIcon());
								table[0][2] = tac;
								box3.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box3.setIcon(tic.getIcon());
								table[0][2] = tic;
								box3.removeMouseListener(this);
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
						}
					});
					box4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box4.setIcon(tac.getIcon());
								table[1][0] = tac;
								box4.removeMouseListener(this);
								
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box4.setIcon(tic.getIcon());
								table[1][0] = tic;
								box4.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
						}
					});
					box5.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box5.setIcon(tac.getIcon());
								table[1][1] = tac;
								box5.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box5.setIcon(tic.getIcon());
								table[1][1] = tic;
								box5.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
						}
					});
					box6.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box6.setIcon(tac.getIcon());
								table[1][2] = tac;
								box6.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box6.setIcon(tic.getIcon());
								table[1][2] = tic;
								box6.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
						}
					});
					box7.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box7.setIcon(tac.getIcon());
								table[2][0] = tac;
								box7.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box7.setIcon(tic.getIcon());
								table[2][0] = tic;
								box7.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
						}
					});
					box8.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box8.setIcon(tac.getIcon());
								table[2][1] = tac;
								box8.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box8.setIcon(tic.getIcon());
								table[2][1] = tic;
								box8.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
													
							System.out.print(turn + ",");
						}
					});
					box9.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if (turn == false) {
								Tic tac = new Tic();
								tac.setSymbol('o');
								box9.setIcon(tac.getIcon());
								table[2][2] = tac;
								box9.removeMouseListener(this);
							}
							
							else if (turn == true) {
								Tac tic = new Tac();
								tic.setSymbol('x');
								box9.setIcon(tic.getIcon());
								table[2][2] = tic;
								box9.removeMouseListener(this);
								
							}

							if (turn == false)
								turn = true;
							else 
								turn = false;
							
							System.out.print(turn + ",");
							
						}
					});
					
				}
			
		});
		Restart.setBounds(570, 200, 100, 30);
		contentPane.add(Restart);
	}
}

package AyeUi;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Database.DBController;
import java.sql.PreparedStatement;


public class Forumpage2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forumpage2 frame = new Forumpage2();
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
	public Forumpage2() {
		
		DBController dbc = new DBController();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseACategory = new JLabel("Choose a Category:");
		lblChooseACategory.setFont(new Font("Nyala", Font.BOLD, 18));
		lblChooseACategory.setBounds(27, 29, 174, 20);
		contentPane.add(lblChooseACategory);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Nyala", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Categories", "General", "Entertainment", "Singapore", "Family", "Health", "Hobbies", "Lottery"}));
		comboBox.setBounds(211, 26, 173, 26);
		contentPane.add(comboBox);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Nyala", Font.BOLD, 18));
		lblSubject.setBounds(27, 76, 82, 20);
		contentPane.add(lblSubject);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(119, 76, 265, 26);
		contentPane.add(textPane);
		
		JLabel lblBody = new JLabel("Body:");
		lblBody.setFont(new Font("Nyala", Font.BOLD, 18));
		lblBody.setBounds(27, 133, 69, 20);
		contentPane.add(lblBody);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(27, 167, 358, 172);
		contentPane.add(textPane_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Nyala", Font.BOLD, 16));
		btnSubmit.setBounds(27, 355, 115, 29);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sub = textPane.getText();
				String body = textPane_1.getText();
				
				try{
					
				}
				catch(Exception g){
					
				}
				
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSubmit.setFont(new Font("Nyala", Font.BOLD, 16));
		btnBack.setBounds(160, 355, 115, 29);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}

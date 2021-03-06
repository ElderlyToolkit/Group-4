package UI;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import Database.*;
import Entity.ForumsConstructor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ForumHealth extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForumHealth frame = new ForumHealth();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	private JTable table_1;

	/**
	 * Create the frame.
	 */
	String[] columns = {"Subject", "Message"};
	DefaultTableModel model = new DefaultTableModel();
	DBController dbc = new DBController();
	
	public ForumHealth(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String s ="", r ="";
		
		ResultSet rs = null;
		String dbQuery = "SELECT * FROM forum WHERE category='Health'";
		rs = dbc.readRequest(dbQuery);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(538, 589, 97, 25);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Forum1 f1 = new Forum1();
					f1.setVisible(true);
					setVisible(false);
				}catch(Exception m){}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 623, 273);
		contentPane.add(scrollPane);
		
		try{
			String[] subj = {"Subject","Message"};
			table_1 = new JTable();
			table_1.setColumnSelectionAllowed(true);
			table_1.setCellSelectionEnabled(true);
			table_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
			DefaultTableModel model1=new DefaultTableModel(subj,0){
				public boolean isCellEditable(int row, int column) {
				       return false;
				    }
			};
			table_1.setModel(model1);
			scrollPane.setViewportView(table_1);
			
			
			
			while(rs.next()){
				s = rs.getString("message");
				r = rs.getString("subject");
				System.out.println(r);
		
		
				String [] [] msg = {{r,s}};
				model1.addRow(new Object[]{r,s});
				table_1.setRowHeight(30);				
			}
		}
		catch(Exception e){
		}
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Nyala", Font.BOLD, 18));
		lblSubject.setBounds(12, 336, 81, 16);
		contentPane.add(lblSubject);
		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Nyala", Font.BOLD, 18));
		lblMessage.setBounds(12, 394, 97, 25);
		contentPane.add(lblMessage);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(97, 333, 304, 32);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(12, 432, 392, 160);
		contentPane.add(textPane_1);
		
		JButton btnReply = new JButton("Reply");
		btnReply.setBounds(429, 589, 97, 25);
		contentPane.add(btnReply);
		
		table_1.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
			    if (e.getClickCount() == 1) {
			    	int row = 0, column = 0;
			    	String databaseSubject = "", databaseMessage = null, message, subject;
			      
			      row = table_1.getSelectedRow();
			      column = table_1.getSelectedColumn();
			      message = table_1.getValueAt(row, 1).toString();
			      subject = table_1.getValueAt(row, 0).toString();
			      System.out.println(row);
			      System.out.println("User Data: " + message);
			      JOptionPane.showMessageDialog(ForumHealth.this, message);
			      textPane.setText("RE: " + subject);
			    }
			  }
			});
		
		btnReply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = 0;
				String message = textPane_1.getText();
				String subject = textPane.getText();
				String catergory = "Health";
				ForumsConstructor constructor = new ForumsConstructor(message, catergory, subject);
				id= ForumsDA.createForum(constructor);
				
				if (id>0) {
		    		constructor.setId(id);
		    		JOptionPane.showMessageDialog(ForumHealth.this, "Reply Sucessful!");
		    		//System.out.println("Entry was created");
		    	}
			}
		});
		
		table_1.repaint();
	}
}

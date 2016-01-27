package PeterUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.*;
import RyanUI.ListTableModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

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
	Connection con = null;
	private JTable table_1;

	/**
	 * Create the frame.
	 */
	public ForumHealth() throws FileNotFoundException, IOException, SQLException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ResultSet rs = null;
		String subject = null, message = null;
		DBController dbc = new DBController();
		
		String dbQuery = "SELECT * FROM forum";
		rs = dbc.readRequest(dbQuery);
		
		ListTableModel model = ListTableModel.createModelFromResultSet(rs);
		JTable table = new JTable(model);
		table.setEnabled(true);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(538, 589, 97, 25);
		contentPane.add(btnBack);
		
		JButton btnShow = new JButton("Show");
		btnShow.setBounds(429, 589, 97, 25);
		contentPane.add(btnShow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 623, 567);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		

		
		
	}
}

package DarylUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dictionary extends JFrame {

	private JPanel contentPane;
	private JTextField txtGtg;
	private JTextArea txtrgtgAbbreviationGo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dictionary frame = new Dictionary();
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
	public Dictionary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblText = new JLabel("Word/Phrases:\r\n");
		lblText.setBounds(15, 16, 133, 20);
		contentPane.add(lblText);
		
		txtGtg = new JTextField();
		txtGtg.setBounds(126, 13, 178, 26);
		contentPane.add(txtGtg);
		txtGtg.setColumns(10);
		
		txtrgtgAbbreviationGo = new JTextArea();
		txtrgtgAbbreviationGo.setFont(new Font("Arial", Font.PLAIN, 16));
		txtrgtgAbbreviationGo.setBounds(69, 55, 272, 152);
		contentPane.add(txtrgtgAbbreviationGo);
		
		JLabel lblUsage = new JLabel("Usage:");
		lblUsage.setBounds(15, 52, 69, 20);
		contentPane.add(lblUsage);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(309, 15, 91, 23);
		contentPane.add(btnSearch);
	}
}

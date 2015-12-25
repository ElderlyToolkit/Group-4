package AyeUi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Livechat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Livechat frame = new Livechat();
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
	public Livechat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(15, 147, 398, 223);
		contentPane.add(textArea);
		
		JTextPane txtpnTypeYourMessage = new JTextPane();
		txtpnTypeYourMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnTypeYourMessage.setBackground(SystemColor.control);
		txtpnTypeYourMessage.setText("Fill in your name and message below. Our available counsellor will reply you shortly!");
		txtpnTypeYourMessage.setBounds(15, 20, 412, 54);
		contentPane.add(txtpnTypeYourMessage);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(15, 386, 115, 29);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(85, 90, 328, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(25, 90, 69, 41);
		contentPane.add(lblName);
	}
}

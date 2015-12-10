package RyanUIPrototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.IOException;

public class DayEvent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayEvent frame = new DayEvent();
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
	public DayEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("< Back");
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JLabel lblTodaysDate = new JLabel("Today's Date");
		lblTodaysDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodaysDate.setBounds(109, 15, 315, 14);
		contentPane.add(lblTodaysDate);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 45, 414, 8);
		contentPane.add(separator);
		
		JLabel lblam = new JLabel("Timings");
		lblam.setHorizontalAlignment(SwingConstants.CENTER);
		lblam.setForeground(Color.BLACK);
		lblam.setBackground(UIManager.getColor("List.background"));
		lblam.setBounds(10, 57, 62, 193);
		Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
		lblam.setBorder(border);
		contentPane.add(lblam);
		
		JLabel lblNewLabel = new JLabel("Events");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(71, 57, 353, 193);
		lblNewLabel.setBorder(border);
		contentPane.add(lblNewLabel);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				Events event = new Events();
				setVisible(false);
				event.setVisible(true);
			}
		});
	}
}

package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;

public class Goodbye extends JFrame {

	private JPanel contentPane;
	Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Goodbye frame = new Goodbye();
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
	public Goodbye() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon image = new ImageIcon("Images/logo.png");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(10, 11, 408, 103);
		contentPane.add(imagelabel);
		
		JLabel lblThankYouFor = new JLabel("Thank you for using our app!");
		lblThankYouFor.setFont(new Font("Roboto Condensed", Font.PLAIN, 15));
		lblThankYouFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYouFor.setBounds(10, 125, 408, 21);
		contentPane.add(lblThankYouFor);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMaximum(10);
		progressBar.setBounds(10, 157, 408, 14);
		progressBar.setValue(10);
		contentPane.add(progressBar);
		
		JLabel lblTheAppWill = new JLabel("The app will close within 10 seconds.");
		lblTheAppWill.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheAppWill.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblTheAppWill.setBounds(10, 182, 408, 14);
		contentPane.add(lblTheAppWill);
		
		ActionListener listener = new ActionListener() {
            int counter = 10;
            public void actionPerformed(ActionEvent ae) {
                counter--;
                progressBar.setValue(counter);
                if (counter<0) {
                	//JOptionPane.showMessageDialog(null, "Kaboom!");
                    timer.stop();
                    System.exit(0);
                } 
            }
        };
       timer = new Timer(1000, listener);
       timer.start();
       //JOptionPane.showMessageDialog(null, progressBar);
	}
}

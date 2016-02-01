package UI;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


public class eBooks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eBooks frame = new eBooks();
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
	public eBooks() {
		setTitle("eBooks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCategories = new JLabel("Categories");
		lblCategories.setBounds(176, 13, 84, 33);
		contentPane.add(lblCategories);
		
		ImageIcon knitting = new ImageIcon("Images/knitting.png");
		JButton btnKnitting = new JButton(knitting);
		btnKnitting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKnitting.setBounds(67, 59, 117, 30);
		contentPane.add(btnKnitting);
		
		ImageIcon cooking = new ImageIcon("Images/cooking.png");
		JButton btnCooking = new JButton(cooking);
		btnCooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cooking cook = new cooking();
				cook.setVisible(true);
				setVisible(false);
				
			}
		});
		btnCooking.setBounds(251, 59, 117, 30);
		contentPane.add(btnCooking);
		
		ImageIcon gardening = new ImageIcon("Images/gardening.png");
		JButton btnNewButton = new JButton(gardening);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(67, 129, 117, 30);
		contentPane.add(btnNewButton);
		
		ImageIcon juggling = new ImageIcon("Images/juggling.png");
		JButton btnJuggling = new JButton(juggling);
		btnJuggling.setBounds(251, 129,117, 30);
		contentPane.add(btnJuggling);
		
		ImageIcon embroidery = new ImageIcon("Images/embroidery.png");
		JButton btnEmbroidery = new JButton(embroidery);
		btnEmbroidery.setBounds(67, 199, 117, 30);
		contentPane.add(btnEmbroidery);
		
		ImageIcon sewing = new ImageIcon("Images/sewing.png");
		JButton btnSewing = new JButton(sewing);
		btnSewing.setBounds(251, 199, 117, 30);
		contentPane.add(btnSewing);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton btnBack = new JButton(back);
		btnBack.setBounds(159, 322, 97, 25);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Homepage h = new Homepage();
        		h.setVisible(true);
        		setVisible(false);
        	}
        });
		
	}
}

package UI;

import Database.DBController;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Matchmaking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JFileChooser fc;
	private File file;
	public static int preferedage;
	public static int preferedgender;
	
	public final static int FIVE_SECOND = 5000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matchmaking frame = new Matchmaking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws FontFormatException
	 * @throws SQLException 
	 */
	public Matchmaking() throws IOException, FontFormatException {
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(12f);
		
		ResultSet rs = null;
        DBController db=new DBController();
        String name = null, email = null;
        int age = 0, gender = 0;
        String photo = null;
		
		String dbQuery = "SELECT * FROM users WHERE name='" + Login.user + "'";
		
		rs = db.readRequest(dbQuery);
		
		try {
			while (rs.next()) {
			    name = rs.getString("name");
			    age = rs.getInt("age");
			    email = rs.getString("email");
			    gender = rs.getInt("gender");
			    photo = rs.getString("photo");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		setTitle("Matchmaker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setState(JFrame.NORMAL);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon search = new ImageIcon("Images/search.png");
		JButton btnSubmit = new JButton(search);
		btnSubmit.setBorder(BorderFactory.createEmptyBorder());
		btnSubmit.setContentAreaFilled(false);
		btnSubmit.setBounds(14, 164, 143, 23);
		btnSubmit.setFont(sizedFont);
		contentPane.add(btnSubmit);
		
		ImageIcon reset = new ImageIcon("Images/reset.png");
		JButton btnClear = new JButton(reset);
		btnClear.setBorder(BorderFactory.createEmptyBorder());
		btnClear.setContentAreaFilled(false);
		btnClear.setBounds(14, 198, 143, 23);
		btnClear.setFont(sizedFont);
		contentPane.add(btnClear);
		
		ImageIcon back = new ImageIcon("Images/back.png");
		JButton btnBack = new JButton(back);
		btnBack.setBorder(BorderFactory.createEmptyBorder());
		btnBack.setContentAreaFilled(false);
		btnBack.setBounds(14, 232, 143, 23);
		btnBack.setFont(sizedFont);
		contentPane.add(btnBack);
		
		ImageIcon profile = new ImageIcon(photo);
		JLabel lblProfilePicture = new JLabel(profile);
		lblProfilePicture.setBackground(Color.YELLOW);
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(14, 11, 143, 106);
		contentPane.add(lblProfilePicture);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(167, 40, 46, 14);
		lblName.setFont(sizedFont);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Prefered Age:");
		lblAge.setBounds(167, 65, 68, 14);
		lblAge.setFont(sizedFont);
		contentPane.add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(245, 37, 146, 20);
		textField.setFont(sizedFont);
		textField.setEditable(false);
		textField.setText(name);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPreference = new JLabel("Prefered Gender:");
		lblPreference.setBounds(167, 90, 84, 14);
		lblPreference.setFont(sizedFont);
		contentPane.add(lblPreference);
		
		JRadioButton prefmale = new JRadioButton("Male");
		prefmale.setBounds(255, 86, 54, 23);
		prefmale.setFont(sizedFont);
		contentPane.add(prefmale);
		
		JRadioButton preffemale = new JRadioButton("Female");
		preffemale.setBounds(311, 86, 84, 23);
		preffemale.setFont(sizedFont);
		contentPane.add(preffemale);
		
		if (prefmale.isSelected()) {
			preferedgender = 1;
		}
		else if (preffemale.isSelected()) {
			preferedgender = 2;
		}
		else {
			preferedgender = 0;
		}
		
		final JLabel lblSearchingForYour = new JLabel("Searching for your match...");
		lblSearchingForYour.setBounds(167, 181, 220, 14);
		lblSearchingForYour.setFont(sizedFont);
		contentPane.add(lblSearchingForYour);
		lblSearchingForYour.setVisible(false);
		
		final JLabel lblMatchFound = new JLabel("Match found!");
		lblMatchFound.setBounds(167, 202, 132, 14);
		lblMatchFound.setFont(sizedFont);
		contentPane.add(lblMatchFound);
		lblMatchFound.setVisible(false);
		
		JButton btnProceedToChat = new JButton("Proceed to chat >");
		btnProceedToChat.setBounds(245, 198, 146, 23);
		btnProceedToChat.setFont(sizedFont);
		contentPane.add(btnProceedToChat);
		btnProceedToChat.setVisible(false);
		btnProceedToChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatchmakingList matchmakinglist = null;
				try {
					matchmakinglist = new MatchmakingList();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				matchmakinglist.setVisible(true);
			}
		});
		
		ImageIcon upload = new ImageIcon("Images/upload.png");
		JButton btnUploadPicture = new JButton(upload);
		btnUploadPicture.setBorder(BorderFactory.createEmptyBorder());
		btnUploadPicture.setContentAreaFilled(false);
		btnUploadPicture.setBounds(14, 130, 143, 23);
		btnUploadPicture.setFont(sizedFont);
		
		btnUploadPicture.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e1) {
        		int retval = 0;
        		
        		JFileChooser fileChooser = new JFileChooser();
        		retval = fileChooser.showOpenDialog(Matchmaking.this);
				if (retval == JFileChooser.APPROVE_OPTION) {
				     file = fileChooser.getSelectedFile();
				     lblProfilePicture.setText("");
				     lblProfilePicture.setIcon(new ImageIcon(file.getAbsolutePath()));
			    }
				else {
					JOptionPane.showMessageDialog(Matchmaking.this, "No Image selected!");
				}
        	}
        });
		
		contentPane.add(btnUploadPicture);
		
		ImageIcon image = new ImageIcon("Images/245.GIF");
		final JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(167, 202, 224, 14);
		contentPane.add(imagelabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(245, 62, 146, 17);
		contentPane.add(spinner);
		imagelabel.setVisible(false);
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prefmale.setSelected(false);
				preffemale.setSelected(false);
				lblSearchingForYour.setVisible(false);
				imagelabel.setVisible(false);
				lblMatchFound.setVisible(false);
				btnProceedToChat.setVisible(false);
			}
		});
		
		ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	lblSearchingForYour.setVisible(false);
				imagelabel.setVisible(false);
				lblMatchFound.setVisible(true);
				btnProceedToChat.setVisible(true);
            }
        };
        Timer timer = new Timer(5000, taskPerformer);
        
        btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				preferedage = (int) spinner.getValue();
				lblSearchingForYour.setVisible(true);
				imagelabel.setVisible(true);
				timer.start();
			}
		});
        
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Homepage home = new Homepage();
        		setVisible(false);
        		home.setVisible(true);
        	}
        });
	}
}

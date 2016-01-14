package RyanUI;

import Database.DBController;
import Main.ExistingUser;
import Main.Homepage;
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
	private JTextField textField_1;
	private JTextField textField_2;
	private JFileChooser fc;
	private File file;
	public static String partner;
	
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
	 */
	public Matchmaking() throws IOException, FontFormatException {
		File font_file = new File("Fonts/RobotoCondensed-Regular.ttf");
		Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
		Font sizedFont = font.deriveFont(12f);
		
		ResultSet rs = null;
        DBController db=new DBController();
        String name = null, email = null;
        int age = 0, gender = 0;
		
		String dbQuery = "SELECT * FROM users WHERE name='" + ExistingUser.user + "'";
		
		rs = db.readRequest(dbQuery);
		
		try {
			while (rs.next()) {
			    name = rs.getString("name");
			    age = rs.getInt("age");
			    email = rs.getString("email");
			    gender = rs.getInt("gender");
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
		
		JButton btnSubmit = new JButton("Search");
		btnSubmit.setBounds(14, 164, 116, 23);
		btnSubmit.setFont(sizedFont);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("Reset");
		btnClear.setBounds(14, 198, 116, 23);
		btnClear.setFont(sizedFont);
		contentPane.add(btnClear);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(14, 232, 116, 23);
		btnBack.setFont(sizedFont);
		contentPane.add(btnBack);
		
		JLabel lblProfilePicture = new JLabel();
		lblProfilePicture.setBackground(Color.YELLOW);
		lblProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfilePicture.setBounds(14, 11, 116, 106);
		contentPane.add(lblProfilePicture);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(167, 40, 46, 14);
		lblName.setFont(sizedFont);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(167, 65, 46, 14);
		lblAge.setFont(sizedFont);
		contentPane.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(167, 90, 46, 14);
		lblGender.setFont(sizedFont);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setEnabled(false);
		rdbtnMale.setBounds(245, 86, 54, 23);
		rdbtnMale.setFont(sizedFont);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setEnabled(false);
		rdbtnFemale.setBounds(307, 86, 84, 23);
		rdbtnFemale.setFont(sizedFont);
		contentPane.add(rdbtnFemale);
		
		textField = new JTextField();
		textField.setBounds(206, 37, 185, 20);
		textField.setFont(sizedFont);
		textField.setEditable(false);
		textField.setText(name);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText(Integer.toString(age));
		textField_1.setBounds(206, 62, 185, 20);
		textField_1.setFont(sizedFont);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(167, 115, 46, 14);
		lblEmail.setFont(sizedFont);
		contentPane.add(lblEmail);
		
		JLabel lblPreference = new JLabel("Preference:");
		lblPreference.setBounds(167, 143, 59, 14);
		lblPreference.setFont(sizedFont);
		contentPane.add(lblPreference);
		
		JRadioButton prefmale = new JRadioButton("Male");
		prefmale.setBounds(245, 139, 54, 23);
		prefmale.setFont(sizedFont);
		contentPane.add(prefmale);
		
		JRadioButton preffemale = new JRadioButton("Female");
		preffemale.setBounds(307, 139, 84, 23);
		preffemale.setFont(sizedFont);
		contentPane.add(preffemale);
		
		if (gender == 1) {
			rdbtnMale.setSelected(true);
		}
		else {
			rdbtnFemale.setSelected(true);
		}
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnMale);
		group.add(rdbtnFemale);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText(email);
		textField_2.setBounds(206, 112, 185, 20);
		textField_2.setFont(sizedFont);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
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
				PrivateChat privatechat = null;
				try {
					privatechat = new PrivateChat();
				} catch (FontFormatException | IOException e1) {
					e1.printStackTrace();
				}
				setVisible(false);
				privatechat.setVisible(true);
			}
		});
		
		JButton btnUploadPicture = new JButton("Upload Picture");
		btnUploadPicture.setBounds(14, 130, 116, 23);
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
				int pref = 0;
				String databasePartner = null;
				if (prefmale.isSelected()) {
					pref = 1;
					ResultSet rs = null;
					DBController db=new DBController();
					String dbQuery = "SELECT * FROM users WHERE gender='" + pref + "'";
					
					rs = db.readRequest(dbQuery);
					
					try {
						while (rs.next()) {
							databasePartner = rs.getString("name");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					if (!databasePartner.equals("")) {
						lblSearchingForYour.setVisible(true);
						imagelabel.setVisible(true);
						timer.start();
					}
				}
				else if (preffemale.isSelected()) {
					pref = 2;
					ResultSet rs = null;
					DBController db=new DBController();
					String dbQuery = "SELECT * FROM users WHERE gender='" + pref + "'";
					
					rs = db.readRequest(dbQuery);
					
					try {
						while (rs.next()) {
							databasePartner = rs.getString("name");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					if (!databasePartner.equals("")) {
						lblSearchingForYour.setVisible(true);
						imagelabel.setVisible(true);
						timer.start();
					}
				}
				else if (prefmale.isSelected() && preffemale.isSelected()) {
					pref = 3;
					ResultSet rs = null;
					DBController db=new DBController();
					String dbQuery = "SELECT * FROM users ORDER BY RAND() LIMIT 1";
					
					rs = db.readRequest(dbQuery);
					
					try {
						while (rs.next()) {
							lblSearchingForYour.setVisible(true);
							imagelabel.setVisible(true);
							databasePartner = rs.getString("name");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
					if (!databasePartner.equals("")) {
						timer.start();
					}
				}
				
				partner = databasePartner;
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

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.event.*;

public class Home1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_2;

	public static void main(String[] args) {
		Home1 frame = new Home1();
		frame.setSize(1200, 900);
		frame.setVisible(true);
	}

	public Home1() {
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(100, 14, 927, 555);   //10,14,956,555
		getContentPane().add(tabbedPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Home", null, panel_1, null);
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Course", null, panel, null);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Admin", null, panel_2, null);
		panel_2.setLayout(null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("DATABASE", null, tabbedPane_1, null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 34, 750, 427);
		tabbedPane_1.add(scrollPane);
		
		
		tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
              JTabbedPane pane = (JTabbedPane) e.getSource();
              int index = pane.getSelectedIndex();
              JOptionPane.showMessageDialog(Home1.this,"Tab changed to: " + pane.getTitleAt(index));
            }
          });
		
		
		//Home Page
		JLabel heading = new JLabel("Tech Star");
		heading.setBounds(331, 10, 143, 48);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_1.add(heading);
		
		JLabel lblNewLabel_6 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/title.jpg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img1));
		lblNewLabel_6.setBounds(484, 10, 64, 48);
		panel_1.add(lblNewLabel_6);

		JLabel line1 = new JLabel(
				"-------------------------------------------- Welcome to Tech Star -------------------------------------------");
		line1.setBounds(11, 48, 744, 48);
		line1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(line1);

		JLabel lblNewLabel_3 = new JLabel("The most trusted way to become an IT Expert");
		lblNewLabel_3.setBounds(11, 119, 445, 27);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblNewLabel_3);

		JLabel line2 = new JLabel("* KEY POINTS *");
		line2.setBounds(11, 143, 398, 40);
		line2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(line2);

		JLabel lblNewLabel_3_1 = new JLabel("1.Land your dream tech job");
		lblNewLabel_3_1.setBounds(20, 186, 367, 27);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("2.Mock interviews, hackathons and more");
		lblNewLabel_3_2.setBounds(20, 224, 367, 27);
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1.add(lblNewLabel_3_2);

		JLabel lblNewLabel_3_3 = new JLabel("3.Job-ready portfolio of rich, functional apps");
		lblNewLabel_3_3.setBounds(20, 262, 367, 27);
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1.add(lblNewLabel_3_3);

		JLabel lblNewLabel_3_4 = new JLabel("4.Ticket to fast-tracked career growth in tech");
		lblNewLabel_3_4.setBounds(20, 300, 367, 27);
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1.add(lblNewLabel_3_4);

		JLabel lblNewLabel_3_5 = new JLabel("5.Reserve a Seat for INR 500/-");
		lblNewLabel_3_5.setBounds(20, 340, 367, 27);
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1.add(lblNewLabel_3_5);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(491, 127, 386, 336);
		Image img = new ImageIcon(this.getClass().getResource("/home1.jpg")).getImage();
		// Resize the image to your desired dimensions
		int width7 = 450; // New width
		int height7 = 400; // New height
		Image resizedHome = img.getScaledInstance(width7, height7, Image.SCALE_SMOOTH);
		lblNewLabel_5.setIcon(new ImageIcon(resizedHome));
		lblNewLabel_5.setBounds(489, 85, width7, height7);
		panel_1.add(lblNewLabel_5);
		panel.setLayout(null);
		
		
		
		//Course Page
		JLabel lblNewLabel = new JLabel("Course");
		lblNewLabel.setBounds(400, 11, 115, 37);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(78, 39, 200, 150);
		panel.add(lblNewLabel_2);
		Image imgcour1 = new ImageIcon(this.getClass().getResource("/Full Stack.jpg")).getImage();
		// Resize the image to your desired dimensions
		int width = 200; // New width
		int height = 150; // New height
		Image resizedImg = imgcour1.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(resizedImg));
		panel.add(lblNewLabel_2);
		JLabel lblNewLabel_4 = new JLabel("Full Stack Development");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(100, 200, 200, 27);
		panel.add(lblNewLabel_4);
		JLabel lblNewLabel_13_2 = new JLabel("FEE :- 7000/");
		lblNewLabel_13_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13_2.setBounds(125, 223, 100, 20);
		panel.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(588, 39, 200, 150);
		panel.add(lblNewLabel_2_1);
		Image img2 = new ImageIcon(this.getClass().getResource("/Python.jpg")).getImage();
		// Resize the image to your desired dimensions
		int width1 = 200; // New width
		int height1 = 150; // New height
		Image resizedImg2 = img2.getScaledInstance(width1, height1, Image.SCALE_SMOOTH);
		lblNewLabel_2_1.setIcon(new ImageIcon(resizedImg2));
		panel.add(lblNewLabel_2_1);
		JLabel lblNewLabel_7 = new JLabel("Python Programming");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(620, 203, 200, 20);
		panel.add(lblNewLabel_7);
		JLabel lblNewLabel_13_1 = new JLabel("FEE :- 3000/-");
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13_1.setBounds(650, 223, 100, 20);
		panel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(91, 271, 200, 150);
		panel.add(lblNewLabel_2_2);
		Image img3 = new ImageIcon(this.getClass().getResource("/Java.jpg")).getImage();
		// Resize the image to your desired dimensions
		int width3 = 200; // New width
		int height3 = 150; // New height
		Image resizedImg3 = img3.getScaledInstance(width3, height3, Image.SCALE_SMOOTH);
		lblNewLabel_2_2.setIcon(new ImageIcon(resizedImg3));
		panel.add(lblNewLabel_2_2);
		JLabel lblNewLabel_8 = new JLabel("Core Java");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(160, 419, 100, 20);
		panel.add(lblNewLabel_8);
		JLabel lblNewLabel_12 = new JLabel("FEE :- 4000/-");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_12.setBounds(160, 450, 100, 20);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBounds(600, 271, 200, 150);
		panel.add(lblNewLabel_2_3);
		Image img4 = new ImageIcon(this.getClass().getResource("/ML & AI.jpg")).getImage();
		// Resize the image to your desired dimensions
		int width4 = 200; // New width
		int height4 = 150; // New height
		Image resizedImg4 = img4.getScaledInstance(width4, height4, Image.SCALE_SMOOTH);
		lblNewLabel_2_3.setIcon(new ImageIcon(resizedImg4));
		panel.add(lblNewLabel_2_3);
		JLabel lblNewLabel_9 = new JLabel("Artifical Intelligence");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(630, 432, 200, 20);
		panel.add(lblNewLabel_9);
		JLabel lblNewLabel_13 = new JLabel("FEE :- 5000/-");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13.setBounds(660, 463, 100, 20);
		panel.add(lblNewLabel_13);
		

		//Registration Tab
		JButton Registerbtn = new JButton("Register");
		Registerbtn.setBounds(400, 450, 115, 37);

		Registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel_3 = new JPanel();
				tabbedPane.addTab("Register", null, panel_3, null);
				panel_3.setLayout(null);
				panel_1.setLayout(null);

				JLabel lblNewLabel2 = new JLabel("Register Here");
				lblNewLabel2.setBounds(291, 11, 162, 26);
				lblNewLabel2.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
				panel_3.add(lblNewLabel2);

				JLabel Name = new JLabel("Name");
				Name.setBounds(30, 94, 45, 13);
				panel_3.add(Name);
						
				JTextField textField_2 = new JTextField();
				textField_2.setBounds(142, 91, 311, 19);
			    panel_3.add(textField_2);
				textField_2.setColumns(10);

				JLabel Coursename = new JLabel("Course Name");
			    Coursename.setBounds(30, 143, 86, 13);
				panel_3.add(Coursename);
						
				JTextField textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(142, 140, 234, 19);
				panel_3.add(textField_3);
						
				JLabel Phone = new JLabel("Phone");
				Phone.setBounds(30, 193, 45, 13);
			    panel_3.add(Phone);
						
				JTextField textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(142, 190, 234, 19);
				panel_3.add(textField_4);

				JLabel Email = new JLabel("Email");
				Email.setBounds(30, 240, 45, 13);
				panel_3.add(Email);
						
				JTextField textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(142, 237, 311, 19);
				panel_3.add(textField_5);

				JLabel City = new JLabel("City");
				City.setBounds(30, 291, 45, 13);
				panel_3.add(City);
						
				JTextField textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(142, 288, 104, 19);
				panel_3.add(textField_6);

				JTextField textField = new JTextField();
						
				JButton backbtn = new JButton("Back");
				backbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int selectedIndex = tabbedPane.getSelectedIndex();
				        if (selectedIndex != -1) {
				            tabbedPane.setSelectedIndex(1);
				            tabbedPane.removeTabAt(selectedIndex);
				            tabbedPane.setSelectedIndex(selectedIndex - 3);
				            }
						  }
						});
						
				JButton btnNewButton_1 = new JButton("SUBMIT");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (textField_2.getText().equals("") || textField_3.getText().equals("")
							|| textField_4.getText().equals("") || textField_5.getText().equals("")
							|| textField_6.getText().equals("")) {
								JOptionPane.showMessageDialog(Home1.this, "Enter All data");
							} else {
									String data[] = { textField_2.getText(), textField_3.getText(), textField_4.getText(),
											textField_5.getText(), textField_6.getText() };
									DefaultTableModel tblModel = (DefaultTableModel) table_2.getModel();
									tblModel.addRow(data);
									JOptionPane.showMessageDialog(Home1.this, "Registration Succesfull");
									textField.setText("");
								}
							}
						});
				backbtn.setBounds(400, 383, 94, 38);
				btnNewButton_1.setBounds(64, 383, 94, 38);
				panel_3.add(btnNewButton_1);
				panel_3.add(backbtn);

					tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1); // Switch to the new tab
					}
				});
				panel.add(Registerbtn);
				

		//Admin Tab
		JLabel lblNewLabel2 = new JLabel("Admin");
		lblNewLabel2.setBounds(291, 100, 162, 26);
		lblNewLabel2.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		panel_2.add(lblNewLabel2);
				
		JLabel lblNewLabel_1 = new JLabel("Admin ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(121, 150, 107, 39);
		panel_2.add(lblNewLabel_1);
				
		JTextField textField = new JTextField();
		textField.setBounds(226, 150, 272, 39);
		panel_2.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(121, 243, 107, 39);
		panel_2.add(lblNewLabel_1_1);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(226, 238, 272, 39);
		panel_2.add(passwordField);
				
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = new String(passwordField.getPassword());
				if (username.equals("admin") && password.equals("12345")) {
						tabbedPane.setEnabledAt(3, true);
				} else {
						JOptionPane.showMessageDialog(Home1.this, "Invalid Username or password");
				}
				}});
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		loginButton.setBounds(295, 342, 185, 63);
		panel_2.add(loginButton);
				
				
		//Database Tab
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "NAME", "COURSE NAME", "PHONE NUMBER", "EMAIL", "CITY" }));

		table_2.getColumnModel().getColumn(0).setMinWidth(100);
		table_2.getColumnModel().getColumn(1).setMinWidth(100);
		table_2.getColumnModel().getColumn(2).setMinWidth(180);
		table_2.getColumnModel().getColumn(2).setMaxWidth(0);
		tabbedPane.setEnabledAt(3, false);

   }
}


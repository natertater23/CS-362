import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Book Advantage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_6377821138327491");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Book Advantage");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 48, 356, 60);
		panel.add(lblNewLabel);
		
		JLabel lblEnterId = new JLabel("Enter ID:");
		lblEnterId.setBounds(12, 197, 56, 16);
		panel.add(lblEnterId);
		
		textField = new JTextField();
		textField.setBounds(185, 194, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setBounds(12, 260, 101, 16);
		panel.add(lblEnterPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 257, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = textField.getText();
				String pass = textField_1.getText();
				
				// read txt file or check arr here and switch to corresponding pane 
			}
		});
		btnEnter.setBounds(12, 301, 97, 25);
		panel.add(btnEnter);
		
		JButton btnSignUpHere = new JButton("Sign Up Here");
		btnSignUpHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// change pane to sign up pane 
			}
		});
		btnSignUpHere.setBounds(285, 414, 118, 25);
		panel.add(btnSignUpHere);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\getty_883231284_200013331818843182490_335833.jpg"));
		lblNewLabel_1.setBounds(0, -25, 853, 512);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_6377843307333427");
		panel_1.setLayout(null);
		
		JLabel lblCreateId = new JLabel("Create ID: ");
		lblCreateId.setForeground(Color.WHITE);
		lblCreateId.setBounds(282, 95, 75, 16);
		panel_1.add(lblCreateId);
		
		JLabel lblCreatePassword = new JLabel("Create Password:");
		lblCreatePassword.setForeground(Color.WHITE);
		lblCreatePassword.setBounds(282, 140, 102, 16);
		panel_1.add(lblCreatePassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(442, 92, 116, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(442, 137, 116, 22);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEnter_1 = new JButton("Enter");
		btnEnter_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = textField_2.getText();
				String pass = textField_3.getText();
				
				// write it to the txt file here or add to arr 
			}
		});
		btnEnter_1.setBounds(442, 185, 116, 25);
		panel_1.add(btnEnter_1);
		
		JLabel lblCreateYourAccount = new JLabel("Create Your Account");
		lblCreateYourAccount.setForeground(Color.WHITE);
		lblCreateYourAccount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCreateYourAccount.setBounds(226, 13, 259, 41);
		panel_1.add(lblCreateYourAccount);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\181.png"));
		lblNewLabel_2.setBounds(0, 0, 737, 468);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "name_6378735013698833");
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 78, 177, 36);
		panel_2.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(413, 65, 284, 169);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(208, 382, 133, 22);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(12, 382, 116, 22);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnExitSave = new JButton("Exit & Save");
		btnExitSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// just exit app here 
			}
		});
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(413, 260, 284, 144);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		btnExitSave.setBounds(600, 417, 97, 25);
		panel_2.add(btnExitSave);
		
		JButton btnNewButton_6 = new JButton("Return Book ");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_9.getText();
				// mark it returned 
			}
		});
		btnNewButton_6.setBounds(12, 417, 116, 25);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Check Out Book \r\n");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_10.getText();
				// mark it loaned 
			}
		});
		btnNewButton_5.setBounds(208, 417, 133, 25);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("Eligible Courses:");
		lblNewLabel_3.setBounds(12, 36, 177, 16);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblTextbooks = new JLabel("TextBooks:");
		lblTextbooks.setBounds(413, 36, 107, 16);
		panel_2.add(lblTextbooks);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\dT9rzapBc.png"));
		lblNewLabel_4.setBounds(-135, -16, 844, 538);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "name_6379662685985548");
		panel_3.setLayout(null);
		
		JLabel lblAdminPage = new JLabel("Admin Page");
		lblAdminPage.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		lblAdminPage.setBounds(162, 32, 309, 87);
		panel_3.add(lblAdminPage);
		
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = textField_5.getText();
				// Add course to list
			}
		});
		btnAddCourse.setBounds(90, 365, 140, 25);
		panel_3.add(btnAddCourse);
		
		textField_5 = new JTextField();
		textField_5.setBounds(154, 330, 140, 22);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Remove Course\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = textField_5.getText();
				// Remove course from list
			}
		});
		btnNewButton.setBounds(90, 402, 140, 25);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Activate Course\r\n");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// Type code here 
				String name = textField_5.getText();
				// Make it de-gray
			}
		});
		btnNewButton_1.setBounds(242, 365, 140, 25);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deactivate Course");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = textField_5.getText();
				// Gray out class 
			textField5.setEnabled(false);
			}
		});
		btnNewButton_2.setBounds(242, 402, 140, 25);
		panel_3.add(btnNewButton_2);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(443, 101, 235, 216);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(443, 330, 127, 22);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(154, 101, 198, 216);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Remove Book");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bookName = textField_7.getText();
				// Remove Book from list 
			}
		});
		btnNewButton_4.setBounds(443, 415, 127, 25);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Add Book");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_7.getText();
				// Add Book to list 
			}
		});
		btnNewButton_3.setBounds(443, 377, 127, 25);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\vintage-open-book-image-graphi.png"));
		lblNewLabel_5.setBounds(-12, 0, 709, 468);
		
		panel_3.add(lblNewLabel_5);
		
		String directory = System.getProperty("user.home");  
		String fileName = "sample.txt";  
		String absolutePath = directory + File.separator + fileName;

		// write the content in file 
		try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(absolutePath))) {  
		    String fileContent = "This is a sample text.";
		    bufferedOutputStream.write(fileContent.getBytes());
		} catch (IOException e) {
		    // exception handling
		}

		// read the content from file
		try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath))) {  
		    int ch = bufferedInputStream.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = bufferedInputStream.read();
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
		
		
	}
}

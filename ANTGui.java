import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textField_4;
	private JTextField textField_5;
	private JTextArea textField_6;
	private JTextField textField_7;
	private JTextArea textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextArea textField_11;
	String myId = "";
	String mypass = "";
	
	
	CardLayout bookLayout = new CardLayout();

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
		setTitle("Book Advantagitge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		getContentPane().setLayout(bookLayout);
		//contentPane.setLayout(new CardLayout(0, 0));
		
		
		String directory = System.getProperty("user.home");  
		String fileName = "sample.txt";  
		String absolutePath = directory + File.separator + fileName;

		// read in all the info from the text files and load them into Arrays for quick access 
		// Course, book, admin , student 
		
		// CREATE ArrayList here 
		ArrayList<Student> StudentArr = new ArrayList<Student>();
		ArrayList<Admin> AdminArr = new ArrayList<Admin>();
		ArrayList<Course> CourseArr = new ArrayList<Course>(); // all available courses 
		ArrayList<Course> BookCourseArr = new ArrayList<Course>();
		ArrayList<StudentCourseArray> StudentCourseArr = new ArrayList<StudentCourseArray>();
		ArrayList<Book> BookArr = new ArrayList<Book>(); // all available books
		ArrayList<Book> LoanedBookArr = new ArrayList<Book>(); // all available books
		ArrayList<StudentBookArray> StudentBookArr = new ArrayList<StudentBookArray>();
		
		//Read in Students
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
		    String line = bufferedReader.readLine();
		    while(line != null) {
		        System.out.println(line);
		        line = bufferedReader.readLine();
		        String id = line.substring(0, line.indexOf(" ")); 
		        line = line.substring(line.indexOf(" "));
		        String pass = line.substring(0, line.indexOf(" "));
		        line = line.substring(line.indexOf(" "));
		        String name = line.substring(0, line.indexOf(" "));;
		       Student temp = new Student(name,id,pass);
		       StudentArr.add(temp);
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
		//Read in Student Courses
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
		    String line = bufferedReader.readLine();
		    while(line != null) {
		        System.out.println(line);
		        
		        line = bufferedReader.readLine();
		        String id = line;
		        
		        line = bufferedReader.readLine();
		        String c1,c2,c3,c4;
		        c1 = line;
		        line = bufferedReader.readLine();
		        Course t1  = new Course(c1);
		        c2 = line;
		        Course t2  = new Course(c2);
		        line = bufferedReader.readLine();
		        c3 = line;
		        Course t3  = new Course(c3);
		        line = bufferedReader.readLine();
		        c4 = line;
		        Course t4  = new Course(c4);
		        
		        ArrayList <Course> courses = new ArrayList<Course>();
		        courses.add(t1);
		        courses.add(t2);
		        courses.add(t3);
		        courses.add(t4);
		        
		        StudentCourseArr.add(new StudentCourseArray(id,courses));
		       
		       
		       
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
		//Read in Course Books
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        System.out.println(line);
				        
				        line = bufferedReader.readLine();
				        String name = line;
				        
				        line = bufferedReader.readLine();
				        String c1;
				        c1 = line;
				      
				        Book t1  = new Book(c1);
				       
				        ArrayList <Book> book = new ArrayList<Book>();
				        book.add(t1);
				        
				        
				        BookCourseArr.add(new Course(name,book));
				       
				       
				       
				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
		//Read in Student Books
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
		    String line = bufferedReader.readLine();
		    while(line != null) {
		        System.out.println(line);
		        
		        line = bufferedReader.readLine();
		        String id = line;
		        
		        line = bufferedReader.readLine();
		        String c1,c2,c3,c4;
		        c1 = line;
		        line = bufferedReader.readLine();
		        Book t1  = new Book(c1);
		        c2 = line;
		        Book t2  = new Book(c2);
		        line = bufferedReader.readLine();
		        c3 = line;
		        Book t3  = new Book(c3);
		        line = bufferedReader.readLine();
		        c4 = line;
		        Book t4  = new Book(c4);
		        
		        ArrayList <Book> courses = new ArrayList<Book>();
		        courses.add(t1);
		        courses.add(t2);
		        courses.add(t3);
		        courses.add(t4);
		        
		        StudentBookArr.add(new StudentBookArray(id,courses));
		       
		       
		       
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
		//Read in Admin 
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        System.out.println(line);
				        line = bufferedReader.readLine();
				        String id = line.substring(0, line.indexOf(" ")); 
				        line = line.substring(line.indexOf(" "));
				        String pass = line.substring(0, line.indexOf(" "));
				        line = line.substring(line.indexOf(" "));
				        String name = line.substring(0, line.indexOf(" "));;
				        
				       Admin temp = new Admin(name,id,pass);
				       AdminArr.add(temp);
				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				//Read in courses 
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        System.out.println(line);
				        line = bufferedReader.readLine();
				        Course temp = new Course(line);
				       CourseArr.add(temp);
				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				//Read in Available Books TODO
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        System.out.println(line);
				        line = bufferedReader.readLine();
				       Book temp = new Book(line);
				       BookArr.add(temp);
				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				
				// read in loaned Books TODO
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutePath))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        System.out.println(line);
				        line = bufferedReader.readLine();
				        Book temp = new Book(line);
				       LoanedBookArr.add(temp);
				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				
		JPanel panel = new JPanel();
		contentPane.add(panel, "IntroPage");
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
		
		JLabel lblIncorrect = new JLabel("INCORRECT");
		lblIncorrect.setForeground(Color.RED);
		lblIncorrect.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblIncorrect.setEnabled(false);
		lblIncorrect.setBounds(185, 365, 116, 16);
		
		
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = textField.getText();
				String pass = textField_1.getText();
				boolean flag = false; 
				
				for(int i = 0 ; i< StudentArr.size();i++) {
					if(id == StudentArr.get(i).getEmail() && pass == StudentArr.get(i).getPassword() )
					{
						bookLayout.show(getContentPane(), "StudentPage");
						myId = id;
						mypass = pass; 
						flag = true;
					}
					else if(id == AdminArr.get(i).getEmail() && pass == AdminArr.get(i).getPassword() ){
						bookLayout.show(getContentPane(), "AdminPage");					
						myId = id;
						mypass = pass; 
						flag = true;
					}
					
				}
				// reset text
				textField.setText("");
				textField_1.setText("");
				 
				lblIncorrect.setEnabled(!flag); // Incorrect thing lights up red
				
			}
		});
		
		
		panel.add(lblIncorrect);
		btnEnter.setBounds(12, 301, 97, 25);
		panel.add(btnEnter);
		
		JButton btnSignUpHere = new JButton("Sign Up Here");
		btnSignUpHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bookLayout.show(getContentPane(), "CreatePage");
			}
		});
		btnSignUpHere.setBounds(285, 414, 118, 25);
		panel.add(btnSignUpHere);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\getty_883231284_200013331818843182490_335833.jpg"));
		lblNewLabel_1.setBounds(0, -25, 853, 512);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "CreatePage");
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
				Student temp = null;
				String id = null,name = null,pass = null;
				boolean flag = false;
				
				while (flag == false) {
				id = textField_2.getText();
				pass = textField_3.getText();
				name = "";
				
				temp = new Student(name,id,pass);
				
				for (int i = 0;i<StudentArr.size();i++) {
					if(temp != StudentArr.get(i))
						flag = true;
						
					}
				}		
				
				StudentArr.add(temp); 
				// write the content in file 
				bookLayout.show(getContentPane(),"IntroPage");
			
			}});
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
		contentPane.add(panel_2, "StudentPage");
		panel_2.setLayout(null);
		
		
		// This is where we list the avail courses to the student 
		// with the saved id and pass we get it from the arr 
		//myId - global ID of student
		//StudentCourseArr- (id,ArrayList)
		//Obj - StudentCourseArray
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 78, 177, 36);
		panel_2.add(comboBox);
		
		
		
		for(int a = 0; a < StudentCourseArr.size(); a++) {
			StudentCourseArray currentCourses = StudentCourseArr.get(a); //gives studentCourseArray
			if(currentCourses.getEmail().equals(email)) {	//current student found
				for(int b = 0; b < currentCourses.get(a).size())
					availCourses.addItem(courses.get(a).get(b)); // returns course
			System.out.println(currentCourses.displayCourses() + " added");
			}
		}	
		
		
		
		//Display avail books to the selected class on 4
		textField_4 = new JTextArea();
		textField_4.setEditable(false);
		textField_4.setBounds(413, 65, 284, 169);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		String tempCourseName = textField_4.getSelectedText();
		
		for(int i = 0; i<BookCourseArr.size();i++) {
			if(BookCourseArr.get(i).getName() == tempCourseName) {
				for(int j = 0; j< BookCourseArr.get(i).getBooks().size();i++) {
					
					String name = BookCourseArr.get(i).getBooks().get(j) + "\n";
					textField_4.append(name);
					
				}
			}
		}
			
		
		// loop through coursebook
		
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
		        System.exit(0);

			}
		});
		
		// display loaned out books on 11 DONE
		textField_11 = new JTextArea();
		textField_11.setEditable(false);
		textField_11.setBounds(413, 271, 284, 144);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		
		
		for(int i = 0; i<StudentBookArr.size();i++) {
			if(StudentBookArr.get(i).getEmail() == myId) {
				for(int j = 0; j< StudentBookArr.get(i).getBooks().size();i++) {
					
					String name = StudentBookArr.get(i).getBooks().get(j) + "\n";
					textField_4.append(name);
					
				}
			}
		}
		
		
		btnExitSave.setBounds(600, 417, 97, 25);
		panel_2.add(btnExitSave);
		
		JButton btnNewButton_6 = new JButton("Return Book ");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_9.getText();
				textField_9.setText("");
				
				
				// remove from studentbookarr, add to avail book list, 
			}
		});
		btnNewButton_6.setBounds(12, 417, 116, 25);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Check Out Book \r\n");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_10.getText();
				// mark it loaned, add it to arr and text files 
				
				
			}
		});
		btnNewButton_5.setBounds(208, 417, 133, 25);
		panel_2.add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("Eligible Courses:");
		lblNewLabel_3.setBounds(12, 36, 177, 16);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblTextbooks = new JLabel("Available TextBooks:");
		lblTextbooks.setBounds(413, 36, 148, 16);
		panel_2.add(lblTextbooks);
		
		JLabel lblNewLabel_6 = new JLabel("Currently Loaned Books:");
		lblNewLabel_6.setBounds(413, 247, 148, 16);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\dT9rzapBc.png"));
		lblNewLabel_4.setBounds(-135, -16, 844, 538);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "AdminPage");
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
		btnAddCourse.setBounds(154, 364, 140, 25);
		panel_3.add(btnAddCourse);
		
		// 5 is the field for course remove/add/deactivate/activate
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
		btnNewButton.setBounds(154, 403, 140, 25);
		panel_3.add(btnNewButton);
		//ALL BOOKS DISPLAYED HERE 
		textField_6 = new JTextArea();
		textField_6.setEditable(false);
		textField_6.setBounds(443, 101, 235, 216);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		// 7 is for the book remove/add
		textField_7 = new JTextField();
		textField_7.setBounds(443, 330, 127, 22);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		// ALL COURSES DISPLAYED HERE ? 
		textField_8 = new JTextArea();
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
		btnNewButton_4.setBounds(443, 403, 127, 25);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Add Book");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_7.getText();
				// Add Book to list 
			}
		});
		btnNewButton_3.setBounds(443, 364, 127, 25);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\vintage-open-book-image-graphi.png"));
		lblNewLabel_5.setBounds(-12, 0, 709, 468);
		
		panel_3.add(lblNewLabel_5);
		
		
		// End i/o 
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {  
		    String fileContent = "";
		    bufferedWriter.write(fileContent);
		} catch (IOException e1) {
		    // exception handling
		}
		

		
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
	private JPasswordField textField_1;
	private JTextField textField_2;
	private JPasswordField textField_3;
	private JTextArea textField_4;
	private JTextField textField_5;
	private JTextArea textField_6;
	private JTextField textField_7;
	private JTextArea textField_8;
	private JTextArea textArea;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextArea textField_11;
	String myId = "";
	String mypass = "";
	
	
	CardLayout bookLayout = new CardLayout();
	private JTextField textField_12;

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
		ArrayList<Book> LoanedBookArr = new ArrayList<Book>(); // all loaned books ?
		ArrayList<Book> TotalBookArr = new ArrayList<Book>(); // TOTAL BOOK COUNT
		ArrayList<StudentBookArray> StudentBookArr = new ArrayList<StudentBookArray>();
	   

		//Read in Students
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\students.txt"))) {  
			
		    String line = bufferedReader.readLine();
		   
		    while(line != null) {
		     
		        
		        String name = line.substring(0, line.indexOf(" ")); 
		        line = line.substring(line.indexOf(" ")+1);
		        String id = line.substring(0, line.indexOf(" "));
		        line = line.substring(line.indexOf(" ")+1);
		        String pass = line;
		       Student temp = new Student(name,id,pass);
		       StudentArr.add(temp);
		       
		       line = bufferedReader.readLine();
		    }
		} catch (FileNotFoundException e) {
		    // exception handling

		} catch (IOException e) {
		    // exception handling
		   

		}
		//Read in Student Courses
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Student_Courses.txt"))) {  
		    String line = bufferedReader.readLine();
		    while(line != null) {
		        
		        String id = line;
		        String c1,c2,c3,c4;
		        
		        line = bufferedReader.readLine();
		         c1 = line;
		        Course t1  = new Course(c1);
		        
		        line = bufferedReader.readLine();
		        c2 = line;
		        Course t2  = new Course(c2);
		        
		        line = bufferedReader.readLine();
		        c3 = line;
		        Course t3  = new Course(c3);
		        
		        line = bufferedReader.readLine();
		        c4 = line;
		        Course t4  = new Course(c4);
		        //System.out.println(id + c1 + c2 + c3 + c4);
		        
		        ArrayList <Course> courses = new ArrayList<Course>();
		        courses.add(t1);
		        courses.add(t2);
		        courses.add(t3);
		        courses.add(t4);
		        
		        StudentCourseArr.add(new StudentCourseArray(id,courses));
		       
		        line = bufferedReader.readLine();

		       
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
		//Read in Course Books
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Book_Courses.txt"))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        
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
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\StudentBookArr.txt"))) {  
		    String line = bufferedReader.readLine();
		    while(line != null) {
		        
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
		        //System.out.println(id + c1 + c2 + c3 + c4);

		        ArrayList <Book> courses = new ArrayList<Book>();
		        courses.add(t1);
		        courses.add(t2);
		        courses.add(t3);
		        courses.add(t4);
		        
		        StudentBookArr.add(new StudentBookArray(id,courses));
		        line = bufferedReader.readLine();

		       
		       
		    }
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		}
		//Read in Admin 
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\admins.txt"))) {  
				    
					String line = bufferedReader.readLine();

				    while(line != null) {
				    	
				        String name = line.substring(0, line.indexOf(" ")); 
				        line = line.substring(line.indexOf(" ")+1);
				        String id = line.substring(0, line.indexOf(" "));
				        line = line.substring(line.indexOf(" ")+1);
				        String pass = line;

				        
				       Admin temp = new Admin(name,id,pass);
				       AdminArr.add(temp);
				        line = bufferedReader.readLine();

				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				//Read in courses 
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Courses.txt"))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        Course temp = new Course(line);
				       CourseArr.add(temp);
				        line = bufferedReader.readLine();

				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				//Read in Available Books 
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\BookArr.txt"))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				       Book temp = new Book(line);
				       BookArr.add(temp);
				        line = bufferedReader.readLine();

				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				//Read in Total Books 
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\TotalBookArr.txt"))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				       Book temp = new Book(line);
				       TotalBookArr.add(temp);
				        line = bufferedReader.readLine();

				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				// read in loaned Books 
				try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\LoanedBookArr.txt"))) {  
				    String line = bufferedReader.readLine();
				    while(line != null) {
				        Book temp = new Book(line);
				       LoanedBookArr.add(temp);
				        line = bufferedReader.readLine();

				    }
				} catch (FileNotFoundException e) {
				    // exception handling
				} catch (IOException e) {
				    // exception handling
				}
				
		JPanel panel = new JPanel();
		contentPane.add(panel,"IntroPage");
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
		
		textField_1 = new JPasswordField();
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
				//bookLayout.show(getContentPane(), "StudentPage");

				String id = textField.getText();
				String pass = textField_1.getText();
				boolean flag = false; 
				
				for(int i = 0 ; i< StudentArr.size();i++) {
					if(id.equals(StudentArr.get(i).getEmail()) && pass.equals(StudentArr.get(i).getPassword()) )
					{
						
						myId = id;
						mypass = pass; 
						flag = true;
						// reset text
						textField.setText("");
						textField_1.setText("");

						for(int a = 0; a < StudentCourseArr.size(); a++) {
							if(StudentCourseArr.get(a).getEmail().equals(myId)) {	//current student found
								System.out.println(StudentCourseArr.get(a).getEmail());
								for(int b = 0; b < StudentCourseArr.get(a).getCourses().size();b++) {
									System.out.print(StudentCourseArr.get(a).getCourses().get(b).getName() + "\n");
									textArea.append(StudentCourseArr.get(a).getCourses().get(b).getName() + "\n"); // returns course
								}
							}
						}
						for(int c = 0; c<StudentBookArr.size();c++) {
							if(StudentBookArr.get(c).getEmail().equals(myId)) {
								for(int d = 0; d< StudentBookArr.get(c).getBooks().size();d++) {
									
									String name = StudentBookArr.get(c).getBooks().get(d) + "\n";
									textField_11.append(name);
									
								}
							}
						}
						
								for(int f = 0; f< BookArr.size();f++) {
									
									String name = BookArr.get(f).getName() + "\n";
									textField_4.append(name);
									
								}
							
						
						bookLayout.show(getContentPane(), "StudentPage");

					}
				}
					
				for(int i = 0 ; i< AdminArr.size();i++) {

				if(  AdminArr.size() > 0 && id.equals(AdminArr.get(i).getid()) && pass.equals(AdminArr.get(i).getPassword()) ){
						myId = id;
						mypass = pass; 
						flag = true;
						// reset text
						textField.setText("");
						textField_1.setText("");
						

						bookLayout.show(getContentPane(), "AdminPage");					

					}
				}
					
					
				
				
				lblIncorrect.setEnabled(!flag); // Incorrect thing lights up red
				textField.setText("");
				textField_1.setText("");
				 
				

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
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name:");
		lblEnterYourName.setForeground(Color.WHITE);
		lblEnterYourName.setBounds(282, 55, 116, 16);
		panel_1.add(lblEnterYourName);
		
		JLabel lblCreateId = new JLabel("Create ID: ");
		lblCreateId.setForeground(Color.WHITE);
		lblCreateId.setBounds(282, 95, 75, 16);
		panel_1.add(lblCreateId);
		
		JLabel lblCreatePassword = new JLabel("Create Password:");
		lblCreatePassword.setForeground(Color.WHITE);
		lblCreatePassword.setBounds(282, 140, 102, 16);
		panel_1.add(lblCreatePassword);
		
		textField_12 = new JTextField();
		textField_12.setBounds(442, 52, 116, 22);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(442, 92, 116, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JPasswordField();
		textField_3.setBounds(442, 137, 116, 22);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEnter_1 = new JButton("Enter");
		btnEnter_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {

				Student temp = null;
				String id = null,name = null,pass = null;
				boolean flag = false;
				
				do {
				id = textField_2.getText();
				pass = textField_3.getText();
				name = textField_12.getText();
				textField_12.setText("");
				textField_2.setText("");
				textField_3.setText("");

				
				temp = new Student(name,id,pass);
				
				for (int i = 0;i<StudentArr.size();i++) {
					if(StudentArr.size()>0 && id.equals(StudentArr.get(i).getEmail()))
						flag = true;
						
					}
				
									// remove later just for testing 
				}while (flag == true);	
				
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
		
		
		
		//Display avail books to the selected class on 4
		textField_4 = new JTextArea();
		textField_4.setEditable(false);
		textField_4.setBounds(413, 65, 284, 169);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		
			
		
		// loop through coursebook
		
		textField_9 = new JTextField();
		textField_9.setBounds(12, 377, 116, 22);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(192, 377, 131, 22);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Check Out Book \r\n");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_10.getText();
				// mark it loaned, add it to arr and text files 
				
				textField_10.setText("");
				
				
				for(int i = 0 ; i<StudentBookArr.size();i++) {
					if(StudentBookArr.get(i).getEmail()==myId) {
						StudentBookArr.get(i).getBooks().add(new Book(bookName));
						
						}
					}
				for(int i = 0 ; i <BookArr.size();i++) {
					if(BookArr.get(i).getName().equals(bookName)) {
						BookArr.remove(i);
					}
				}
				LoanedBookArr.add(new Book(bookName));
				
			}
		});
		btnNewButton_5.setBounds(192, 417, 131, 25);
		panel_2.add(btnNewButton_5);
		JButton btnExitSave = new JButton("Exit & Save");
		btnExitSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// just exit app here 
				
				// End i/o 
		        // Student 
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\students.txt"))) {
		            for(int i = 0; i < StudentArr.size(); i++) {
		                bufferedWriter.write(StudentArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        // StudentCourse
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Student_Courses.txt"))) {
		        	for (int i = 0;i<StudentCourseArr.size();i++) {		        		
		    			bufferedWriter.write(StudentCourseArr.get(i).getEmail());
		    			bufferedWriter.newLine();
		    			for(int j = 0;j<StudentCourseArr.get(i).getCourses().size();j++) {
		    				bufferedWriter.write(StudentCourseArr.get(i).getCourses().get(j).getName());
		    				bufferedWriter.newLine();
		    			}
		    		}
		            
		       
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //StudentBook
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\StudentBookArr.txt"))) {
		        	for (int i = 0;i<StudentBookArr.size();i++) {		        		
		    			bufferedWriter.write(StudentBookArr.get(i).getEmail());
		    			bufferedWriter.newLine();
		    			for(int j = 0;j<StudentBookArr.get(i).getBooks().size();j++) {
		    				bufferedWriter.write(StudentBookArr.get(i).getBooks().get(j).getName());
		    				bufferedWriter.newLine();
		    			}
		    		}
		        }
		         catch (IOException e1) {
		            // exception handling
		        }
		//Admin
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\admins.txt"))) {
		            for(int i = 0; i < AdminArr.size(); i++) {
		            bufferedWriter.write(AdminArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //Book
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\BookArr.txt"))) {
		            for(int i = 0; i < BookArr.size(); i++) {
		                bufferedWriter.write(BookArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //totalbook
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\TotalBookArr.txt"))) {
		            for(int i = 0; i < TotalBookArr.size(); i++) {
		                bufferedWriter.write(TotalBookArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //loaned
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\LoanedBookArr.txt"))) {
		            for(int i = 0; i < LoanedBookArr.size(); i++) {
		                bufferedWriter.write(LoanedBookArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //Courses
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Courses.txt"))) {
		            for(int i = 0; i < CourseArr.size(); i++) {
		                bufferedWriter.write(CourseArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //book course
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Book_Courses.txt"))) {
		            for(int i = 0; i < BookCourseArr.size(); i++) {
		                bufferedWriter.write(BookCourseArr.get(i).toString());
		                bufferedWriter.newLine();
		            }
		            
		        } catch (IOException e1) {
		            // exception handling
		        }
		        System.exit(0);

			}
		});
		
		// display loaned out books on 11 DONE
		textField_11 = new JTextArea();
		textField_11.setEditable(false);
		textField_11.setBounds(413, 271, 284, 144);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		
	
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(22, 75, 284, 159);
		panel_2.add(textArea);
		
		
		btnExitSave.setBounds(600, 417, 97, 25);
		panel_2.add(btnExitSave);
		
		JButton btnNewButton_6 = new JButton("Return Book ");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bookName = textField_9.getText();
				textField_9.setText("");
				
				for(int i = 0 ; i<StudentBookArr.size();i++) {
					if(StudentBookArr.get(i).getEmail()==myId) {
						for(int j = 0; j < StudentBookArr.get(i).getBooks().size();j++) {		
							if(StudentBookArr.get(i).getBook(j).getName() == bookName) {
								StudentBookArr.get(i).getBooks().remove(j);
								// removes book
							}
						}
					}
				}
				for(int i = 0 ; i <LoanedBookArr.size();i++) {
					if(LoanedBookArr.get(i).getName().equals(bookName)) {
						LoanedBookArr.remove(i);
					}
				}
				
				BookArr.add(new Book(bookName));
				//adds it to the pool of avail books
				
			}
		});
		btnNewButton_6.setBounds(12, 417, 116, 25);
		panel_2.add(btnNewButton_6);
		
		
		
		
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
				textField_5.setText("");

				CourseArr.add(new Course(name));
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
				textField_5.setText("");
				// Remove course from list
				for(int i = 0; i < CourseArr.size(); i++) {

                    if(CourseArr.get(i).getName().equals(name))
                        CourseArr.remove(i);

                }
				
			}
		});
		
		JButton btnExitAndSave = new JButton("Exit and Save");
		btnExitAndSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				// End i/o 
		        // Student 
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\students.txt"))) {
		            for(int i = 0; i < StudentArr.size(); i++) {
		                bufferedWriter.write(StudentArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        // StudentCourse
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Student_Courses.txt"))) {
		        	for (int i = 0;i<StudentCourseArr.size();i++) {		        		
		    			bufferedWriter.write(StudentCourseArr.get(i).getEmail());
		    			bufferedWriter.newLine();
		    			for(int j = 0;j<StudentCourseArr.get(i).getCourses().size();j++) {
		    				bufferedWriter.write(StudentCourseArr.get(i).getCourses().get(j).getName());
		    				bufferedWriter.newLine();
		    			}
		    		}
		            
		       
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //StudentBook
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\StudentBookArr.txt"))) {
		        	for (int i = 0;i<StudentBookArr.size();i++) {		        		
		    			bufferedWriter.write(StudentBookArr.get(i).getEmail());
		    			bufferedWriter.newLine();
		    			for(int j = 0;j<StudentBookArr.get(i).getBooks().size();j++) {
		    				bufferedWriter.write(StudentBookArr.get(i).getBooks().get(j).getName());
		    				bufferedWriter.newLine();
		    			}
		    		}
		        }
		         catch (IOException e1) {
		            // exception handling
		        }
		//Admin
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\admins.txt"))) {
		            for(int i = 0; i < AdminArr.size(); i++) {
		            bufferedWriter.write(AdminArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //Book
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\BookArr.txt"))) {
		            for(int i = 0; i < BookArr.size(); i++) {
		                bufferedWriter.write(BookArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //totalbook
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\TotalBookArr.txt"))) {
		            for(int i = 0; i < TotalBookArr.size(); i++) {
		                bufferedWriter.write(TotalBookArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //loaned
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\LoanedBookArr.txt"))) {
		            for(int i = 0; i < LoanedBookArr.size(); i++) {
		                bufferedWriter.write(LoanedBookArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //Courses
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Courses.txt"))) {
		            for(int i = 0; i < CourseArr.size(); i++) {
		                bufferedWriter.write(CourseArr.get(i).toString());
		            bufferedWriter.newLine();
		        }
		        } catch (IOException e1) {
		            // exception handling
		        }
		        //book course
		        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ant\\eclipse-workspace\\Book\\src\\Book_Courses.txt"))) {
		            for(int i = 0; i < BookCourseArr.size(); i++) {
		                bufferedWriter.write(BookCourseArr.get(i).toString());
		                bufferedWriter.newLine();
		            }
		            
		        } catch (IOException e1) {
		            // exception handling
		        }
		        System.exit(0);
			}
		});
		btnExitAndSave.setBounds(581, 430, 116, 25);
		panel_3.add(btnExitAndSave);
		btnNewButton.setBounds(154, 403, 140, 25);
		panel_3.add(btnNewButton);
		//ALL BOOKS DISPLAYED HERE 
		textField_6 = new JTextArea();
		textField_6.setEditable(false);
		textField_6.setBounds(443, 101, 235, 216);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		for(int i = 0; i < TotalBookArr.size(); i++)
            textField_6.append((TotalBookArr.get(i).getName() + "\n"));
		
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
		
		for(int k = 0; k < CourseArr.size(); k++)
			textField_8.append(CourseArr.get(k).getName() + "\n");
		
		JButton btnNewButton_4 = new JButton("Remove Book");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bookName = textField_7.getText();
				textField_7.setText("");
				
				// Remove Book from list
				for(int i = 0; i < BookArr.size(); i++) {
                    if(TotalBookArr.get(i).getName().equals(bookName))
                        TotalBookArr.remove(i);
                }
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
				textField_7.setText("");

				TotalBookArr.add(new Book(bookName));
				
	     
	            

			}
		});
		btnNewButton_3.setBounds(443, 364, 127, 25);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Ant\\Desktop\\vintage-open-book-image-graphi.png"));
		lblNewLabel_5.setBounds(-12, 0, 709, 468);
		
		panel_3.add(lblNewLabel_5);
		
	
		
	}
}

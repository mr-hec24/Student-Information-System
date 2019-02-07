import java.io.*;
import java.text.*;
import java.util.*;

public class MainMenu
	{
		static ArrayList<Student> roster = new ArrayList<Student>();
		
		public static void main(String[]args) throws IOException
		{
			mainMenu();
		}
		
		public static void mainMenu() throws IOException // Asks the user what he/she wants to do
		{
			fillStudentRoster();
			boolean shouldContinue;
			do
				{
					// Main Menu
					System.out.println("What Would You Like To Do?");
					System.out.println("     1) Add or Delete a Student"
					+ "\n     2) Change Student Grades/Schedule"
					+ "\n     3) Sort Students");
					
					Scanner userInput = new Scanner(System.in);
					int answer = userInput.nextInt();
					
					switch (answer)
					{
						// Adding and Deleting Students
						case 1: 
								{
									boolean tryAgain;
									do
										{
											tryAgain = false;
										// Adding or Deleting Menu
										System.out.println("Would You Like To Add Or Delete A Student?"
											+ "\n     1) Add Student"
											+ "\n     2) Delete Student");
										
											userInput = new Scanner(System.in);
											answer = userInput.nextInt();
											
											// Adds Student
											if (answer == 1)
												AddStudent.runner();
											
											// Deletes Student
											else if (answer == 2)
												DeleteStudent.runner();
											
											// Try A Different Input
											else
												{
													String[] notValidText = {"N","O","T"," ","A"," ","V","A","L","I","D"," ","O","P","T","I","O","N","!"," ","T","R","Y"," ","A","G","A","I","N","!"};
													dramaticPrintOut(150 , notValidText);
													tryAgain = true;
												}
												
											
										} while (tryAgain);
									
									break;
								}
						// Changing Grades / Schedules
						case 2: 
								{
									boolean tryAgain;
									do
										{
										tryAgain = false;
										System.out.println("Would You Like To Change A Grade Or A Schedule?"
											+ "\n     1) Change Grade"
											+ "\n     2) Change Schedule");
										userInput = new Scanner (System.in);
										int change = userInput.nextInt();
										
										if (change == 1)
											GradeChange.changeGrade();
										
										else if (change == 2)
											ScheduleChange.changeSchedule();
											
										else
											{
												String[] notValidText = {"N","O","T"," ","A"," ","V","A","L","I","D"," ","O","P","T","I","O","N","!"," ","T","R","Y"," ","A","G","A","I","N","!"};
												dramaticPrintOut(150 , notValidText);
												tryAgain = true;
											}
										
										} while (tryAgain);
									break;
								}
						// Sorting Students by Last Name, GPA, Classes, and First Name
						case 3:  
								{
									Sort.mainMethod();
									break;
								}
						// Just in case the user is dumb and inputs an invalid option
						default:
								{
									String[] notValidText = {"N","O","T"," ","A"," ","V","A","L","I","D"," ","O","P","T","I","O","N","!"," ","T","R","Y"," ","A","G","A","I","N","!"};
									dramaticPrintOut(150 , notValidText);
									break;
								}
					}
					// Try Again Menu
					System.out.println("Would You Like To Do Something Else?"
							+ "\n     1) Yes"
							+ "\n     2) No");
					userInput = new Scanner(System.in);
					answer = userInput.nextInt();
					
					// Determines whether the computer should continue or not
					shouldContinue = answer == 1? true: false;
					
				} while (shouldContinue);
		}
		
		public static void fillStudentRoster() throws IOException // Fills the roster with Student Objects
			{
				Scanner file = new Scanner(new File("information"));
				while (file.hasNext())
					{
						// Takes First and Last Name from the text file
						String firstName = file.next();
						String lastName = file.next();
						
						Classes[] courses = new Classes[3];
						
						// Creates Period 1
						String period1 = file.next();
						String period1Grade = file.next();
						courses[0] = new Classes(1, period1, period1Grade);
						
						// Creates Period 2
						String period2 = file.next();
						String period2Grade = file.next();
						courses[1] = new Classes(2, period2, period2Grade);
						
						// Creates Period 3
						String period3 = file.next();
						String period3Grade = file.next();
						courses[2] = new Classes(3, period3, period3Grade);

						// The Following Three Lines Calculates The Letter GRade Point Value
						double gpa = period1Grade.equals("A")? 4.0 : period1Grade.equals("A-")? 3.7 : period1Grade.equals("B+")? 3.3 : period1Grade.equals("B")? 3 : period1Grade.equals("B-")? 2.7 : period1Grade.equals("C+")? 2.3 : period1Grade.equals("C")? 2 : period1Grade.equals("C-")? 1.7 : period1Grade.equals("D+")? 1.3 : period1Grade.equals("D")?  1.0 : period1Grade.equals("D-")? 0.7 : 0;
						gpa += period2Grade.equals("A")? 4.0 : period2Grade.equals("A-")? 3.7 : period2Grade.equals("B+")? 3.3 : period2Grade.equals("B")? 3 : period2Grade.equals("B-")? 2.7 : period2Grade.equals("C+")? 2.3 : period2Grade.equals("C")? 2 : period2Grade.equals("C-")? 1.7 : period2Grade.equals("D+")? 1.3 : period2Grade.equals("D")?  1.0 : period2Grade.equals("D-")? 0.7 : 0;
						gpa += period3Grade.equals("A")? 4.0 : period3Grade.equals("A-")? 3.7 : period3Grade.equals("B+")? 3.3 : period3Grade.equals("B")? 3 : period3Grade.equals("B-")? 2.7 : period3Grade.equals("C+")? 2.3 : period3Grade.equals("C")? 2 : period3Grade.equals("C-")? 1.7 : period3Grade.equals("D+")? 1.3 : period3Grade.equals("D")?  1.0 : period3Grade.equals("D-")? 0.7 : 0;
						gpa /= 3;
						
						// Creates a specific Format for the GPA so that it could have 2 decimal points
						Format decimal = new DecimalFormat("0.00");
						String tempGPA = decimal.format(gpa);
						gpa = Double.valueOf(tempGPA);
						
						// Adds the student to student roster
						roster.add(new Student(firstName, lastName, gpa, courses));
					}
			}
			
		public static void dramaticPrintOut(int numberOfMilliseconds, String[] text) // Prints Out LEtter By Letter Very Dramatically
			{
				for (String letter: text)
					{
						try
							{
								System.out.print(letter + " ");
								Thread.sleep(numberOfMilliseconds);
							} 
						catch (InterruptedException e)
							{
								e.printStackTrace();
							}
					}
				System.out.println(" ");
			}
	}
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu
	{
		static ArrayList<Student> roster = new ArrayList<Student>();
		
		public static void main(String[]args) throws IOException
		{
			mainMenu();
		}
		
		public static void fillStudentRoster() throws IOException // Fills the roster with Student Objects
		{
			Scanner file = new Scanner(new File("information"));
			while (file.hasNext())
				{
					String firstName = file.next();
					String lastName = file.next();
					
					Classes[] courses = new Classes[3];
					
					String period1 = file.next();
					String period1Grade = file.next();
					courses[0] = new Classes(1, period1, period1Grade);
					
					
					String period2 = file.next();
					String period2Grade = file.next();
					courses[1] = new Classes(2, period2, period2Grade);
					
					String period3 = file.next();
					String period3Grade = file.next();
					courses[2] = new Classes(3, period3, period3Grade);

					double gpa = period1Grade.equals("A")? 4.0 : period1Grade.equals("A-")? 3.7 : period1Grade.equals("B+")? 3.3 : period1Grade.equals("B")? 3 : period1Grade.equals("B-")? 2.7 : period1Grade.equals("C+")? 2.3 : period1Grade.equals("C")? 2 : period1Grade.equals("C-")? 1.7 : period1Grade.equals("D+")? 1.3 : period1Grade.equals("D")?  1.0 : period1Grade.equals("D-")? 0.7 : 0;
					gpa += period2Grade.equals("A")? 4.0 : period2Grade.equals("A-")? 3.7 : period2Grade.equals("B+")? 3.3 : period2Grade.equals("B")? 3 : period2Grade.equals("B-")? 2.7 : period2Grade.equals("C+")? 2.3 : period2Grade.equals("C")? 2 : period2Grade.equals("C-")? 1.7 : period2Grade.equals("D+")? 1.3 : period2Grade.equals("D")?  1.0 : period2Grade.equals("D-")? 0.7 : 0;
					gpa += period3Grade.equals("A")? 4.0 : period3Grade.equals("A-")? 3.7 : period3Grade.equals("B+")? 3.3 : period3Grade.equals("B")? 3 : period3Grade.equals("B-")? 2.7 : period3Grade.equals("C+")? 2.3 : period3Grade.equals("C")? 2 : period3Grade.equals("C-")? 1.7 : period3Grade.equals("D+")? 1.3 : period3Grade.equals("D")?  1.0 : period3Grade.equals("D-")? 0.7 : 0;
					
					gpa /= 3;
					
					roster.add(new Student(firstName, lastName, gpa, courses));
					
//					Format decimal = new DecimalFormat("0.00");
//					System.out.println(decimal.format(gpa));
				}
		}
		
		public static void mainMenu() throws IOException // Asks the user what he/she wants to do
		{
			fillStudentRoster();
			boolean shouldContinue;
			do
				{
					System.out.println("What Would You Like To Do?");
					System.out.println("     1) Add or Delete a Student"
					+ "\n     2) Change Student Grades/Schedule"
					+ "\n     3) Sort Students");
					Scanner userInput = new Scanner(System.in);
					int answer = userInput.nextInt();
					switch (answer)
					{
						case 1:
								{
									boolean tryAgain = false;
									do
										{
										System.out.println("Would You Like To Add Or Delete A Student?"
											+ "\n     1) Add Student"
											+ "\n     2) Delete Student");
											userInput = new Scanner(System.in);
											answer = userInput.nextInt();
//											if (answer == 1)
//												//AddStudent.main(args);
//											else if (answer == 2)
//												//DeleteStudent.main(args);
//											else
//												tryAgain = true;
										} while (tryAgain);
									
									break;
								}
						case 2:
								{
									// Change Student Grades Or Schedule Class
									break;
								}
						case 3:
								{
									// Sort Method In the Sort Class
									break;
								}
						default:
								{
									System.out.println("Try Something Else \n");
									break;
								}
					}
					System.out.println("Would You Like To Do Something Else?"
							+ "\n     1) Yes"
							+ "\n     2) No");
					userInput = new Scanner(System.in);
					answer = userInput.nextInt();
					
					shouldContinue = answer == 1? true: false;
				} while (shouldContinue);
		}
	}

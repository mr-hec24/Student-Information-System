import java.io.*;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class AddStudent
	{

		public static void runner()
			{
				Scanner userInput = new Scanner(System.in);
				Classes[] courses = new Classes[3];
				
				System.out.println("First Name");
				String firstName = userInput.next();
				System.out.println("Last Name");
				String lastName = userInput.next();
				
				System.out.println("First Class");
				String period1 = userInput.next();
				System.out.println("Grade");
				String period1Grade = userInput.next();
				
				System.out.println("Second Class");
				String period2 = userInput.next();
				System.out.println("Grade");
				String period2Grade = userInput.next();
				
				System.out.println("Third Class");
				String period3 = userInput.next();
				System.out.println("Grade");
				String period3Grade = userInput.next();
				
				courses[0] = new Classes(1, period1, period1Grade);
				courses[1] = new Classes(2, period2, period2Grade);
				courses[2] = new Classes(3, period3, period3Grade);
				
				double gpa = period1Grade.equals("A")? 4.0 : period1Grade.equals("A-")? 3.7 : period1Grade.equals("B+")? 3.3 : period1Grade.equals("B")? 3 : period1Grade.equals("B-")? 2.7 : period1Grade.equals("C+")? 2.3 : period1Grade.equals("C")? 2 : period1Grade.equals("C-")? 1.7 : period1Grade.equals("D+")? 1.3 : period1Grade.equals("D")?  1.0 : period1Grade.equals("D-")? 0.7 : 0;
				gpa += period2Grade.equals("A")? 4.0 : period2Grade.equals("A-")? 3.7 : period2Grade.equals("B+")? 3.3 : period2Grade.equals("B")? 3 : period2Grade.equals("B-")? 2.7 : period2Grade.equals("C+")? 2.3 : period2Grade.equals("C")? 2 : period2Grade.equals("C-")? 1.7 : period2Grade.equals("D+")? 1.3 : period2Grade.equals("D")?  1.0 : period2Grade.equals("D-")? 0.7 : 0;
				gpa += period3Grade.equals("A")? 4.0 : period3Grade.equals("A-")? 3.7 : period3Grade.equals("B+")? 3.3 : period3Grade.equals("B")? 3 : period3Grade.equals("B-")? 2.7 : period3Grade.equals("C+")? 2.3 : period3Grade.equals("C")? 2 : period3Grade.equals("C-")? 1.7 : period3Grade.equals("D+")? 1.3 : period3Grade.equals("D")?  1.0 : period3Grade.equals("D-")? 0.7 : 0;
				
					
				gpa /= 3;
				Format decimal = new DecimalFormat("0.00");
				String tempGPA = decimal.format(gpa);
				gpa = Double.valueOf(tempGPA);
				
				System.out.println("Added " + firstName);
				MainMenu.roster.add(new Student(firstName, lastName, gpa, courses));
			}
	}

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
			fillStudentRoster();
		}
		
		public static void fillStudentRoster() throws IOException
		{
			Scanner file = new Scanner(new File("information"));
			int i = 0;
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
					
					double gpa = period1Grade.substring(0, 1).equals("A")? 4: period1Grade.substring(0,1).equals("B")? 3: period1Grade.substring(0,1).equals("C")? 2: period1Grade.substring(0,1).equals("D")? 1:0;
					gpa += period2Grade.substring(0, 1).equals("A")? 4: period2Grade.substring(0,1).equals("B")? 3: period2Grade.substring(0,1).equals("C")? 2: period2Grade.substring(0,1).equals("D")? 1:0;
					gpa += period3Grade.substring(0, 1).equals("A")? 4: period3Grade.substring(0,1).equals("B")? 3: period3Grade.substring(0,1).equals("C")? 2: period3Grade.substring(0,1).equals("D")? 1:0;
					
					gpa /= 3;
					
					roster.add(new Student(firstName, lastName, gpa, courses));
					
					Format format = new DecimalFormat("0.00");
					System.out.println(roster.get(i).getFirstName() + " " + roster.get(i).getLastName() + " " + roster.get(i).getGpa());
					System.out.println(roster.get(i).getCourses()[0].getClassName() + " " + format.format(roster.get(i).getCourses()[0].getGrade()));
					System.out.println(roster.get(i).getCourses()[1].getClassName() + " " + roster.get(i).getCourses()[1].getGrade());
					System.out.println(roster.get(i).getCourses()[2].getClassName() + " " + roster.get(i).getCourses()[2].getGrade());
					i++;
				}
		}
	}

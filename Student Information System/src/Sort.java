import java.util.Scanner;
import java.util.ArrayList;

public class Sort
	{
		public static void mainMMethod()
		{
			ArrayList<Student> roster = MainMenu.roster;
			
			System.out.println("Would you like to sort the students by their Last Name, GPA, or by Class Period?");
			System.out.println("     1) Sort by Last Name." + "\n     2) Sort by GPA." + "\n     3) Sort by class period." + "\n     4) Sort by First Name.");
			Scanner userInput = new Scanner(System.in);
			int input = userInput.nextInt();
			
			if (input == 1)
				{
					for (int i = 0; i < roster.size(); i ++)
						{
							System.out.println(Student.getLastName());
						}
				}
			if (input == 2)
				{
					for (int i = 0; i < roster.size(); i ++)
						{
							System.out.println(Student.getGpa());
						}
				}
			if (input == 3)
				{
					for (int i = 0; i < roster.size(); i ++)
						{
							System.out.println();
						}
				}
			if (input == 4)
				{
					for (int i = 0; i < roster.size(); i ++)
						{
							System.out.println(Student.getFirstName());
						}
				}
				
		}
		
	}
// 1) Last Name
// 2) GPA
// 3) Period
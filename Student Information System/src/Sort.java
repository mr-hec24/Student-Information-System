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
							System.out.println(roster.get(i).getLastName());
						}
				}
			if (input == 2)
				{
					for (int j = 0; j < roster.size(); j ++)
						{
							System.out.println(roster.get(j).getGpa());
						}
				}
			if (input == 3)
				{
					System.out.println("Which period would you like to sort by? 1,2 or 3?");
					Scanner userPeriod = new Scanner(System.in);
					int period = userInput.nextInt();
				
//					for (int k = 0; k < roster.size(); k ++)
//						{
//							System.out.println(roster.get(k).);
//						}
				}
			if (input == 4)
				{
					for (int l = 0; l < roster.size(); l ++)
						{
							System.out.println(roster.get(l).getFirstName());
						}
				}
				
		}
	}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort
	{
		public static void mainMethod()
		{
			ArrayList<Student> roster = MainMenu.roster;
			
			System.out.println("Would you like to sort the students by their Last Name, GPA, or by Class Period?");
			System.out.println("     1) Sort by Last Name." + "\n     2) Sort by GPA." + "\n     3) Sort by class period." + "\n     4) Sort by First Name.");
			Scanner userInput = new Scanner(System.in);
			int input = userInput.nextInt();
			
			Comparator <Student> myComparator = null;
			
			if (input == 1)
				{
					myComparator = new Comparator <Student>()
							{
								public int compare(Student s1, Student s2)
								{
									String student1 = s1.getLastName();
									String student2 = s2.getLastName();
									//System.out.println("Comparing " + student1 + " to " + student2);
									return student1.compareTo(student2);
								}
							};
				}
			if (input == 2)
				{
				
				myComparator = new Comparator <Student>()
				{
					public int compare(Student s1, Student s2)
					{
						return s1.getGpa().compareTo(s2.getGpa());
					}
				};
				}
			
			if (input == 3)
			{
				System.out.println("Which period would you like to sort?");
				Scanner userEntry = new Scanner(System.in);
				final int userPeriod = userEntry.nextInt();
				
				
				
				myComparator = new Comparator <Student>()
				{
					public int compare(Student s1, Student s2)
					{
						String className1 = s1.getCourses()[userPeriod-1].getClassName();
						String className2 = s2.getCourses()[userPeriod-1].getClassName();
						return className1.compareTo(className2);
					}
				}; //hdajk
			}
			
			if (input == 4)
				{
					myComparator = new Comparator <Student>()
						{
							public int compare(Student s1, Student s2)
								{
									return s1.getFirstName().compareTo(s2.getFirstName());
								}
						};
				}
			
			Collections.sort(roster, myComparator);
			for (int x = 0; x < roster.size(); x++)
			{
				System.out.println(roster.get(x));
				
			}
			System.out.println(" ");
		}
	}

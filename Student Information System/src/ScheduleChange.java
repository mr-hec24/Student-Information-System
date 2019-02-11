
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScheduleChange
	{
		
		public static void changeSchedule()
			{
			System.out.println("Which Student would you like to select?");
			System.out.println("Here is the student list:");
			PrintStudents.runner();
			Scanner studentSelect = new Scanner(System.in);
			int selectingStud = studentSelect.nextInt();
			
			System.out.println("You chose " + MainMenu.roster.get(selectingStud-1).getFirstName()+".");
			System.out.println("Which period would you like to change?");
			Scanner classes = new Scanner(System.in);
			int period = classes.nextInt();
			
			System.out.println("What is the name of this class?");
			Scanner className = new Scanner(System.in);
			String grades = className.nextLine();
			System.out.println("And what would the grade for that class be?");
			String neoGrade = className.nextLine();
			
//			if(period == 1)
//			   {
//				    
//				    MainMenu.roster.get(selectingStud-1).period1Grade(grades);
//				    MainMenu.roster.get(selectingStud-1).period1Grade(neoGrade);
//			   }
//			else if(period == 2)
//				{
//					MainMenu.roster.get(selectingStud-1).period1(grades);
//					MainMenu.roster.get(selectingStud-1).period1Grade(neoGrade);
//				}
//			else if(period == 3)
//				{
//					MainMenu.roster.get(selectingStud-1).period3Grade(grades);
//					MainMenu.roster.get(selectingStud-1).period1Grade(neoGrade);
//				}
			
			System.out.println("You just changed " +  MainMenu.roster.get(selectingStud-1).getFirstName() +  "'s "+ "period " + period + " grade.");
			PrintStudents.runner();
			}
	}
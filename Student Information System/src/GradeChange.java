import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeChange
	{

		
		public static void changeGrade()
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
			System.out.println("What do you want the new grade to be?");
			Scanner letterGrade = new Scanner(System.in);
			String grades = letterGrade.nextLine();
//			
//			if(period == 1)
//			   {
//				    
//				    MainMenu.roster.get(selectingStud-1).period1Grade(grades);
//			   }
//			else if(period == 2)
//				{
//				 	MainMenu.roster.get(selectingStud-1).period1(grades);
//				}
//			else if(period == 3)
//				{
//					MainMenu.roster.get(selectingStud-1).period3Grade(grades);
//				}
		
			System.out.println("You just changed " +  MainMenu.roster.get(selectingStud-1).getFirstName() +  "'s "+ "period " + period + " grade.");
			PrintStudents.runner();
			}
	
	}
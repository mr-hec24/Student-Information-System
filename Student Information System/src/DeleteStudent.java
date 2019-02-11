import java.util.Scanner;

public class DeleteStudent
	{

		public static void runner()
			{
				Scanner userInput = new Scanner(System.in);
				PrintStudents.runner();
				System.out.println("What student would you like to delete?");
				System.out.println("Type their full name");
				String fullName = userInput.nextLine();
				boolean deleted = false;
				for (int i = 0; i < MainMenu.roster.size(); i++){
					String tempName = MainMenu.roster.get(i).getFirstName() + " " + MainMenu.roster.get(i).getLastName();
					if (tempName.equals(fullName)){
						MainMenu.roster.remove(i);
						System.out.println("Removed " + tempName);
						deleted = true;
					}
				}
				if (deleted == false){
					System.out.println("No student of that name can be found");
					System.out.println("Try Again?");
					System.out.println("     1) Yes");
					System.out.println("     2) No");
					int tryAgain = userInput.nextInt();
					
					if(tryAgain == 1){
						DeleteStudent.runner();
					}
				}
			}

	}

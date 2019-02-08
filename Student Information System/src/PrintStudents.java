
public class PrintStudents
	{
		public static void runner(){
			for (Student s: MainMenu.roster){
				System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getGpa());
			}
		}
	}

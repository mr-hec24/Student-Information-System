
public class PrintStudents
	{
		public static void runner(){
			for (Student s: MainMenu.roster){
				System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getCourses()[0].getClassName() + " " + s.getCourses()[0].getGrade() + " " + s.getCourses()[1].getClassName() + " " + s.getCourses()[1].getGrade() + " " + s.getCourses()[2].getClassName() + " " + s.getCourses()[2].getGrade() + " " + s.getGpa());
			}
		}
	}

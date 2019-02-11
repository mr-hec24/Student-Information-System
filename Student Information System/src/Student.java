import java.util.Arrays;

public class Student
	{
		private String firstName;
		private String lastName;
		private double gpa;
		private Classes[] courses = new Classes[3];
		private String grade;
		
		public Student(String f, String l, double g, Classes[] c)
		{
			firstName = f;
			lastName = l;
			gpa = g;
			courses = c;
			
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public Double getGpa()
			{
				return gpa;
			}

		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}

		public Classes[] getCourses()
			{
				return courses;
			}

		public void setCourses(Classes[] courses)
			{
				this.courses = courses;
			}
		public String toString()
		{
			String courseString = "";
			
			for (int i = 0; i < courses.length; i++)
			{
				courseString += courses[i] + " ";
			}
			return firstName + " " + lastName + " " + courseString + gpa;
		}
		
		
	}


public class Classes
	{
		private int period;
		private String className;
		private String grade;
		
		public Classes(int p, String n, String g)
		{
			period = p;
			className = n;
			grade = g;
		}

		public int getPeriod()
			{
				return period;
			}

		public void setPeriod(int period)
			{
				this.period = period;
			}

		public String getClassName()
			{
				return className;
			}

		public void setClassName(String className)
			{
				this.className = className;
			}

		public String getGrade()
			{
				return grade;
			}

		public void setGrade(String grade)
			{
				this.grade = grade;
			}
		
		
	}


public class Person {
	
		private String Name;
		private int birthdayYear;
		public Person()
		{
			
		}
		public Person(String givenName, int yearOfBirth)
		{
			this.Name = givenName;
			this.birthdayYear = yearOfBirth;
		}
		
		public String getName() {
			return this.Name;
			
		}
		public void changeName(String name) 
		{
			this.Name=name;
			
		}

		public int getAgeInYears(int CurrentYear) {
			return CurrentYear-birthdayYear ;

		}
		public static void main(String[] args) 
		{	
			Person person1 = new Person("Shammi",2001);
			person1.changeName("Shammi Kabir");
			System.out.println("Name is : " + person1.getName());
			System.out.println("Age is  : " + person1.getAgeInYears(2020));
			
		}

	}




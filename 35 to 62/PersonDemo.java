//Q37

class Person{
		private int age ;
		private String name;
		Person ()
		{
			age = 18;
			name = "priya";
		}
		Person( int age , String name)
		{
			this.age = age;
			this.name = name;
		}
		void display()
		{
			System.out.println("age is " +age);
			System.out.println("name is " +name);
		}
}

class PersonDemo{
		public static void main(String args[]){
			Person p = new Person();
			Person p1 = new Person(28,"neha");
			p.display();
			p1.display();
		}
}
			


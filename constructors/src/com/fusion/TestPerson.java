package com.fusion;

public class TestPerson {
	


		public static void main(String[] args) {
			
			Person defaultPerson=new Person();
			Person parameterizedPerson=new Person("Alice",30);
			
			defaultPerson.displayPerson();
			parameterizedPerson.displayPerson();

}
}

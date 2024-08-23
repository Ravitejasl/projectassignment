package constructors;

public class Student {
	String name;
	int age;
	public Student() {
		
		System.out.println("Call Student");
	
		
	}
	

	
	public Student(String studentName,int studentAge) {
		this.name= studentName;
		age= studentAge;
	}
	public Student(Student obj) {
		name=obj.name;
		age=obj.age;
	}

}

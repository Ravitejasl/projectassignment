package variablr;

public class Student {
private	String name;
private	   int age ;
	   //constructor
	 public Student(String name,int age){
		 this.name= name;
		 this.age= age;
	 }   
	 //method name
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


     //method age
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[]args) {
		Student student1=new Student("Ravi",22);
		Student student2=new Student("GR",21);
		
		System.out.println("Student1:Name ="+student1.getName());
		System.out.println("Student1:Name="+student1.getAge());
		
		System.out.println("Student2:Name="+ student2.getName());
		System.out.println("Student2:Nmae"+ student2.getAge());
		
	}
	   }



package constructors;

public class Maindriver {
	public static void main(String[]args) {
		Person pr=new Person();
		pr.name="John";
		pr.age=33;
		
		System.out.println(pr.getName()+" "+pr.getAge());
	}

}

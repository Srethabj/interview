package staticvariables;

public class Student1 { int rollno;
String name;
static String college="ITS";
static void change() {college="BBDIT";}
Student1(int r,String n) {
	rollno =r;
	name =n;
}
void display() {System.out.println(rollno+" "+name+" "+college);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1.change();
Student1 s1=new Student1(111,"Karan");
Student1 s2=new Student1(222,"Aryan");
Student1 s3=new Student1(333,"Sonoo");
s1.display();
s2.display();
s3.display();
	}

}

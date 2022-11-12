public class Student{
	int rollno;
	String name;
	Student(int r,String n){
	rollno=r;
	name=n;
	}
	void display(){
	System.out.println(rollno+" "+name);
	}
public static void main(String[] args){
		Student s=new Student(111,"A");
		s.display();
		Student s1=new Student(112,"B");
		s1.display();
		Student s2=new Student(113,"C");
		s2.display();
		Student s3=new Student(114,"D");
		s3.display();
		Student s4=new Student(115,"E");
		s4.display();
		}
}
		
		
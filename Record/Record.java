record Person(String Name,String gender,int Age,long PhoneNumber){
		Person(){
			this("null","null",0,0);
		}
	}
record Employee(String Name,double Salary,int id,long PhoneNumber){
		Employee(){
			this("nul",0,0,0);
		}
	}
record Student(String Name,int id,long PhoneNumber){
		Student(){
			this("nul",0,0);
		}
	}
record Animal(String t,String l,String c){
		Animal(){
			this("nul","null","null");
		}
	}
record Vehicle(String Name,String color,int Number,double Amount){
		Vehicle(){
			this("nul","null",0,0);
		}
	}
public class Record{
public static void main(String[] args){
		
		Person myPerson = new Person("Indhu","Female",20,678365);
		System.out.println(myPerson);
		
		Employee myEmployee = new Employee("Maha",10000,4321,6783455);
		System.out.println(myEmployee);
		
		Student myStudent = new Student("Anu",1234,6783653);
		System.out.println(myStudent);
		
		Animal myAnimal = new Animal("Tiger","Lion","Camal");
		System.out.println(myAnimal);
		
		Vehicle myVehicle = new Vehicle("Bullet","Black",2106,200000);
		System.out.println(myVehicle);
	}
}
		
		
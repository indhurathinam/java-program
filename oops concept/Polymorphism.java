class Animal{
	void animalsound(){
	System.out.println("Animal main sound");
	}
}
class cat extends Animal{
	void animalsound(){
	System.out.println("Cat sound is mewo mewo");
	}
}
class dog extends Animal{
	void animalsound(){
	System.out.println("Dog sound is bark");
	}
}
class Polymorphism{
public static void main(String[] args){
	Animal obj = new Animal();
	Animal mycat = new cat();
	Animal mydog = new dog();
	mydog.animalsound();
	}
}
	
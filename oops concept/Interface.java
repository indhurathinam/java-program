interface Veichal{
	public void method_1();
	public void method_2();
}
class bike implements Veichal{
	public void method_1(){
	System.out.println("this is the first method of interface class");
	}
	public void method_2(){
	System.out.println("this is the second method of interface class");
	}
}
class Interface{ //main method
	public static void main(String[] args){
	bike mybike = new bike();
	mybike.method_1();
	mybike.method_2();
	}
}
	
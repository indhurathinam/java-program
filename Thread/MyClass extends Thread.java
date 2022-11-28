public class MyClass extends Thread {
public void run(){
		System.out.println("Thread class is running");
		}
	public static void main(String args[]){
		MyClass m=new MyClass();
		m.start();
	}
}
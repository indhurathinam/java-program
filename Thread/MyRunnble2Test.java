class MyRunnble2Test {
public static void main(String arg[]) {// main thread
		Runnable r=()->{
		for(int i=0; i<10; i++) {
		System.out.println("Thread-child");
		}};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10; i++) {
		System.out.println("Main Thread");
		}
	}
}
package demo;

class Students  {
	void mark(int tamil,int eng) {
		System.out.println("the tamil mark is : " + tamil);
		System.out.println("the english mark is : " + eng);
		System.out.println();
	}
	void mark(int tamil,int eng,int maths) {
		System.out.println("the tamil mark is : " + tamil);
		System.out.println("the english mark is : " + eng);
		System.out.println("the maths mark is : " + maths);
		System.out.println();

	}
	void mark(int tamil,int eng,int maths,int sci) {
		System.out.println("the tamil mark is : " + tamil);
		System.out.println("the english mark is : " + eng);
		System.out.println("the maths mark is : " + maths);
		System.out.println("the science mark is : " + sci);
		System.out.println();

	}
	
}



public class MethodOverloaddingDemo {

	public static void main(String[] args) {
		Students stuObj = new Students();
		stuObj.mark(87,98);
		stuObj.mark(90,88,65);
		stuObj.mark(34,98,67,45);

	}

}
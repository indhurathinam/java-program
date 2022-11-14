class A{
	int a;
	public void method_1(int a){
	this.a=a;
	System.out.println("this is the first method_1");
	}
}
class B extends A{
	public void method_2(){
	System.out.println("this is the method_2");
	}
}
class C extends A{
	public void method_3(){
		System.out.println("this is the method_3");
	}
}
class Inheritance{
public static void main(String[] args){
	B obj = new B();
	C obj2 = new C();
	obj.method_1(2);
	obj2.method_3();
	System.out.println(obj.a);
	}
}

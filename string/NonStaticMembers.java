public class NonStaticMembers{
	int x=75;
	void m(){
	System.out.println("Non-static M method");
	}
	{
	System.out.println("Non-static block");
	}
NonStaticMembers()
	{
	System.out.println("constructor");
	}
public static void main(String[] args){
		System.out.println("Main");
		NonStaticMembers obj=new NonStaticMembers();
		obj.m();
		System.out.println(obj.x);
		}
}
	
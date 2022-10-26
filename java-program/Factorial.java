class Factorial
{
static int Factorial(int n)
{
int res=1,i;
for(i=2; i<=n; i++)
res *= i;
return res;
}
public static void main(String[] rags)
{
int num = 6;
System.out.println("Factorial of" + num +"is" + Factorial(num));
}
}
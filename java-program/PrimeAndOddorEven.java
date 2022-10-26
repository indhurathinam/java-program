class PrimeAndOddorEven
{
static void prime(int n)
{
for (int i=1; i,=n; i++)
{
if(n % i==0)
count++;
}
if (count ==2)
System.out.println("It is a prime number");
else
System.out.println("It is not a prime number");
}
static void oddoreven(int n)
{
if (n % 2 == 0)
System.out.println("It is a Even number");
else
System.out.println("It is odd number");
}
public static void main(String[] rags)
{
Scanner input = new Scanner(System.in);
System.out.println("\t |1.Find the prime number |");
System.out.println("\t |2.Find the Odd or Even number |");
System.out.println("enter the above list nuber you want to find:");
int num = input.nextInt();
}
if (num == 1)
{
System.out.println("\t you choosing prime number");
System.out.println("Enter the number:");
int n = input.nextInt();
prime(n);
}
else if (num == 2)
{
System.out.println("\t choosing Odd or Even number");
System.out.println("enter the number:");
int n = input.nextIn();
oddoreven(n);
}
else
System.out.println("please enter the correct number");
}
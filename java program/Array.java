import java.util.*;
public class Array{
public static void main (String[] args)
{
Scanner input=new Scanner(System.in);
int r=input.nextInt();
System.out.println("Enter the Coloumns:");
int c=input.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
System.out.println("Enter elements of matrixl:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++)
{
a[i][j]=input.nextInt();
}
}			
System.out.println(Original matrix:");
for(int i=0;i,r;i++)
{
System.out.println(" "+a[i][j]);
}
System.out.println();
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[j][i]=a[i][j];
}
}
System.out.println("Reverse matrix:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
System.out.println(" "+b[i][j]);
}
System.out.println();
}
}
}
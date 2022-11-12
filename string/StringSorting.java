import java.util.Arrays;
public class StringSorting{
public static void main(String[] args){
	String[] sa={"Mango","Apple","Orange","Graphs","Banana"};
	for(String i:sa)
	System.out.println(i+" ");
	System.out.println();
	System.out.println("After Sorting");
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));
	}
}
	
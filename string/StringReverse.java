public class StringReverse{
public static void main(String[] args){
	String s="My name is Indhu";
	String[] strArray=s.split(" ");
	for(int i=strArray.length-1; i>=0; i--)
	System.out.println(strArray[i]+" ");
	}
}
import java.io.*;
class Depersist{
public static void main(String args[]){
	try{ //Creating stream to read the object
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
	Student s=(Student)in.readObject();
	System.out.println(s.id+" "+s.name); //printing the data of the serialized object
	in.close(); //closing the stream
	}catch(Exception e){
	System.out.println(e);
	}
	}
}
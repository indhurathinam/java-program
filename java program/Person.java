class Person{
	public static void main(String args[]){
		person p=new person("A",163.5,75,"non-veg");
		person p1=new person("B",153,85,"veg");
		person p2=new person("C",147.5,60,"both");
		person p3=new person("D",160.,65,"non-veg");
		System.out.println(p);
		p=sleep();
		System.out.println(p3);
		p3=eat();
	}
}
		
		
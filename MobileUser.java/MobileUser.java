interface Sim{
	String dialCall(long mobile_no);
	String sendSms(long moble_No,String message);
}
class Airtel implements Sim{
	public String dialCall(long mobile_No){
	return "Airtel No busy please try again";
	}
	public String sendSms(long mobile_No, String message){
	return "Airtel message send by"+mobile_No;
	}
}
class Vi implements Sim{
	public String dialCall(long mobile_No){
	return "Vi No busy please try again";
	}
	public String sendSms(long mobile_No, String message){
	return "Vi message send by"+mobile_No;
	}
}
class Mobile{
	public Sim s;
	public void insertSim(Sim s){
	this.s=s;
	}
	public String dialCall(long mobile_No){
	return s.dialCall(mobile_No);
	}
	public String sendSms(long mobile_No, String message){
	return s.sendSms(mobile_No,message);
	}
}
public class MobileUser{
	public static void main(String[] args){
		Mobile iphone=new Mobile();
		iphone.insertSim(new Vi());
		String res = iphone.sendSms(80129933,"Hello everyone");
		System.out.println(res);
		}
}
	
	
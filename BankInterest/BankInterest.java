class Bank{
	int getInterest(){
	return 0;
	}
}
class SBI extends Bank{
	int getInterest(){
	return 8;
	}
}
class HDFC extends Bank{
	int getInterest(){
	return 11;
	}
}
class ICICI extends Bank{
	int getInterest(){
	return 7;
	}
}
class AXIS extends Bank{
	int getInterest(){
	return 9;
	}
}
class BankInterest{
	public static void main(String[] args){
		SBI s = new SBI();
			System.out.println("SBI rate of Interset:" +s.getInterest());
		AXIS a = new AXIS();
			System.out.println("AXIS rate of Interest:" +a.getInterest());
		ICICI i = new ICICI();
			System.out.println("ICICI rate of Interst:" +i.getInterest());
		HDFC h = new HDFC();
			System.out.println("HDFC rate of InterestL:" +h.getInterest());
	}
}
package com.mycompany.device;
public class DeviceDemo
{
	public static void main(String [] arg)
	{
		Tablet myTablet = new Tablet(30,"ipad",400.0);
		Phone myPhone = new Phone(40,"Nokia", 150.0);
		SmartPhone mySPhone = new SmartPhone(50,35,"iphone",500.0);
		
		moreData(myTablet);
		moreData(mySPhone);
		moreVoice(myPhone);
		moreVoice(mySPhone);
		printBill(myTablet);
		printBill(myPhone);
		printBill(mySPhone);
		
	}
	
	public static void printBill(Device d)
	{
		System.out.println(d.getBill());
	}
	
	public static void moreData(WithDataPlan d)
	{
		d.addData(20);
	}
	
	public static void moreVoice(WithVoicePlan d)
	{
		d.addVoice(100);
	}
}
package com.datatypes;

public class Demo {
	
		int  cid = 10;
		String city = "Mumbai";  // instance variables
		
		static double fee = 9000.0;
		

	public static void main(String[] args) {
	

		int  sid = 101;   // local variables
	
		String sname = new  String("raju");
		
		System.out.println(sid);
		System.out.println(sname);
		
	   Demo d =	new  Demo();
	   
	   		d.getData();
	   
	   		System.out.println(d.city);
		
		
	}
	
	public void   getData() {
			boolean isValid = true;
		
			Demo d = new Demo();
			
		System.out.println("cid "+d.cid);
		System.out.println("city "+d.city);
		
		System.out.println("static with ref "+d.fee);
		
		System.out.println("static with classname "+Demo.fee);
		
		
	}
	
	

	

}

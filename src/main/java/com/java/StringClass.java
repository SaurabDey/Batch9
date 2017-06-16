package com.java;

public class StringClass {

	public static void main(String[] args) 
	{
		String s= new String("Vijay"); //2 object
		s=s.concat("Saurab");//"VijaySaurab"
		
		String ss= "Vijay";
		ss=ss.concat("Saurab");//"VijaySaurab"
		
		System.out.println(s +" " + ss);
		
		
		//--------------
		
		String s1= new String("Vijay");//Immutable  //2 
		s1.concat("Saurab");
		
		StringBuffer sb= new StringBuffer("Vijay"); //
		sb.append("Saurab");
		
		System.out.println(s1 +" " + sb);
		
		//--------------
		String sss= "Vijay";
		String sss1= "Vijay";
		
		System.out.println(sss==sss1);
		System.out.println(sss.equals(sss1));
		
		String ss1= new String("Vijay");
		String ss2= new String("Vijay");
		
		System.out.println(ss1==ss2);
		System.out.println(ss1.equals(ss2));//true
		
		StringBuffer ssb1= new StringBuffer("Vijay");
		StringBuffer ssb2= new StringBuffer("Vijay");
		

		System.out.println(ssb1==ssb2);
		System.out.println(ssb1.equals(ssb2));
		
		//---------
		
		String myString= new String("Vijay"); // Vijay            Vijay
		myString.concat("Ankit");             // VijayAnkit      Ankit
		
		
		String second=myString.concat("Gaurav");//VijayGaurav        Gaurav
		myString=second.concat("Saurab");//VijayGauravSaurab Saurab
		
		myString=myString.concat("Dey"); //VijayGauravSaurabDey   Dey
		
		System.out.println("--->"+second);
		System.out.println("+++>"+myString);
		
		
		
	}

}

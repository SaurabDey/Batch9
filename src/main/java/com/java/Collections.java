package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) 
	{
				int number1= 100;
				int number2= 200;
				int number3= 300;
				int number4= 400;
				
				//-------------Array----------------------------
				int[] num= new int [5];//Array
				num[0]=100;
				num[1]=100;
				num[3]=300;
				
				try {
					System.out.println(num[8]);
				} catch (Exception e) {
					System.out.println("We donot have the value");
				}
				
				System.out.println(num[3]);
				System.out.println("Length of Array "+num.length);
				
				//-----------List----------------------------
				
				//ArrayList<Integer> numberlist= new ArrayList<Integer>();
				//[0][1][2][3][4][5]
				
				
				//List<Integer> numberlist= new LinkedList<Integer>();
				//[0]<->[1]<->[2]<->[4]<->[5]
				
				//Set<Integer>numberlist = new HashSet<Integer>();
				//Set<Integer>numberlist = new TreeSet<Integer>();
				Set<Integer>numberlist = new LinkedHashSet<Integer>();
				numberlist.add(100);
				numberlist.add(100);
				numberlist.add(200);
				numberlist.add(200);
				numberlist.add(300);
				numberlist.add(10000);
				numberlist.add(500);
				
				System.out.println(numberlist);
				
				                      //100, 200, 300, 10000, 500
				for (Integer numset : numberlist) {
					
					System.out.println("The values of numset are "+numset);
				}
							
				System.out.println("Specific number ");
				
				System.out.println("Length of Collections "+numberlist.size());
				
				numberlist.remove(3);

				System.out.println(numberlist);
				
				
				Map<String, Integer> mymap = new LinkedHashMap<String, Integer>();
				mymap.put("Gaurav",2 );
				mymap.put("Vijay",2 );
				mymap.put("Ankit", 2 );
				mymap.put("Saurab",2 );
				
				
				
				System.out.println(mymap);
				
				mymap.put("Ankit", 89 );
				
				System.out.println(mymap);
				
				System.out.println("The roll number for "+mymap.get("Ankit"));
				                     //"Gaurav,"Vijay",.... 
				for (String mykey : mymap.keySet()) {
					
					Integer rollnumber=mymap.get(mykey);
					System.out.println("test "+rollnumber);
				}
				
				
				
	}

}

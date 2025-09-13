package com.tnisf.daysix.staticblockmethod;

public class MyClass {
	
	private int section;  
	
	private static int srNo;
	
 
	static {
		System.out.println("-----Within static block-----");
		srNo=1000;
		
	}
	
	MyClass()
	{
		System.out.println("------Within Default constructor-----");
		srNo++; //
		section++;
		
	}

	
	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	
	static void display()
	{
		
		System.out.println("Searial No :"+ srNo);
	}

}

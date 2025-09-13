package com.tnisf.daysix.usingfinal;

public class Finalvariables {
	
	final int x=100;
	
	
	final static int y;
	
	final static int z=10;
	
	
	
	void change () {
		//x=30;
		//z=100;
		//y=23;
		
	}


	@Override
	public String toString() {
		return "Finalvariables [x=" + x + ", y=" + y +"]";
	
	}
	
	 
	static 
	{
		//z=89;
		y=20;
	
		System.out.println("value of Y : "+ y);
	}

}

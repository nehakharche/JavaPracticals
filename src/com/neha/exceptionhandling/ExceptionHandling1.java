package com.neha.exceptionhandling;

public class ExceptionHandling1 {
	int i=10;
	static String name;
	
	public static void m()
	{
		System.out.println("In static method");
	}
   public ExceptionHandling1() {
	   this.name="Neha";
	   System.out.println("Welcome to "+ name +" pc ");
	   System.out.println("Inside Contructor");
}
	public static void main(String[] args) {
		System.out.println("Inside a main");
		// TODO Auto-generated method stub
		
		ExceptionHandling1 ex=new ExceptionHandling1();
		
		ex.m1();
		
		ExceptionHandling1.m5();
		ExceptionHandling1.m();
		ex.m6();

	}
	public void m1()
	{
		System.out.println("Inside m1");
		m2();
//		try{
//			m2();	
//		}catch(Exception e)
//		{
//			System.out.println("Exception is"+e);
//			e.printStackTrace();
//		}
		
		System.out.println("M1 executed successfuly");
	}
	public void m2()
	{
		System.out.println("Inside m2");
		//m3();
		try{
			m3();	
		}catch(Exception e)
		{
			System.out.println("Exception is"+e);
			e.printStackTrace();
		}
		
		System.out.println("M2 executed successfuly");
		//System.out.println("M2 executed successfuly");
	}
	public void m3() throws Exception
	{
		System.out.println("Inside m3");
		int res=i/0;
		System.out.println("M3 executed successfuly");
	}
    public static void m5()
    {
    	System.out.println("Inside m5");
		System.out.println("M5 executed successfuly");
    }
    public int m6()
    {
    	int i1=0;
    	System.out.println("inside m6");
		//return i;
		try{
			i1=1;
			return i1;
		}catch(Exception e)
		{
			i1=2;
			//return i;
		}finally
		{
			i1=3;
			//System.out.println("M6 Executed i="+i);
		}
		return i1;
    
    }
    
}

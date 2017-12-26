package com.neha.stringdemo;

public class stringdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name=new String("Neha");//goes on heap and SCP because we create object with new keyword
   String surname=new String("kharche");
   String city="Malkapur"; // goes on SCP
   String dist="Buldhana";
   
   name.concat(surname);//obj not have reference so its goes to garbage colletion
   String s= city.concat(dist);
   String s2=name.concat(surname);
   System.out.println("s2 "+s2);
   
   String s1=name.concat("kharche"); //Nehakharche stores on heap and kharche stores on heap
   System.out.println("s1 "+s1);
   
   boolean t;
   t=s1.equals(s2);
   System.out.println("T "+t);
   
	}

}

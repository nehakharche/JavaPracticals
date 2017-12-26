package JdbcDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serilizationdemo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s1="ser_demo";
	static String ss="str_static";
	final String fs="final"; //not serilized
	static final String sfs="static_fin_str";
	
	
	//transient 
	
	transient String ts1="ser_demo";
	transient static String tss="str_static";
	transient final String tfs="final"; //not serilized
	transient static final String tsfs="static_fin_str";
	//transient final String tfs="tran_final";
	/*transient--->null
	 * static--->value
	 * transient static-->value
	 * 
	 * final-->value
	 * transient final-->null
	 * 
	 * 
	 * 
	 */
	
//	public serilizationdemo(String s1,String s2)
//	{
//		// TODO Auto-generated constructor stub
//		this.name=name;
//		this.surname=surname;
//	}
//    
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		//String name="neha";
	    //String surname="Kharche";
		
		      //serilizationdemo s1 =new serilizationdemo("neha","kharche");  
		      serilizationdemo s2=new serilizationdemo();
		      serilizationdemo s1 =new serilizationdemo();  
			  
			  FileOutputStream fout=new FileOutputStream("str_static_final_serilized.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  out.writeObject(s1);  
			  out.flush();  
			  System.out.println("serilization successfully done");
		  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("str_final_serilized.txt"));  
			  serilizationdemo s=(serilizationdemo)in.readObject();  
			
			  
			  System.out.println("Deserilization:-"+s.ts1+"\n static string:- "+serilizationdemo.tss+"\n final string:- "+s.tfs+" \n static final string:- "+serilizationdemo.tsfs);
			  System.out.println("\n transient final string:-"+s.tfs);
			  
			  in.close();  
		  
	
		
	}

}

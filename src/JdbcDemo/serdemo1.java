package JdbcDemo;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serdemo1 extends A implements Serializable{
	
    int j=20;
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        serdemo1 s=new serdemo1();
        FileOutputStream fout=new FileOutputStream("ser_inherit_demo.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(s);
        oos.close();
        
        
        //serdemo1 s1=new serdemo1();
        FileInputStream fin=new FileInputStream("ser_inherit_demo.txt");
        ObjectInputStream ois=new ObjectInputStream(fin);
       //ois.readObject(s1);
        serdemo1 s1=(serdemo1)ois.readObject();
       System.out.println("A i="+s1.i);
       System.out.println("serdemo1 j="+s1.j);
       
	}

}
class A 
{
	int i=30;
//	A()
//	{
//	i=30;
//	}
}


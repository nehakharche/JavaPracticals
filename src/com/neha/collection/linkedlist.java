package com.neha.collection;

public class linkedlist {
	Node head=null;
	Node tail=null;
   public void addnode(Node n)
   {
	   if(head==null)
	   {
		   head=n;
		   tail=n;
	   }
	   else
	   {
		   tail.next=n;//tail of previous node
		   tail=n;// tail of currnt node
	   }	   
   }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    linkedlist l=new linkedlist();
		Node n=new Node(10,null);
	    Node n1=new Node(20,null);
	    Node n2=new Node(30,null);
	    l.addnode(n);
	    l.addnode(n1);
	    l.addnode(n2);
	    
	    System.out.println("head"+l.head);
	    System.out.println("tail"+l.tail);
		System.out.println(l);
		
		
//		Emp e=new Emp();
//		Emp e1=new Emp();
//		Node n=new Node(e,null);
//		Node n1=new Node(e1,null);
//		l.addnode(n1);
//		l.addnode(n);
//		
//		System.out.println("head"+l.head);
//		System.out.println("tail"+l.tail);
//		
	}

	@Override
	public String toString() {
		return "linkedlist [head=" + head + "]";
	}

}
class Node
{
	int data;//
	//Emp e;
	Node next;
	Node(int data,Node next)
	{
		this.data=data;
		this.next=next;
	}		
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	/* Node(Emp e,Node next)
	{
		this.e=e;
		this.next=next;
    } 
	@Override
	public String toString()
	 {
		return "Node [data=" + data + ", e=" + e + ", next=" + next + "]";
	 }	
    
    class Emp
    {
		String name="Neha";
		String Surname="Kharche";	
    }
    */
	 class Emp1
	    {
			String name="Neha";
			String Surname="Kharche";	
	    }

public class Emp2
	    {
			String name="Neha";
			String Surname="Kharche";	
	    }








public class Emp10
{
	String name="Neha";
	String Surname="Kharche";	
}
}
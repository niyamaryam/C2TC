package com.tnsif.staticpack;

public class StaticVarDemo 
{
	
	String name;
	int uid;
	static String coll="Shadan college";//class bound
	
	public StaticVarDemo(String name, int uid) {
		super();
		this.name = name;
		this.uid = uid;
	}

	void display()
	{
		System.out.println(name+=" "+uid+" "+coll);
	}
	
	static void modify()
	{
		coll="IIIT Hyderabad";
	}
	
	public static void main(String[]args) {
		StaticVarDemo s=new StaticVarDemo("Niya Maryam",320);
		s.display();
		modify();
		
		s.display();
	}
	
	 

}
 
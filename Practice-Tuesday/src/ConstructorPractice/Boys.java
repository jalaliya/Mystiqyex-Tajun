package ConstructorPractice;

public class Boys {
	
	String name;
	int amount;
	
	Boys()
	{
		System.out.println("Welcome");
	}
	
	
	public static void main(String args[])
	{
		Boys boy1=new Boys();
		boy1.name="Jalal";
		boy1.amount=100;
		//boy.gotoShop();
		Boys.provide_chocolates();//not object level class level
		
		Boys boy2=new Boys();
		boy2.name="kamal";
		boy2.amount=1000;
		boy2.gotoShop();
	}

	
	void gotoShop()
	{
		
		int amount=50;
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(amount);
		System.out.println(this.amount);
	}
	
	
	//studying the use of static
	static void provide_chocolates()
	{
		//cannot use this keyword for static method
		//System.out.println(this.name);//studying about this
		System.out.println("Distribute chocolates");
	}
}

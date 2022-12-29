package ConstructorPractice;

public class Shop {
	
	//Global variables(Non-static)
	String brand;
	int price,quantity;
	Shop()
	{
		
	}
	
	
	Shop(int price,int quantity,String brand)
	{
		this.brand=brand;
		this.price=price;
		this.quantity=quantity;
	}
	 public static void main(String[] args)
	 {
		 Shop prod1=new Shop();
		 prod1.brand="Aeropostale";
		 prod1.price=100;
		 prod1.quantity=12;
		 
		 Shop prod2=new Shop();
		 prod2.brand="Nike";
		 prod2.price=1009;
		 prod2.quantity=112;
		 
		 Shop prod3=new Shop();
		 prod3.brand="Ferrari";
		 prod3.price=19;
		 prod3.quantity=100;
		 
		 Shop prod4=new Shop(34,56,"ABC");
		
		 
		 System.out.println(prod1.price);
		 System.out.println(prod2.quantity);
		 System.out.println(prod3.price);
		 System.out.println(prod4.quantity);
		
		 prod1.buy();
	 }

	 void buy() {
		
		
	}
	

}

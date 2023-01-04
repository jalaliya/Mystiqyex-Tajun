package abstractionpractice;

public class Tv {
	
	public Tv purchase()
	{
		Tv samsung=new Tv();
		return samsung;
	}
public static void main(String[] args)
{
	Tv salesMan=new Tv();
	Tv mytv=salesMan.purchase();
}
	
	
	
}

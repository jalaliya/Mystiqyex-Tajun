package abstractionpractice;

public class SmartTv extends Tv {
	
	
	//covariant Return type(method overriding)
	public SmartTv purchase()
	{
		SmartTv samsung=new SmartTv();
		return samsung;
	}

	public static void main(String[] args)
{
	SmartTv salesMan=new SmartTv();
	SmartTv mytv=salesMan.purchase();
}
	
	

}

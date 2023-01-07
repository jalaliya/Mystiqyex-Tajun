package overloading;

public class OverladingPractice {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=10;
		
		OverladingPractice obj=new OverladingPractice();
		obj.add(x,y);
	    obj.add(x,y,z);

	}

	
	public void add(int x,int y)
	{
		int sum=x+y;
	    System.out.println(sum);
	}
	
	public void add(int x,int y,int z)
	{
		int sum=x+y+z;
	    System.out.println(sum);
	}
}

package InheritancePolymorphismPractice;

public class Domestic extends Pet{
	
	
	
	
	public Domestic(String name, String owner, String type, int age) {
		super(name, owner, type, age);
		if(type.equals("cat"))
		{
			cutenessFactor=7;
		}
		else if(type.equals("Dog"))
		{
			cutenessFactor=6;
		}
		else
		{
			cutenessFactor=4;
		}
		
	}

	@Override
	public String toString() {
		return super.toString()+"Domestic [cutenessFactor=" + cutenessFactor + "]";
	}

	protected int cutenessFactor;
	
	
	
	public int getCutenessFactor()
	{
		return cutenessFactor;
	}

	public void setCutenessFactor(int c)
	{
		cutenessFactor=c;
	}
}

package InheritancePolymorphismPractice;

public class Exotic extends Pet {
	
	protected int dangerFactor;

	public Exotic(String name, String owner, String type, int age) {
		super(name, owner, type, age);
		if(type.equals("snake"))
		{
			dangerFactor=7;
		}
		else if(type.equals("tiger"))
		{
			dangerFactor=4;
		}
		else {
			dangerFactor=9;
		}
	}

	@Override
	public String toString() {
		return super.toString()+ "Exotic [dangerFactor=" + dangerFactor + "]";
	}
	
	public int getDangerFactor()
	{
		return dangerFactor;
	}
	
	public void setDangerFactor(int df)
	{
		dangerFactor=df;
	}

}

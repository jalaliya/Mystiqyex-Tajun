package InheritancePolymorphismPractice;

public class Pet {
	
	protected String name;
	protected String owner;
	protected String type;
	protected int age;
	
	public Pet(String name,String owner,String type,int age)
	{
		this.name=name;
		this.owner=owner;
		this.type=type;
		this.age=age;
		
	}
	
	@Override
	public String toString() {
		return "Pet [name=" + name + ", owner=" + owner + ", type=" + type + ", age=" + age + "]";
	}

	public String  getName()
	{
		return name;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String speak()
	{
		return "Iam a " +type +" and I say ";	}

}

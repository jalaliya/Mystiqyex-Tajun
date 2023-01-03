package InheritancePolymorphismPractice;

public class Dog extends Domestic {
	
	public Dog(String name, String owner, String type, int age) {
		super(name, owner, type, age);
	
	}

	public String speak()
	{
		return super.speak()+"bark bark!";
	}

}

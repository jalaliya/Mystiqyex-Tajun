package InheritancePolymorphismPractice;

public class Cat extends Domestic{

	
	public Cat(String name, String owner, String type, int age) {
		super(name, owner, type, age);
		
	}

	public String speak()
	{
		return super.speak()+"meeoooow";
	}
			
			
}

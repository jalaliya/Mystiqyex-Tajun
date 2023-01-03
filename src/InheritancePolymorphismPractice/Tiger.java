package InheritancePolymorphismPractice;

public class Tiger extends Exotic {

	public Tiger(String name, String owner, String type, int age) {
		super(name, owner, type, age);
		// TODO Auto-generated constructor stub
	}
	public String speak()
	{
		return super.speak()+"rooaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaarrrrrrrrrrrrr";
	}
		
}

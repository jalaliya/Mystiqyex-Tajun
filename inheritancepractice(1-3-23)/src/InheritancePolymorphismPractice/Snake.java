package InheritancePolymorphismPractice;

public class Snake extends Exotic{

	public Snake(String name, String owner, String type, int age) {
		super(name, owner, type, age);
		// TODO Auto-generated constructor stub
	}
	public String speak()
	{
		return super.speak()+"sssssssssssssssssssss";
	}
		
}

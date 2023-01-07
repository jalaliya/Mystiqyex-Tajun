package abstarctpractice;

public abstract class AbstractionTest2  extends AbstractionTest1{

	@Override
	void firstMethod() {
		System.out.println("First");
		thirdMethod();
		
	}
	
	abstract void thirdMethod();

}


package abstarctpractice;

public  abstract class AbstractionTest1 {
	 abstract void firstMethod();
	
	void secondMethod()
	{
		System.out.println("Second");
		firstMethod();
	}
	

}



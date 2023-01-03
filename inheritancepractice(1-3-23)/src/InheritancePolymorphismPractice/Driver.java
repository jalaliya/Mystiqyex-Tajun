package InheritancePolymorphismPractice;

public class Driver {

	public static void main(String[] args) {
	
		Cat c=new Cat("mila","Jalaliya","cat",5);
		System.out.println(c.speak());
		System.out.println(c);
		
		Dog d=new Dog("Johny","Alex","dog",12);
		System.out.println(d.speak());
		System.out.println(d);
		
		Snake s=new Snake("pallu","frick","snake",3);
		System.out.println(s.speak());
		System.out.println(s);
		
		
		Tiger t=new Tiger("juhdu","hatrick","tiger",5);
		System.out.println(t.speak());
		System.out.println(t);
	}

}

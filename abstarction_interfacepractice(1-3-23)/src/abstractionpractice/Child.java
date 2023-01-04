package abstractionpractice;

public class Child extends Parent{
	
	Child ch11=new Child();

	public void doJava()
	{
		System.out.println("Iam Programming");
	}
	public void play()
	{
		System.out.println("child playing");
	}
	public  void study()
	{
		System.out.println("child studying");
	}
	
	public static void main(String[] args)
	{
		Child ch=new Child();
		//Parent p=new Child();
//		p.work();
//		p.study();
		
		ch.study();
		ch.work();
		ch.play();
		ch.doJava();
	}
	
	
	
}

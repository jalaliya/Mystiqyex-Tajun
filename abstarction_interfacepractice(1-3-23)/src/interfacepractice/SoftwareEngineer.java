package interfacepractice;

public class SoftwareEngineer implements OfficeRules {

	@Override
	public void work_8_hrs() {
		// TODO Auto-generated method stub
		
		System.out.println("Working 8 hrs");
		
	}

	@Override
	public void wear_formals() {
		// TODO Auto-generated method stub
		System.out.println("Wearing Formals");
		
	}

	@Override
	public void get_salary() {
		// TODO Auto-generated method stub
		System.out.println("Getting salary");
		
	}

	@Override
	public void apply_leave() {
		// TODO Auto-generated method stub
		System.out.println("Applying Leave");
		
	}
	
	public void Take_break()
	{
		System.out.println("Taking Break");
	}
	
	public void Take_Vacation()
	{
		System.out.println("Taking Vacation");
	}
public static void main(String[] args)
{
	//SoftwareEngineer se=new SoftwareEngineer();
	OfficeRules or=new SoftwareEngineer();
     //	se.Take_break();
     //	se.apply_leave();
	
}
}

package superkeyword;

public class SuperMethodChild extends SuperMethod{
	
	public void print()
	{
		super.display();
		System.out.println("Inside child class method");
	}

	public static void main(String[] args) {

		SuperMethodChild obj=new SuperMethodChild();
		obj.print();
		
	}

}

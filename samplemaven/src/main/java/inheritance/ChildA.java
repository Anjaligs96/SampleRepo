package inheritance;

public class ChildA extends ParentHeirarchial {
	
	public void print()
	{
		System.out.println("Inside ChildA class..");
	}

	public static void main(String[] args) {
		ChildA obj=new ChildA();
		obj.display();
		obj.print();

	}

}

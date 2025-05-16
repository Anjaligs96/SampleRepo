package inheritance;

public class ChildB extends ParentHeirarchial {
	
	public void show()
	{
		System.out.println("Inside ChildB class..");
	}

	public static void main(String[] args) {
		ChildB obj1=new ChildB();
		obj1.display();
		obj1.show();

	}

}

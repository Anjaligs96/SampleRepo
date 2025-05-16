package inheritance;

public class Child extends Parent{
	
	public void show() 
	{
		System.out.println("Inside Child class...");
	}

	public static void main(String[] args) {

		Child obj= new Child();
		obj.display();
		obj.print();
		obj.show();
	}

}

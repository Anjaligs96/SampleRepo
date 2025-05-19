package abstraction;

public class AbstractChild extends AbstractionParent{
	

	@Override
	public void display() {
	System.out.println("Inside display method..");
		
	}
	public void print()
	{
		System.out.println("Inside print method...");
	}
	public static void main(String[] args) {
		
	/*AbstractChild obj = new AbstractChild();   // object creation
		obj.display();
		obj.show();
		obj.print();	*/
		
		AbstractionParent obj1= new AbstractChild(); // creating ref for parent class
		obj1.display();
		obj1.show();
		

	}


	
}

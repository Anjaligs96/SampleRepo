package interfaceexample;

public class Interface2 implements Interface1{
	public void show()
	{
	 System.out.println("Inside show method..");	
	}

	public static void main(String[] args) {
	/*	Interface2 obj= new Interface2();
		obj.display();
		obj.print();
		obj.show(); */
		
		Interface1 obj1= new Interface2();
		obj1.display();
		obj1.print();
		

	}

	@Override
	public void display() {
		 System.out.println("Inside display method..");
		
	}

	@Override
	public void print() {
		 System.out.println("Inside print method..");
		
	}

}

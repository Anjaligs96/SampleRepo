package superkeyword;

public class SupervariableChild extends SuperVariable {
	
	String color="red";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {

		SupervariableChild obj= new SupervariableChild();
		obj.display();
		
		
	}

}

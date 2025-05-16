package superkeyword;

public class SuperConstructorChild extends SuperConstructor {

	public SuperConstructorChild() {
		super("Parent class constructor");
		System.out.println("Child class constructor");
		
	}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();

	}

}

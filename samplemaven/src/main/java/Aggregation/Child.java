package Aggregation;

public class Child {

	String city,state;
	Parent ref;
	
	public Child(String city,String state,Parent ref)//creating ref obj to parent class
	{
		this.ref=ref;
		this.city=city;
		this.state=state;
	}
	public void display()
	{
		System.out.println(ref.name+","+ref.address);
		System.out.println(city+","+state);
	}
	                   
	
	public static void main(String[] args) {
		Parent obj= new Parent("Anu", 123,"xyz");
		Child obj1= new Child("Ernakulam","Kerala",obj);
		obj1.display();

	}

}

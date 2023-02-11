package java_oops;

public class Bird 
	{
	int age = 25;
	String color ="voilet";
	void run( )
	{
	System.out.println("running operation");
	}
	public static void main(String[ ]args)
	{
	Bird peacock = new Bird( );
	peacock.run( );
	System.out.println((peacock.age));
	System.out.println("color of Peacock is"+ peacock.color);
	}
	}



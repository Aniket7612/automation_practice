package java_oops;

public class Animal1
	{
	int age = 20;
	String color = "grey";
	void run  ( )
	{
	System.out.println("running operation");
	}
	public static void main (String[ ]args)
	{
	Animal1 sansa = new Animal1 ( );
	sansa.run( );

	System.out.println((sansa.age));

	System.out.println("color of sansa is"+sansa.color);
	}
	}




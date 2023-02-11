package learn_object;

public class shrimp {
	private static final int age1 =22;
	int age = 12;
	String color ="orange";
	float height = 1.1f;
	
	void swim()
	{
		System.out.println("shrimp is swim");
		
	}
	public static void main(String[ ] args)
	{
		shrimp k =new shrimp();
		k.swim();
		{
		System.out.println("shrimp is waiting");
		System.out.println("shrimp is watching");
		System.out.println("shrimp is see something");
		System.out.println("shrimp.age1");
		System.out.println(k.age);
		System.out.println(k.height);
		System.out.println(k.color);
		}
	}
}

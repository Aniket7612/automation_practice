package method_overriding;

public class son extends mom {
	void property()
	{
		System.out.println("i am lucky one");
	}
	
	public static void main(String[] args) {
		son shub =new son();
		shub.property();
		mom alk =new mom();
		alk.property();
		

	}

}

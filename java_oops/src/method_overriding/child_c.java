package method_overriding;

public class child_c extends parent_p {
	void property()
	{
		System.out.println("select pushpa");
		
	}
public static void main(String[ ] args)
{
	child_c nick =new child_c();
	 nick.property();
	 parent_p pogo =new parent_p();
	 pogo.property();
	 parent_p disney =new parent_p();
	 disney.property();
			
	
		// TODO Auto-generated constructor stub
	}

}

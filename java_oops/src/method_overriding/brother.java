package method_overriding;

public class brother extends  sister {
void property()
{
	System.out.println("i am smaller one ");
	}
public static void main(String[ ] args)
{
	sister abc =new sister();
	abc.property();
	brother xyz =new brother();
	xyz.property();
}
}

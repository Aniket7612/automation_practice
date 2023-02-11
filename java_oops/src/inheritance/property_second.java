package inheritance;

public class property_second extends property_first {

void sleeping()

{
System.out.println("now felling beter");
System.out.println("stomach is full");

	}
public static void main(String[ ] args)
{
	property_second b1 = new property_second();
	b1.sleeping();
}
}
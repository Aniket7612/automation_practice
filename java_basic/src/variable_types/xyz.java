package variable_types;

public class xyz {
int a ;
	static int b ;
	
void add ( )
{
		int c=30, d;
		d=a+b+c;
		System.out.println(d);
		
	}
void mul()
{
	int s=12, t;
	t=a*b*s;
	System.out.println(t);
}
	public static void main(String[ ] args)
	{
	xyz ss = new xyz();
			ss.add();
			ss.mul();
}
	}

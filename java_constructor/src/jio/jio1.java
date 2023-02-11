package jio;

public class jio1 { 
int shub_id;
String shub_name;
jio1 (int shub_id, String shub_name)
{ 
	this.shub_id= shub_id;
	this.shub_name=shub_name;
	
	System.out.println("the member of jio");
}
public static void main(String[ ]args) {
	{
		jio1 j1 =new jio1(234,"shub");
		System.out.println("the detail of shub is "+j1.shub_id+"  "+j1.shub_name);
		jio1 j2 =new jio1(576,"prasad");
		System.out.println("the detail of prasad is" +j2.shub_id+"  "+j2.shub_name);
	}
	
}

}

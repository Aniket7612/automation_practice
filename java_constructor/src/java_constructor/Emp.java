package java_constructor;

public class Emp {
	int Emp_id;
	String Emp_name;
	Emp (int Emp_id, String Emp_name)
	{
this.Emp_id =Emp_id;
this.Emp_name =Emp_name;

System.out.println("the empioy of fusion");
	}
	public static void main(String[ ]args) {
		{
			Emp e1 =new Emp(1500,"shubham");
			System.out.println("the detail of employee is "+e1.Emp_id+"  "+e1.Emp_name);
			Emp e2 =new Emp(1290,"babli");
			System.out.println("the detail of employee is  "+e2.Emp_id+"  "+e2.Emp_name);
		}
	}
	

}

package key_static;

public class employee {
	
	
	
	int emp_id;
	String emp_name;
	static String emp_company;
	
	employee(int emp_id, String emp_name, String emp_company)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_company=emp_company;
		
	}
	void display( )
	{
		System.out.println(emp_id+" "+emp_name+" "+emp_company);
		
	}
	public static void main(String[ ] args)
	{
		employee e1= new employee(101,"shubham","google");
		e1.display();
		employee e2=new employee(103,"minal","google");
		e2.display();
	}
}
		
	



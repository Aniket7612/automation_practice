package key_static;

public class majur 
{
	
	
	int m_id;
	String m_name;
	static String m_company;
majur(int m_id,String m_name,String m_company)
{
	this.m_id = m_id;
	this.m_name =m_name;
	this.m_company =m_company;
}
void display()
{
	System.out.println(m_id+" "+m_name+" "+m_company);
}
public static void main(String[ ] args)
{
	majur a = new majur(191,"raju","midc");
	a.display();
	majur b = new majur(199,"sham","company");
	b.display();
		
	}

}

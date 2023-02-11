/**
 * 
 */
/**
 * @author DELL
 *
 */
package java_oops;
public class Animal
{
int age = 20;
String color = "grey";
void run  ( )
{
System.out.println("running operation");
}
public static void main (String[ ]args)
{
Animal sansa = new Animal ( );
sansa.run( );

System.out.println((sansa.age));

System.out.println("color of sansa is"+sansa.color);
}
}

import java.io.*;
class area
{
	area(int a)
	{
		System.out.println("area of squre is"+(a*a));
	}
	area(int a,int b)
	{
		System.out.println("area of rectangle is"+(a*b));
	}
}
public class overloadconstructor
{
	public static void main(String args[])throws IOException

	{
		BufferedReader k=new BufferedReader (new Input StramReader(System.in));
		System.out.println("enter the side of squre");
		int a=Integer.parseInt(k.readLine());
		area kb=new area(a);
		System.out.println("enter the side of the rectangle");
		int c=Integer.parseInt(k.readLine());
		int b=Integer.parseInt(k.readLine());
	}
}

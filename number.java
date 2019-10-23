import java.io.*;
public class number
{
	public static void main(String args[]) throws IOException
	{
		int n,i,m=0,s=0;
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		n=Integer.parseInt(kb.readLine());
		for(i=1;i<=n/2;i++)
			{
				m=n%i;
				if(m==0)
				{
					s=s+i;
				}
			}
				if(s==n)
				{
					System.out.println("The given number is perfect");
				}
				else if(s>n)
				{
					System.out.println("The given number is Abundent");
				}
				else
				{
					System.out.println("The given number is Defficient");
				}
			
	}
}

import java.util.Scanner;
public class fibo
{
public static void main(String args[])
    {
     int n,a=0,b=0,c=1;
     Scanner s=new Scanner(System.in);
     System.out.println("enter value of n:");
     n=s.nextInt() ;
     System.out.println("fibonacci series:");
     for(int i=0;i<=n;i++)
       {
         a=b;
          b=c;
          c=a+b;
          System.out.println(a+" ");
	   }
    }
}  

import java.util.Scanner;
public class sorting
{
 public static void main(String args[])
      {
	   int i,j,n,temp;
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the number of element");
	   n=s.nextInt();
	   int a[]=new int[n];
	   System.out.println("enter the element");
	   for(i=0;i<n;i++)
	   {
	     a[i]=s.nextInt();
		}
     for(i=0;i<n;i++)
		{
		  for(j=i+1;j<n;j++)
		  {
		   if (a[i]>a[j])
		   {
		     temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 }
			}
		}
		System.out.println("ascending order");
		for(i=0;i<n-1;i++)
		{
	  System.out.println(a[i]+" ");
		}	  
		System.out.println(a[n-1]);
 
	    }
}	  
	    
	  
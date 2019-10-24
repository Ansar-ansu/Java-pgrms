import java.util.Scanner;		
class students
{
	String home=new string();
	int rollno;
	String course=new String();
	void read()
	{
		Scanner.k=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=k.nextLine();
		System.out.println("Enter the course:");
		course=k.nextLine();
		System.out.println("Enter the rollno:");
		rollno=k.nextLine();
	}
	void disply()
	{
		System.out.println("name="+name);
		System.out.println("course="+course);
		System.out.println("rollno="+rollno);
	}
}
class result extends students
{
	int m1,m2,m3,m4,m5;
	double tot,per;
	char grade;
	void readmark()
	{
		super.read();
		Scanner k=new Scanner(System.in);
		System.out.println("Enter 5 marks out of 50:");
		m1=k.nextInt();
		m2=k.nextInt();
		m3=k.nextInt();
		m4=k.nextInt();
		m5=k.nextInt();
		tot=m1+m2+m3+m4+m5;
		per=(tot/250*100);
		if(per>80)
		grade='A';
		else if(per>70)
		grade='B';
		else if(per>60)
		grade='c';
		else if(per>50)
		grade='D';
		else if(per>40)
		grade='E';
		else if(per>30)
		grade='f';
	}
	void dispalyresult()
	{
		super.display();
		System.out.println("total="+tot);
		System.out.println("percentage="+per);
		System.out.println("grade="+grade);
	}
}
		
		
		
		
		

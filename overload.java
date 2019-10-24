import java.io.*;
class overload
{
	double vol(float l,float w,float h)
	  {
		return l*w*h;
	  }
	  double vol(float r,float h)
	  {
		return 3.14*r*r*h;
	  }
 }
     class methodoverloading
     {
	public static void main(String args[])throws IOException
	{
		overload ov=new overload();
		float x,y,z;
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the length,breadth,height");
		x=Integer.parseInt(kb.readLine());
		y=Integer.parseInt(kb.readLine());
		z=Integer.parseInt(kb.readLine());
		double rectbox=ov.vol(x,y,z);
		System.out.println("volume of the rectangle box is:"+rectbox);
		System.out.println("enter the length");
		x=Integer.parseInt(kb.readLine());
		double cube=ov.vol(x);
		System.out.println("volume of the cube is"+cube);
		System.out.println("enter the radius and height");
		x=Integer.parseInt(kb.readLine());
		y=Integer.parseInt(kb.readline());
		double cyl=ov.vol(x,y);
		System.out.println("volume of the cylinder is"+cyl);
	}
  }

		



  

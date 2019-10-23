class SecondConstructor
{
  int i,j;
  SecondConstructor(int i,int j)
  {
    this.i=i;
    this.j=j;
  }
  void display()
  {
    System.out.println("value of instance variable i:"+i);
    System.out.println("value of instance variable j:"+j);
  }
}
class Constructorcall
{
  public static void main(String args[])
  {
    SecondConstructor Sc=new SecondConstructor(10,20);
    Sc.display();
  }
}

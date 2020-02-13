import java.util.Scanner;
class Faculty
{
  public void salary(int num)
  {
	 num=num;
	 
  }
}
class CSE extends Faculty
{
	public void salary(int num)
	  {
	    System.out.println("CSE Faculty: "+(num+ 3000));
	  }
}
class IT extends Faculty
{
	public void salary(int num)
	  {
	    System.out.println("IT Faculty: "+(num+ 5000));
	  }
}
class ECE 
{
	public void salary(int num)
	  {
	    System.out.println("ECE Faculty: "+(num+ 4500));
	  }
  
}

class Main
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	    int a = sc.nextInt();
	    System.out.println("Base Salary: "+a);
   
    CSE obj1 = new CSE ();
    obj1.salary(a);
    IT obj2 = new IT ();
    obj2.salary(a);
    ECE obj = new ECE();
    obj.salary(a);
  }
}
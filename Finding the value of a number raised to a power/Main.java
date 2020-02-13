import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      	int base = sc.nextInt();
      	int exponent = sc.nextInt();
      int result=1;
      for(int i=0;i<exponent;i++)
      {
        result=result*base;
      }
     //result=pow(base,exponent);
      System.out.println(result);
      
    }
}
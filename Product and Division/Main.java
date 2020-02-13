import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int pdf=n1*n2;
      int qut=n1/n2;
      int rem=n1%n2;
      System.out.println(pdf);
      System.out.println(qut);
      System.out.println(rem);
    }
}
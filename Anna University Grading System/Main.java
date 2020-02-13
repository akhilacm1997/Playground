import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int c=sc.nextInt();
      if(c==100)
        System.out.println("S");
      else if(c>=90&&c<=99)
        System.out.println("A");
      else if(c>=80&&c<=89)
        System.out.println("B");
      else if(c>=70&&c<=79)
        System.out.println("C");
      else if(c>=60&&c<=69)
        System.out.println("D");
      else if(c>=50&&c<=59)
        System.out.println("E");
      else
       
        System.out.println("F");
      
    }
}
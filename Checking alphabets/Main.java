import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
      char c=sc.next().charAt(0);
      if(c>=97&&c<=122)
      {
      if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
         System.out.println("Vowel");
             else
               
       System.out.println("Consonant");
    }
    else
      System.out.println("Not an alphabet");
    }
}
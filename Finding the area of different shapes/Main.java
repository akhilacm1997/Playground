import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num = sc.nextInt();
    int n1,n2;
	    switch(num)
	    {
            
	        case 1:
	                 n1 = sc.nextInt();
	                int squarArea=n1*n1;
	            	System.out.println(squarArea);
	            	break;
	      case 2:
                    n1 = sc.nextInt();
                   n2 = sc.nextInt();
	                int recArea=(n1*n2);
	            	System.out.println(recArea);
	                break;
	       case 3:
                     n1 = sc.nextInt();
                     n2 = sc.nextInt();
	                int triangle = (n1*n2)/2;
	                System.out.println(triangle);
	                break;
	       case 4:
                    n1 = sc.nextInt();
	                double circle =  (3.14*n1*n1);
	                System.out.println(circle);
	              
            break;
	                
	    default:
	    System.out.println("invalid input");
   
	    }
	}
}
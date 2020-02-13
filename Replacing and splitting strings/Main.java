import java.util.Scanner;
public class Main { 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
	    String str1 = sc.nextLine();
	    String str2 =sc.nextLine();
	    int num = sc.nextInt();
		String[] arrOfStr = str2.split(" ", num); 

		for (String a : arrOfStr) 
			System.out.println(a); 
	} 
} 
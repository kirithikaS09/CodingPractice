package package2;
import java.util.Scanner;
public class Threevariables {
	public static void main(String[] args) {
		Scanner g= new Scanner(System.in);
		System.out.println("Enter Name");
		String name = g.nextLine();
		System.out.println("Enter age");
		int age =g.nextInt();
		g.nextLine();
		System.out.println("Enter Address");
		String address = g.nextLine();
		System.out.println("My is Name "+name);
		System.out.println("Iam "+ age+" years old");
		System.out.println("and iam from "+address);
		g.close();
	}
	
}

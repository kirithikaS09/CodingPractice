package package2;
import java.util.Scanner;

public class Trafficlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//changes need not working
		Scanner s=new Scanner(System.in);
		String Tl=s.nextLine();
		if(Tl.equals("red"))
			System.out.println("stop");
		else if(Tl.equals("yellow"))
			System.out.println("Get ready");
		else
			System.out.println("Go");
		s.close();

	}

}

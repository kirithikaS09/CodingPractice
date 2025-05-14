package package2;
import java.util.Scanner;
public class Scoregame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g=new Scanner(System.in);
		int score=g.nextInt();
		if(score<50)
			System.out.println("you need to improve");
		else if(score>=50 && score<=70)
			System.out.println("good job");
		else
			System.out.println("Excellent job");
		g.close();

	}

}

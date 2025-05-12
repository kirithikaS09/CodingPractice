package javaprogram;

public class Maggicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=50112;
		int sum=0;
		int mag=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		while(sum>0) {
			int dig=sum%10;
			mag=mag+dig;
			sum=sum/10;
		}
		System.out.println(mag);*/
		int n=50113;
		while(n>9) {
			int sum=0;
			while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
			}
			n=sum;
		}
		System.out.println(n);
	}
}
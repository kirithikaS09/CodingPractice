package javaprogram;

public class Infinitytables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,res=0;
		/*while(true) {
			res=i*7;
			if(res>9999)
				break;
			i++;
			System.out.println(res);
		}*/
		try {
		for(i=1;i>0;i++){
			if(i%7==0) {
				res=i;
				if(res>9999)
					break;
				System.out.println(res);	
			}
			}}
		catch(Exception e) {
			System.out.println(e);
				

			}
		}
}



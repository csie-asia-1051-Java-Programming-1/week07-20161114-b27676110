package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(fun(a)/(fun(b)*fun(a-b)));}
		
		public static float fun(int n){
			if(n==1){
				return 1;
			}else{
				return n*fun(n-1);
			}

	}

}

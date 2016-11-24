package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		System.out.println(fun(n));}
	public static String fun(long n){
		long a = 0;
		if(n==0){
			return "";
		}else{
			a = n%10;
			return n%10+fun(n/10);
		}

	}

}

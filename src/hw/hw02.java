package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k =0;
		System.out.println(fun(n));}
	
	public static int fun(int v){
		
		if(v==0){
			return 0;
		}else{
			return 1+fun(v/10);
		}

	}

}

package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k =0;
		System.out.println(fun(n,k));}
	
	public static int fun(int v,int k){
		
		if(v==0){
			return k;
		}else{
			return fun(v/10,k+1);
		}

	}

}

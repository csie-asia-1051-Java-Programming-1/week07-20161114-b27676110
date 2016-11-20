package ex;
/*
 * Date: 2016/11/14

 * Author: 105021036 ¾GªFªY
 */

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));}
		
	public static int fun(int v){
		if(v==1){
			return 1;
		}else{
			
			return	v*fun(v-1);}
			
		

	}

}

//	if(x=1)
//	{
//		return 1 ;
//	}
//	else{
//	((data[x]-u)*(data[x]-u))/n+((data[x-1]-u)*(data[x-1]-u))
//	}
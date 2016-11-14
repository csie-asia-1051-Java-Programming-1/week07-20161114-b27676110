package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021036 ¾GªFªY
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float data[] = new float[n];
		for (int i = 0; i < n; i++) {
			data[i] = scn.nextInt();
			
		}
		System.out.println(var(data,n));
	}

	public static float var(float data[],float v){
		float sum = 0;
		float val = 0;
		float a = 0;
		for(int i = 0;i<data.length;i++){
			sum = sum +data[i];
		}
		for(int j = 0;j<data.length;j++){
			val = val+ (data[j]-sum/v)*(data[j]-sum/v);
		}
		a = val/v;
		
		
		return a;

	

	}

}

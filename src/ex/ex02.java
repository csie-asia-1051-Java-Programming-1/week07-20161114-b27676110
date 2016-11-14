package ex;
/*
 * Date: 2016/11/14
 * Author: 105021036 ¾GªFªY
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float data[] = new float[n];
		for (int i = 0; i < n; i++) {
			data[i] = scn.nextInt();	
		}
		System.out.println(std(data,n));
	}
	public static float std(float data[],float v){
		float b = var(data,v);
		float val = 0;
		float a = 0;
		float c = 0;
		for(int j = 0;j<data.length;j++){
			val = val+ (data[j]-b)*(data[j]-b);
		}
		a = val/v;
		c = (float)Math.pow(a, 1/2f);
		return c;
	}
	public static float var(float data[],float v){
		float sum = 0;
		for(int i = 0;i<data.length;i++){
			sum = sum +data[i];
		}
		float b = sum/v;
		return b;
		
	}

}

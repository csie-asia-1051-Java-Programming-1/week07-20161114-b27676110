package ex;
/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float data[][]=new float [(int)a][(int)b];
		for(int i = 0;i<a;i++){
			for(int j = 0;j<b;j++){
				data[i][j]=scn.nextInt();
			}
		}
		System.out.println(var2(data,a,b));
		System.out.println(std2(data,a,b));
	}
	public static float var2(float data [][],float v1,float v2){
		float sum = 0;
		float a = 0;
		float b = 0;
		float c = 0;
		for(int i = 0;i<v1;i++){
			for(int j = 0;j<v2;j++){
				sum = sum + data[i][j];
			}
		}
		a = sum/v1*v2;
		for(int i = 0;i<v1;i++){
			for(int j = 0;j<v2;j++){
				b = b + (data[i][j]-a);
			}
		}
		c = b*b/v1*v2;
		return c;}
		public static float std2(float data [][],float v1,float v2){
			float sum = 0;
			float a = 0;
			float b = 0;
			float c = 0;
			float d = 0;
			for(int i = 0;i<v1;i++){
				for(int j = 0;j<v2;j++){
					sum = sum + data[i][j];
				}
			}
			a = sum/v1*v2;
			for(int i = 0;i<v1;i++){
				for(int j = 0;j<v2;j++){
					b = b + (data[i][j]-a);
				}
			}
			c = b*b/v1*v2;
			d = (float)Math.pow(c,1/2f);
			return d ;
		
		
		

	}

}

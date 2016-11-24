package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 先輸入大樹 再輸入小數 求兩樹最小公倍數
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int sum = m;
		for (int i = sum; i >= 0; i++) {
			if (m % sum == 0) {
				System.out.println(sum);
			}

		}

	}
}

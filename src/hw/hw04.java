package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int sum = m;
		System.out.println(fun(m, n, sum));
	}

	public static int fun(int m, int n, int sum) {
		if (m % sum == 0 && n % sum == 0) {
			return sum;
		} else {
			return fun(m, n, sum - 1);
		}

	}

}

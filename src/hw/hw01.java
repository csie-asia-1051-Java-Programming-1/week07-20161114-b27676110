package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����J�j�� �A��J�p�� �D���̤p������
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		int n = x;
		System.out.println(fun(x, y, z, n));
	}

	public static int fun(int x, int y, int z, int n) {
		if (n % x == 0 && n % y == 0 && n%z == 0) {
			return n;

		} else {

			return fun(x, y, z, n+1);
		}
	}
}
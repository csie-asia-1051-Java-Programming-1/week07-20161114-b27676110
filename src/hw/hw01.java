package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����J�j�� �A��J�p�� �D���̤p������
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

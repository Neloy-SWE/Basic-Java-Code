package Matrix;

import java.util.Scanner;

public class Addmatrix {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("A[%d][%d]=", i + 1, j + 1);
				a[i][j] = x.nextInt();
			}
		}
		System.out.println();
		System.out.printf("A matrix:\n");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%d	", a[i][j]);
			}
			System.out.printf("\n\n");
		}
		System.out.printf("\n\n\n\n");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("B[%d][%d]=", i + 1, j + 1);
				b[i][j] = x.nextInt();
			}
		}
		System.out.println();
		System.out.printf("B matrix:\n");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%d	", b[i][j]);
			}
			System.out.printf("\n\n");
		}
		System.out.printf("\n\n\n\n");

		System.out.printf("Sum of A and B\n");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%d	", c[i][j]);
			}
			System.out.printf("\n\n");
		}

	}
}
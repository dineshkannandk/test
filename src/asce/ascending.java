package asce;

import java.util.Scanner;

public class ascending {

	public static void main(String[] args) {

		int n, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the values ");

		n = sc.nextInt();

		int a[] = new int[n];
		
		System.out.println("enter the  numbers ");

		for (int i = 0; i < n; i++) {


			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (a[i] > a[j]) {

					temp = a[i];

					a[i] = a[j];

					a[j] = temp;
				}

			}

		}

		System.out.println("ascending order");

		for (int i = 0; i < n - 1; i++) {

			System.out.println(a[i] + ", ");
		}

		System.out.println(a[n - 1]);
	}

}

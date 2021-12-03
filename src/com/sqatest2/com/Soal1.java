package com.sqatest2.com;


import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);

	}

	static void cetakFibonacci(int batas) {

		int pass = 0;
		int current = 1;
		int fibonacci;

	
		System.out.println("Output : ");
		System.out.print(current + " ");
		for (int i = 0; i < batas; i++) {
			fibonacci = current + pass;
			pass = current;
			current = fibonacci;

			

			if (fibonacci > batas) {
				return;
			}
			System.out.print(fibonacci + " ");
		}
	}
}

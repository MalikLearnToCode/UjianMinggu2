package com.sqatest2.com;

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Masukan jarak tempuh = ");
		int jarak = in.nextInt();
		
		System.out.println("Masukkan waktu tempuh = ");
		int waktu = in.nextInt();
		System.out.println("Kecepatan rata-rata anda adalah" + hitungKecepatan(jarak, waktu) + " km/jam");
		
		
		}

	static int hitungKecepatan(int jarak, int waktu) {

		
		       return jarak / waktu;
		}
			
	}


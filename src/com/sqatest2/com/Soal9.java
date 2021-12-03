package com.sqatest2.com;

public class Soal9 {
	public static void main(String[] args) {		
		int [] intNilai = {1, 2, 3, 4, 5};
		Soal9 soal9 = new Soal9();
		System.out.println(soal9.jumlahArray(intNilai));
		System.out.println(soal9.cariNilai(intNilai, 3));
	}

	public int jumlahArray(int[] nilai) {
		int sum = 0;
		for (int i = 0; i < nilai.length; i++) {
			sum += nilai[i];
		}
		return sum;
	}

	public boolean cariNilai(int[] arr, int nilai) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == nilai)
				return true;
		}
		return false;
	}
}
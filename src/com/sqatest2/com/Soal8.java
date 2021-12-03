package com.sqatest2.com;

class Tabungan {
	int noRek;
	String nama;
	int saldo;

	public Tabungan(String nama, int noRek, int saldo) {
		this.nama = nama;
		this.noRek = noRek;
		this.saldo = saldo;
	}

	public Tabungan(String nama, int noRek) {
		this.nama = nama;
		this.noRek = noRek;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "Tabungan nomor " + noRek + " atas nama " + nama + " dengan saldo sebesar " + saldo;
	}

}

public class Soal8 {
	public static void main(String[] args) {
		Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati Hartati", 89, 100000);
		System.out.println(simpedes.toString());
		System.out.println();
		Tabungan tabanas = new Tabungan("Hindun", 90);
		System.out.println(tabanas.toString());
	}
}
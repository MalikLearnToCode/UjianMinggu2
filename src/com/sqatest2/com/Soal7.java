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

	public void cekSaldo() {
		System.out.println("Saldo anda saat ini adalah " + saldo);
	}

	public void setor(int setor) {
		saldo = saldo + setor;
		System.out.println("Setoran sebesar " + setor + " berhasil dilakukan, saldo anda sekarang " + saldo);
	}

	public void tarik(int tarik) {
		int saldoTemp = saldo - tarik;
		if (saldoTemp <= 0) {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		} else {
			saldo = saldoTemp;
			System.out.println("Penarikan sebesar " + tarik + " berhasil dilakukan, saldo anda sekarang " + saldo);
		}
	}

}

public class Soal7 {
	public static void main(String[] args) {
		Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati Hartati", 89, 100000);
		simpedes.cekSaldo();
		simpedes.setor(8000);
		simpedes.cekSaldo();
		simpedes.tarik(230000);
		simpedes.tarik(60000);
		simpedes.cekSaldo();
		System.out.println();
		Tabungan tabanas = new Tabungan("Hindun", 90);
		tabanas.cekSaldo();
		tabanas.tarik(10000);
		tabanas.tarik(1000);
		tabanas.setor(20000);
		tabanas.tarik(20000);
	}
}
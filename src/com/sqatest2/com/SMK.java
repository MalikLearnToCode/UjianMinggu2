package com.sqatest2.com;

public class SMK extends Sekolah {
	public SMK() {
		
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public void setJenjang(String jenjang) {
		this.jenjang = jenjang;
	}
	
	public String getName() {
		return this.nama;
	}
	
	public String getAlamat() {
		return this.alamat;
	}
	
	public String getJenjang() {
		return this.jenjang;
	}
}

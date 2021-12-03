package com.sqatest2.com;

import java.util.Scanner;

class BebasException extends Exception {
	public BebasException(String s) {
		super(s);
	}
}

public class Soal6 {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Jenis kelamin = ");
			String jenisKelamin = in.nextLine();

			if (!jenisKelamin.equalsIgnoreCase("pria") && !jenisKelamin.equalsIgnoreCase("wanita")) {
				throw new BebasException("Throw Custom Message Error");
			}

			System.out.println("Status = ");
			String status = in.nextLine();

			if (!status.equalsIgnoreCase("menikah") && !status.equalsIgnoreCase("blm menikah")) {
				throw new BebasException("Throw Custom Message Error");
			}

			if (jenisKelamin.equalsIgnoreCase("pria")) {
				if (status.equalsIgnoreCase("menikah")) {
					System.out.println("pria menikah, pajak 5%");
				} else if (status.equalsIgnoreCase("blm menikah")) {
					System.out.println("pria blm menikah, pajak 10%");
				}
			} else if (!jenisKelamin.equalsIgnoreCase("wanita")) {
				if (status.equalsIgnoreCase("menikah")) {
					System.out.println("wanita menikah, pajak 3%");
				} else if (status.equalsIgnoreCase("blm menikah")) {
					System.out.println("wanita blm menikah, pajak 7%");
				}
			}

		} catch (BebasException bebas) {
			// TODO: handle exception
			System.out.println("Bebas Exception");
			System.out.println(bebas.getMessage());
		}
	}
}

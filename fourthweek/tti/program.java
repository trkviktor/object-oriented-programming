package tti;

import java.util.Scanner;

public class program {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		read();
	}
	
	public static void read() {
		szemely szem = new szemely();
		boolean ok;
		String inp;
		do {
			System.out.println("(nev suly magassag): ");
			inp = in.nextLine();
			String[] strArray = inp.split(" ");
			ok = true;
		try {
			szem.setNev(strArray[0]);
			szem.setSuly(Integer.parseInt(strArray[1]));
			szem.setMagassag(Double.parseDouble(strArray[2]));
			szem.osszefuzes(szem.getNev(), szem.getSuly(), szem.getMagassag(), szem.jellemzes(szem.tti()));
		}
		catch (Exception e) {
			ok = false;
		}
		}while(!ok);
		
	}
}

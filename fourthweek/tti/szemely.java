package tti;

public class szemely {
	public String nev;
	public int suly;
	public double magassag;
	
	public void osszefuzes(String nev, int suly, double magassag, String tti) {
		System.out.println(nev + "," + suly + "," + magassag + ",tti: " + tti);
	}
	
	public String jellemzes(double tti) {
		if(tti < 18.5) {
			return "sovany";
		}
		else if(tti > 25) {
			return "kover";
		}
		else {
			return "normalis";
		}
	}
	
	public double tti() {
		return suly/(magassag*magassag);
	}
	
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public int getSuly() {
		return suly;
	}
	public void setSuly(int suly) {
		this.suly = suly;
	}
	public double getMagassag() {
		return magassag;
	}
	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}
}

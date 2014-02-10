package org.conde.git;

import java.util.List;


public class Bateau{
	
	private String nom;
	private int tonnage;
	
	private List<Bateau> equipage;

	@Override
	public String toString() {
		return "Bateau [nom=" + nom + ", tonnage=" + tonnage + ", equipage="
				+ equipage + "]";
	}
	
	
	
	 
	
}
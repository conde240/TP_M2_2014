package org.conde.git;

import java.util.List;

import org.conde.git.util.Statut;


public class Bateau{
	
	private String nom;
	private int tonnage;
	
	private List<Bateau> equipage;
	
	private Statut statut;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	@Override
	public String toString() {
		return "Bateau [nom=" + nom + ", tonnage=" + tonnage + ", equipage="
				+ equipage + "]";
	}
}

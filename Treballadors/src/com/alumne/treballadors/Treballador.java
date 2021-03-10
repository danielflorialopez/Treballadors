package com.alumne.treballadors;
/**
 * Classe per a guardar les dades d'un treballador
 * No tenim main perquè no la farem servir a soles
 * @author EMILIO
 *
 */

public class Treballador {
	static final int DIRECTOR = 0;
	static final int SUBDIRECTOR = 1;
	static final int BASE = 2;
	
	String nomTreballador;
	int tipusTreballador;
	float nominaTreballador;
	int horesExtresTreballador;
	
	
	//Constructor amb arguments, alternatiu al constructor per defecte
	
	Treballador(String nom, int tipus, float nomina, int hores) {
		nomTreballador = nom;
		tipusTreballador = tipus;
		nominaTreballador = nomina;
		horesExtresTreballador = hores;
		
	}
	
	//Constructor buit per defecte, l'hem de declarar si volem poder usar-lo per culpa d'haver declarat l'anterior
	
	Treballador() {
		
	}
	
	void setNom (String nom) throws Exception {
		//Si la longitud del nou nom és inferior a tres caràcters llença excepció avisant del problema
		if (nom.length() < 3) {
			throw new Exception("El nom ha de tenir 3 o més caràcters");
		}
		//En cas contrari assigna el nom
		nomTreballador = nom;
	}
	
	String getNom() {
		return nomTreballador;
	}
	
	void setNomina (float euros) {
		//Per simplicitat no comprovem que la nomina és superior a zero ja que el programa no fallarà per aquest error
		//i així ens estalviem les excepcions
		nominaTreballador = euros;
	}
	
	float getNomina() {
		return nominaTreballador;
	}
	
	void setHoresExtres(int hores) {
		//Les hores extra poden ser zero sense problema
		horesExtresTreballador = hores;
	}
	
	int getHoresExtres() {
		return horesExtresTreballador;
	}
	
	void setTipusTreballador(int tipus) throws Exception {
		//Aqui no és recomanable estalviar-se les comprovacions perquè el tipus de treballador només pot ser DIRECTOR, SUbDIRECTOR o BASE

		if ((tipus == DIRECTOR) || (tipus == SUBDIRECTOR) || (tipus == BASE)) {
			//Si el tipus és vàlid, l'assignem
			tipusTreballador = tipus;
			
		} else {
			//Si el tipus no és vàlid, creem excepció
			throw new Exception("Tipus de treballador no vàlid");
		}
	}
	
	int getTipusTreballador() {
		return tipusTreballador;
	}
	
}

package com.alumne.treballadors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreballadorsTest {

	@Test
	public void testNomTreballadorIncorrecte() {
		//Aquest test prova si el programa detecta que volem assignar un nom
		//incorrecte i llença l'excepció que toca
		//Noteu que per als objectes individuals de la classe Treballador i
		// Exception podem triar els noms que ens done la gana,
		// no cal fer-los coincidir amb els de les classes
		Treballador treballadorMeu = new Treballador();
		//Codi per a provocar excepcions, modificat a partir de 'exemple de la calculadora
		Exception excepcioMeva = assertThrows(Exception.class, () -> treballadorMeu.setNom(""));
		//L'assercio mira si el text de l'excepcio avisa del problema de nom curt
		assertEquals("El nom ha de tenir 3 o més caràcters", excepcioMeva.getMessage());
	}

	@Test
	public void testNomTreballadorCorrecte() {
		String nomTest = "Emilio";
		Treballador treballador = new Treballador();
		// Assignem un nom, com el metode setNom pot produir excepcions ha d'anar en un
		// bloc try catch
		// A diferencia del cas anterior, aquí no estem provocant l'excepció a propòsit,
		// sino que és el tractament
		// habitual de les excepcions, ja ho veureu en M3
		try {
			treballador.setNom(nomTest);
		} catch (Exception e) {
			// Si es produeix una excepcio, el bloc catch la captura i mostra per pantalla,
			// aixi el programa no peta
			System.out.println(e.getMessage());
		}
		;
		// L'assercio comprova que el nom és correcte i en cas contrari mostraria el
		// missatge d'error
		assertEquals(nomTest, treballador.getNom(), "Els noms han de coincidir!!!");
	}

	@Test
	public void testNomina() {
		float nomina = 2300;
		Treballador treballador = new Treballador();
		// Assignem una nomina, com aquest mètode no provoca excepcions no necessitem el
		// bloc try-catch
		treballador.setNomina(nomina);
		// L'asserció comprova que la nomina és correcta i en cas contrari mostra
		// missatge d'error
		assertEquals(nomina, treballador.getNomina(), "Els dos valors de la nomina han de coincidir!!!");
	}

	@Test
	public void testHoresExtres() {
		int hores = 8;
		Treballador treballador = new Treballador();
		// Assignem un número d'hores extres i fem un constructor de Treballador
		treballador.setHoresExtres(hores);
		// Comprovem amb l'asserció que les hores extres són les indicades i en cas contrari mostra missatge d'error
		assertEquals(hores, treballador.getHoresExtres(), "Els dos valors de les hores extres han de coincidir");
	}

	@Test
	public void testTipusTreballadorIncorrecte() {
		int treballador_incorrecte = 3;
		Treballador treballador = new Treballador();
		// Assignem un número de treballador incorrecte i fem un constructor de treballador
		Exception excepcioMeva = assertThrows(Exception.class, () -> treballador.setTipusTreballador(treballador_incorrecte));
		// Creem una excepció i li assignem el que retorna l'excepció de setTipusTreballador
		// i la comparem amb l'String del que hauria de retornar
		assertEquals("Tipus de treballador no vàlid", excepcioMeva.getMessage());
	}

	@Test
	public void testTipusTreballadorCorrecte() {
		int treballador_correcte = 0;
		Treballador treballador = new Treballador();
		// Assignem un número de treballador correcte i fem un constructor de treballador
		// Fem un trycatch per a provar si setTipusTreballador ens dóna o no una excepció
		// i en cas que ens doni mostrar el missatge d'error
		try {
			treballador.setTipusTreballador(treballador_correcte);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		};
		//Comparem el treballador correcte i el resultat del mètode getTipusTreballador
		// i en cas de que no coincideixin mostrem el nostre missatge
		assertEquals(treballador_correcte, treballador.getTipusTreballador(), "Els dos números de treballador han de coincidir");
	}
}
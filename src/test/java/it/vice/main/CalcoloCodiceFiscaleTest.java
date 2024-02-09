package it.vice.main;

import java.io.IOException;

import org.junit.Test;

import it.vice.model.Persona;

public class CalcoloCodiceFiscaleTest {

	@Test
	public void mainTest () {
		String cognome = "barbarino";
		String nome = "irene";
		String annoNascita = "1989";
		String meseNascita = "7";
		String giornoNascita = "7";
		String sesso = "7";
		String comuneNascita = "Avellino";
		Persona persona = new Persona(cognome, nome, comuneNascita, sesso, giornoNascita, meseNascita, annoNascita);
	
		try {
			Main.main(persona);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void switchRestoToLetteraDiControllo () {
		
		for (int i = 0; i < 26; i++) {
			ConstantsUtility.switchRestoToLetteraDiControllo(i);
			
		}
	}

	@Test
	public void personaModel () {
		
		Persona persona = new Persona();
		persona.setCognome("MANDATO");
		persona.setNome("BENITO");
		persona.setAnnoNascita("1997");
		persona.setMeseNascita("01");
		persona.setGiornoNascita("28");
		persona.setSesso("M");
		persona.setComuneNascita("MADDALONI");
		
	}
	
}

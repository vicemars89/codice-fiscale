package it.vice.main;

import java.io.IOException;

import org.junit.Test;

import it.vice.model.Persona;

public class CalcoloCodiceFiscaleTest {

	@Test
	public void mainTest () {
		String cognome = "romanelli";
		String nome = "vincenzo";
		String annoNascita = "1989";
		String meseNascita = "6";
		String giornoNascita = "23";
		String sesso = "M";
		String comuneNascita = "ivrea";
		String[] persona = {cognome, nome, comuneNascita, sesso, giornoNascita, meseNascita, annoNascita};
		
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
		persona.setCognome("romanelli");
		persona.setNome("vincenzo");
		persona.setAnnoNascita("1989");
		persona.setMeseNascita("6");
		persona.setGiornoNascita("23");
		persona.setSesso("M");
		persona.setComuneNascita("ivrea");
		
	}
	
}

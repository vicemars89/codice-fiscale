package it.vice.main;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import it.vice.model.Persona;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws IOException {

		Persona persona = new Persona();
		String codiceFiscale = "";
		
		try {
			JFrame frame = new JFrame("Calcolo Codice Fiscale");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300,300);
			
			persona.setCognome(JOptionPane.showInputDialog("Inserisci il Cognome: "));
			persona.setNome(JOptionPane.showInputDialog("Inserisci il Nome: "));
			persona.setSesso(JOptionPane.showInputDialog("Inserisci il Sesso (M o F): "));
			persona.setComuneNascita(JOptionPane.showInputDialog("Inserisci il Comune di Nascita: "));
			persona.setGiornoNascita(JOptionPane.showInputDialog("Inserisci il Giorno di Nascita: "));
			persona.setMeseNascita(JOptionPane.showInputDialog("Inserisci il Mese di Nascita: "));
			persona.setAnnoNascita(JOptionPane.showInputDialog("Inserisci l'Anno di Nascita: "));

			codiceFiscale = codiceFiscale.concat(CalcoloCodiceFiscale.calcoloCognome(persona.getCognome()));
			codiceFiscale = codiceFiscale.concat(CalcoloCodiceFiscale.calcoloNome(persona.getNome()));
			codiceFiscale = codiceFiscale.concat(CalcoloCodiceFiscale.calcoloAnno(persona.getAnnoNascita()));
			codiceFiscale = codiceFiscale.concat(CalcoloCodiceFiscale.calcoloMese(persona.getMeseNascita()));
			codiceFiscale = codiceFiscale.concat(CalcoloCodiceFiscale.calcoloGiorno(persona.getGiornoNascita(), persona.getSesso()));
			codiceFiscale = codiceFiscale.concat(CalcoloCodiceFiscale.calcoloComune(persona.getComuneNascita()));
			codiceFiscale = codiceFiscale.concat(CalcoloCodiceFiscale.calcoloLetteraDiControllo(codiceFiscale));
			
			logger.debug("chiamo jframe finale");
			
			JFrame f = new JFrame("CODICE FISCALE CALCOLATO");
			
		    JTextField t1;
		    if(codiceFiscale.length() != 16) {
		    	t1 = new JTextField("Errore nella compilazione dei campi !!!");
			    t1.setBounds(50,100, 250,30);  
		    }else {
		    	t1 = new JTextField(codiceFiscale);
			    t1.setBounds(50,100, 200,30);  
		    }
		    
		    f.add(t1);
		    f.setSize(350,350);  
		    f.setLayout(null);  
		    f.setVisible(true); 
		    
		} catch (Exception e) {
			logger.debug("errore " + e.getMessage());
		}
	}

}
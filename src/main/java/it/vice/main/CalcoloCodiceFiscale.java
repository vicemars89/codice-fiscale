package it.vice.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.apache.log4j.Logger;

public class CalcoloCodiceFiscale {

	
	private static final Logger logger = Logger.getLogger(CalcoloCodiceFiscale.class);
	
	
	public static String calcoloCognome(String cognomePersona) {
		
		logger.debug("calcoloCognome()...");
		String[] arrayCognome = cognomePersona.split("");
		String toReturn = "";
		if(arrayCognome.length > 3) {
			for (String lettera : arrayCognome) {
				if(toReturn.length() < 3 && !lettera.equalsIgnoreCase("a")
						&& !lettera.equalsIgnoreCase("e")
						&& !lettera.equalsIgnoreCase("i")
						&& !lettera.equalsIgnoreCase("o")
						&& !lettera.equalsIgnoreCase("u"))
				{
					toReturn = toReturn.concat(lettera);
				}
			}
		}
		
		return toReturn.toUpperCase();
	}
	
	public static String calcoloNome(String nomePersona) {
		
		logger.debug("calcoloNome()...");
		String[] arrayNome = nomePersona.split("");
		String[] consonanti = calcoloConsonanti(arrayNome).split("");
		String toReturn = "";
		int count = 1;
		if(arrayNome.length > 3) {
			for (String lettera : consonanti) {
				if(toReturn.length() < 3 && (count == 1 || count == 3 || count == 4 ) && !lettera.equalsIgnoreCase("a")
						&& !lettera.equalsIgnoreCase("e")
						&& !lettera.equalsIgnoreCase("i")
						&& !lettera.equalsIgnoreCase("o")
						&& !lettera.equalsIgnoreCase("u"))
				{
					toReturn = toReturn.concat(lettera);
				}
				count++;
			}
		}
		
		return toReturn.toUpperCase();
	}
	
	public static String calcoloAnno(String annoNascita) {
		
		logger.debug("calcoloAnno()...");
		return !annoNascita.equals("") ? annoNascita.substring(annoNascita.length()-2, annoNascita.length()) : "";
	}
	
	public static String calcoloMese(String meseNascita) {
		
		logger.debug("calcoloMese()...");
		return !meseNascita.equals("") ? ConstantsUtility.letteraMese[Integer.valueOf(meseNascita)] : "";
	}
	
	public static String calcoloGiorno(String giornoNascita, String sesso) {
		
		logger.debug("calcoloGiorno()...");
		if(sesso.equalsIgnoreCase("M")) {
			logger.debug("Maschio...");
			if(giornoNascita.length() == 2) {
				return giornoNascita;
			}
			else {
				return "0".concat(giornoNascita);
			}
		}
		else {
			logger.debug("Femmina...");
			return !giornoNascita.equals("") ? String.valueOf(Integer.valueOf(giornoNascita) + 40) : "";	
		}
		
	}
	
	public static String calcoloComune(String comuneNascita) throws IOException {
		
		logger.debug("calcoloComune()...");
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("comuni.txt");
		InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
		BufferedReader reader = new BufferedReader(streamReader);
		String codiceComune = "";
		
		try {
		    String riga;
		    while ((riga = reader.readLine()) != null) {
		       String comune[] = riga.split("\t");
		       if(comuneNascita.equalsIgnoreCase(comune[0])) {
		    	   codiceComune = comune[1];
		       }
		    }
		    return codiceComune;
		} finally {
			reader.close();
		}
	}
	
	public static String calcoloLetteraDiControllo(String codiceFiscale) {
		
		logger.debug("calcoloLetteraDiControllo()...");
		String cognomeNomeArray[] = codiceFiscale.split("");
		int sommaPari = 0;
		int sommaDispari = 0;
		int resto = 0;
		
		for (int i = 0; i < cognomeNomeArray.length ; i++) {
			if(i % 2 != 0) {
				for (int j = 0; j < ConstantsUtility.valoriPari.length; j++ ) {
					String[] valoreEnum = ConstantsUtility.valoriPari[j].split(",");
					if(cognomeNomeArray[i].equalsIgnoreCase(valoreEnum[0])) {
						sommaPari = sommaPari + Integer.valueOf(valoreEnum[1]);
						break;
					}
				}
			}else {
				for (int j = 0; j < ConstantsUtility.valoriDispari.length; j++ ) {
					String[] valoreEnum = ConstantsUtility.valoriDispari[j].split(",");
					if(cognomeNomeArray[i].equalsIgnoreCase(valoreEnum[0])) {
						sommaDispari = sommaDispari + Integer.valueOf(valoreEnum[1]);
						break;
					}
				}
			}
		}
		
		resto = (sommaPari + sommaDispari)/26;
		int numero = (resto * 26) - (sommaPari + sommaDispari);
		String letteraDiControllo = ConstantsUtility.switchRestoToLetteraDiControllo(numero * (-1));
		
		return letteraDiControllo.toUpperCase();
	}
	
	public static String calcoloConsonanti(String[] nome) {
		
		logger.debug("calcoloConsonanti()...");
		String consonantiNome = "";
		for (String lettera : nome) {
			if(!lettera.equalsIgnoreCase("a")
						&& !lettera.equalsIgnoreCase("e")
						&& !lettera.equalsIgnoreCase("i")
						&& !lettera.equalsIgnoreCase("o")
						&& !lettera.equalsIgnoreCase("u")) {
				consonantiNome = consonantiNome.concat(lettera);
			}
		}
		return consonantiNome;
	}
}

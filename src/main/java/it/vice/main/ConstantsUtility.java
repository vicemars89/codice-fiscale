package it.vice.main;

public class ConstantsUtility {
	
	public static String[] letteraMese = {"","A","B","C","D","E","H","L","M","P","R","S","T"};
	public static String[] valoriPari = {"0,0","1,1","2,2","3,3","4,4","5,5","6,6","7,7","8,8","9,9","A,0","B,1","C,2","D,3","E,4","F,5","G,6"
			,"H,7","I,8","J,9","K,10","L,11","M,12","N,13","O,14"
			,"P,15","Q,16","R,17","S,18","T,19","U,20","V,21","W,22"
			,"X,23","Y,24","Z,25"};
	public static String[] valoriDispari = {"0,1","1,0","2,5","3,7","4,9","5,13","6,15","7,17","8,19","9,21","A,1","B,0","C,5","D,7","E,9","F,13","G,15"
			,"H,17","I,19","J,21","K,2","L,4","M,18","N,20","O,11"
			,"P,3","Q,6","R,8","S,12","T,14","U,16","V,10","W,22"
			,"X,25","Y,24","Z,23"};
	
	public static String switchRestoToLetteraDiControllo(int numero) {
		String letteraDiControllo = "";
		
		switch (numero) {
		case 0:
			letteraDiControllo = "A";
			break;
		case 1:
			letteraDiControllo = "B";
			break;
		case 2:
			letteraDiControllo = "C";
			break;
		case 3:
			letteraDiControllo = "D";
			break;
		case 4:
			letteraDiControllo = "E";
			break;
		case 5:
			letteraDiControllo = "F";
			break;
		case 6:
			letteraDiControllo = "G";
			break;
		case 7:
			letteraDiControllo = "H";
			break;
		case 8:
			letteraDiControllo = "I";
			break;
		case 9:
			letteraDiControllo = "J";
			break;
		case 10:
			letteraDiControllo = "K";
			break;
		case 11:
			letteraDiControllo = "L";
			break;
		case 12:
			letteraDiControllo = "M";
			break;
		case 13:
			letteraDiControllo = "N";
			break;
		case 14:
			letteraDiControllo = "O";
			break;
		case 15:
			letteraDiControllo = "P";
			break;
		case 16:
			letteraDiControllo = "Q";
			break;
		case 17:
			letteraDiControllo = "R";
			break;
		case 18:
			letteraDiControllo = "S";
			break;
		case 19:
			letteraDiControllo = "T";
			break;
		case 20:
			letteraDiControllo = "U";
			break;
		case 21:
			letteraDiControllo = "V";
			break;
		case 22:
			letteraDiControllo = "W";
			break;
		case 23:
			letteraDiControllo = "X";
			break;
		case 24:
			letteraDiControllo = "Y";
			break;
		case 25:
			letteraDiControllo = "Z";
			break;

		default:
			break;
		}
		return letteraDiControllo;
		
	}
	
}

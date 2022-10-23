package it.vice.model;

public class Persona {

	private String cognome;
	private String nome;
	private String comuneNascita;
	private String sesso;
	private String giornoNascita;
	private String meseNascita;
	private String annoNascita;
	
	public Persona(String cognome, String nome, String comuneNascita, String sesso, String giornoNascita,
			String meseNascita, String annoNascita) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.comuneNascita = comuneNascita;
		this.sesso = sesso;
		this.giornoNascita = giornoNascita;
		this.meseNascita = meseNascita;
		this.annoNascita = annoNascita;
	}
	
	public Persona() {
		super();
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComuneNascita() {
		return comuneNascita;
	}
	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public String getGiornoNascita() {
		return giornoNascita;
	}
	public void setGiornoNascita(String giornoNascita) {
		this.giornoNascita = giornoNascita;
	}
	public String getMeseNascita() {
		return meseNascita;
	}
	public void setMeseNascita(String meseNascita) {
		this.meseNascita = meseNascita;
	}
	public String getAnnoNascita() {
		return annoNascita;
	}
	public void setAnnoNascita(String annoNascita) {
		this.annoNascita = annoNascita;
	}
	
	
	
}

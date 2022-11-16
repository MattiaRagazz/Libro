package com.itsdigitalacademy.corsocyber.scaffale.beans;

public class Libro{
	
	private String codiceSocieta;
	private String Societa;
	private String isbn;
	private String checkDigit;
	private String edizione;
	private String autore;
	private String titolo;
	private String tipo;
	private String descrizioneTipo;
	private String dataMagazzino;
	private String dataVendita;

	public void setCodiceSocieta(String newVal){
		this.codiceSocieta=newVal;
	}

	public String getCodiceSocieta(){
		return this.codiceSocieta;
	}
	public void setSocieta(String newVal) {
		this.codiceSocieta=newVal;
	}
	public String getSocieta() {
		return this.Societa;
	}
	public void setIsbn(String newVal) {
		this.isbn=newVal;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public void setCheckDigit(String newVal) {
		this.checkDigit=newVal;
	}
	public String getCheckDigit() {
		return this.checkDigit;
	}
	public void setEdizione(String newVal){
		this.edizione=newVal;
	}

	public String getEdizione(){
		return this.edizione;
	}
	public void setAutore(String newVal) {
		this.autore=newVal;
	}
	public String getAutore() {
		return this.autore;
	}
	public void setTitolo(String newVal) {
		this.titolo= newVal;
	}
	public String getTitolo() {
		return this.titolo;
	}
	public void setTipo(String newVal){
		this.tipo=newVal;
	}

	public String getTipo(){
		return this.tipo;
	}
	public void setDescrizioneTipo(String newVal){
		this.descrizioneTipo=newVal;
	}

	public String getDescrizioneTipo(){
		return this.descrizioneTipo;
	}
	public void setDataMagazzino(String newVal){
		this.descrizioneTipo=newVal;
	}

	public String getDataMagazzino(){
		return this.dataMagazzino;
	}
	public void setDataVendita(String newVal){
		this.descrizioneTipo=newVal;
	}

	public String getdataVendita(){
		return this.dataVendita;
	}
	public String toString(){
		return codiceSocieta+Societa+isbn+checkDigit+edizione+autore+titolo+tipo+descrizioneTipo+
				dataMagazzino+dataVendita;
	}
	}
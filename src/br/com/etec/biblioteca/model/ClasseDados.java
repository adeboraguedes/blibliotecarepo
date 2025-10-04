package br.com.etec.biblioteca.model;

public class ClasseDados {

	
	//atributos 
	String tituloAt;
	String autorAt;
	int paginasAt;
	
	//construtor:
	public  ClasseDados(String title, String author ,int pages ) {
		this.tituloAt = title;
		this.autorAt= author;
		this.paginasAt = pages;
		
	}
	//getters (pegar)
	public String getTitulo() {
		return tituloAt;
	}
	public String getautoraAt() {
		return autorAt;
	}
	public int getPaginas() {
		return paginasAt;
	}
	//setters 
	public void setTitulo(String titulo) {
		this.tituloAt = titulo;
	}
	public void setautor(String author) {
		this.autorAt = author;
	}
	public void setPaginas(int pages) {
		this.paginasAt = pages;
	}
}

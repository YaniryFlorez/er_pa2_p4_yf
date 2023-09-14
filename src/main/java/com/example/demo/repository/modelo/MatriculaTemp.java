package com.example.demo.repository.modelo;

public class MatriculaTemp {

	private String codigo;
	private String cedula;
	
	
	
	//set y GET
	
	public MatriculaTemp() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public MatriculaTemp(String codigo, String cedula) {
		super();
		this.codigo = codigo;
		this.cedula = cedula;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}

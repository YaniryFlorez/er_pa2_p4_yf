package com.example.demo.repository.modelo.DTO;

public class MatriculaDTO {

	private String cedula;
	private String apellido;
	private String nombre;
	private String codigo;
	private String fechaMatricula;
	
	public MatriculaDTO() {
		
		// TODO Auto-generated constructor stub
	}

	public MatriculaDTO(String cedula, String nombre, String apellido, String codigo, String fechaMatricula) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
		this.fechaMatricula = fechaMatricula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	
	
	
	
}

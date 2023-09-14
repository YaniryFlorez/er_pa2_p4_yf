package com.example.demo.service;

public class MateriaService {

//	public void MateriTemporal(MatriTemp matriTemp) {
//		Materia mat1=this.materiaRepository.buscarPorCodigo(matriTemp.getCodigo1());
//		Materia mat2=this.materiaRepository.buscarPorCodigo(matriTemp.getCodigo2());
//		Materia mat3=this.materiaRepository.buscarPorCodigo(matriTemp.getCodigo3());
//		Materia mat4=this.materiaRepository.buscarPorCodigo(matriTemp.getCodigo4());
//		
//		List<Materia> listMate= new ArrayList<>();
//		List<Materia> MateriasProcesar = Arrays.asList(mat1,mat2,mat3,mat4);
//		MateriasProcesar.parallelStream().forEach(Materia->{
//			Estudiante estu=this.estudianteRepository.buscarPorCedula(matriTemp.getCedula());
//			Thread hilo = Thread.currentThread();
//			
//			Matricula matri= new Matricula();
//			matri.setEstudiante(estu);
//			matri.setFechaMatricula(LocalDate.now());
//			matri.setNombreHilo(hilo.toString());
//			matri.setMateria(Materia);
//			this.matriculaRepository.insertar(matri);
//			//aqui se agrega el objeto materia a la lista
//			listMate.add(Materia);
//		});
//	}
}

package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>(); // o endereço de memoria não muda
	
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCursos(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
		
	
	}

	Curso obterCursoPorNome(String nome) {
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}



}

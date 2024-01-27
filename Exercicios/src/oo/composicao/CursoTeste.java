package oo.composicao;

public class CursoTeste {

	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Bruno");
		Aluno aluno2 = new Aluno("Bruno");
		Aluno aluno3 = new Aluno("Bruno");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Java completo");
		Curso curso3 = new Curso("Java completo");
		
		
		aluno1.adicionarCursos(curso3);
		aluno2.adicionarCursos(curso3);
		aluno3.adicionarCursos(curso3);
	
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		
		curso2.adicionarAlunos(aluno2);
	
		
		
		
		
	}
	
}

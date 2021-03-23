package br.com.gama.modelo;

public class Turma {

	private String sigla;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", periodo=" + periodo + ", curso=" + curso + ", aluno=" + aluno
				+ ", professor=" + professor + "]";
	}
	public Turma(String sigla, String periodo, Curso curso, Aluno aluno, Professor professor) {
		super();
		this.sigla = sigla;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}
	public Turma() {
		super();
	}
	
	
	
	
	
}

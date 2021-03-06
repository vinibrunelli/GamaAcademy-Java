package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;
import br.com.gama.util.Magica;

public class TesteTurma2 {
	
 

	public static void main(String[] args) {
		Turma turma = new Turma (
		
				Magica.s("Sigla do Curso"),
		"Vespertino",
		new Curso(),
		new Aluno(
				"Rodrigo",
				2000988,
				"rodrigo@rodrigo",
				"24511325",
				new Endereco(
				"Rua erva imperial",
				"149",
				"Ap84",
				"Vila Alpina",
				"Sao Paulo",
				"sp",
				"03244-030"
				)
				),
		new Professor(
				"Humberto",
				"Exatas",
				"TI",
				new Endereco(
						"rua dois",
						"10",
						"Frente",
						"Continental",
						"Guarulhos",
						"SP",
						"03200-001"))
				
				);
		
		System.out.println(turma.toString());
	}
}

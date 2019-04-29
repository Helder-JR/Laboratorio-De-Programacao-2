package lab4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Representação de um sistema que controla os alunos em um controle acadêmico, possuindo coleções
 * de alunos e de perguntas respondidas por estes, além de métodos responsáveis pelo gerenciamento
 * e exibição de tais elementos.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class ControleDeALunos
{
	private HashMap<String, Aluno> alunos;
	private ArrayList<String> alunosQueResponderam;
	
	/**
	 * Cria um controle de alunos.
	 */
	public ControleDeALunos()
	{
		this.alunos = new HashMap<>();
		this.alunosQueResponderam = new ArrayList<>();
	}
	
	/**
	 * Cadastra um aluno no mapa de alunos.
	 * 
	 * @param matricula a matricula do aluno que será cadastrado.
	 * @param nome o nome do aluno que será cadastrado.
	 * @param curso o curso do aluno que será cadastrado.
	 * @return um booleano {@code true} caso o aluno seja cadastrado e {@code false} caso contrario.
	 * @since 1.0
	 */
	public boolean cadastrarAluno(String matricula, String nome, String curso)
	{
		Excecao.testarEntrada(matricula);
		Excecao.testarEntrada(nome);
		Excecao.testarEntrada(curso);
		
		if (this.alunos.containsKey(matricula))
			return false;
		else
		{
			Aluno aluno = new Aluno(matricula, nome, curso);
			this.alunos.put(matricula, aluno);
			return true;
		}
	}
	
	public Aluno consultarAluno(String matricula)
	{
		Excecao.testarEntrada(matricula);
		
		return this.alunos.get(matricula);
	}
}

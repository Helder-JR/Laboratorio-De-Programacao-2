package lab4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Representação de um sistema de controle acadêmico de alunos, possuindo coleções de alunos e de
 * perguntas respondidas por estes, além de métodos responsáveis pelo gerenciamento e exibição de
 * tais elementos.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.2
 */
public class ControleAcademico
{
	/**
	 * HashMap que irá armazenar os alunos, inserindo-os através da sua matrícula.
	 */
	private HashMap<String, Aluno> mapaDeAlunos;
	
	/**
	 * Mapa que contém os grupos de estudo, sendo suas chaves os temas de cada grupo (em minúsculo).
	 */
	private HashMap<String, Grupo> mapaDeGrupos;
	
	/**
	 * ArrayList que irá armazenar os alunos que responderam questões.
	 */
	private ArrayList<Aluno> alunosQueResponderamQuestoes;
	
	/**
	 * Cria um controle de alunos.
	 */
	public ControleAcademico()
	{
		this.mapaDeAlunos = new HashMap<>();
		this.alunosQueResponderamQuestoes = new ArrayList<>();
		this.mapaDeGrupos = new HashMap<>();
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
		
		if (this.mapaDeAlunos.containsKey(matricula))
			return false;
		else
		{
			Aluno aluno = new Aluno(matricula, nome, curso);
			this.mapaDeAlunos.put(matricula, aluno);
			return true;
		}
	}
	
	/**
	 * Verifica no mapa de alunos a existência de um indivídio, e retorna uma referência para esse
	 * aluno, caso esteja alocado, ou {@code null} caso contrário.
	 * 
	 * @param matricula a matrícula referente ao aluno que será consultado.
	 * @return o aluno referente a matrícula passada como parâmetro.
	 * @since 1.0
	 */
	public Aluno consultarAluno(String matricula)
	{
		Excecao.testarEntrada(matricula);
		
		return this.mapaDeAlunos.get(matricula);
	}
	
	/**
	 * Verifica a existência de um aluno em um mapa de alunos.
	 * 
	 * @param matricula a matrícula do aluno a ser verificada.
	 * @return um booleano {@code true} caso o aluno exista no mapa ou {@code false} caso contrário.
	 * @since 1.2
	 */
	public boolean contemAluno(String matricula)
	{
		Excecao.testarEntrada(matricula);
		
		return this.mapaDeAlunos.containsKey(matricula);
	}
	
	/**
	 * Verifica a existência de um grupo em um mapa de grupos de estudo.
	 * 
	 * @param tema o tema do grupo a ser verificada.
	 * @return um booleano {@code true} caso o grupo exista no mapa ou {@code false} caso contrário.
	 * @since 1.2
	 */
	public boolean contemGrupo(String tema)
	{
		Excecao.testarEntrada(tema);
		
		return this.mapaDeGrupos.containsKey(tema.toLowerCase());
	}
	
	/**
	 * Cadastra um grupo no mapa de grupos de estudo.
	 * 
	 * @param tema o tema do grupo que será cadastrado.
	 * @return um booleano {@code true} caso o grupo seja cadastrado e {@code false} caso contrário.
	 * @since 1.0
	 */
	public boolean cadastrarGrupo(String tema)
	{
		Excecao.testarEntrada(tema);
		
		if (this.mapaDeGrupos.containsKey(tema.toLowerCase()))
			return false;
		else
		{
			Grupo grupo = new Grupo(tema);
			this.mapaDeGrupos.put(tema.toLowerCase(), grupo);
			return true;
		}
	}
	
	/**
	 * Aloca um aluno em um grupo de estudos. 
	 * 
	 * @param matricula a matrícula referente ao aluno que será alocado.
	 * @param tema o tema referente ao grupo que irá alocar o aluno.
	 * @return um booleano {@code true} caso o aluno seja ou já esteja alocado no grupo e
	 * {@code false} caso contrário. 
	 * @since 1.0
	 */
	public boolean alocarAlunoEmGrupo(String matricula, String tema)
	{
		Excecao.testarEntrada(matricula);
		Excecao.testarEntrada(tema);
		
		if (!this.mapaDeGrupos.containsKey(tema.toLowerCase()))
			return false;
		
		if (!this.mapaDeAlunos.containsKey(matricula))
			return false;
		
		Grupo grupo = this.mapaDeGrupos.get(tema.toLowerCase());
		Aluno aluno = this.mapaDeAlunos.get(matricula);
		
		if (grupo.contemAluno(aluno))
			return true;
		else
			return grupo.alocarAluno(aluno);
	}
	
	/**
	 * Retorna uma representação de uma lista que contém os alunos participantes de um grupo de
	 * estudo, seguindo o modelo:
	 * </br>
	 * </br>"Alunos do grupo X"
	 * </br>"* Matrícula - Nome - Curso"
	 * 
	 * @param tema o tema referente ao grupo a ser representado.
	 * @return a String que representa a lista de alunos no grupo de estudo.
	 * @since 1.1
	 */
	public String imprimirGrupo(String tema)
	{
		if (this.mapaDeGrupos.containsKey(tema.toLowerCase()))
			return this.mapaDeGrupos.get(tema.toLowerCase()).toString();
		else
			return "Grupo não cadastrado.";
	}
	
	/**
	 * Cadastra um aluno no arranjo de alunos que responderam questões no quadro (caso esse aluno
	 * exista).
	 * 
	 * @param matricula a matrícula referente ao aluno a ser cadastrado.
	 * @return um booleano {@code true} caso esse aluno seja adicionado ao arranjo e {@code false}
	 * caso contrário.
	 * @since 1.0
	 */
	public boolean cadastrarAlunosQueResponderam(String matricula)
	{
		Excecao.testarEntrada(matricula);
		
		if (this.mapaDeAlunos.containsKey(matricula))
		{
			this.alunosQueResponderamQuestoes.add(this.mapaDeAlunos.get(matricula));
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Retorna uma representação de um arranjo de alunos que responderam questões no quadro, 
	 * seguindo o modelo:
	 * </br>
	 * </br>"Alunos:"
	 * </br>"1. Matrícula - Nome - Curso"
	 * </br>
	 * @return a String que representa o arranjo de alunos que responderam questões no quadro. 
	 * @since 1.0
	 */
	public String imprimirAlunosQueResponderamQuestoes()
	{
		String lista = "";
		
		lista += "Alunos:" + System.lineSeparator();
		for (int i = 0; i < this.alunosQueResponderamQuestoes.size(); i++)
			lista += (i + 1) + ". " + this.alunosQueResponderamQuestoes.get(i).toString() + System.lineSeparator();
		
		return lista.trim();
	}
}

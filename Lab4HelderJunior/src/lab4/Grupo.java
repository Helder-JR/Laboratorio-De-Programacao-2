package lab4;

import java.util.HashSet;

/**
 * Representação de um grupo de estudos, que tem por características nome e os alunos que o
 * compõem. Cada grupo é identificado unicamente pelo seu nome.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.1
 */
public class Grupo
{
	private String tema;
	private HashSet<Aluno> alunos;
	
	/**
	 * Cria um grupo de estudos.
	 * 
	 * @param tema o tema do grupo de estudos.
	 * @since 1.0
	 */
	public Grupo(String tema)
	{
		this.tema = tema;
		this.alunos = new HashSet<>();
	}
	
	/**
	 * Retorna o tema do grupo de estudos.
	 * 
	 * @return o tema do grupo de estudos.
	 * @since 1.0
	 */
	public String getTema()
	{
		return this.tema;
	}

	/**
	 * Aloca um aluno em um grupo de estudos e verifica se ele foi alocado.
	 * 
	 * @param aluno o aluno que será inserido no grupo de estudos.
	 * @return um booleano {@code true} caso ele seja alocado com sucesso e {@code false} caso
	 * contrário.
	 * @since 1.0
	 */
	public boolean alocarAluno(Aluno aluno)
	{
		return this.alunos.add(aluno);
	}
	
	/**
	 * Retorna uma representação de uma lista que contém os alunos que participam  do grupo de estudo,
	 * seguindo o modelo:
	 * </br>
	 * </br>"Alunos do grupo X"
	 * </br>"* Matrícula - Nome - Curso"
	 * 
	 * @return a String que representa a lista de alunos no grupo de estudo.
	 * @since 1.1
	 */
	@Override
	public String toString()
	{
		String lista = "";
		
		lista += "Alunos do grupo " + this.tema + System.lineSeparator();
		for (Aluno aluno : this.alunos)
			lista += "* " + aluno + System.lineSeparator();
		
		return lista.trim();
	}
	
	/**
	 * Calcula o hashCode de um grupo de estudos com base apenas no seu tema.
	 * 
	 * @return o hashCode de um grupo de estudos.
	 * @since 1.0
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		
		result = prime * result + this.tema.hashCode();
		
		return result;
	}

	/**
	 * Compara a igualdade entre um grupo de estudos e outro objeto, usando o tema como fator de
	 * comparação.
	 * 
	 * @return um booleano {@code true} caso os objetos sejam iguais e {@code false} caso contrário.
	 * @since 1.0
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Grupo other = (Grupo) obj;
		
		if (!this.tema.equals(other.tema))
			return false;
		
		return true;
	}
}

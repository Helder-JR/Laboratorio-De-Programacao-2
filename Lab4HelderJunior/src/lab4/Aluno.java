package lab4;

/**
 * Representação de um aluno, que possui como atributos nome, curso e matrícula. Cada aluno é
 * identificado unicamente pela sua matrícula.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.1
 */
public class Aluno
{
	/**
	 * A matrícula do aluno.
	 */
	String matricula;
	
	/**
	 * O nome do aluno.
	 */
	String nome;
	
	/**
	 * O nome do curso.
	 */
	String curso;
	
	/**
	 * Cria um aluno a partir da matrícula, nome e curso.
	 * 
	 * @param matricula a matrícula do aluno.
	 * @param nome o nome do aluno.
	 * @param curso o curso do aluno.
	 * @since 1.0
	 * @version 1.0
	 */
	public Aluno(String matricula, String nome, String curso)
	{
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	/**
	 * Retorna a matrícula do aluno.
	 * 
	 * @return a matrícula do aluno.
	 * @since 1.0
	 * @version 1.0
	 */
	public String getMatricula()
	{
		return this.matricula;
	}

	/**
	 * Exibe uma representação de um aluno, sequindo o formato "Matrícula - Nome - Curso".
	 * 
	 * @return a String que representa o aluno.
	 * @since 1.0
	 * @version 1.0
	 */
	@Override
	public String toString()
	{
		return String.format("%s - %s - %s", this.matricula, this.nome, this.curso);
	}
	
	/**
	 * Calcula o hashCode de um aluno, baseando-se apenas na matrícula.
	 * 
	 * @return o hashCode de um aluno.
	 * @since 1.0
	 * @version 1.0
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		
		return result;
	}

	/**
	 * Compara a igualdade entre um aluno e outros objetos, baseando-se apenas na matrícula.
	 * 
	 * @return um booleano {@code true} caso o aluno seja igual ao objeto comparado e {@code false}
	 * caso contrário.
	 * @since 1.0
	 * @version 1.0
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
		
		Aluno other = (Aluno) obj;
		
		if (this.matricula == null)
			if (other.matricula != null)
				return false;
		else if (!this.matricula.equals(other.matricula))
			return false;
		
		return true;
	}
	
	
}

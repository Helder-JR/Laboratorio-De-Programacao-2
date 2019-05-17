package lab3;

/**
 * Representação de um contato, contendo informações de nome, sobrenome e
 * telefone. Há a possibilidade de saber o nome e sobrenome do contato e
 * imprimir uma representação também com o telefone.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.1
 */
public class Contato
{
	/**
	 * O nome do contato.
	 */
	private String nome;
	
	/**
	 * O sobrenome do contato.
	 */
	private String sobrenome;
	
	/**
	 * O telefone do contato, no formato {@code String}.
	 */
	private String telefone;
	
	/**
	 * Constrói um contato a partir de seu nome, sobrenome e telefone. Caso
	 * algum dos argumentos seja nulo ou inválido serão lançadas exceções.
	 * 
	 * @param nome o nome do contato.
	 * @param sobrenome o sobrenome do contato.
	 * @param telefone o telefone do contato.
	 * @throws NullPointerException quando o nome, sobrenome ou telefone são
	 * nulos.
	 * @throws IllegalArgumentException quando o nome, sobrenome ou telefone
	 * são inválidos.
	 * @since 1.0
	 */
	public Contato(String nome, String sobrenome, String telefone)
	{
		if (nome == null)
			throw new NullPointerException("NOME NULO!");
		else if (nome.equals("") || nome.trim().isEmpty())
			throw new IllegalArgumentException("NOME INVÁLIDO!");
		else
			this.nome = nome;
		
		if (sobrenome == null)
			throw new NullPointerException("SOBRENOME NULO!");
		else if (sobrenome.equals("") || sobrenome.trim().isEmpty())
			throw new IllegalArgumentException("SOBRENOME INVÁLIDO");
		else
			this.sobrenome = sobrenome;
		
		if (telefone == null)
			throw new NullPointerException("TELEFONE NULO!");
		else if (telefone.equals("") || telefone.trim().isEmpty())
			throw new IllegalArgumentException("TELEFONE INVÁLIDO!");
		else
			this.telefone = telefone;
	}
	
	/**
	 * Retorna o nome e sobrenome do contato, no formato "Nome Sobrenome".
	 * 
	 * @return o nome e sobrenome do contato.
	 * @since 1.0
	 */
	public String getNomeSobrenome()
	{
		return String.format("%s %s", this.nome, this.sobrenome);
	}
	
	/**
	 * Representação do contato, no formato "Nome Sobrenome - Telefone".
	 * 
	 * @return o nome, sobrenome e telefone do contato.
	 * @since 1.0
	 */
	@Override
	public String toString()
	{
		return String.format("%s %s - %s", this.nome, this.sobrenome, this.telefone);
	}
	
	/**
	 * Método hashCode, baseado nos hashCodes do nome, sobrenome e telefone
	 * do contato.
	 * 
	 * @return o hashCode do objeto.
	 * @since 1.1
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}
	
	/**
	 * Verifica se dois contatos são iguais, com base em seus nomes, sobrenomes
	 * e telefones.
	 * 
	 * @param obj o outro contato que será comparado.
	 * @return um booleano {@code true} caso os contatos sejam iguais, e
	 * {@code false} caso contrário.
	 * 
	 * @since 1.1
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
		Contato other = (Contato) obj;
		if (nome == null)
			if (other.nome != null)
				return false;
		else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null)
			if (other.sobrenome != null)
				return false;
		else if (!sobrenome.equals(other.sobrenome))
			return false;
		
		return true;
	}
}

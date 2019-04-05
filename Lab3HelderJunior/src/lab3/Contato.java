package lab3;

/**
 * Representação de um contato, contendo informações de nome, sobrenome e
 * telefone. Há a possibilidade de saber o nome e sobrenome do contato e
 * imprimir uma representação também com o telefone.
 * 
 * @author Helder Chaves Leite Junior
 * @version 1.0
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
	 * Constrói um contato a partir de seu nome, sobrenome e telefone.
	 * 
	 * @param nome o nome do contato.
	 * @param sobrenome o sobrenome do contato.
	 * @param telefone o telefone do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	/**
	 * Retorna o nome e sobrenome do contato.
	 * 
	 * @return o nome e sobrenome do contato.
	 */
	public String getNomeSobrenome()
	{
		return this.nome + " " + this.sobrenome;
	}
	
	/**
	 * Representação do contato, no formato "NOME SOBRENOME - TELEFONE".
	 * 
	 * @return o nome, sobrenome e telefone do contato.
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
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}
	
	/**
	 * Verifica se dois contatos são iguais, com base em seus nomes, sobrenomes
	 * e telefones.
	 * 
	 * @param obj o outro contato que será comparado.
	 * @return um booleano {@code true} caso os contatos sejam iguais, e
	 * {@code false} caso contrário.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
}

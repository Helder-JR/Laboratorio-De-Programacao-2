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
	 * Getter que retorna o nome do contato, importante para os testes de
	 * unidade.
	 * 
	 * @return o nome do contato.
	 */
	public String getNome()
	{
		return this.nome;
	}
	
	/**
	 * Setter que define o nome do contato, importante para os testes de
	 * unidade.
	 * 
	 * @param nome o nome do contato a ser definido.
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	/**
	 * Getter que retorna o sobrenome do contato, importante para os testes
	 * de unidade.
	 * 
	 * @return o sobrenome do contato.
	 */
	public String getSobrenome()
	{
		return this.sobrenome;
	}
	
	/**
	 * Setter que define o sobrenome do contato, importante para os testes
	 * de unidade.
	 * 
	 * @param sobrenome o sobrenome do contato a ser definido.
	 */
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	
	/**
	 * Getter que retorna o telefone do contato, importante para os testes
	 * de unidade.
	 * 
	 * @return o telefone do contato.
	 */
	public String getTelefone()
	{
		return this.telefone;
	}
	
	/**
	 * Setter que definie o telefone do contato, importante para os testes
	 * de unidade.
	 * 
	 * @param telefone o telefone a ser definido.
	 */
	public void setTelefone(String telefone)
	{
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
		
		return true;
	}
}

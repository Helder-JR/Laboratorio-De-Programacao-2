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
}

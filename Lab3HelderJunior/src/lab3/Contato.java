package lab3;

/**
 * 
 * 
 * @author Helder Chaves Leite Junior
 */
public class Contato
{
	private String nome;
	private String sobrenome;
	private String telefone;
	
	public Contato(String nome, String sobrenome, String telefone)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	public String getNomeCompleto()
	{
		return this.nome + " " + this.sobrenome;
	}
	
	public String toString()
	{
		return String.format("%s %s - %s", this.nome, this.sobrenome, this.telefone);
	}
}

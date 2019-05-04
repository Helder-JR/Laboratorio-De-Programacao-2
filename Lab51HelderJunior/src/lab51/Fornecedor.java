package lab51;

/**
 * Representação de um fornecedor no SAGA. Possui informações referentes ao nome, telefone e e-mail,
 * além de poder alterar tais informações (com exceção do nome).
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class Fornecedor
{
	/**
	 * O nome do fornecedor, utilizado como identificador único.
	 */
	private String nome;
	
	/**
	 * O endereço de e-mail do fornecedor.
	 */
	private String email;
	
	/**
	 * O telefone do fornecedor.
	 */
	private String telefone;
	
	/**
	 * Cria um fornecedor.
	 * 
	 * @param nome o nome que será registrado ao fornecedor.
	 * @param telefone o telefone que será registrado ao fornecedor.
	 * @param email o endereço de e-mail que será registrado ao fornecedor.
	 * @since 1.0
	 */
	public Fornecedor(String nome, String email, String telefone)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	/**
	 * @return a String referente ao nome do fornecedor.
	 * @since 1.0
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * Altera o endereço de e-mail do fornecedor.
	 * 
	 * @param email o e-mail que será registrado ao fornecedor.
	 * @since 1.0
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 * Altera o telefone do fornecedor.
	 * 
	 * @param telefone o telefone que será registrado.
	 * @since 1.0
	 */
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	
	/**
	 * Exibe uma representação textual de um fornecedor, seguindo o modelo:
	 * </br>
	 * "Nome - E-mail - Telefone"
	 * 
	 * @return a representação em String do fornecedor.
	 * @since 1.0
	 */
	@Override
	public String toString()
	{
		return String.format("%s - %s - %s", this.nome, this.email, this.telefone);
	}
	
	/**
	 * Calcula e retorna o hashCode do fornecedor, baseando-se em seu nome.
	 * 
	 * @return o hashCode referente ao fornecedor.
	 * @since 1.0
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((this.nome == null) ? 0 : this.nome.hashCode());
		
		return result;
	}
	
	/**
	 * Verifica a igualdade entre um objeto do tipo Fornecedor e outro objeto, levando em
	 * consideração o nome como fator último de comparação.
	 * 
	 * @return um booleano {@code true} caso o objeto comparado seja igual e {@code false}
	 * caso contrário.
	 * @since 1.0
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Fornecedor other = (Fornecedor) obj;
		
		if (this.nome == null)
		{
			if (other.nome != null)
				return false;
		}
		else if (!this.nome.equals(other.nome))
			return false;
		
		return true;
	}
	
	
}

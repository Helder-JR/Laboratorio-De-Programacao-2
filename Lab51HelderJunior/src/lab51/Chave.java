package lab51;

/**
 * Representação de uma chave a ser utilizada em um mapa de produtos de um fornecedor.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class Chave
{
	/**
	 * O nome do produto a ser inserido na chave.
	 */
	private String nome;
	
	/**
	 * A descrição do produto a ser inserida na chave.
	 */
	private String descricao;
	
	/**
	 * Cria uma chave.
	 * 
	 * @param nome o nome a ser inserido na chave.
	 * @param descricao a descrição a ser inserida na chave.
	 * @since 1.0
	 */
	public Chave(String nome, String descricao)
	{
		this.nome = nome;
		this.descricao = descricao;
	}
	
	/**
	 * Calcula e retorna o hashCode da chave, com base no nome e na descrição.
	 * 
	 * @return o hashCode da chave.
	 * @since 1.0
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((this.descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((this.nome == null) ? 0 : nome.hashCode());
		
		return result;
	}
	
	/**
	 * Compara a igualdade entre um objeto do tipo chave e outro objeto, com base na descrição e no
	 * nome que fazem parte da chave.
	 * 
	 * @return um booleano {@code true} caso o objeto seja igual a chave ou {@code false} caso não.
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
		
		Chave other = (Chave) obj;
		
		if (this.descricao == null)
		{
			if (other.descricao != null)
				return false;
		}
		else if (!this.descricao.equals(other.descricao))
			return false;
		
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

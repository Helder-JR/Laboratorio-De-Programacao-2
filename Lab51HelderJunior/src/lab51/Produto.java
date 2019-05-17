package lab51;

/**
 * Representação de um produto no SAGA, com atributos de nome, descrição e preço, além de métodos
 * que possibilitam alterar o preço do produto, identificá-lo a partir de seu nome ou descrição e
 * exibir uma representação textual do mesmo.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class Produto
{
	/**
	 * O nome do produto a ser comercializado.
	 */
	private String nome;
	
	/**
	 * A descrição do produto a ser comercializado.
	 */
	private String descricao;
	
	/**
	 * O preço pelo qual o produto será comercializado.
	 */
	private Double preco;
	
	/**
	 * Cria um produto.
	 * 
	 * @param nome o nome que o produto irá receber.
	 * @param descricao a descrição que o produto irá receber.
	 * @param preco o preço que o produto irá receber.
	 * @since 1.0
	 */
	public Produto(String nome, String descricao, Double preco)
	{
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	/**
	 * @return o nome do produto.
	 * @since 1.0
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @return a descrição do produto.
	 * @since 1.0
	 */
	public String getDescricao()
	{
		return descricao;
	}

	/**
	 * Altera o preço do produto.
	 * 
	 * @param preco o preço que o produto receberá.
	 * @since 1.0
	 */
	public void setPreco(Double preco)
	{
		this.preco = preco;
	}
	
	/**
	 * Exibe uma representação textual de um produto, seguindo o modelo:
	 * </br>
	 * "Nome - Descrição - Preço"
	 * 
	 * @return a String que representa o produto.
	 * @since 1.0
	 */
	@Override
	public String toString()
	{
		return String.format("%s - %s - R$%.2f", this.nome, this.descricao, this.preco);
	}
	
	/**
	 * Calcula e retorna o hashCode do produto, baseando-se em seu nome e descrição para o cálculo.
	 * 
	 * @return o hashCode do produto.
	 * @since 1.0
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((this.descricao == null) ? 0 : this.descricao.hashCode());
		result = prime * result + ((this.nome == null) ? 0 : this.nome.hashCode());
		
		return result;
	}
	
	/**
	 * Verifica a igualdade entre um objeto do tipo Produto e outro objeto, levando em consideração
	 * o nome e a descrição como fatores últimos de comparação.
	 * 
	 * @param obj o objeto a ser comparado.
	 * @return um booleano {@code true} caso o objeto comparado seja igual ao fornecedor e
	 * caso contrário {@code false}. 
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
		
		Produto other = (Produto) obj;
		
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

package lab52;

import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Representação de um fornecedor no SAGA. Possui informações referentes ao nome, telefone e e-mail,
 * além de poder alterar tais informações (com exceção do nome).
 *
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.1
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
     * Mapa responsável por armazenar os produtos vendidos pelo fornecedor, sendo aceesados através
     * de uma chave que é um objeto que recebe o nome e descrição do produto.
     */
    private HashMap<Chave, Produto> produtos;

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
        this.produtos = new HashMap<>();
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
     * Adiciona um produto no mapa de produtos, utilizando o nome e a descrição do produto como
     * chave.
     *
     * @param nome o nome do produto a ser adicionado.
     * @param descricao a descrição do produto a ser adicionado.
     * @param preco o preço do produto a ser adicionado.
     * @return um booleano {@code true} caso o produto tenha sido adicionado ou {@code false} caso
     * contrário.
     * @since 1.1
     */
    public boolean adicionarProduto(String nome, String descricao, Double preco)
    {
        Chave chave = new Chave(nome, descricao);

        if (this.produtos.containsKey(chave))
            return false;
        else
        {
            Produto produto = new Produto(nome, descricao, preco);
            this.produtos.put(chave, produto);
            return true;
        }

    }

    /**
     * Consulta e retorna um objeto do tipo Produto.
     *
     * @param nome o nome do produto (que também faz parte da chave).
     * @param descricao a descrição do produto (que também faz parte da chave).
     * @return uma referência para o produto consultado.
     * @since 1.1
     */
    public Produto consultarProduto(String nome, String descricao)
    {
        Chave chave = new Chave(nome, descricao);

        return this.produtos.get(chave);
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
     * Exibe uma representação textual dos produtos de um fornecedor, seguindo o modelo:
     * </br>
     * "Nome do Fornecedor - Nome do Produto - Descrição - Preço | Nome do Fornecedor - Nome do..."
     *
     * @return a representação em String dos produtos do fornecedor.
     * @since 1.1
     */
    public String toStringProdutos()
    {
        return this.produtos.values().stream().map(p -> p.toString()).collect(Collectors.joining(" | "));
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

package lab52;

/**
 * Representação de um cliente no SAGA. Possui informações referentes ao CPF, nome, e-mail e
 * localização, além de poder alterar tais informações (exceto o CPF).
 *
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class Cliente
{
    /**
     * O CPF do cliente, utilizado como identificador único.
     */
    private String cpf;

    /**
     * O nome do cliente.
     */
    private String nome;

    /**
     * O endereço de e-mail do cliente.
     */
    private String email;

    /**
     * A localização em que o cliente pode ser encontrado.
     */
    private String localizacao;

    /**
     * Cria um cliente.
     *
     * @param cpf o CPF do cliente.
     * @param nome o nome do cliente.
     * @param email o e-mail do cliente.
     * @param localizacao a localização do cliente.
     * @since 1.0
     */
    public Cliente(String cpf, String nome, String email, String localizacao)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.localizacao = localizacao;
    }

    /**
     * @return a String referente ao CPF do cliente.
     * @since 1.0
     */
    public String getCpf()
    {
        return this.cpf;
    }

    /**
     * Altera o nome do cliente.
     *
     * @param nome o nome que será registrado ao cliente.
     * @since 1.0
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    /**
     * Altera o endereço de e-mail do cliente.
     *
     * @param email o e-mail que será registrado ao cliente.
     * @since 1.0
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Altera a localização do cliente.
     *
     * @param localizacao a localização que será registrada ao cliente.
     * @since 1.0
     */
    public void setLocalizacao(String localizacao)
    {
        this.localizacao = localizacao;
    }

    /**
     * Exibe uma representação textual de um cliente, seguindo o modelo:
     * </br>
     * "Nome - Localização - E-mail"
     *
     * @return a representação em String do cliente.
     * @since 1.0
     */
    @Override
    public String toString()
    {
        return String.format("%s - %s - %s", this.nome, this.localizacao, this.email);
    }

    /**
     * Calcula e retorna o hashCode referente ao cliente, baseando-se apenas no CPF.
     *
     * @return o hashCode referente ao cliente.
     * @since 1.0
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((this.cpf == null) ? 0 : this.cpf.hashCode());

        return result;
    }

    /**
     * Verifica a igualdade entre um objeto do tipo Cliente e outro objeto, tendo como critério
     * último o CPF do cliente.
     *
     * @param obj o objeto a ser comparado.
     * @return um booleano {@code true} caso o cliente seja igual ao objeto comparado e {@code false}
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

        Cliente other = (Cliente) obj;

        if (this.cpf == null)
        {
            if (other.cpf != null)
                return false;
        }
        else if (!this.cpf.equals(other.cpf))
            return false;

        return true;
    }
}

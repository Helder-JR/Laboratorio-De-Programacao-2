package lab52;

import easyaccept.EasyAccept;

/**
 * Representação da fachada do sistema.
 *
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class Facade
{
    public static void main(String[] args)
    {
        args = new String[] {"lab52.Facade", "acceptance_test/use_case_1.txt",
                                             "acceptance_test/use_case_2.txt",
                                             "acceptance_test/use_case_3.txt",
                                             "acceptance_test/use_case_4.txt",
                                             "acceptance_test/use_case_5.txt",
                                             "acceptance_test/use_case_6.txt"};
    }

    public String adicionaCliente(String cpf, String nome, String email, String localizacao)
    {

    }

    public String exibeCliente(String cpf)
    {

    }

    public String exibeClientes()
    {

    }

    public void editaCliente(String cpf, String atributo, String novoValor)
    {

    }

    public void removeCliente(String cpf)
    {

    }

    public String adicionaFornecedor(String nome, String email, String telefone)
    {

    }

    public String exibeFornecedor(String nome)
    {

    }

    public String exibeFornecedores()
    {

    }

    public void editaFornecedor(String nome, String atributo, String novoValor)
    {

    }

    public void removeFornecedor(String nome)
    {

    }

    public String adicionaProduto(String fornecedor, String nome, String descricao, double preco)
    {

    }

    public String exibeProduto(String nome, String descricao, String fornecedor)
    {

    }

    public String exibeProdutosFornecedor(String fornecedor)
    {

    }

    public void editaProduto(String nome, String descricao, String fornecedor, double novoPreco)
    {

    }

    public void removeProduto(String nome, String descricao, String fornecedor)
    {

    }
}

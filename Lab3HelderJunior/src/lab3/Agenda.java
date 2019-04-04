package lab3;

/**
 * Representação de uma agenda de contatos. A agenda é <b>composta</b> de
 * elementos do tipo Contato, sendo responsável por criá-los e manipulá-los
 * (cadastrar, listar e exibir).
 * 
 * @author Helder Junior
 * @version 1.0
 */
public class Agenda
{
	/**
	 * Array de contatos.
	 */
	private Contato[] contato;
	
	/**
	 * Índice referente ao último contato cadastrado. É importante na hora de
	 * listar todos os contatos.
	 */
	private int ultimoCadastro;
	
	/**
	 * Constrói uma agenda com 100 contatos (possui tamanho 101 para facilitar
	 * a indexação).
	 */
	public Agenda()
	{
		contato = new Contato[101];
	}
	
	/**
	 * Cadastra um contato a partir do seu nome, sobrenome, telefone e posição
	 * a ser definida na agenda.
	 * 
	 * @param nome o nome do contato.
	 * @param sobrenome o sobrenome do contato.
	 * @param telefone o telefone do contato.
	 * @param posicao a posição na agenda em que o contato deve ser inserido.
	 * @return um booleano <b>true</b> caso o contato seja cadastrado com
	 * sucesso, e <b>false</b> caso contrário.
	 */
	public boolean cadastraContato(String nome, String sobrenome, String telefone, int posicao)
	{
		this.contato[posicao] = new Contato(nome, sobrenome, telefone);
		
		if (this.contato[posicao] != null)
		{
			if (posicao > ultimoCadastro)
				ultimoCadastro = posicao;
			
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Lista todos os contatos que estão armazenados na agenda, um em cada
	 * linha, na forma "POSIÇÃO - NOME SOBRENOME".
	 */
	public void listaContatos()
	{
		System.out.println();
		
		for (int pos = 1; pos <= this.ultimoCadastro; pos++)
			if (contato[pos] != null)
				System.out.println(pos + " - " + this.contato[pos].getNomeSobrenome());
		
		System.out.println();
	}
	
	public Contato exibeContato(int posicao)
	{
		return this.contato[posicao];
	}
	
	public boolean possuiContato(int posicao)
	{
		return this.contato[posicao] != null;
	}
}

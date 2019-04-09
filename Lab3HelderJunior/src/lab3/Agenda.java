package lab3;

import java.util.Arrays;

/**
 * Representação de uma agenda de contatos. A agenda é <b>composta</b> de
 * elementos do tipo Contato, sendo responsável por criá-los e manipulá-los
 * (cadastrar, listar e exibir).
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.2
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
	 * Constrói uma agenda com 100 contatos.
	 */
	public Agenda()
	{
		contato = new Contato[100];
	}
	
	/**
	 * Cadastra um contato a partir do seu nome, sobrenome, telefone e posição
	 * a ser definida na agenda.
	 * 
	 * @param nome o nome do contato.
	 * @param sobrenome o sobrenome do contato.
	 * @param telefone o telefone do contato.
	 * @param posicao a posição na agenda em que o contato deve ser inserido.
	 * @return um booleano {@code true} caso o contato seja cadastrado com
	 * sucesso, e {@code false} caso contrário.
	 * @since 1.0
	 */
	public boolean cadastraContato(String nome, String sobrenome, String telefone, int pos)
	{
		if (pos > 0 && pos < 101)
		{
			int posicao = pos - 1;
			
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
		else
		{
			return false;
		}
	}
	
	/**
	 * Lista todos os contatos que estão armazenados na agenda, um em cada
	 * linha, na forma "Posição - Nome Sobrenome".
	 * 
	 * @since 1.0
	 */
	public void listaContatos()
	{
		System.out.println();
		
		for (int pos = 0; pos <= this.ultimoCadastro; pos++)
			if (contato[pos] != null)
				System.out.println((pos + 1) + " - " + this.contato[pos].getNomeSobrenome());
		
		System.out.println();
	}
	
	/**
	 * Exibe um contato em uma posição especificada, no formato
	 * "Nome Sobrenome - Telefone".
	 * 
	 * @param posicao a posição do contato a ser exibido.
	 * @return uma representação do contato.
	 * 
	 * @since 1.0
	 */
	public String exibeContato(int posicao)
	{
		return this.contato[posicao - 1].toString();
	}
	
	/**
	 * Verifica se uma determinada posição da agenda possui um contato
	 * cadastrado.
	 * 
	 * @param posicao a posição do contato a ser verificada.
	 * @return um booleano {@code true} caso exista um contato na posição
	 * especificada e {@code false} caso contrário.
	 * 
	 * @since 1.0
	 */
	public boolean possuiContato(int posicao)
	{
		return this.contato[posicao - 1] != null;
	}
	
	/**
	 * Método hashCode da agenda, baseado nos hashCodes dos seus contatos.
	 * 
	 * @return o hashCode da agenda.
	 * 
	 * @since 1.1
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contato);
		return result;
	}
	
	/**
	 * Verifica se duas agendas são iguais, com base em seus contatos em
	 * posições idênticas.
	 * 
	 * @param obj a outra agenda que será comparada.
	 * @return um booleano {@code true} caso as agendas sejam iguais, e
	 * {@code false} caso contrário.
	 * 
	 * @since 1.1
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contato, other.contato))
			return false;
		return true;
	}
	
}

package lab2;

/**
 * Representação de uma conta de cantina. Cada conta apresenta informações de
 * nome, débito devido pelo estudante e seus gastos totais. É possivel
 * cadastrar lanches, saber o total devido, pagar esse débito e imprimir o
 * estado atual dessa conta.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class ContaCantina
{
	/**
	 * Nome da cantina vinculada à conta.
	 */
	private String nomeCantina;
	
	/**
	 * Débito total devido atualmente pelo estudante.
	 */
	private int debitoConta;
	
	/**
	 * Quantidade total de itens que foram consumidos pelo estudante.
	 */
	private int qtdItens;
	
	/**
	 * Total que foi gasto em lanches pelo estudante.
	 */
	private int gastoTotal;
	
	/**
	 * Constrói uma conta de cantina a partir do seu nome.
	 * 
	 * @param nomeCantina o nome da cantina.
	 */
	public ContaCantina(String nomeCantina)
	{
		this.nomeCantina = nomeCantina;
	}
	
	/**
	 * Cadastra lanches consumidos pelo estudante.
	 * 
	 * @param qtdItens a quantidade de lanches consumidos.
	 * @param valorCentavos o valor em centavos do total que foi consumido.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos)
	{
		this.qtdItens += qtdItens;
		this.gastoTotal += valorCentavos;
		this.debitoConta += valorCentavos;
	}
	
	/**
	 * Liquida parte ou todo o valor devido pelo estudante na cantina. Caso o
	 * valor pago seja maior ou igual ao débito total este será definido como
	 * zero, impedindo assim que o valor devido seja negativo.
	 * 
	 * @param valorCentavos o valor a ser liquidado do débito.
	 */
	public void pagaConta(int valorCentavos)
	{
		if (valorCentavos >= this.debitoConta)
			this.debitoConta = 0;
		else
			this.debitoConta -= valorCentavos;
	}
	
	
	/**
	 * Retorna o valor total do débito do estudante, em centavos.
	 * 
	 * @return o débito total.
	 */
	public int getFaltaPagar()
	{
		return this.debitoConta;
	}
	
	/**
	 * Imprime as informações da conta na cantina. A representação segue o
	 * formato "NOME_DA_CANTINA TOTAL_DE_ITENS_ADQUIRIDOS TOTAL_GASTO".
	 * 
	 * @return a String que representa a conta na cantina.
	 */
	public String toString()
	{
		return String.format("%s %d %d", this.nomeCantina, this.qtdItens, this.gastoTotal);
	}
}

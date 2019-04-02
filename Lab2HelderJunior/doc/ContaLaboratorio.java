package lab2;

/**
 * Representação de uma conta de um laboratório de informática, análoga as
 * utilizadas pelos alunos de Ciência da Computação da UFCG. Cada conta possui
 * o nome do laboratório a qual está vinculada, além da capacidade e da cota de
 * armazenamento que pode ser utilizado por esta conta. É possível aumentar ou
 * diminuir o espaço ocupado, verificar se a cota de armazenamento foi atingida
 * e imprimir o estado atual. 
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class ContaLaboratorio
{
	/**
	 * Nome do laboratório vinculado à conta.
	 */
	private String nomeLaboratorio;
	
	/**
	 * Quantia máxima em arquivos que uma conta deve ter (em MB).
	 */
	private int cota;
	
	/**
	 * Espaço total ocupado em disco pela conta.
	 */
	private int espacoOcupado;
	
	/**
	 * Constrói uma conta de laboratório a partir de seu nome e da cota
	 * de armazenamento que será disponibilizada.
	 * 
	 * @param nomeLaboratorio o nome do laboratório vinculado à conta.
	 * @param cota a quantia máxima em arquivos que uma conta deve ter (em MB).
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota)
	{
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	
	/**
	 * Constrói uma conta de laboratório a partir de seu nome. A cota de
	 * armazenamento será automaticamente definida como 2000 MB.
	 * 
	 * @param nomeLaboratorio o nome do laboratório vinculado à conta.
	 */
	public ContaLaboratorio(String nomeLaboratorio)
	{
		this(nomeLaboratorio, 2000);
	}
	
	/**
	 * Aumenta a quantidade total do espaço que foi armazenado pela conta.
	 * 
	 * @param mbytes a quantidade de armazenamento (em MB) a ser consumida.
	 */
	public void consomeEspaco(int mbytes)
	{
		this.espacoOcupado += mbytes;
	}
	
	/**
	 * Diminui a quantidade total do espaço armazenado pela conta.
	 * 
	 * @param mbytes a quantidade de armazenamento (em MB) a ser liberada.
	 */
	public void liberaEspaco(int mbytes)
	{
		this.espacoOcupado -= mbytes;
	}
	
	/**
	 * Verifica se a cota de armazenamento total da conta foi atingida.
	 * 
	 * @return um booleano <b>true</b> que indica se o espaço ocupado é maior ou igual
	 * a cota definida ou <b>false</b> caso esta condição não seja satisfeita.
	 */
	public boolean atingiuCota()
	{
		return this.espacoOcupado >= this.cota;
	}
	
	/**
	 * Imprime a String que representa as informações da conta. A representação
	 * segue o formato "NOME_DO_LABORATÓRIO ESPAÇO OCUPADO/COTA".
	 * 
	 * @return a String que representa a conta no laboratório.
	 */
	public String toString()
	{
		return String.format("%s %s/%s", this.nomeLaboratorio, this.espacoOcupado, this.cota);
	}
}

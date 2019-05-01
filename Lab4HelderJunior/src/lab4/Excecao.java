package lab4;

/**
 * Classe de suporte para testar entradas de texto.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 */
public class Excecao
{
	/**
	 * Testa se uma entrada é nula ou inválida e lança exceções apropriadas caso necessário.
	 * 
	 * @param entrada a String que irá ser testada.
	 * @throws NullPointerException caso a entrada seja nula.
	 * @throws IllegalArgumentException caso a entrada seja uma String vazia ou apenas uma String
	 * formada por espaços.
	 */
	public static void testarEntrada(String entrada)
	{
		if (entrada == null)
			throw new NullPointerException("Entrada nula!");
		
		if (entrada.trim().isEmpty())
			throw new IllegalArgumentException("Entrada inválida!");
	}
}

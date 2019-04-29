package lab4;

public class Excecao
{
	public static void testarEntrada(String entrada)
	{
		if (entrada == null)
			throw new NullPointerException("Entrada nula!");
		else if (entrada.equals("") || entrada.trim().isEmpty())
			throw new IllegalArgumentException("Entrada inválida!");
	}
}

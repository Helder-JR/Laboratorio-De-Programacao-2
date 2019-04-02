package lab2;

/**
 * Representação da saúde de um estudante. Possui informações da saúde física
 * e mental, além de ter como definir cada um desses parâmetros e saber como
 * está a saúde geral.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class Saude
{
	/**
	 * Saude física do estudante.
	 */
	private String saudeFisica;
	
	/**
	 * Saúde mental do estudante.
	 */
	private String saudeMental;
	
	/**
	 * Constrói um estado de saúde do estudante, onde as saúdes física e mental
	 * serão definidas como <b>boa</b>.
	 */
	public Saude()
	{
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}
	
	/**
	 * Define um estado para a saúde física do estudante.
	 * 
	 * @param valor o valor da saúde física a ser definido.
	 */
	public void defineSaudeFisica(String valor)
	{
		this.saudeFisica = valor;
	}
	
	/**
	 * Define um estado para a saúde mental do estudante.
	 * 
	 * @param valor o valorda saúde mental a ser definido.
	 */
	public void defineSaudeMental(String valor)
	{
		this.saudeMental = valor;
	}
	
	/**
	 * Retorna o estado de saúde como <b>boa</b> caso a saúde física e mental
	 * do estudante estejam bons, <b>ok</b> caso apenas um dos dois estejam 
	 * bons e <b>fraca</b> caso ambas estejam fracas.
	 * 
	 * @return o estado da saúde geral do estudante.
	 */
	public String getStatusGeral()
	{
		if (this.saudeFisica.equals("boa") && this.saudeMental.equals("boa"))
		{
			return "boa";
		}
		else if (this.saudeFisica.equals("boa") && this.saudeMental.equals("fraca") ||
				this.saudeFisica.equals("fraca") && this.saudeMental.equals("boa"))
		{
			return "ok";
		}
		else
		{
			return "fraca";
		}
	}
}

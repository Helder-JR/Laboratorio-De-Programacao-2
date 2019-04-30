package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcecaoTest
{
	@Test
	void testExcecao()
	{
		Excecao exc = new Excecao();
	}
	
	@Test
	void testEntradaNula()
	{
		try
		{
			Excecao.testarEntrada(null);
			fail("Deveria ter gerado uma exceção de entrada nula!");
		}
		catch(NullPointerException npe) {  }
	}
	
	@Test
	void testEntradaVazia()
	{
		try
		{
			Excecao.testarEntrada("");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(IllegalArgumentException iae) {  }
	}
	
	@Test
	void testEntradaComEspacos()
	{
		try
		{
			Excecao.testarEntrada(" ");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(IllegalArgumentException iae) {  }
	}
}

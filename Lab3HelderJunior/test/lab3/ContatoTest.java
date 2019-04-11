package lab3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste de unidade implementado para verificar e validar a consistência da
 * classe Contato.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.1
 */
class ContatoTest
{
	Contato contato;
	
	@Test
	public void testContato()
	{
		assertNull(this.contato);
		contato = new Contato("Helder", "Junior", "83991700979");
		assertNotNull(this.contato);
	}
	
	@Test
	public void testContatoSobreposicao()
	{
		contato = new Contato("Helder", "Junior", "83991700979");
		contato = new Contato("Tayná", "Tavares", "83993469402");
		assertEquals("Tayná Tavares - 83993469402", contato.toString());
	}
	
	@Test
	public void testContatoNomeNulo()
	{
		try
		{
			this.contato = new Contato(null, "Sobrenome", "Telefone");
			fail("Deveria dar erro de ponteiro nulo.");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	public void testContatoNomeInvalido()
	{
		try
		{
			this.contato = new Contato("", "Sobrenome", "Telefone");
			fail("Deveria dar erro de argumento inválido.");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	public void testContatoSobrenomeNulo()
	{
		try
		{
			this.contato = new Contato("Nome", null, "Telefone");
			fail("Deveria dar erro de ponteiro nulo.");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	public void testContatoSobrenomeInvalido()
	{
		try
		{
			this.contato = new Contato("Nome", "", "Telefone");
			fail("Deveria dar erro de argumento inválido.");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	public void testContatoTelefoneNulo()
	{
		try
		{
			this.contato = new Contato("Nome", "Sobrenome", null);
			fail("Deveria dar erro de ponteiro nulo.");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	public void testContatoTelefoneInvalido()
	{
		try
		{
			this.contato = new Contato("Nome", "Sobrenome", "");
			fail("Deveria dar erro de argumento inválido.");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	public void testGetNomeSobrenome()
	{
		this.contato = new Contato("Helder", "Junior", "83987654321");
		assertEquals("Helder Junior", contato.getNomeSobrenome());
	}

	@Test
	public void testToString()
	{
		this.contato = new Contato("Augusto", "Lima", "83999794424");
		assertEquals("Augusto Lima - 83999794424", contato.toString());
	}
	
	@Test
	public void testHashCodeContato()
	{
		Contato c1 = new Contato("Carlos", "Magno", "321");
		Contato c2 = new Contato("Carlos", "Magno", "123");
		assertEquals(c1.hashCode(), c2.hashCode());
	}
	
	@Test
	public void testEqualsObject()
	{
		Contato c1 = new Contato("Carlos", "Magno", "321");
		Contato c2 = new Contato("Carlos", "Magno", "123");
		assertEquals(c1, c2);
	}
}

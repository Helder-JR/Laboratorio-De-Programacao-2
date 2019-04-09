package lab3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste de unidade implementado para verificar e validar a consistência da
 * classe Contato.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
class ContatoTest
{
	@Test
	void testContato()
	{
		Contato contato = null;
		assertNull(contato);
		contato = new Contato("Lucifer", "Dos Anjos", "83666666666");
		assertNotNull(contato);
	}
	
	@Test
	void testGetNomeSobrenome()
	{
		Contato contato = new Contato("Helder", "Junior", "83987654321");
		assertEquals("Helder Junior", contato.getNomeSobrenome());
	}

	@Test
	void testToString()
	{
		Contato contato = new Contato("Augusto", "Lima", "83999794424");
		assertEquals("Augusto Lima - 83999794424", contato.toString());
	}
	
	@Test
	void testEqualsObject()
	{
		Contato c1 = new Contato("Carlos", "Magno", "321");
		Contato c2 = new Contato("Carlos", "Magno", "123");
		assertEquals(c1, c2);
	}
}

package lab3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContatoTest
{
	private Contato contatoBasico;
	
	@BeforeEach
	public void criaContato()
	{
		contatoBasico = new Contato("Helder", "Junior", "(83) 99170-0979");
	}

	@Test
	void testContato()
	{
		assertEquals(contatoBasico.getNome(), "Helder");
		assertEquals(contatoBasico.getSobrenome(), "Junior");
		assertEquals(contatoBasico.getTelefone(), "(83) 99170-0979");
	}

	@Test
	void testGetNomeSobrenome()
	{
		assertEquals("Helder Junior", contatoBasico.getNomeSobrenome());
	}

	@Test
	void testToString()
	{
		assertEquals("Helder Junior - (83) 99170-0979", contatoBasico.toString());
	}
}

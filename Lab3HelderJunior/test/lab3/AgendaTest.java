package lab3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste de unidade implementado para verificar e validar a consistência da
 * classe Agenda.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.1
 */
class AgendaTest
{
	private Agenda agendaTest;
	
	@BeforeEach
	void criaAgenda()
	{
		this.agendaTest = new Agenda();
	}
	
	@Test
	void testAgenda()
	{
		Agenda agenda = null;
		assertNull(agenda);
		agenda = new Agenda();
		assertNotNull(agenda);
	}
	
	@Test
	void testCadastraContatoPosicaoZero()
	{
		assertFalse(this.agendaTest.cadastraContato("Midoriya", "Izuku", "83991700979", 0));
	}
	
	@Test
	void testCadastraContatoPosicaoUm()
	{
		assertTrue(this.agendaTest.cadastraContato("Katsu", "Bakugo", "83987654321", 1));
	}
	
	@Test
	void testCadastraContatoPosicaoCinquenta()
	{
		assertTrue(this.agendaTest.cadastraContato("Ochako", "Uraraka", "83900000000", 50));
	}
	
	@Test
	void testCadastraContatoPosicaoCem()
	{
		assertTrue(this.agendaTest.cadastraContato("Tenya", "Iida", "83999999999", 100));
	}
	
	@Test
	void testCadastraContatoPosicaoCentoEum()
	{
		assertFalse(this.agendaTest.cadastraContato("Todoroki", "Shoto", "83911111111", 101));
	}
	
	@Test
	void testCadastraContatoNomeNulo()
	{
		try
		{
			this.agendaTest.cadastraContato(null, "Sobrenome", "Telefone", 12);
			fail("Deveria dar erro de ponteiro nulo.");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testCadastraContatoNomeInvalido()
	{
		try
		{
			this.agendaTest.cadastraContato("", "Sobrenome", "Telefone", 42);
			fail("Deveria dar erro de argumento inválido.");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastraContatoSobrenomeNulo()
	{
		try
		{
			this.agendaTest.cadastraContato("Nome", null, "Telefone", 13);
			fail("Deveria dar erro de ponteiro nulo.");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testCadastraContatoSobrenomeInvalido()
	{
		try
		{
			this.agendaTest.cadastraContato("Nome", "", "Telefone", 16);
			fail("Deveria dar erro de argumento inválido.");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastraContatoTelefoneNulo()
	{
		try
		{
			this.agendaTest.cadastraContato("Nome", "Sobrenome", null, 11);
			fail("Deveria dar erro de ponteiro nulo.");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testCadastraContatoTelefoneInvalido()
	{
		try
		{
			this.agendaTest.cadastraContato("Nome", "Sobrenome", "", 31);
			fail("Deveria dar erro de argumento inválido.");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testListaContatoPosicaoZero()
	{
		try
		{
			this.agendaTest.listaContato(0);
		}
		catch (IndexOutOfBoundsException idoobe) {  }
	}
	
	@Test
	void testListaContatoPosicaoUm()
	{
		this.agendaTest.cadastraContato("Katsu", "Bakugo", "83987654321", 1);
		assertEquals("1 - Katsu Bakugo", this.agendaTest.listaContato(1));
	}
	
	@Test
	void testListaContatoPosicaoVinteEtres()
	{
		this.agendaTest.cadastraContato("All", "Might", "83999999999", 23);
		assertEquals("23 - All Might", this.agendaTest.listaContato(23));
	}
	
	@Test
	void testListaContatoPosicaoCem()
	{
		this.agendaTest.cadastraContato("Tenya", "Iida", "83999999999", 100);
		assertEquals("100 - Tenya Iida", this.agendaTest.listaContato(100));
	}
	
	@Test
	void testListaContatoPosicaoCentoEum()
	{
		try
		{
			this.agendaTest.listaContato(101);
		}
		catch (IndexOutOfBoundsException idoobe) {  }
	}
	
	@Test
	void testExibeContatoPosicaoZero()
	{
		try
		{
			this.agendaTest.exibeContato(0);
		}
		catch (IndexOutOfBoundsException idoobe) {  }
	}
	
	@Test
	void testExibeContatoPosicaoUm()
	{
		this.agendaTest.cadastraContato("Katsu", "Bakugo", "83987654321", 1);
		assertEquals("Katsu Bakugo - 83987654321", this.agendaTest.exibeContato(1));
	}
	
	@Test
	void testExibeContatoPosicaoCinquenta()
	{
		this.agendaTest.cadastraContato("Ochako", "Uraraka", "83900000000", 50);
		assertEquals("Ochako Uraraka - 83900000000", this.agendaTest.exibeContato(50));
	}
	
	@Test
	void testExibeContatoPosicaoCem()
	{
		this.agendaTest.cadastraContato("Tenya", "Iida", "83999999999", 100);
		assertEquals("Tenya Iida - 83999999999", this.agendaTest.exibeContato(100));
	}
	
	@Test
	void testExibeContatoPosicaoCentoEum()
	{
		try
		{
			this.agendaTest.exibeContato(101);
		}
		catch (IndexOutOfBoundsException idoobe) {  }
	}
	
	@Test
	void testPossuiContatoPosicaoZero()
	{
		try
		{
			this.agendaTest.possuiContato(0);
		}
		catch (IndexOutOfBoundsException idoobe) {  }
	}
	
	@Test
	void testPossuiContatoPosicaoUm()
	{
		this.agendaTest.cadastraContato("Katsu", "Bakugo", "83987654321", 1);
		assertTrue(this.agendaTest.possuiContato(1));
	}
	
	@Test
	void testPossuiContatoPosicaoSetentaEsete()
	{
		this.agendaTest.cadastraContato("Mashirao", "Ojiro", "83789654231", 77);
		assertTrue(this.agendaTest.possuiContato(77));
	}
	
	@Test
	void testPossuiContatoPosicaoCem()
	{
		this.agendaTest.cadastraContato("Tenya", "Iida", "83999999999", 100);
		assertTrue(this.agendaTest.possuiContato(100));
	}
	
	@Test
	void testPossuiContatoPosicaoCentoEum()
	{
		try
		{
			this.agendaTest.possuiContato(101);
		}
		catch (IndexOutOfBoundsException idoobe) {  }
	}
	
	@Test
	void testHashCodeAgenda()
	{
		Agenda agenda1 = new Agenda();
		agenda1.cadastraContato("Nome", "Sobrenome", "Telefone", 32);
		agenda1.cadastraContato("Ochako", "Uraraka", "83900000001", 50);
		
		Agenda agenda2 = new Agenda();
		agenda2.cadastraContato("Nome", "Sobrenome", "Telefone", 32);
		agenda2.cadastraContato("Ochako", "Uraraka", "83900000001", 50);
		
		assertEquals(agenda1.hashCode(), agenda2.hashCode());
	}
	
	@Test
	void testEqualsAgenda()
	{
		Agenda agendaTest2 = new Agenda();
		agendaTest2.cadastraContato("Katsu", "Bakugo", "83987564123", 1);
		agendaTest2.cadastraContato("Ochako", "Uraraka", "83900000001", 50);
		agendaTest2.cadastraContato("Tenya", "Iida", "83999999998", 100);
		
		Agenda agendaTest3 = new Agenda();
		agendaTest3.cadastraContato("Katsu", "Bakugo", "83987654321", 1);
		agendaTest3.cadastraContato("Ochako", "Uraraka", "83900000000", 50);
		agendaTest3.cadastraContato("Tenya", "Iida", "83999999999", 100);
		
		assertEquals(agendaTest2, agendaTest3);
	}
}

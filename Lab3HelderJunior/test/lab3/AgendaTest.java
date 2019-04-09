package lab3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste de unidade implementado para verificar e validar a consistência da
 * classe Agenda.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
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
	void testCadastraContatoLimiteInferior()
	{
		assertTrue(agendaTest.cadastraContato("Vinícius", "Furtado", "83991700979", 1));
	}
	
	@Test
	void testCadastraContatoLimiteSuperior()
	{
		assertTrue(agendaTest.cadastraContato("Aldo", "Monteiro", "83993528229", 100));
	}
	
	@Test
	void testCadastraContatoPosicaoZero()
	{
		assertFalse(agendaTest.cadastraContato("Vinícius", "Furtado", "83991700979", 0));
	}
	
	@Test
	void testCadastraContatoPosicaoCentoEUm()
	{
		assertFalse(agendaTest.cadastraContato("Petrus", "Kyrbb", "83123456789", 101));
	}
	
	@Test
	void testExibeContato()
	{
		agendaTest.cadastraContato("Nilson", "Murilo", "83991700979", 1);
		assertEquals("Nilson Murilo - 83991700979", agendaTest.exibeContato(1));
	}
	
	@Test
	void testListaContatos()
	{
		fail("Not yet implemented");
	}

	@Test
	void testPossuiContato()
	{
		agendaTest.cadastraContato("Tayná", "Tavares", "83993469402", 42);
		assertTrue(agendaTest.possuiContato(42));
	}

	@Test
	void testEqualsObject()
	{
		fail("Not yet implemented");
	}
}

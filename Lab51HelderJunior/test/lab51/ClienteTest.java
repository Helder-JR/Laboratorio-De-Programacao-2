package lab51;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest
{
	private Cliente cliente;
	private Cliente outro;
	
	@BeforeEach
	void testCliente()
	{
		this.cliente = null;
		this.outro = null;
	}
	
	@Test
	void testNovoCliente()
	{
		assertNull(this.cliente);
		this.cliente = new Cliente("XXX.XXX.XXX-XX", "Fulano", "fulano@gmail.com", "AlgumLugar");
		assertNotNull(this.cliente);
	}
	
	@Test
	void testToString()
	{
		this.cliente = new Cliente("123.456.789-11", "Naruto", "naruto@konoha.com", "Vila da Folha");
		assertEquals("Naruto - Vila da Folha - naruto@konoha.com", this.cliente.toString());
	}
	
	@Test
	void testGetCpf()
	{
		this.cliente = new Cliente("123.456.789-11", "Naruto", "naruto@konoha.com", "Vila da Folha");
		String cpf = this.cliente.getCpf();
		assertEquals(cpf, this.cliente.getCpf());
	}
	
	@Test
	void testSetNome()
	{
		this.cliente = new Cliente("123.456.789-11", "Naruto", "naruto@konoha.com", "Vila da Folha");
		this.cliente.setNome("Sasuke");
		assertEquals("Sasuke - Vila da Folha - naruto@konoha.com", this.cliente.toString());
	}
	
	@Test
	void testSetEmail()
	{
		this.cliente = new Cliente("123.456.789-11", "Naruto", "naruto@konoha.com", "Vila da Folha");
		this.cliente.setEmail("naruto@hokage.com");
		assertEquals("Naruto - Vila da Folha - naruto@hokage.com", this.cliente.toString());
	}
	
	@Test
	void testSetLocalizacao()
	{
		this.cliente = new Cliente("123.456.789-11", "Naruto", "naruto@konoha.com", "Vila da Folha");
		this.cliente.setLocalizacao("Vila do Som");
		assertEquals("Naruto - Vila do Som - naruto@konoha.com", this.cliente.toString());
	}
	
	@Test
	void testHashCode()
	{
		this.cliente = new Cliente("123.456.789-11", "Naruto", "naruto@konoha.com", "Vila da Folha");
		this.outro = new Cliente("123.456.789-11", "Kakashi", "kakashi@konoha.com", "Vila da Folha");
		assertEquals(this.cliente.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testHashCodeCpfDiferente()
	{
		this.cliente = new Cliente("055.821.944-06", "Hinata", "hinata@konoha.com", "Vila da Folha");
		this.outro = new Cliente("066.069.124-88", "Orochimaru", "orochimaru@oto.com", "Vila do Som");
		assertNotEquals(this.cliente.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testHashCodeCpfNull()
	{
		this.cliente = new Cliente(null, "Naruto", "naruto@konoha.com", "Vila da Folha");
		this.outro = new Cliente(null, "Kakashi", "kakashi@konoha.com", "Vila da Folha");
		assertEquals(this.cliente.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testEquals()
	{
		this.cliente = new Cliente("123.444.099-75", "Gaara", "gaara@kazekage.com", "Vila da Areia");
		this.outro = new Cliente("123.444.099-75", "Rock-Lee", "rocklee@konoha.com", "Vila da Folha");
		assertTrue(this.cliente.equals(this.outro));
	}
	
	@Test
	void testEqualsMesmoObjeto()
	{
		this.cliente = new Cliente("055.821.944-06", "Hinata", "hinata@konoha.com", "Vila da Folha");
		assertTrue(this.cliente.equals(this.cliente));
	}
	
	@Test
	void testEqualsCpfNull()
	{
		this.cliente = new Cliente(null, "Kakashi", "kakashi@konoha.com", "Vila da Folha");
		this.outro = new Cliente("066.069.124-88", "Orochimaru", "orochimaru@oto.com", "Vila do Som");
		assertFalse(this.cliente.equals(this.outro));
	}
	
	@Test
	void testEqualsCpfsNull()
	{
		this.cliente = new Cliente(null, "Minato", "minato@hokage.com", "Vila da Folha");
		this.outro = new Cliente(null, "Kushina", "kushina@konoha.com", "Vila da Folha");
		assertTrue(this.cliente.equals(this.outro));
	}
	
	@Test
	void testEqualsNull()
	{
		this.cliente = new Cliente("066.069.124-88", "Orochimaru", "orochimaru@oto.com", "Vila do Som");
		assertFalse(this.cliente.equals(null));
	}
	
	@Test
	void testEqualsObjetoDiferente()
	{
		this.cliente = new Cliente("055.821.944-06", "Hinata", "hinata@konoha.com", "Vila da Folha");
		this.outro = new Cliente("066.069.124-88", "Orochimaru", "orochimaru@oto.com", "Vila do Som");
		assertFalse(this.cliente.equals(this.outro));
	}
	
	@Test
	void testEqualsClasseDiferente()
	{
		this.cliente = new Cliente("066.069.124-88", "Orochimaru", "orochimaru@oto.com", "Vila do Som");
		String teste = "teste";
		assertFalse(this.cliente.equals(teste));
	}
}

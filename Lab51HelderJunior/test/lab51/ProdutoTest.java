package lab51;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest
{
	private Produto produto;
	private Produto outro;
	
	@BeforeEach
	void testProduto()
	{
		this.produto = null;
		this.outro = null;
	}
	
	@Test
	void testNovoProduto()
	{
		assertNull(this.produto);
		this.produto = new Produto("Café São Braz", "Café moído", 4.20);
		assertNotNull(this.produto);
	}
	
	@Test
	void testToString()
	{
		this.produto = new Produto("Xiaomi Redmi Note 7 Pro", "Smartphone", 1200.00);
		assertEquals("Xiaomi Redmi Note 7 Pro - Smartphone - R$1200,00", this.produto.toString());
	}
	
	@Test
	void testGetNome()
	{
		this.produto = new Produto("Quentinha", "Quentinha Fulano de Sal", 5.00);
		String nome = this.produto.getNome();
		assertEquals(nome, this.produto.getNome());
	}
	
	@Test
	void testGetDescricao()
	{
		this.produto = new Produto("Salcicha", "Salcicha defumada Perdigão", 7.00);
		String descricao = this.produto.getDescricao();
		assertEquals(descricao, this.produto.getDescricao());
	}
	
	@Test
	void testSetPreco()
	{
		this.produto = new Produto("Caneta", "Caneta 4 cores BIC", 11.00);
		this.produto.setPreco(12.00);
		assertEquals("Caneta - Caneta 4 cores BIC - R$12,00", this.produto.toString());
	}
	
	@Test
	void testHashCode()
	{
		this.produto = new Produto("Barbeador", "Gillette Mach 3 Turbo", 15.00);
		this.outro = new Produto("Barbeador", "Gillette Mach 3 Turbo", 13.99);
		assertEquals(this.produto.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testHashCodeNomeDiferente()
	{
		this.produto = new Produto("Isqueiro Grande", "Isqueiro BIC", 7.00);
		this.outro = new Produto("Isqueiro Médio", "Isqueiro BIC", 7.00);
		assertNotEquals(this.produto.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testHashCodeDescricaoDiferente()
	{
		this.produto = new Produto("Isqueiro Grande", "Isqueiro BIC", 7.00);
		this.outro = new Produto("Isqueiro Grande", "Isqueiro CIS", 5.00);
		assertNotEquals(this.produto.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testHashCodeDescricaoNull()
	{
		this.produto = new Produto("Isqueiro Grande", null, 7.00);
		this.outro = new Produto("Isqueiro Grande", null, 7.00);
		assertEquals(this.produto.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testHashCodeNomeNull()
	{
		this.produto = new Produto(null, "Isqueiro BIC", 7.00);
		this.outro = new Produto(null, "Isqueiro BIC", 7.00);
		assertEquals(this.produto.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testEqualsMesmoObjeto()
	{
		this.produto = new Produto("Teclado", "Teclado Gamer Razer", 560.99);
		assertTrue(this.produto.equals(this.produto));
	}
	
	@Test
	void testEqualsObjetosDiferentes()
	{
		this.produto = new Produto("Teclado", "Teclado Gamer Razer", 560.99);
		this.outro = new Produto("Mouse", "Mouse Multilaser Warrior", 149.99);
		assertFalse(this.produto.equals(this.outro));
	}
	
	@Test
	void testEqualsObjetoNull()
	{
		this.produto = new Produto("Teclado", "Teclado Gamer Razer", 560.99);
		assertFalse(this.produto.equals(null));
	}
	
	@Test
	void testEqualsClassesDiferentes()
	{
		this.produto = new Produto("Teclado", "Teclado Gamer Razer", 560.99);
		Fornecedor fornecedor = new Fornecedor("Del Vale", "delvale@cocacola.com", "(11)7341-4823");
		assertFalse(this.produto.equals(fornecedor));
	}
	
	@Test
	void testEqualsDescricaoNull()
	{
		this.produto = new Produto("Teclado", null, 560.99);
		this.outro = new Produto("Teclado", "Teclado Multilaser Warrior", 149.99);
		assertFalse(this.produto.equals(this.outro));
	}
	
	@Test
	void testEqualsDescricoesNull()
	{
		this.produto = new Produto("Teclado", null, 560.99);
		this.outro = new Produto("Teclado", null, 149.99);
		assertTrue(this.produto.equals(this.outro));
	}
	
	@Test
	void testEqualsDescricoesIguais()
	{
		this.produto = new Produto("Teclado", "Teclado Gamer Razer", 560.99);
		this.outro = new Produto("Teclado", "Teclado Gamer Razer", 149.99);
		assertTrue(this.produto.equals(this.outro));
	}
	
	@Test
	void testEqualsNomeNull()
	{
		this.produto = new Produto(null, "Pendrive Sandisk 16GB", 18.00);
		this.outro = new Produto("Pendrive", "Pendrive Sandisk 16GB", 18.00);
		assertFalse(this.produto.equals(this.outro));
	}
	
	@Test
	void testEqualsNomesNull()
	{
		this.produto = new Produto(null, "Pendrive Sandisk 16GB", 18.00);
		this.outro = new Produto(null, "Pendrive Sandisk 16GB", 18.00);
		assertTrue(this.produto.equals(this.outro));
	}
	
	@Test
	void testEqualsNomesIguais()
	{
		this.produto = new Produto("Pendrive", "Pendrive Sandisk 16GB", 18.00);
		this.outro = new Produto("Pendrive", "Pendrive Sandisk 16GB", 18.00);
		assertTrue(this.produto.equals(this.outro));
	}
	
	@Test
	void testEqualsNomesDiferentes()
	{
		this.produto = new Produto("Pendrive Kingston", "Pendrive Sandisk 16GB", 18.00);
		this.outro = new Produto("Pendrive", "Pendrive Sandisk 16GB", 18.00);
		assertFalse(this.produto.equals(this.outro));
	}
}

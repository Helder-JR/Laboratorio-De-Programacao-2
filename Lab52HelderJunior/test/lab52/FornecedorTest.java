package lab52;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FornecedorTest
{
    Fornecedor fornecedor;
    Fornecedor outro;

    @BeforeEach
    void testFornecedor()
    {
        this.fornecedor = null;
        this.outro = null;
    }

    @Test
    void testNovoFornecedor()
    {
        assertNull(this.fornecedor);
        this.fornecedor = new Fornecedor("Coca-Cola", "coca@cola.com", "(31)3291-1414");
        assertNotNull(this.fornecedor);
    }

    @Test
    void testToString()
    {
        this.fornecedor = new Fornecedor("Ambev", "ambev@ambev.com", "(13)2108-4888");
        assertEquals("Ambev - ambev@ambev.com - (13)2108-4888", this.fornecedor.toString());
    }

    @Test
    void testGetNome()
    {
        this.fornecedor = new Fornecedor("Nestlé", "nestlé@nestlé.com", "(62)7822-0222");
        String nome = this.fornecedor.getNome();
        assertEquals(nome, this.fornecedor.getNome());
    }

    @Test
    void testSetEmail()
    {
        this.fornecedor = new Fornecedor("Nutrimassa", "nutri@massa.com", "(83)3342-1762");
        this.fornecedor.setEmail("atendimento@nutrimassa.com");
        assertEquals("Nutrimassa - atendimento@nutrimassa.com - (83)3342-1762", this.fornecedor.toString());
    }

    @Test
    void testSetTelefone()
    {
        this.fornecedor = new Fornecedor("Nutrimassa", "nutri@massa.com", "(83)3342-1762");
        this.fornecedor.setTelefone("(83)3391-1510");
        assertEquals("Nutrimassa - nutri@massa.com - (83)3391-1510", this.fornecedor.toString());
    }

    @Test
    void testHashCode()
    {
        this.fornecedor = new Fornecedor("Cariri", "sac@cariri.com", "(83)2102-5656");
        this.outro = new Fornecedor("Cariri", "cariri@cariri.com", "(83)3392-5050");
        assertEquals(this.fornecedor.hashCode(), this.outro.hashCode());
    }

    @Test
    void testHashCodeNomeDiferente()
    {
        this.fornecedor = new Fornecedor("Cariri", "sac@cariri.com", "(83)2102-5656");
        this.outro = new Fornecedor("Lelegut", "sac@lelegut.com", "(83)3332-0550");
        assertNotEquals(this.fornecedor.hashCode(), this.outro.hashCode());
    }

    @Test
    void testHashCodeNomeNull()
    {
        this.fornecedor = new Fornecedor(null, "sac@cariri.com", "(83)2102-5656");
        this.outro = new Fornecedor(null, "cariri@cariri.com", "(83)3392-5050");
        assertEquals(this.fornecedor.hashCode(), this.outro.hashCode());
    }

    @Test
    void testEquals()
    {
        this.fornecedor = new Fornecedor("Souza-Cruz", "souza@cruz.com", "(34)4758-2343");
        this.outro = new Fornecedor("Souza-Cruz", "sac@souzacruz.com", "(57)4722-8109");
        assertTrue(this.fornecedor.equals(this.outro));
    }

    @Test
    void testEqualsMesmoObjeto()
    {
        this.fornecedor = new Fornecedor("Pepsico", "sac@pepsico.com", "(21)7221-1321");
        assertTrue(this.fornecedor.equals(this.fornecedor));
    }

    @Test
    void testEqualsNomeNull()
    {
        this.fornecedor = new Fornecedor(null, "sac@pepsico.com", "(21)7221-1321");
        this.outro = new Fornecedor("Cariri", "cariri@cariri.com", "(83)3392-5050");
        assertFalse(this.fornecedor.equals(this.outro));
    }

    @Test
    void testEqualsNomesNull()
    {
        this.fornecedor = new Fornecedor(null, "sac@pepsico.com", "(21)7221-1321");
        this.outro = new Fornecedor(null, "cariri@cariri.com", "(83)3392-5050");
        assertTrue(this.fornecedor.equals(this.outro));
    }

    @Test
    void testEqualsNull()
    {
        this.fornecedor = new Fornecedor("Pepsico", "sac@pepsico.com", "(21)7221-1321");
        assertFalse(this.fornecedor.equals(null));
    }

    @Test
    void testEqualsObjetoDiferente()
    {
        this.fornecedor = new Fornecedor("Pepsico", "sac@pepsico.com", "(21)7221-1321");
        this.outro = new Fornecedor("Cariri", "cariri@cariri.com", "(83)3392-5050");
        assertFalse(this.fornecedor.equals(this.outro));
    }

    @Test
    void testEqualsClasseDiferente()
    {
        this.fornecedor = new Fornecedor("Belatrix", "atend@belatrix.com", "(83)98624-7084");
        Cliente cliente = new Cliente("055.821.944-06", "Hinata", "hinata@konoha.com", "Vila da Folha");
        assertFalse(this.fornecedor.equals(cliente));
    }

    @Test
    void testAdicionarProduto()
    {
        this.fornecedor = new Fornecedor("Parmalat", "atendimento@parmalat.com", "(41)4447-7171");
        assertTrue(this.fornecedor.adicionarProduto("Leite UHT", "Leite desnatado", 5.00));
    }

    @Test
    void testAdicionarProdutoInexistente()
    {
        this.fornecedor = new Fornecedor("Parmalat", "atendimento@parmalat.com", "(41)4447-7171");
        assertTrue(this.fornecedor.adicionarProduto("Leite UHT", "Leite desnatado", 5.00));
    }

    @Test
    void testConsultarProduto()
    {
        this.fornecedor = new Fornecedor("Parmalat", "atendimento@parmalat.com", "(41)4447-7171");
        this.fornecedor.adicionarProduto("Leite UHT", "Leite desnatado", 5.00);
        Produto produto = this.fornecedor.consultarProduto("Leite UHT", "Leite desnatado");
        assertEquals("Leite UHT - Leite desnatado - R$5,00", produto.toString());
    }
}

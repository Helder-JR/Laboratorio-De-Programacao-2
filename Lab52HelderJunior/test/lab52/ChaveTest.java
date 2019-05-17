package lab52;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChaveTest
{
    private Chave chave;
    private Chave outro;

    @BeforeEach
    void testChave()
    {
        this.chave = null;
    }

    @Test
    void testNovaChave()
    {
        assertNull(this.chave);
        this.chave = new Chave("Pêra", "Pêra maçã");
        assertNotNull(this.chave);
    }

    @Test
    void testHashCode()
    {
        this.chave = new Chave("Computador", "Notebook Samsung");
        this.outro = new Chave("Computador", "Notebook Samsung");
        assertEquals(this.chave.hashCode(), this.outro.hashCode());
    }

    @Test
    void testHashCodeNomeNull()
    {
        this.chave = new Chave(null, "Samsung");
        this.outro = new Chave(null, "Samsung");
        assertEquals(this.chave.hashCode(), this.outro.hashCode());
    }

    @Test
    void testHashCodeDescricaoNull()
    {
        this.chave = new Chave("Televisão", null);
        this.outro = new Chave("Televisão", null);
        assertEquals(this.chave.hashCode(), this.outro.hashCode());
    }

    @Test
    void testEqualsMesmoObjeto()
    {
        this.chave = new Chave("Caneta", "BIC 4 cores");
        assertTrue(this.chave.equals(this.chave));
    }

    @Test
    void testEqualsObjetoNull()
    {
        this.chave = new Chave("Caneta", "BIC 4 cores");
        assertFalse(this.chave.equals(null));
    }

    @Test
    void testEqualsClasseDiferente()
    {
        this.chave = new Chave("Controle", "Xbox One");
        Produto produto = new Produto("Controle", "Xbox One Elite", 215.00);
        assertFalse(this.chave.equals(produto));
    }

    @Test
    void testEqualsDescricaoNull()
    {
        this.chave = new Chave("Anel", null);
        this.outro = new Chave("Anel", "Prata 925");
        assertFalse(this.chave.equals(this.outro));
    }

    @Test
    void testEqualsDescricoesNull()
    {
        this.chave = new Chave("Anel", null);
        this.outro = new Chave("Anel", null);
        assertTrue(this.chave.equals(this.outro));
    }
}

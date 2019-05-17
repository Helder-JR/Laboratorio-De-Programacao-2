package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest
{
	private Aluno aluno;
	private Aluno outro;
	
	@BeforeEach
	void testAluno()
	{
		this.aluno = null;
		this.outro = null;
	}
	
	@Test
	void testNovoAluno()
	{
		assertNull(this.aluno);
		this.aluno = new Aluno("123456789", "Jonathan", "Enfermagem");
		assertNotNull(this.aluno);
	}
	
	@Test
	void testNovoAlunoMatriculaNull()
	{
		try
		{
			this.aluno = new Aluno(null, "Arthur", "Design");
			fail("Deveria ter gerado uma exceção de entrada nula!");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testNovoAlunoMatriculaVazia()
	{
		try
		{
			this.aluno = new Aluno("", "João", "Letras");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testNovoAlunoMatriculaEspacos()
	{
		try
		{
			this.aluno = new Aluno(" ", "Pedro", "Engenharia Elétrica");
			fail("Deveria ter gerado um exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testNovoAlunoNomeNull()
	{
		try
		{
			this.aluno = new Aluno("123456789", null, "Enfermagem");
			fail("Deveria ter gerado uma exceção de entrada nula!");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testNovoAlunoNomeVazio()
	{
		try
		{
			this.aluno = new Aluno("123812380", "", "Letras");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testNovoAlunoNomeEspacos()
	{
		try
		{
			this.aluno = new Aluno("185884848", " ", "Engenharia Elétrica");
			fail("Deveria ter gerado um exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testNovoAlunoCursoNull()
	{
		try
		{
			this.aluno = new Aluno("123456789", "Gabriel", null);
			fail("Deveria ter gerado uma exceção de entrada nula!");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testNovoAlunoCursoVazio()
	{
		try
		{
			this.aluno = new Aluno("123812380", "Márcio", "");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testNovoAlunoCursoEspacos()
	{
		try
		{
			this.aluno = new Aluno("185884848", "Denilson", " ");
			fail("Deveria ter gerado um exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testMatricula()
	{
		this.aluno = new Aluno("321534657", "Carlos", "Nutrição");
		assertEquals("321534657", this.aluno.getMatricula());
	}
	
	@Test
	void testToString()
	{
		this.aluno = new Aluno("10035008", "Emanuel Carneiro", "Fisioterapia");
		assertEquals("10035008 - Emanuel Carneiro - Fisioterapia", this.aluno.toString());
	}
	
	@Test
	void testHashCode()
	{
		this.aluno = new Aluno("987654321", "Bruna", "Medicina");
		this.outro = new Aluno("987654321", "Heitor", "Odontologia");
		assertEquals(this.outro.hashCode(), this.aluno.hashCode());
	}
	
	@Test
	void testEquals()
	{
		this.aluno = new Aluno("118210158", "Helder", "Computação");
		this.outro = new Aluno("118210158", "Henrique", "Farmácia");
		assertTrue(this.aluno.equals(this.outro));
	}
	
	@Test
	void testEqualsMatriculasDiferentes()
	{
		this.aluno = new Aluno("001258974", "Genilda", "História");
		this.outro = new Aluno("123551044", "Leandra", "Geografia");
		assertFalse(this.aluno.equals(this.outro));
	}
	
	@Test
	void testEqualsMesmoObjeto()
	{
		this.aluno = new Aluno("123456987", "Camila", "Engenharia Naval");
		assertTrue(this.aluno.equals(this.aluno));
	}
	
	@Test
	void testEqualsObjetoNull()
	{
		this.aluno = new Aluno("546877103", "Marina", "Administração");
		assertFalse(this.aluno.equals(null));
	}
	
	@Test
	void testEqualsClassesDiferentes()
	{
		this.aluno = new Aluno("753951456", "Mylena", "Teatro");
		Grupo grupo = new Grupo("Grafos");
		assertFalse(this.aluno.equals(grupo));
	}
}

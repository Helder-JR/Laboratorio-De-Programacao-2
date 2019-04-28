package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest
{
	private Aluno aluno;
	private Aluno outro;
	
	@BeforeEach
	void testAlunos()
	{
		this.aluno = null;
		outro = null;
	}
	
	@Test
	void testNovoAluno()
	{
		assertNull(this.aluno);
		this.aluno = new Aluno("123456789", "Jonathan", "Enfermagem");
		assertNotNull(this.aluno);
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
		outro = new Aluno("987654321", "Heitor", "Odontologia");
		assertEquals(outro.hashCode(), this.aluno.hashCode());
	}
	
	@Test
	void testEquals()
	{
		this.aluno = new Aluno("118210158", "Helder", "Computação");
		outro = new Aluno("118210158", "Henrique", "Farmácia");
		assertTrue(this.aluno.equals(outro));
	}
}

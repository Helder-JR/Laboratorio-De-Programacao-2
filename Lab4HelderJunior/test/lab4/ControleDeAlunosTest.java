package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControleDeAlunosTest
{
	private ControleDeALunos controle;
	
	@BeforeEach
	void testControleDeAluno()
	{
		this.controle = null;
	}
	
	@Test
	void testNovoControleDeAlunos()
	{
		assertNull(this.controle);
		this.controle = new ControleDeALunos();
		assertNotNull(this.controle);
	}
	
	@Test
	void testCadastrarAluno()
	{
		this.controle = new ControleDeALunos();
		assertTrue(this.controle.cadastrarAluno("118210158", "Helder", "Computação"));
	}
	
	@Test
	void testCadastrarAlunoMatriculaExistente()
	{
		this.controle = new ControleDeALunos();
		this.controle.cadastrarAluno("118210158", "Ruan", "Pedagogia");
		assertFalse(this.controle.cadastrarAluno("118210158", "Pietro", "Letras"));
	}
	
	@Test
	void testCadastrarAlunoMatriculaNull()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno(null, "Ricardo", "Medicina");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testCadastrarAlunoMatriculaVazia()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("", "Ricardo", "Medicina");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastrarAlunoMatriculaEspacos()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno(" ", "Ricardo", "Medicina");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastrarAlunoNomeNull()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("123456789", null, "Computação");
			fail("Deveria ter gerado uma exceção de entrada nula!");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testCadastrarAlunoNomeVazio()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("776904123", "", "Medicina");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastrarAlunoNomeEspacos()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("486759123", " ", "Veterinária");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastrarAlunoCursoNull()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("153426789", "Lucca", null);
			fail("Deveria ter gerado uma exceção de entrada nula!");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testCadastrarAlunoCursoVazio()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("288357917", "Antônio", "");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastrarAlunoCursoEspacos()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("118448796", "Rodolfo", " ");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testConsultarAluno()
	{
		this.controle = new ControleDeALunos();
		this.controle.cadastrarAluno("449853201", "David", "Matemática");
		Aluno aluno = this.controle.consultarAluno("449853201");
		assertEquals(aluno.toString(), "449853201 - David - Matemática");
	}
	
	@Test
	void testConsultarAlunoMatriculaNull()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("156742893", "Marcelo", "Física");
			this.controle.consultarAluno(null);
			fail("Deveria ter gerado uma exceção de entrada nula!");
		}
		catch (NullPointerException npe) {  }
	}
	
	@Test
	void testConsultarAlunoMatriculaVazia()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("893001228", "Gleyson", "Jogos Digitais");
			this.controle.consultarAluno("");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testConsultarAlunoMatriculaEspacos()
	{
		try
		{
			this.controle = new ControleDeALunos();
			this.controle.cadastrarAluno("123558479", "Jadison", "Jogos Digitais");
			this.controle.consultarAluno(" ");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastrarAlunosQueResponderam()
	{
		this.controle = new ControleDeALunos();
		this.controle.cadastrarAluno("118210158", "Helder Junior", "Ciência da Computação");
		assertTrue(this.controle.cadastrarAlunosQueResponderam("118210158"));
	}
	
	@Test
	void testCadastrarAlunosQueResponderamMatriculaInexistente()
	{
		this.controle = new ControleDeALunos();
		this.controle.cadastrarAluno("388093640", "Tayná Tavares", "Administração");
		assertFalse(this.controle.cadastrarAlunosQueResponderam("118110462"));
	}
	
	@Test
	void testImprimirAlunosQueResponderamQuestoes()
	{
		this.controle = new ControleDeALunos();
		this.controle.cadastrarAluno("388093640", "Tayná Tavares", "Administração");
		this.controle.cadastrarAluno("118210158", "Helder Junior", "Ciência da Computação");
		this.controle.cadastrarAluno("893001228", "Gleyson", "Jogos Digitais");
		this.controle.cadastrarAlunosQueResponderam("388093640");
		this.controle.cadastrarAlunosQueResponderam("118210158");
		this.controle.cadastrarAlunosQueResponderam("893001228");
		
		String lista = "";
		lista += "Alunos:" + System.lineSeparator();
		lista += "1. 388093640 - Tayná Tavares - Administração" + System.lineSeparator();
		lista += "2. 118210158 - Helder Junior - Ciência da Computação" + System.lineSeparator();
		lista += "3. 893001228 - Gleyson - Jogos Digitais" + System.lineSeparator();
		lista = lista.trim();
		
		assertEquals(lista, this.controle.imprimirAlunosQueResponderamQuestoes());
		
	}
}

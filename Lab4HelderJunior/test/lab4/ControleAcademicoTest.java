package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControleAcademicoTest
{
	private ControleAcademico controle;
	
	@BeforeEach
	void testControleAcademico()
	{
		this.controle = null;
	}
	
	@Test
	void testNovoControleAcademico()
	{
		assertNull(this.controle);
		this.controle = new ControleAcademico();
		assertNotNull(this.controle);
	}
	
	@Test
	void testCadastrarAluno()
	{
		this.controle = new ControleAcademico();
		assertTrue(this.controle.cadastrarAluno("118210158", "Helder", "Computação"));
	}
	
	@Test
	void testCadastrarAlunoMatriculaExistente()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Ruan", "Pedagogia");
		assertFalse(this.controle.cadastrarAluno("118210158", "Pietro", "Letras"));
	}
	
	@Test
	void testCadastrarAlunoMatriculaNull()
	{
		try
		{
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
			this.controle.cadastrarAluno("118448796", "Rodolfo", " ");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testConsultarAluno()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("449853201", "David", "Matemática");
		Aluno aluno = this.controle.consultarAluno("449853201");
		assertEquals(aluno, this.controle.consultarAluno("449853201"));
	}
	
	@Test
	void testConsultarAlunoMatriculaNull()
	{
		try
		{
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
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
			this.controle = new ControleAcademico();
			this.controle.cadastrarAluno("123558479", "Jadison", "Jogos Digitais");
			this.controle.consultarAluno(" ");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch (IllegalArgumentException iae) {  }
	}
	
	@Test
	void testContemAluno()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("123558479", "Jadison", "Jogos Digitais");
		assertTrue(this.controle.contemAluno("123558479"));
	}
	
	@Test
	void testContemGrupo()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarGrupo("Código penal");
		assertTrue(this.controle.contemGrupo("Código penal"));
	}
	
	@Test
	void testCadastrarAlunosQueResponderam()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Helder Junior", "Ciência da Computação");
		assertTrue(this.controle.cadastrarAlunosQueResponderam("118210158"));
	}
	
	@Test
	void testCadastrarAlunosQueResponderamMatriculaInexistente()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("388093640", "Tayná Tavares", "Administração");
		assertFalse(this.controle.cadastrarAlunosQueResponderam("118110462"));
	}
	
	@Test
	void testImprimirAlunosQueResponderamQuestoes()
	{
		this.controle = new ControleAcademico();
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
	
	@Test
	void testNovoControleDeGrupo()
	{
		assertNull(this.controle);
		this.controle = new ControleAcademico();
		assertNotNull(this.controle);
	}

	@Test
	void testCadastrarGrupo()
	{
		this.controle = new ControleAcademico();
		assertTrue(this.controle.cadastrarGrupo("Funções do 2º grau"));
	}
	
	@Test
	void testCadastrarGrupoTemaExistente()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarGrupo("Logaritmos");
		assertFalse(this.controle.cadastrarGrupo("Logaritmos"));
	}
	
	@Test
	void testCadastrarGrupoTemaNull()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarGrupo(null);
		}
		catch(NullPointerException npe) {  }
	}
	
	@Test
	void testCadastrarGrupoTemaVazio()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarGrupo("");
		}
		catch(IllegalArgumentException iae) {  }
	}
	
	@Test
	void testCadastrarGrupoTemaEspacos()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarGrupo(" ");
		}
		catch(IllegalArgumentException iae) {  }
	}
	
	@Test
	void testAlocarAlunoEmGrupo()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Helder", "Computação");
		this.controle.cadastrarGrupo("IA");
		assertTrue(this.controle.alocarAlunoEmGrupo("118210158", "IA"));
	}
	
	@Test
	void testAlocarAlunoExistenteEmGrupo()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Helder", "Computação");
		this.controle.cadastrarGrupo("IA");
		this.controle.alocarAlunoEmGrupo("118210158", "IA");
		this.controle.alocarAlunoEmGrupo("118210158", "IA");
	}
	
	@Test
	void testAlocarAlunoInexistenteEmGrupo()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Helder", "Computação");
		this.controle.cadastrarGrupo("IA");
		assertFalse(this.controle.alocarAlunoEmGrupo("11574998", "IA"));
	}
	
	@Test
	void testAlocarAlunoEmGrupoInexistente()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Helder", "Computação");
		this.controle.cadastrarGrupo("IA");
		assertFalse(this.controle.alocarAlunoEmGrupo("11574998", "EDA"));
	}
	
	@Test
	void testAlocarAlunoEmGrupoMatriculaNull()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarAluno("118210158", "Helder", "Computação");
			this.controle.cadastrarGrupo("Português");
			this.controle.alocarAlunoEmGrupo(null, "OAC");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(NullPointerException npe) {  }
	}
	
	@Test
	void testAlocarAlunoEmGrupoMatriculaVazia()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarAluno("118210158", "Helder", "Computação");
			this.controle.cadastrarGrupo("Português");
			this.controle.alocarAlunoEmGrupo("", "Português");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(IllegalArgumentException iae) {  }
	}
	
	@Test
	void testAlocarAlunoEmGrupoMatriculaEspacos()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarAluno("118210158", "Helder", "Computação");
			this.controle.cadastrarGrupo("Português");
			this.controle.alocarAlunoEmGrupo(" ", "Português");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(IllegalArgumentException iae) {  }
	}
	
	@Test
	void testAlocarAlunoEmGrupoTemaNull()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarAluno("118210158", "Helder", "Computação");
			this.controle.cadastrarGrupo("Português");
			this.controle.alocarAlunoEmGrupo("118210158", null);
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(NullPointerException npe) {  }
	}
	
	@Test
	void testAlocarAlunoEmGrupoTemaVazio()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarAluno("118210158", "Helder", "Computação");
			this.controle.cadastrarGrupo("Português");
			this.controle.alocarAlunoEmGrupo("118210158", "");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(IllegalArgumentException iae) {  }
	}
	
	@Test
	void testAlocarAlunoEmGrupoTemaEspacos()
	{
		try
		{
			this.controle = new ControleAcademico();
			this.controle.cadastrarGrupo("Português");
			this.controle.alocarAlunoEmGrupo("118210158", " ");
			fail("Deveria ter gerado uma exceção de entrada inválida!");
		}
		catch(IllegalArgumentException iae) {  }
	}
	
	@Test
	void testImprimirGrupo()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Helder", "Computação");
		this.controle.cadastrarAluno("388093640", "Tayná Tavares", "Administração");
		this.controle.cadastrarAluno("893001228", "Gleyson", "Jogos Digitais");
		this.controle.cadastrarGrupo("Minecraft");
		this.controle.alocarAlunoEmGrupo("118210158", "Minecraft");
		this.controle.alocarAlunoEmGrupo("388093640", "Minecraft");
		this.controle.alocarAlunoEmGrupo("893001228", "Minecraft");
		
		String lista = "Alunos do grupo Minecraft" + System.lineSeparator();
		lista += "* 118210158 - Helder - Computação" + System.lineSeparator();
		lista += "* 893001228 - Gleyson - Jogos Digitais" + System.lineSeparator();
		lista += "* 388093640 - Tayná Tavares - Administração" + System.lineSeparator();
		lista = lista.trim();
		
		assertEquals(lista, this.controle.imprimirGrupo("Minecraft"));
	}
	
	@Test
	void testImprimirGrupoNaoCadastrado()
	{
		this.controle = new ControleAcademico();
		this.controle.cadastrarAluno("118210158", "Helder", "Computação");
		this.controle.cadastrarAluno("388093640", "Tayná Tavares", "Administração");
		this.controle.cadastrarAluno("893001228", "Gleyson", "Jogos Digitais");
		this.controle.cadastrarGrupo("Minecraft");
		this.controle.alocarAlunoEmGrupo("118210158", "Minecraft");
		this.controle.alocarAlunoEmGrupo("388093640", "Minecraft");
		this.controle.alocarAlunoEmGrupo("893001228", "Minecraft");
		
		assertEquals("Grupo não cadastrado.", this.controle.imprimirGrupo("Bioinformática"));
	}
}

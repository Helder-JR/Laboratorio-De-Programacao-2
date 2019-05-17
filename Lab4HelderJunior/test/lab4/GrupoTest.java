package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrupoTest
{
	private Grupo grupo;
	private Grupo outro;
	
	@BeforeEach
	void testGrupo()
	{
		this.grupo = null;
		this.outro = null;
	}
	
	@Test
	void testNovoGrupo()
	{
		assertNull(grupo);
		this.grupo = new Grupo("Teoria da Computação");
		assertNotNull(grupo);
	}
	
	@Test
	void testTema()
	{
		this.grupo = new Grupo("Informática e Sociedade");
		assertEquals("Informática e Sociedade", this.grupo.getTema());
	}
	
	@Test
	void testAlocaAluno()
	{
		this.grupo = new Grupo("Inteligência Artificial");
		Aluno aluno = new Aluno("123456", "Helder", "Computação");
		assertTrue(this.grupo.alocarAluno(aluno));
	}
	
	@Test
	void testContemAluno()
	{
		this.grupo = new Grupo("Cálculo 1");
		Aluno aluno = new Aluno("213654887", "Patrício", "Letras");
		this.grupo.alocarAluno(aluno);
		assertTrue(this.grupo.contemAluno(aluno));
	}
	
	@Test
	void testToString()
	{
		this.grupo = new Grupo("Cálculo 1");
		Aluno a1 = new Aluno("123777890", "Cristovam", "Mecânica");
		Aluno a2 = new Aluno("123324423", "Márcio", "Contábeis");
		this.grupo.alocarAluno(a1);
		this.grupo.alocarAluno(a2);
		
		String lista = "Alunos do grupo Cálculo 1" + System.lineSeparator();
		lista += "* 123324423 - Márcio - Contábeis" + System.lineSeparator();
		lista += "* 123777890 - Cristovam - Mecânica" + System.lineSeparator();
		lista = lista.trim();
		
		assertEquals(lista, this.grupo.toString());
	}
	
	@Test
	void testHashCode()
	{
		this.grupo = new Grupo("Lógica");
		Aluno a1 = new Aluno("192168001", "Matheus", "Engenharia Civil");
		Aluno a2 = new Aluno("388257094", "Francisco", "Administração");
		this.grupo.alocarAluno(a1);
		this.grupo.alocarAluno(a2);
		
		this.outro = new Grupo("Lógica");
		Aluno a3 = new Aluno("987014255", "Ivna", "Computação");
		Aluno a4 = new Aluno("382347282", "Marcela", "Direito");
		this.outro.alocarAluno(a3);
		this.outro.alocarAluno(a4);
		
		assertEquals(this.grupo.hashCode(), this.outro.hashCode());
	}
	
	@Test
	void testEquals()
	{
		this.grupo = new Grupo("GRASP");
		Aluno a1 = new Aluno("484333200", "Tayná", "Computação");
		Aluno a2 = new Aluno("383748301", "Carol", "Sociologia");
		this.grupo.alocarAluno(a1);
		this.grupo.alocarAluno(a2);
		
		this.outro = new Grupo("GRASP");
		Aluno a3 = new Aluno("918273645", "Maryanna", "Farmácia");
		Aluno a4 = new Aluno("011922384", "Michelle", "Engenharia Elétrica");
		this.grupo.alocarAluno(a3);
		this.grupo.alocarAluno(a4);
		
		assertTrue(this.grupo.equals(this.outro));
	}
	
	@Test
	void testEqualsTemasDiferentes()
	{
		this.grupo = new Grupo("Vetores");
		Aluno a1 = new Aluno("555789122", "Cláudia", "Educação Física");
		Aluno a2 = new Aluno("220294148", "Francis", "Fisioterapia");
		this.grupo.alocarAluno(a1);
		this.grupo.alocarAluno(a2);
		
		this.outro = new Grupo("Derivadas");
		Aluno a3 = new Aluno("910555445", "Gabrielly", "Economia");
		Aluno a4 = new Aluno("011922384", "Josenildo", "Engenharia de Materiais");
		this.grupo.alocarAluno(a3);
		this.grupo.alocarAluno(a4);
		
		assertFalse(this.grupo.equals(this.outro));
	}
	
	@Test
	void testEqualsMesmoObjeto()
	{
		this.grupo = new Grupo("Análise Assintótica de Algoritmos");
		Aluno a1 = new Aluno("100258799", "Flávia", "Ciências Sociais");
		Aluno a2 = new Aluno("220282648", "Giovana", "Computação");
		this.grupo.alocarAluno(a1);
		this.grupo.alocarAluno(a2);
		
		assertTrue(this.grupo.equals(this.grupo));
	}
	
	@Test
	void testEqualsObjetoNull()
	{
		this.grupo = new Grupo("Diagramas de Classes");
		Aluno a1 = new Aluno("104408799", "Rondinelle", "Engenharia Química");
		Aluno a2 = new Aluno("220009948", "Gaspar", "Computação");
		this.grupo.alocarAluno(a1);
		this.grupo.alocarAluno(a2);
		
		assertFalse(this.grupo.equals(null));
	}
	
	@Test
	void testEqualsClassesDiferentes()
	{
		this.grupo = new Grupo("Cinemática");
		Aluno a1 = new Aluno("000808799", "Franklin", "Ciência dos Dados");
		Aluno a2 = new Aluno("123409948", "Marta", "Medicina");
		this.grupo.alocarAluno(a1);
		this.grupo.alocarAluno(a2);
		
		Aluno aluno = new Aluno("232233233", "Iuri", "Engenharia Elétrica");
		
		assertFalse(this.grupo.equals(aluno));
	}
}

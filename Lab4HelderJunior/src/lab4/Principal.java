package lab4;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab. 4
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.0
 */
public class Principal
{
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ControleAcademico controle = new ControleAcademico();
		String opcao = "";
		char escolha;
		
		do
		{
			System.out.println("(C)adastrar Aluno");
			System.out.println("(E)xibir Aluno");
			System.out.println("(N)ovo Grupo");
			System.out.println("(A)locar Aluno no Grupo e Imprimir Grupo");
			System.out.println("(R)egistrar Aluno que Respondeu");
			System.out.println("(I)mprimir Alunos que Responderam");
			System.out.println("(O)ra, vamos fechar o programa!");
			System.out.println();
			System.out.print("Opção> ");
			
			opcao = entrada.nextLine().toUpperCase();
			
			System.out.println();
			
			Excecao.testarEntrada(opcao);
			
			escolha = opcao.charAt(0);
			
			switch(escolha)
			{
				case 'C':
				{
					menuCadastrarAluno(controle);
					break;
				}
				
				case 'E':
				{
					menuConsultarAluno(controle);
					break;
				}
				
				case 'N':
				{
					menuCadastrarGrupo(controle);
					break;
				}
				
				case 'A':
				{
					menuAlocarImprimirGrupos(controle);
					break;
				}
				
				case 'R':
				{
					menuRegistrarAlunoQueRespondeu(controle);
					break;
				}
				
				case 'I':
				{
					menuImprimirAlunosQueResponderam(controle);
					break;
				}
				
				case 'O':
				{
					break;
				}
			}
			
		}
		while (escolha != 'O');
	}

	/**
	 * Cadastro de um aluno no controle acadêmico. É necessário informar a matrícula que o aluno
	 * irá possuir, além de seu nome e curso. Caso o cadastro seja bem sucedido uma mensagem será
	 * exibida. O contrário também é válido.
	 * 
	 * @param controle o controle acadêmico que irá receber o cadastro do aluno.
	 * @since 1.0
	 */
	private static void menuCadastrarAluno(ControleAcademico controle)
	{
		System.out.print("Matrícula: ");
		String matricula = entrada.nextLine();
		Excecao.testarEntrada(matricula);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		Excecao.testarEntrada(nome);
		
		System.out.print("Curso: ");
		String curso = entrada.nextLine();
		Excecao.testarEntrada(curso);
		
		if (controle.cadastrarAluno(matricula, nome, curso))
			System.out.println("CADASTRO REALIZADO!");
		else
			System.out.println("MATRÍCULA JÁ CADASTRADA!");
		
		System.out.println();
	}
	
	/**
	 * Consulta de um aluno no controle acadêmico. Para a consulta ser realizada é necessário
	 * informar a matrícula do aluno requisitado. Caso esse aluno exista no controle será exibida
	 * uma mensagem com sua descrição. Caso contrário uma mensagem de também exibirá que o aluno
	 * não está cadastrado.
	 * 
	 * @param controle o controle acadêmico que terá o aluno consultado.
	 * @since 1.0
	 */
	private static void menuConsultarAluno(ControleAcademico controle)
	{
		System.out.print("Matrícula: ");
		String matricula = entrada.nextLine();
		Excecao.testarEntrada(matricula);
		
		if (controle.contemAluno(matricula))
			System.out.println("Aluno(a): " + controle.consultarAluno(matricula));
		else
			System.out.println("ALUNO NÃO CADASTRADO!");
		
		System.out.println();
	}
	
	/**
	 * Cadastro de um grupo de estudos no controle acadêmico. É necessário informar o tema de estudo
	 * que o grupo irá abordadr. Caso o cadastro ocorra com sucesso uma mensagem será exibida 
	 * informando. Caso o grupo já exista uma mensagem também informará essa condição ao usuário.
	 * 
	 * @param controle o controle acadêmico que irá receber o cadasto do grupo.
	 */
	private static void menuCadastrarGrupo(ControleAcademico controle)
	{
		System.out.print("Grupo: ");
		String tema = entrada.nextLine();
		Excecao.testarEntrada(tema);
		
		if(controle.cadastrarGrupo(tema))
			System.out.println("CADASTRO REALIZADO!");
		else
			System.out.println("GRUPO JÁ CADASTRADO!");
		
		System.out.println();
	}
	
	/**
	 * Alocação ou impressão de alunos em um grupo de estudos. Será necessário escolher entre uma
	 * das duas opções: A (ou a) para alocar o aluno em um grupo e I (ou i) para imprimir um grupo
	 * em questão. No caso de alocação será necessário informar a matrícula do aluno a ser alocado,
	 * bem como o tema do grupo a alocá-lo. Caso o aluno ou o grupo não estejam cadastrados uma
	 * mensagem será exibida e o método terminará. Caso o aluno consiga ser alocado outra mensagem
	 * será exibida informando ao usuário que a alocação foi bem sucedida. Para o caso de impressão
	 * do grupo é necessário inserir o tema do grupo a ser impresso. Caso o grupo não tenha esteja
	 * cadastrado uma mensagem será exibida, e do contrário o grupo de estudos será mostrado.
	 * 
	 * @param controle o controle acadêmico que irá alocar ou imprimir o grupo de estudos.
	 */
	private static void menuAlocarImprimirGrupos(ControleAcademico controle)
	{
		System.out.print("(A)locar aluno ou (I)mprimir Grupo? ");
		String opcao = entrada.nextLine();
		Excecao.testarEntrada(opcao);
		
		if (opcao.toUpperCase().charAt(0) == 'A')
		{
			System.out.print("Matrícula: ");
			String matricula = entrada.nextLine();
			Excecao.testarEntrada(matricula);
			
			if (!controle.contemAluno(matricula))
			{
				System.out.println("ALUNO NÃO CADASTRADO!");
				System.out.println();
				return;
			}
			
			System.out.print("Grupo: ");
			String tema = entrada.nextLine();
			Excecao.testarEntrada(tema);
			
			if (!controle.contemGrupo(tema))
			{
				System.out.println("GRUPO NÃO CADASTRADO!");
				System.out.println();
				return;
			}
			
			if (controle.alocarAlunoEmGrupo(matricula, tema))
				System.out.println("ALUNO ALOCADO!");
			
			System.out.println();
		}
		else if (opcao.toUpperCase().charAt(0) == 'I')
		{
			System.out.print("Grupo: ");
			String tema = entrada.nextLine();
			Excecao.testarEntrada(tema);
			
			System.out.println();
			
			if (controle.contemGrupo(tema))
				System.out.println(controle.imprimirGrupo(tema));
			else
				System.out.println("GRUPO NÃO CADASTRADO!");
			
			System.out.println();
		}
	}
	
	/**
	 * Registro de um aluno que respondeu questões no quadro. É necessário informar a matrícula
	 * referente ao aluno. Caso tudo ocorra bem uma mensagem será exibida informando que o aluno
	 * foi registrado, e do contrário uma mensagem de que o aluno não está cadastrado também será
	 * exibida.
	 * 
	 * @param controle o controle acadêmico que irá registrar o aluno que respondeu uma questão.
	 */
	private static void menuRegistrarAlunoQueRespondeu(ControleAcademico controle)
	{
		System.out.print("Matrícula: ");
		String matricula = entrada.nextLine();
		Excecao.testarEntrada(matricula);
		
		if (controle.contemAluno(matricula))
		{
			if(controle.cadastrarAlunosQueResponderam(matricula))
				System.out.println("ALUNO REGISTRADO!");
		}
		else
			System.out.println("ALUNO NÃO CADASTRADO!");
		
		System.out.println();
	}
	
	/**
	 * Imprime uma lista com os alunos que responderam questões no quadro. Essa lista será mostrada
	 * de acordo com a ordem em que os alunos que responderam foram registrados.
	 * 
	 * @param controle o controle que irá informar a lista dos alunos que responderam questões.
	 */
	private static void menuImprimirAlunosQueResponderam(ControleAcademico controle)
	{
		System.out.println(controle.imprimirAlunosQueResponderamQuestoes());
		System.out.println();
	}
}

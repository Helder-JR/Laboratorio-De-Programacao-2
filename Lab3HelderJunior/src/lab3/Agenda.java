package lab3;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab. 3
 * 
 * @author Helder Chaves Leite Junior - 118210158
 */
public class Agenda
{	
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		Contato agenda[] = new Contato[101];		
		
		char opcao;
		int ultimoCadastro = 0;
		
		do
		{
			System.out.println("(C)adastrar Contato");
			System.out.println("(L)istar Contatos");
			System.out.println("(E)xibir Contato");
			System.out.println("(S)air");
			System.out.println();
			System.out.print("Opção> ");
			
			opcao = entrada.nextLine().toUpperCase().charAt(0);
			
			switch (opcao)
			{
				case 'C':
				{
					System.out.print("Posição: ");
					int posicao = entrada.nextInt();
					entrada.nextLine();
					
					if (posicao < 1 || posicao > 100)
						break;
					else
					{
						System.out.print("Nome: ");
						String nome = entrada.nextLine();
						
						System.out.print("Sobrenome: ");
						String sobrenome = entrada.nextLine();
						
						System.out.print("Telefone: ");
						String telefone = entrada.nextLine();
						
						agenda[posicao] = new Contato(nome, sobrenome, telefone);
						
						System.out.println("CADASTRO REALIZADO!");
						System.out.println();
						
						if (posicao > ultimoCadastro)
							ultimoCadastro = posicao;
						
						break;
					}
				}
					
				case 'L':
				{
					for (int pos = 1; pos <= ultimoCadastro; pos++)
						if (agenda[pos] != null)
							System.out.println(pos + " - " + agenda[pos].getNomeSobrenome());
					
					System.out.println();
					
					break;
				}
				
				case 'E':
				{
					System.out.print("Contato> ");
					int posicao = entrada.nextInt();
					entrada.nextLine();
					System.out.println();
					
					if (posicao >= 1 && posicao <= 100 && agenda[posicao] != null)
						System.out.println(agenda[posicao]);
						
					else
						System.out.println("POSIÇÃO INVÁLIDA!");
					
					System.out.println();
					
					break;
				}
				
				case 'S':
				{
					break;
				}
				
				default:
				{
					System.out.println("OPÇÃO INVÁLIDA!");
					System.out.println();
				}
			}
		}
		while (opcao != 'S');
		
		entrada.close();
	}
}

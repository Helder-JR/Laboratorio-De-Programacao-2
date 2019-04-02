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
		
		char opcao;
		
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
				
			}
		}
		while (opcao != 'S');
		
		entrada.close();
	}
}

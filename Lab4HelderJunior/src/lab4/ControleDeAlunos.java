package lab4;

import java.util.Scanner;

public class ControleDeAlunos
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("(C)adastrar Aluno");
		System.out.println("(E)xibir Aluno");
		System.out.println("(N)ovo Grupo");
		System.out.println("(A)locar Aluno no Grupo e Imprimir Grupo");
		System.out.println("(R)egistrar Aluno que Respondeu");
		System.out.println("(I)mprimir Alunos que Responderam");
		System.out.println("(O)ra, vamos fechar o programa!");
		System.out.println();
		System.out.print("Opção> ");
		
		entrada.close();
	}
}

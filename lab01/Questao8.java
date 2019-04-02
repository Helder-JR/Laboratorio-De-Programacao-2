/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao8
{
    public static void calculaNotas(Scanner entrada)
    {
        String[] linha;
        int totalAcumulado = 0, quantidadeDeAlunos = 0, maiorNota = 0, menorNota = 1000, acimaDaMedia = 0, abaixoDaMedia = 0, mediaTotal = 0;

        do
        {
            linha = entrada.nextLine().split(" ");

            if (linha.length > 1)
            {
                int nota = Integer.parseInt(linha[1]);

                totalAcumulado += nota;
                quantidadeDeAlunos++;

                if (nota >= 700)
                    acimaDaMedia++;
                else
                    abaixoDaMedia++;
                
                if (nota > maiorNota)
                    maiorNota = nota;
                
                if (nota < menorNota)
                    menorNota = nota;
            }

        }
        while (!linha[0].equals("-"));
        
        mediaTotal = totalAcumulado / quantidadeDeAlunos;
        
        System.out.println("maior: " + maiorNota);
        System.out.println("menor: " + menorNota);
        System.out.println("media: " + mediaTotal);
        System.out.println("acima: " + acimaDaMedia);
        System.out.println("abaixo: " + abaixoDaMedia);
    }
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        calculaNotas(entrada);
        
        entrada.close();
    }
}
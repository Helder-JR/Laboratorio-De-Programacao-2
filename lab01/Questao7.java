/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao7
{
    public static String procuraNome(String[] nomes)
    {
        String novoNome = "";

        for (String nome : nomes)
            if (nome.length() == 5)
                novoNome = nome;
        
        if (novoNome != "")
            return novoNome;
        else
            return "?";
    }

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nome;
        
        do
        {
            String[] linha = entrada.nextLine().split(" ");
            nome = procuraNome(linha);

            if (!nome.equals("wally"))
                System.out.println(nome);
        }
        while (!nome.equals("wally"));

        entrada.close();
    }
}
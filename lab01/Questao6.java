<<<<<<< HEAD
/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao6
{
    public static int[] mapearInt(Scanner entrada)
    {
        String[] linha = entrada.nextLine().split(" ");

        int[] numero = new int[linha.length];

        int i = linha.length;

        while (i-- > 0)
            numero[i] = Integer.parseInt(linha[i]);
        
        return numero;
    }

    public static double calculaMedia(int[] numero)
    {
        double media = 0.0;
        
        for (int i = 0; i < numero.length; i++)
            media += numero[i];

        return media /= numero.length;
    }
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int[] numero = mapearInt(entrada);

        double media = calculaMedia(numero);

        for (int num : numero)
            if (num > media)
                System.out.print(num + " ");
        
        System.out.println();

        entrada.close();
    }
=======
/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao6
{
    public static int[] mapearInt(Scanner entrada)
    {
        String[] linha = entrada.nextLine().split(" ");

        int[] numero = new int[linha.length];

        int i = linha.length;

        while (i-- > 0)
            numero[i] = Integer.parseInt(linha[i]);
        
        return numero;
    }

    public static double calculaMedia(int[] numero)
    {
        double media = 0.0;
        
        for (int i = 0; i < numero.length; i++)
            media += numero[i];

        return media /= numero.length;
    }
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int[] numero = mapearInt(entrada);

        double media = calculaMedia(numero);

        for (int num : numero)
            if (num > media)
                System.out.print(num + " ");
        
        System.out.println();

        entrada.close();
    }
>>>>>>> 14cd11ad876628188470dd779b4c71a1f6443202
}
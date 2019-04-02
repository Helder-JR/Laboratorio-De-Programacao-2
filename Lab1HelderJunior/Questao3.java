/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao3
{
    public static void trueFalse(double n1, double n2)
    {
        if ((n1 + n2) / 2 >= 7.0)
            System.out.println("pass: True!");
        else
            System.out.println("pass: False!");
    }
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        trueFalse(entrada.nextDouble(), entrada.nextDouble());

        entrada.close();
    }
}
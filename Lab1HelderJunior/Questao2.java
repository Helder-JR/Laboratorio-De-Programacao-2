/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao2
{
    public static void dobroTriplo(int X)
    {
        System.out.println("dobro: " + (2 * X) + ", triplo: " + (3 * X));
    }

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        dobroTriplo(entrada.nextInt());

        entrada.close();
    }
}
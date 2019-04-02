/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao4
{
    public static void cresDecres(Scanner entrada)
    {
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        
        if (a < b && b < c && c < d)
        System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        else if (a > b &&  b > c && c > d)
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        else
        System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
    }
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        cresDecres(entrada);

        entrada.close();
    }
}
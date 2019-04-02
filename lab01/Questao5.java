/**
*** Laboratório de Programação 2 - Lab 1
*** 
*** @author Helder Chaves Leite Junior - 118210158
**/

import java.util.Scanner;

public class Questao5
{
    public static void calculadora(Scanner entrada)
    {
        switch (entrada.next())
        {
            case "+":
                System.out.println("RESULTADO: " + (entrada.nextDouble() + entrada.nextDouble()));
                break;
            
            case "-":
                System.out.println("RESULTADO: " + (entrada.nextDouble() - entrada.nextDouble()));
                break;
            
            case "*":
                System.out.println("RESULTADO: " + (entrada.nextDouble() * entrada.nextDouble()));
                break;
            
            case "/":
                double x = entrada.nextDouble();
                double y = entrada.nextDouble();
        
                if (y == 0.0)
                    System.out.println("ERRO");
                else
                    System.out.println("RESULTADO: " + (x / y));
                break;
        
            default:
                System.out.println("ENTRADA INVALIDA");
                break;
        }
    }
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        calculadora(entrada);
        
        entrada.close();
    }
}
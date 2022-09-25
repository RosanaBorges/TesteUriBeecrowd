package teste.mjv;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = entrada.nextDouble();
         entrada.close();

        double soma = num1 + num2;

       System.out.println("Resultado " + soma);

    }

    }



package teste.mjv.IfElse;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");

        int nota = entrada.nextInt();

        if (nota >= 0 && nota < 7) {
            System.out.println("REPROVADO");
        } else if (nota < 0) {
            System.out.println("Nota invalida, inferior nota 0");
        } else if (nota > 10) {
            System.out.println("Nota invalida, superior nota 10");
        } else {
            System.out.println("APROVADO");

        }
    }
}


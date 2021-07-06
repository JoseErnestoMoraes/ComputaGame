package JAVA;

import java.util.Scanner;

public class Questao_01 {
    public static void main(String[] args) throws Exception {
        Scanner valor = new Scanner(System.in);

        int A = valor.nextInt();
        int B = valor.nextInt();

        valor.close();

        int X = A + B;

        System.out.println("X = " + X);
    }
}


//referente ao exercicio 4 da apostila

//CODIGO COM ERRO - OS VALORES DE X1 E X2 RESULTAM NO MESMO NUMERO

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;
        double[] raiz;

        System.out.print("Valor de a ---> ");
        a = sc.nextDouble();

        if(a == 0) {
            System.out.println("Não é uma equação de segundo grau..");
        } else {
            System.out.print("Valor de b ---> ");
            b = sc.nextDouble();
            System.out.print("Valor de c ---> ");
            c = sc.nextDouble();

            delta = calcularDelta(a, b, c);
            if(delta < 0) {
                System.out.println("A equação não tem raiz real");
            } else {
                raiz = calcularRaiz(a, b, delta);

                System.out.println("x1 = " + raiz[0]);
                System.out.println("x2 = " + raiz[1]);
            }
        }
    }

    public static double calcularDelta (double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double[] calcularRaiz (double a, double b, double delta) {
        double[] raiz = new double[2];
        raiz[0] = (-b + Math.sqrt(delta)) / (2 * a);
        raiz[1] = (-b + Math.sqrt(delta)) / (2 * a);
        return raiz;
    }

}

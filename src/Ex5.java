//referente ao exercicio 5 da apostila

import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        int[] v = new int[5];

        preencher(v);
        System.out.println("Dados antes da inversão: ");
        imprimir(v);
        inverter(v);
        System.out.println("\nDados depois da inversão");
        imprimir(v);
    }

    public static void imprimir(int[] v) {
        for(int i : v) {
            System.out.print(i + " ");
        }
    }

    public static void preencher(int[] v) {
        Random rd = new Random();

        for(int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(1, 10);
        }
    }

    public static void inverter(int[] v) {
        int aux;

        for(int i = 0; i < v.length/2; i++) {
            aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
        }
    }
}

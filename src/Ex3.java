//referente ao exercicio 3 da apostila

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1, v2, v3;
        int maior;

        System.out.println("Valor 1 ---> ");
        v1 = sc.nextInt();
        System.out.println("Valor 2 ---> ");
        v2 = sc.nextInt();
        System.out.println("Valor 3 ---> ");
        v3 = sc.nextInt();

        maior = calcularMaior(v1,v2,v3);
        System.out.println("Maior valor: " + maior);
    }

    public static int calcularMaior(int v1, int v2, int v3) {
        if(v1 > v2 && v1 > v3){
            return v1;
        } else if (v2 > v3) {
            return v2;
        } else {
            return v3;
        }
    }
}

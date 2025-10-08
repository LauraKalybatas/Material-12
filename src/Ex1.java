//referente ao exercicio 1 da apostila

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Valor ---> ");
        valor = sc.nextInt();

        if(valor > 0){
            imprimirDivisor(valor);
        } else {
            System.out.println("Os valores devem ser positivos!");
        }
    }

    public static void imprimirDivisor(int valor) {
        for(int cont = 1; cont <= valor; cont++) {
            if(valor % cont == 0){
                System.out.println(-cont + ", " + cont);
            }
        }
    }
}

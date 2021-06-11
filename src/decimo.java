package src;

import java.util.Scanner;

public class decimo {
    Scanner ent = new Scanner(System.in);
    int[][] matriz = new int[3][4];
    int[][] transpuesta = new int[4][3];

    public static void main(String[] args) {
        decimo di = new decimo();
    }

    public decimo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese los valores de la matriz: ");
                matriz[i][j] = ent.nextInt();
            }
        }
        mostrar();
        transpuesta();
        mostrarTranspuesta();

    }

    public void mostrar() {
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public void transpuesta() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

    }

    public void mostrarTranspuesta() {
        System.out.println("TRANSPUESTA");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
              System.out.print(  transpuesta[i][j]+" ");
            }
            System.out.println("");
        }
    }

}

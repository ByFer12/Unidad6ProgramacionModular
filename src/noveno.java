package src;

import java.util.Scanner;

public class noveno {
    int[][] matriz1;
    int fila, col;
    int[][] matriz2;
    int[][] suma;
    Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        noveno nov = new noveno();
    }

    public noveno() {
        System.out.print("Ingrese el numero de filas: ");
        fila = ent.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        col = ent.nextInt();
        matriz1 = new int[fila][col];
        matriz2 = new int[fila][col];
        suma = new int[fila][col];

        if (fila == col) {

            System.out.println("LLENANDO LA PRIMERA MATRIZ");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    System.out.print("Ingrese el numero para lenar tu matriz ");
                    matriz1[i][j] = ent.nextInt();
                }
            }

            System.out.println("LLENANDO LA SEGUNDA MATRIZ");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    System.out.print("Ingrese el numero para llenar tu matriz: ");
                    matriz2[i][j] = ent.nextInt();
                }
            }

        } else {
            System.out.println("No se pueden sumar las matrices que no sean cuadradas");
        }
        sumar();
        mostrar();

    }

    public void mostrar() {
        System.out.println("MATRIZ A");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("MATRIZ B");
        for (int i = 0; i< matriz2.length; i++) {
           
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }

       System.out.println("");

        System.out.println("SUMA");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println("");
        }
     

        System.out.println("");
    }

    public void sumar() {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
            System.out.println("");
        }

    }

}

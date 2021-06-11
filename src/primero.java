package src;

import java.util.Scanner;

public class primero {
    Scanner ent = new Scanner(System.in);
    int[] num = new int[5];

    public static void main(String[] args) {

        primero pi = new primero();

    }

    public primero() {
        System.out.println("Ingresando los numeros: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + " Ingrese el numero: ");
            num[i] = ent.nextInt();
        }
        mostrarDatos();
    }

    public void mostrarDatos(){
        System.out.println("Los datos Ingresados son: ");
        for(int i=0; i<num.length;i++){
            System.out.print(num[i]+", ");
        }
        System.out.println("");
    }

}



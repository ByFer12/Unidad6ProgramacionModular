package src;

import java.util.Scanner;

public class tercero {
    Scanner ent = new Scanner(System.in);
    int[] num = new int[8];
    int aux1, aux2 = 0, aux3;

    public static void main(String[] args) {
        tercero t1 = new tercero();
    }

    public tercero() {
        System.out.println("Llenando el arreglo: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + " Ingrese un nunero: ");
            num[i] = ent.nextInt();
        }

        System.out.println("Ingrese e valor que desea buscar: ");
        aux1 = ent.nextInt();
        buscarNumero(aux1);

    }

    public void buscarNumero(int numero) {
        int cont = 0;
        while(cont<8 && num[cont]<numero){
            cont++;
        }
        if(cont==8){
            System.out.println("No se ha encontrado el numero: ");
        }else if(num[cont]==numero){
                System.out.println("EL numero ha sido encontrado!!: ");
            }else{
                System.out.println("El numero no ha sido encontrado...");
            }
        }
       

}

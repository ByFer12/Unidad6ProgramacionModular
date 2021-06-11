package src;

import java.util.Scanner;

public class octavo {

    Scanner ent = new Scanner(System.in);
    String[] pal1 = new String[5];
    String[] pal2 = new String[5];

    public static void main(String[] args) {
        octavo oc = new octavo();
    }

    public octavo() {
        System.out.println("llenando el primer arreglo...");
        for (int i = 0; i < pal1.length; i++) {
            System.out.println((i + 1) + " Ingrese una palabra: ");
            pal1[i] = ent.nextLine();
        }
        System.out.println("LLenando el segundo arreglo...");
        for (int i = 0; i < pal1.length; i++) {
            System.out.println((i+1)+" Ingrese una palabra");
            pal2 [i]= ent.nextLine();
        }
        tamaño();

    }

    public void tamaño(){
        if(pal1[0].length()==pal2[0].length()){
            System.out.println("Son iguales de tamaño");
            int tamaño=pal1[0].length();
            System.out.println("El tamaño de la palabra es: "+tamaño);
        }
    }

}

package src;

import java.util.Scanner;

public class onceavo {
    Scanner ent = new Scanner(System.in);
    String[] nombre = new String[6];
    double[] nota = new double[6];

    public static void main(String[] args) {
        onceavo on = new onceavo();
    }

    public onceavo() {
        System.out.println("NOMBRES DE LOS ESTUDIANTES");
        for (int i = 0;i<6; i++) {
            System.out.print("ingrese el nombre del estudiante: " + (i + 1)+" ");
            nombre[i] = ent.nextLine();
            
        }
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese la nota del estudiante: " + nombre[i]+" ");
            nota[i] = ent.nextInt();
            
        }
        mostrar();

    }

    public void mostrar() {
        for (int i = 0; i < 6; i++) {
            if (nota[i] < 5) {

                System.out.println(nombre[i] + " Su nota es de: " + nota[i] + " por lo tanto usted queda suspendido: ");
            } else if (nota[i] < 7 && nota[i] >= 5) {
                System.out.println(nombre[i] + " Su nota es de: " + nota[i] + " Será un bien: ");

            } else if (nota[i] < 9 && nota[i] >=7) {
                System.out.println(nombre[i] + " Su nota es de: " + nota[i] + " por lo tanto sera un notable : ");

            }else if(nota[i]<10 && nota[i]>=9){
                System.out.println(nombre[i]+" Su nota es de: "+nota[i]+" por lo tanto usted es un sobresaliente: ");

            }
        }
    }

}

package src;
import java.util.Scanner;

public class segundo {

    Scanner ent = new Scanner(System.in);
    int[] num = new int[10];
    int aleat, aux = 0, cont = 0;

    public static void main(String[] args) {
        segundo seg= new segundo();

    }

    public segundo() {
        System.out.println("LLenando el arreglo con numeros aleatorios: ");
        for (int i = 0; i < num.length; i++) {
            aleat = (int) (Math.random() * 100);
            System.out.println("El numero es: " + aleat);
            num[i] = aleat;
            if (aleat > aux) {
                aux = aleat;
                cont++;
            
            }
        

        }
        mostrarDatos();

    }

    public void mostrarDatos() {
        System.out.println("Mostrando los valores: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println("El numero mayor es: " + aux);
        System.out.println("El numero mayor se repitió: " + cont + " veces");
    }

}

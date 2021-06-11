package src;

import java.util.Scanner;

public class cuarto {
    /*
    Leer 10 valores de un array de enteros y deducir
cuál es la distancia que les separa del número
mayor. Los números ingresados en el array deben
de generarse aleatoriamente.
    */

    Scanner ent = new Scanner(System.in);
    int []num=new int [10];
    int mayor=0,menor=0,diferencia=0;
    public static void main(String[] args) {
        cuarto cu = new cuarto();
    }


    public cuarto(){
       
        for(int i=0;i<10;i++){
            int numer=(int)(Math.random()*100);
            num[i]=numer;
        }
        mayorMenor();

    }


    public void mayorMenor(){
        mayor=menor=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>mayor){
                mayor=num[i];
            }
            if(num[i]<menor){
                menor=num[i];
            }
        }
        diferencia=mayor-menor;
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("La distancia que separa el mayor con el menor es: "+diferencia);
    }
    
}

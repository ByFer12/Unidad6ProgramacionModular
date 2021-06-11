package src;
public class septimo {
    int [][]num=new int[4][3];
    int aleat,aux1=0,suma=0;
    public static void main(String[] args) {
        septimo sep = new septimo();
    }

    public septimo(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                aleat=(int)(Math.random()*555+1);
                num[i][j]=aleat;
            }
        }
        mostrar();
        
        sumar();

    }

    public void mostrar(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num[i][j]+"  ");
            }
            System.out.println("");
        }

    }

    public void sumar(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                suma+=num[1][j];
                aux1+=num[3][j];
            }
        }
        System.out.println("La suma de la primera fila par es de: "+suma);
        System.out.println("La suma de la segunda fila par es de: "+aux1);
    }
    
}

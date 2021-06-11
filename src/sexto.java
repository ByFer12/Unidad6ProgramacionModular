package src;
public class sexto {
    int [][]num={{5,6,13},
               {14,2,4},
               {21,7,6}};
    public static void main(String[] args) {
        sexto se = new sexto();
    }

    public sexto(){
        System.out.println("Multiplicandolo");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j]*=2;
            }
        }
        mostrando();

    }

    public void mostrando(){
        System.out.println("Resultado: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

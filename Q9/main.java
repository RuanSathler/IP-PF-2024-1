import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int ordem;

        ordem = ler.nextInt();
        matrizTrans mat = new matrizTrans(ordem);

        mat.ler();
        mat.Imprime();
        mat.ImprimeTransposta();
        

    }
}

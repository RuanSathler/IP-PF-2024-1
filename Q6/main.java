import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int tamL, tamC;

        tamL = ler.nextInt();
        tamC = ler.nextInt();
        matrizPrima mat = new matrizPrima(tamL, tamC);

        mat.ler();
        mat.Imprime();
        mat.somaPrimo();

    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        fibona fibo = new fibona();
        Scanner ler = new Scanner(System.in);

        int newValor;

        newValor = ler.nextInt();

        fibo.fibonacci(newValor);

        System.out.println(fibo.getFibonacci());

    }
}

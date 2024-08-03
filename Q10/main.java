public class main {
    public static void main(String[] args){
        vetorIntercalado vet1 = new vetorIntercalado();
        vetorIntercalado vet2 = new vetorIntercalado();

        vet1.ler();
        vet2.ler();

        vet1.imprimeIntercalado(vet2);
    }
}
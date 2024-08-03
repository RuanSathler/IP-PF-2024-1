import java.util.Scanner;

public class vetorIntercalado{
    private int[] mat;
    private int tamanho;


    vetorIntercalado(){
        this.setTamanho(5);
        mat = new int[this.getTamanho()];
    }

    private void setTamanho(int valor){
        this.tamanho = valor;
    }
    private int getTamanho(){
        return this.tamanho;
    }

    private void setElemento(int indx, int valor){
        mat[indx] = valor;
    }
    private int getElemento(int indx){
        return mat[indx];
    }


    public void ler(){
        Scanner ler = new Scanner(System.in);
        int cont, novoValor;
		for(cont = 0; cont < this.getTamanho(); cont++){
                novoValor = ler.nextInt();
				this.setElemento(cont, novoValor);			
		}
    }

    public void imprimeIntercalado(vetorIntercalado vet){
        int cont;
		for(cont = 0; cont < this.getTamanho(); cont++){
				System.out.print(this.getElemento(cont)+" ");
                System.out.print(vet.getElemento(cont)+" ");	
		}
    }

}

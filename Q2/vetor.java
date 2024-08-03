import java.util.Scanner;

public class vetor{
    private int[] mat;
    private int tamanho;


    vetor(){
        this.setTamanho(10);
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

    public void produtoEscalar(vetor vet2){
        int cont, novoValor;
        novoValor = 0;
		for(cont = 0; cont < this.getTamanho(); cont++){
                novoValor = novoValor + this.getElemento(cont)*vet2.getElemento(cont);			
		}
        System.out.println(novoValor);
    }

    public void ler(){
        Scanner ler = new Scanner(System.in);
        int cont, novoValor;
		for(cont = 0; cont < this.getTamanho(); cont++){
                novoValor = ler.nextInt();
				this.setElemento(cont, novoValor);			
		}
    }

}

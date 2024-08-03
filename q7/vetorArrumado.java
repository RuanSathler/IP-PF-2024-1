import java.util.Scanner;

public class vetorArrumado{
    private int[] mat;
    private int tamanho;


    vetorArrumado(){
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

    public void ler(){
        Scanner ler = new Scanner(System.in);
        int cont, novoValor;
		for(cont = 0; cont < this.getTamanho(); cont++){
                novoValor = ler.nextInt();
				this.setElemento(cont, novoValor);			
		}
    }

    private void trocaPosicao(int indx1, int indx2){
        int auxiliar;

        auxiliar = this.getElemento(indx1);
        this.setElemento(indx1, this.getElemento(indx2));
        this.setElemento(indx2, auxiliar);
    }

    public void Arrumar(){
        int cont1, cont2;
		for(cont1 = 0; cont1 < this.getTamanho(); cont1++){
			for(cont2 = cont1+1; cont2 < this.getTamanho(); cont2++){
                if(this.getElemento(cont1) < this.getElemento(cont2)){
                    this.trocaPosicao(cont1, cont2);
                }
            }
		}         
        this.imprime();
    }

    public void imprime(){
        int cont1;
		for(cont1 = 0; cont1 < this.getTamanho(); cont1++){
            System.out.print(this.getElemento(cont1)+ " ");
        }
	}        

}

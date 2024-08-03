import java.util.Scanner;

public class matriz {
    private int[][] mat;
    private int qntLinha;
    private int qntColuna;

    matriz(){
        this.setQntLinha(3);
        this.setQntColuna(3);
        mat = new int[this.getQntLinha()][this.getQntColuna()];
    }

    private void setQntLinha(int valor){
        this.qntLinha = valor;
    }
    private int getQntLinha(){
        return this.qntLinha;
    }

    private void setQntColuna(int valor){
        this.qntColuna = valor;
    }
    private int getQntColuna(){
        return this.qntColuna;
    }

    private void setElemento(int indLinha, int indColuna, int valor){
        mat[indLinha][indColuna] = valor;
    }
    private int getElemento(int indLinha, int indColuna){
        return mat[indLinha][indColuna];
    }

    private void somaComINteiro(int aumento){
        int contL,contC, novoValor;
		for(contL = 0; contL < this.getQntLinha(); contL++){
			for(contC = 0; contC < this.getQntColuna(); contC++){
                novoValor = this.getElemento(contL, contC)+2;
				System.out.print(novoValor+" ");
			}
            System.out.println();
		}
    }

    public void lerEImprime(){
        Scanner ler = new Scanner(System.in);
        int contL,contC, novoValor;
		for(contL = 0; contL < this.getQntLinha(); contL++){
			for(contC = 0; contC < this.getQntColuna(); contC++){
                novoValor = ler.nextInt();
				this.setElemento(contL, contC, novoValor);
			}
		}
        novoValor = ler.nextInt();
        this.somaComINteiro(novoValor);
    }

}

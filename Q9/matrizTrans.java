import java.util.Scanner;

public class matrizTrans{
    private int[][] mat;
    private int qntLinha;
    private int qntColuna;

    matrizTrans(int ordem){
        this.setQntLinha(ordem);
        this.setQntColuna(ordem);
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

    public void ImprimeTransposta(){
        int contL,contC;
        System.out.println("Matriz Transposta");
		for(contL = 0; contL < this.getQntLinha(); contL++){
			for(contC = 0; contC < this.getQntColuna(); contC++){
				System.out.print(this.getElemento(contC, contL)+" ");
			}
            System.out.println();
		}
    }

    public void Imprime(){
        int contL,contC;
        System.out.println("Matriz A");
		for(contL = 0; contL < this.getQntLinha(); contL++){
			for(contC = 0; contC < this.getQntColuna(); contC++){
				System.out.print(this.getElemento(contL, contC)+" ");
			}
            System.out.println();
		}
    }

    public void ler(){
        Scanner ler = new Scanner(System.in);
        int contL,contC, novoValor;
		for(contL = 0; contL < this.getQntLinha(); contL++){
			for(contC = 0; contC < this.getQntColuna(); contC++){
                novoValor = ler.nextInt();
				this.setElemento(contL, contC, novoValor);
			}
		}
    }

}

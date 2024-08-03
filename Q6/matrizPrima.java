import java.util.Scanner;

public class matrizPrima{
    private int[][] mat;
    private int qntLinha;
    private int qntColuna;

    matrizPrima(int tempTamL, int tempTamC){
        this.setQntLinha(tempTamL);
        this.setQntColuna(tempTamC);
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



    public void Imprime(){
        int contL,contC;
        System.out.println("Matriz");
		for(contL = 0; contL < this.getQntLinha(); contL++){
			for(contC = 0; contC < this.getQntColuna(); contC++){
				System.out.print(this.getElemento(contL, contC)+" ");
			}
            System.out.println();
		}
    }

    public void somaPrimo(){
        int contL, contC, somatorio, tempValor;
        somatorio = 0;

		for(contL = 0; contL < this.getQntLinha(); contL++){
			for(contC = 0; contC < this.getQntColuna(); contC++){
                tempValor = this.getElemento(contL, contC);
                if(tempValor==2){
                    somatorio = somatorio +2;
                }
                else{
                    if(this.numeroHePrimo(tempValor)){
                        somatorio = somatorio + this.getElemento(contL, contC);
                    }
                }
			}
		}

        System.out.println("Soma Primos: "+somatorio);
    }

    public boolean numeroHePrimo(int numeroTeste){
        boolean numeroHePrimo;
        int divisor, resto;
        divisor = 2;
        numeroHePrimo = true;

        if(numeroTeste<2){
            numeroHePrimo = false;
        }
        else{
            while((divisor< numeroTeste) && (numeroHePrimo)){
				resto = numeroTeste % divisor;
				if(resto == 0){
					numeroHePrimo = false;
				}
				divisor = divisor +1;
			}
        }

        return numeroHePrimo;
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

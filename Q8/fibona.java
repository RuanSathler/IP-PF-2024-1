public class fibona{
    private int fibonacci;

    fibona(){
        this.setFibonacci(0);
    }

    public  void setFibonacci(int tempFib){
        this.fibonacci = tempFib;
    }
    public int getFibonacci(){
        return this.fibonacci;
    }

    public int fibonacci(int valor){

        if (valor <= 1) {
            this.setFibonacci(valor);
        } else {
            this.setFibonacci(fibonacci(valor - 1) + fibonacci(valor - 2));
        }

        return this.getFibonacci();
    }
}

interface Calculadora {

    int somar(int a, int b);

    // não precisa de implementação, é herdado
    default int multiplicar(int a, int b){
        return a * b;
    }
}

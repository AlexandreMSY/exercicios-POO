public class ClasseTeste {
    String palavra;
    int numero;

    public ClasseTeste(String palavra, int numero){                  //construtor
        this.palavra = palavra;
        this.numero = numero;
    }

    public void modificarAtributos(String palavra, int numero){    // encapsulação
        this.palavra = palavra;                                    // setter
        this.numero = numero;
    }

    public void mostrarAtributos(){
        System.out.println(palavra);                               //getter, no caso sem retorno
        System.out.println(numero);
    }

}

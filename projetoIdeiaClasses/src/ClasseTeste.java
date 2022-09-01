public class ClasseTeste {
    String palavra;
    int numero;

    public ClasseTeste(String palavra, int numero){
        this.palavra = palavra;
        this.numero = numero;
    }

    public void mostrarAtributos(){
        System.out.println(palavra);
        System.out.println(numero);
    }
}

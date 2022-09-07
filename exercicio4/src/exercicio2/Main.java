package exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Daniel", 0, 'A');
        ContaCorrente conta2 = new ContaCorrente("Marcelo", 0, 1000, 'G');

        conta1.depositar(50);
        conta2.depositar(100);

        conta1.sacar(10);
        conta2.sacar(50);

        conta1.imprimeDados();
        conta2.imprimeDados();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long numero1 = 0, numero2 = 1, fibonacci;
        String numerosSequencia = "", escolha;

        System.out.println("Sequencia Fibonacci");

        do {
            fibonacci = numero1 + numero2;

            numero2 = numero1;
            numero1 = fibonacci;

            numerosSequencia += fibonacci + " ";

            System.out.println(numerosSequencia);
            System.out.print("Digite x para continuar, qualquer outra letra para parar: ");
            escolha = input.next().toLowerCase();

        }while(escolha.equals("x"));

    }
}


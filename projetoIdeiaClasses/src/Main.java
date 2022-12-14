import java.util.ArrayList;
import java.util.Scanner;

/*
Referência futura para o projeto interdisciplinar.
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<ClasseTeste> objetos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int numero;
        int escolha;
        int objetoEscolhido;
        String palavra;

        while(true){
            System.out.println("1 - adicionar | 2 - mostrar atributos | 3 - modificar atributo | 4 - sair");
            escolha = Integer.parseInt(input.nextLine());

            if (escolha == 1) {
                System.out.print("Entre com um numero: ");
                numero = Integer.parseInt(input.nextLine()); //usar apenas o nextInt() faz o loop voltar para o inicio por algum motivo
                System.out.print("Entre com uma palavra: ");
                palavra = input.nextLine();

                ClasseTeste objeto = new ClasseTeste(palavra, numero);
                objetos.add(objeto);
            } else if (escolha == 2) {
                for (ClasseTeste objeto : objetos) {
                    objeto.mostrarAtributos();
                }
            } else if (escolha == 3) {
                System.out.print("Há " + objetos.size() + " objetos, escolha qual modificar: ");
                objetoEscolhido = Integer.parseInt(input.nextLine()) - 1;

                System.out.print("Entre com um numero: ");
                numero = Integer.parseInt(input.nextLine()); //usar apenas o nextInt() faz o loop voltar para o inicio por algum motivo
                System.out.print("Entre com uma palavra: ");
                palavra = input.nextLine();

                objetos.get(objetoEscolhido).modificarAtributos(palavra, numero);

                System.out.println("Novos atributos: ");
                objetos.get(objetoEscolhido).mostrarAtributos();
            } else {
                input.close();
                break;
            }
        }
    }
}

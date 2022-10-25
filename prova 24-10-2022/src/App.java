import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Scanner leia = new Scanner(System.in);
        String nome, raca, tutor, porte, corPelo;
        int idade;
        String escolha;

        do{
            System.out.println("""
                    1 - Cadastrar Cachorro
                    2 - Listar Cachorros
                    3 - Cadastrar Gato
                    4 - Listar Gatos
                    sair para sair do programa
                    """);

            System.out.print("Escolha: ");
            escolha = leia.next().toLowerCase();

            switch(escolha){
                case "1":
                    System.out.print("Nome: ");
                    nome = leia.next();
                    System.out.print("Raca: ");
                    raca = leia.next();
                    System.out.print("Idade: ");
                    idade = leia.nextInt();
                    System.out.print("Tutor: ");
                    tutor = leia.next();
                    System.out.print("Porte: ");
                    porte = leia.next();
                    System.out.print("Cor pelo: ");
                    corPelo = leia.next();


                    cachorro.setNome(nome);
                    cachorro.setRaca(raca);
                    cachorro.setIdade(idade);
                    cachorro.setTutor(tutor);
                    cachorro.setCorPelo(corPelo);
                    cachorro.setPorte(porte);

                    break;

                case "2":
                    System.out.println(cachorro.toString());
                    break;

                case "3":
                    System.out.print("Nome: ");
                    nome = leia.next();
                    System.out.print("Raca: ");
                    raca = leia.next();
                    System.out.print("Idade: ");
                    idade = leia.nextInt();
                    System.out.print("Tutor: ");
                    tutor = leia.next();
                    System.out.print("Cor pelo: ");
                    corPelo = leia.next();

                    gato.setNome(nome);
                    gato.setRaca(raca);
                    gato.setIdade(idade);
                    gato.setTutor(tutor);
                    gato.setCorPelo(corPelo);

                    break;
                
                case "4":
                    System.out.println(gato.toString());

            }

        }while(!escolha.equals("sair"));
        leia.close();
    }
}

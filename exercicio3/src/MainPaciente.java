import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("RG: ");
        String rg = input.nextLine();
        System.out.print("Endereço: ");
        String endereco = input.nextLine();
        System.out.print("Telefone: ");
        String telefone = input.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = input.nextLine();
        System.out.print("Profissão: ");
        String profissao = input.nextLine();

        Paciente paciente = new Paciente(
                nome,
                rg,
                endereco,
                telefone,
                dataNascimento,
                profissao);

        String dadosPaciente = "Nome: " + paciente.nome + "\n"
                + "RG: " + paciente.rg + "\n"
                + "Endereço: " + paciente.endereco + "\n"
                + "Telefone: " + paciente.telefone + "\n"
                + "Data de nascimento: " + paciente.dataNascimento + "\n"
                + "Profissão: " + paciente.profissao;

        System.out.println(dadosPaciente);
    }
}

package exercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente("fulano", "1234", "Rua X", "1234560", 1999, "profissaoX");
        int idade;

        paciente2.cadastraDados();
        idade = paciente2.calculaIdade(2022);
        paciente2.imprimeDados();
        JOptionPane.showMessageDialog(null, "Idade: " + idade);

    }
}

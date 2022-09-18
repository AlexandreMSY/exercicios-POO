package exercicio2;

import javax.swing.*;

public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

    public Paciente() {
    }

    public Paciente(String nome, String rg, String endereco, String telefone, int anoNascimento, String profissao) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.anoNascimento = anoNascimento;
        this.profissao = profissao;
    }

    public void cadastraDados(){
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.rg = JOptionPane.showInputDialog("RG: ");
        this.endereco = JOptionPane.showInputDialog("Endereço ");
        this.telefone = JOptionPane.showInputDialog("Telefone: ");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento: "));
        this.profissao = JOptionPane.showInputDialog("Profissão: ");
    }

    public void imprimeDados(){
        String dados = "Nome: " + this.nome + "\n" +
                "RG: " + this.rg + "\n" +
                "Endereço: " + this.endereco + "\n" +
                "Telefone: " + this.telefone + "\n" +
                "Ano de Nascimento: " + this.anoNascimento + "\n" +
                "Profissão: " + this.profissao + "\n";

        JOptionPane.showMessageDialog(null, dados);
    }

    public int calculaIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }
}

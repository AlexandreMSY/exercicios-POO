package exercicio1;

import javax.swing.*;

public class Curso{
    String nome;
    int quantidadeAlunos;
    String turma;
    float mensalidade;

    public Curso() {
    }

    public Curso(String nome, int quantidadeAlunos, String turma, float mensalidade) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.turma = turma;
        this.mensalidade = mensalidade;
    }

    public void cadastraCurso(){
        this.nome = JOptionPane.showInputDialog("Nome do curso: ");
        this.quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: "));
        this.turma = JOptionPane.showInputDialog("Turma: ");
        this.mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Mensalidade: "));
    }

    public void imprimeDados(){
        String detalhesCurso = "Nome: " + this.nome + "\n" +
                "Quantidade de Alunos " + this.quantidadeAlunos  + "\n" +
                "Turma: " + this.turma + "\n" +
                "Mensalidade: " + this.mensalidade + "\n" +
                "Total Mensalidade: " + this.calculaTotalMensalidade();

        String texto = "Informações curso: " + detalhesCurso;
        JOptionPane.showMessageDialog(null, texto);
    }

    public float calculaTotalMensalidade(){
        return this.mensalidade * this.quantidadeAlunos;
    }
}
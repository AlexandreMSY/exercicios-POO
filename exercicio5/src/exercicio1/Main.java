package exercicio1;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso("ADS", 300, "Manhã", 300);

        curso2.cadastraCurso();
        curso2.imprimeDados();
    }
}

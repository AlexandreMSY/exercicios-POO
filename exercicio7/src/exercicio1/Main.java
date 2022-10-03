package exercicio1;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario(23, 1500, "estagiario");

        float aumento30Porcento = funcionario2.calculaAumento((float) 30);
        float aumento2Anos = funcionario2.calculaAumento(2);

        System.out.println("Funcionario2");
        System.out.println("Aumento 30% : " + aumento30Porcento);
        System.out.println("Aumento 2 anos : " + aumento2Anos);
    }
}

package exercicio1;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo(12, 8);

        float triangulo1Area = triangulo1.calculaArea();
        String triangulo1Resultado = triangulo1.imprimeDados(triangulo1Area);

        float triangulo2Area = triangulo2.calculaArea();
        String triangulo2Resultado = triangulo2.imprimeDados(triangulo2Area);

        System.out.println("Triangulo 1: " + triangulo1Resultado);
        System.out.println("Triangulo 2: " + triangulo2Resultado);

        Data data1 = new Data();
        Data data2 = new Data(7,9,2022);

        data1.imprimeData();
        data2.imprimeData();
    }
}

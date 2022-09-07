package exercicio1;

public class Triangulo {
    float base;
    float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calculaArea(){
        float area = this.base * this.altura / 2;
        return area;
    }

    public String imprimeDados(float area){
        String resultado = "A area do triângulo é " + area + "cm²";
        return resultado;
    }
}

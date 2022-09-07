package exercicio1;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimeData(){
        System.out.println("Data: " + this.dia + " / " + this.mes + " / " + this.ano);
    }
}

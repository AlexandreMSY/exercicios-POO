package exercicio2;

public class ContaCorrente {
    String nome;
    float saldo;
    float limite;
    char tipo;

    public ContaCorrente() {
    }

    public ContaCorrente(String nome, float saldo, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public ContaCorrente(String nome, float saldo, float limite, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }

    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(float valor){
        this.saldo = this.saldo - valor;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + this.nome + '\n' +
        "Saldo: " + this.saldo + '\n' +
        "Limite: " + this.limite + '\n' +
        "Tipo: " + this.tipo);
    }
}

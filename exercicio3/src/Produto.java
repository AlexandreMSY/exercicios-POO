public class Produto {
    String marca;
    String fabricante;
    String codigoBarras;
    float preco;

    public Produto(){}

    public Produto(String marca, String fabricante, String codigoBarras, float preco){
        this.marca = marca;
        this.fabricante = fabricante;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
    }
}

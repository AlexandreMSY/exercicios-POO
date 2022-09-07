import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = input.nextLine();
        System.out.print("Fabricante: ");
        String fabricante = input.nextLine();
        System.out.print("Código de barras: ");
        String codigoBarras = input.nextLine();
        System.out.print("Preço: ");
        float preco = input.nextFloat();

        Produto produto = new Produto(
                marca,
                fabricante,
                codigoBarras,
                preco);

        String dadosProduto = "Marca: " + produto.marca + "\n" +
                "Fabricante: " + produto.fabricante + "\n" +
                "Código de barras: " + produto.codigoBarras + "\n" +
                "Preço: " + produto.preco;

        System.out.println(dadosProduto);
    }
}

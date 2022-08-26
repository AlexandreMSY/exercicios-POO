import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com a base maior: ");
        int baseMaior = input.nextInt();
        System.out.print("Entre com a base menor: ");
        int baseMenor = input.nextInt();
        System.out.print("Entre com a altura: ");
        int altura = input.nextInt();
        int areaTrapezio = (baseMaior + baseMenor) * altura / 2;
        System.out.println("Area do trapézio: " + areaTrapezio);
        input.close();
    }
}

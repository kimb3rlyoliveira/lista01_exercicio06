import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double raio;
        
        System.out.print("Insira o raio do círculo: ");

        Scanner teclado = new Scanner(System.in);
        raio = teclado.nextDouble();

        double area = 3.14159*(raio*raio);
        System.out.println("A área do círculo é de: " + area);
    }
}
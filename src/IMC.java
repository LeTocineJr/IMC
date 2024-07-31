import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura, peso, imc;
        System.out.println("Ingresa tu Altura ");
        altura = scanner.nextDouble();
        System.out.println("Ingresa tu Peso ");
        peso = scanner.nextDouble();

        imc = peso / (Math.pow(altura,2));
        System.out.println("Tu IMC es: " + imc);
    }
}

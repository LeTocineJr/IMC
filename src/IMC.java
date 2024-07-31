import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //Se crea la clase escaner
        Scanner scanner = new Scanner(System.in);

        double altura, peso, imc;
        //SOlicita los datos al usuario
        System.out.println("Ingresa tu Altura ");
        altura = scanner.nextDouble();
        System.out.println("Ingresa tu Peso ");
        peso = scanner.nextDouble();
        //Formula de IMC
        imc = peso / (Math.pow(altura,2));
        //Imprime resultado
        System.out.println("Tu IMC es: " + imc);
    }
}

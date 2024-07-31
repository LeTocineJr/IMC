import javax.swing.*;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        double altura, peso, imc;
        //Solicita los datos al usuario
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu Altura"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu Peso"));

        //Formula de IMC
        imc = weight / (Math.pow(height,2));
        //Imprime resultado
        JOptionPane.showMessageDialog(null,"Tu IMC es: " + imc);
    }
}

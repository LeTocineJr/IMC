import javax.swing.*;
import java.text.DecimalFormat;

public class IMC {
    public static void main(String[] args) {
        //Creamos la clase DecimalFormat
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        //Solicita los datos al usuario
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu Altura"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu Peso"));

        //Formula de IMC
        double IMC = weight / (Math.pow(height,2));
        //Imprime resultado
        JOptionPane.showMessageDialog(null,"Tu IMC es: " + decimalFormat.format(IMC));
    }
}
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
        //Flujo de control para validar Peso
        if (IMC >= 40){
            JOptionPane.showMessageDialog(null, "Presentas Obesidad grado 3." + "\n" + "Tu IMC es: " + decimalFormat.format(IMC));
        } else if (IMC >= 35.5) {
            JOptionPane.showMessageDialog(null, "Presentas Obesidad grado 2." + "\n" + "Tu IMC es: " + decimalFormat.format(IMC));
        } else if (IMC >= 30.0) {
            JOptionPane.showMessageDialog(null, "Presentas Obesidad grado 1." + "\n" + "Tu IMC es: " + decimalFormat.format(IMC));
        } else if (IMC >= 25.0) {
            JOptionPane.showMessageDialog(null,"Padeses de Sobrepeso" + "\n" + "Tu IMC es: " + decimalFormat.format(IMC));
        } else if (IMC >= 18.5) {
            JOptionPane.showMessageDialog(null, "Tienes un peso adecuado" + "\n" +"Tu IMC es: " + decimalFormat.format(IMC));
        } else if (IMC < 18.5){
            JOptionPane.showMessageDialog(null,"Tienes bajo peso" + "\n" + "Tu IMC es: " + decimalFormat.format(IMC));
        }
    }
}
import javax.swing.*;

public class Ventanas {
  public static void main(String[] args){
    int numero = 0;
//El parámetro JOptionPane muestra una ventana una vez se ejecuta el código y el método showInputDialog deja introducir datos que quedan guardados como tipo string
    String numeroStr = JOptionPane.showInputDialog(null, "introduce un número");

    try {
      numero = Integer.parseInt(numeroStr);
    }catch (NumberFormatException e){
      JOptionPane.showMessageDialog(null, "introduce un valor que sea numérico");
      main(args);
      System.exit(0);
    }
    // ----------------------------------------Binario--------------------------------------------//
    String resultadoBi = "El valor en binario de " + numero + " es: " + Integer.toBinaryString(numero);
    System.out.println(resultadoBi);
    // ----------------------------------------Hexadecimal--------------------------------------------//
    String resultadoHex = "El valor en hexadecimal de " + numero + " es " + Integer.toHexString(numero);
    System.out.println(resultadoHex);
    // ----------------------------------------octal--------------------------------------------//
    String resultadoOct = "El valor en octal de " + numero + " es " + Integer.toOctalString(numero);
    System.out.println(resultadoOct);

    String mensaje = resultadoBi;
    mensaje += "\n" + resultadoHex;
    mensaje += "\n" + resultadoOct;
//El parámetro showMessageDialog muestra un texto en la ventana
    JOptionPane.showMessageDialog(null, mensaje);
  }
}
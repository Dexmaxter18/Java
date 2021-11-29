import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);         //aquí se está creando un objeto de la clase Scanner y se le pasa el parámetro System.in para que se pueda introducir datos por la consola
    System.out.println("ingrese un número entero");
    int numero = 0;

    try{
      numero = scanner.nextInt();         //aquí se le está pasando el método nextInt a la variable scanner que lo que hace es convertir un string a entero
    }catch (InputMismatchException e){
      System.out.println("Error ingrese un valor numérico");
      main(args);
      System.exit(0);
    }

    // ----------------------------------------Binario--------------------------------------------//
    String resultadoBi = "El valor en binario de " + numero + " es: " + Integer.toBinaryString(numero);
    // ----------------------------------------Hexadecimal--------------------------------------------//
    String resultadoHex = "El valor en hexadecimal de " + numero + " es " + Integer.toHexString(numero);
    // ----------------------------------------octal--------------------------------------------//
    String resultadoOct = "El valor en octal de " + numero + " es " + Integer.toOctalString(numero);

    String mensaje = resultadoBi;
    mensaje += "\n" + resultadoHex;
    mensaje += "\n" + resultadoOct;

    System.out.println(mensaje);
  }
}
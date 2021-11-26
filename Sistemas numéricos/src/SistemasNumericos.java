public class SistemasNumericos {
	public static void main(String[] args) {
		var numero = 100;
		// ----------------------------------------Binario--------------------------------------------//
		// El sistema binario solo se utilizan los números 0 y 1, y para que la máquina
		// virtual de java reconozca que se está introduciendo un valor en binario se
		// utiliza el prefijo 0b
		System.out.println("El valor en binario de " + numero + " es: " + Integer.toBinaryString(numero));
		int numeroBinario = 0b100101111010;
		System.out.println("El valor de numeroBinario en decimal es: " + numeroBinario);
		// ----------------------------------------Hexadecimal--------------------------------------------//
		// En el sistema hexadecimal se utiliza un sistema alfanumérico en el cual se
		// utilizan los números del 0 al 9 y para los números del 10 al 15 se remplazan
		// con las letras de la (A) a la (F).
		// Para que la máquina virtual de java reconozca que se le está introduciendo un
		// valor en hexadecimal se utiliza el prefijo 0x
		System.out.println("El valor en hexadecimal de " + numero + " es " + Integer.toHexString(numero));
		int numeroHexadecimal = 0x1a4e29f;
		System.out.println("El valor de numeroHexadecimal en decimal es:" + numeroHexadecimal);
		// ----------------------------------------octal--------------------------------------------//
		// En el sistema octal se utilizan los números del o al 7, y para que la máquina
		// virtual de java reconozca que se le está pasando un valor en octal se utiliza
		// el prefijo 0
		System.out.println("El valor en octal de " + numero + " es " + Integer.toOctalString(numero));
		int numeroOctal = 01734773;
		System.out.println("El valor de numeroOctal en decimal es:" + numeroOctal);
	}
}
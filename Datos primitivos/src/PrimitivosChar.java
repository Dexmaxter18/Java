public class PrimitivosChar {
	public static void main(String[] args){
//----------------------------------------char--------------------------------------------//
//La variable de tipo char (tipo de dato primitivo) almacena un único carácter y para definir un símbolo con el código unicode se envuelve este mismo en comillas simples ('). Ocupa un espacio de 2 bytes y 16 bites en memoria
		char caracter = '\u0376';
		char simbolo = 163;
		char figura = '@';
		System.out.println(caracter);
		System.out.println(simbolo);
		System.out.println(figura);
		System.out.println(Character.BYTES);
		System.out.println(Character.SIZE);
//caracteres especiales
		char espacio = '\u0020';
		char tabulacion = '\t';
		char saltoDeLinea = '\n';
		char retroceso = '\b';
		char retornoDeCarro = '\r';				//El retorno de carro borra lo que se encuentre antes de él, pero solo si se le concatena algo después
		System.out.println("esto tiene un tamaño en bytes de:" + espacio + Character.BYTES);
		System.out.println("esto tiene un tamaño en bites de:" + tabulacion + Character.SIZE);
		System.out.println("esto tiene un tamaño en bytes de:" + saltoDeLinea + Character.BYTES);
		System.out.println("esto tiene un tamaño en bites de:" + retroceso + Character.SIZE);
		System.out.println("esto tiene un tamaño en bytes de:" + retornoDeCarro + Character.BYTES);
		System.out.println("hola" + System.lineSeparator() + "como estas?");
	}
}

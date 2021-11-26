public class PrimitivosEnteros {
	public static void main(String[] args) {
//----------------------------------------byte--------------------------------------------//
//Las variables de tipo byte (tipo de dato primitivo) son las más pequeñas y que ocupan menos espacio en memoria
		byte numeroBytePositivo = 127;
		byte numeroByteNegativo = -128;
		System.out.println("numeroBytePositivo = " + numeroBytePositivo);
		System.out.println("numeroByteNegativo = " + numeroByteNegativo);
		System.out.println("La variable de tipo byte en bytes ocupa " + Byte.BYTES);
		System.out.println("La variable de tipo byte en bites ocupa " + Byte.SIZE);
		System.out.println("La variable de tipo byte solo puede almacenar desde " + Byte.MIN_VALUE + " hasta " + Byte.MAX_VALUE);
//----------------------------------------short--------------------------------------------//
//La variable tipo short (tipo de dato primitivo) es más grande que la de tipo byte y ocupan el doble de espacio en memoria
		short numeroShortPositivo = 32767;
		short numeroShortNegativo = -32768;
		System.out.println("numeroShortPositivo = " + numeroShortPositivo);
		System.out.println("numeroShortNegativo = " + numeroShortNegativo);
		System.out.println("La variable de tipo short en bytes ocupa " + Short.BYTES);
		System.out.println("La variable de tipo short en bites ocupa " + Short.SIZE);
		System.out.println("La variable de tipo short solo puede almacenar desde " + Short.MIN_VALUE + " hasta " + Short.MAX_VALUE);
//----------------------------------------int--------------------------------------------//
// La variable de tipo int (tipo de dato primitivo) es más grande que la de tipo short y ocupan el doble de espacio en memoria
		int numeroIntPositivo = 2147483647;
		int numeroIntNegativo = -2147483648;
		System.out.println("numeroImtPositivo = " + numeroIntPositivo);
		System.out.println("numeroIntNegativo = " + numeroIntNegativo);
		System.out.println("La variable de tipo int en bytes ocupa " + Integer.BYTES);				//La variable de tipo primitivo se escribe int, pero su clase se escribe Integer
		System.out.println("La variable de tipo int en bites ocupa " + Integer.SIZE);					//La variable de tipo primitivo se escribe int, pero su clase se escribe Integer
		System.out.println("La variable de tipo int solo puede almacenar desde " + Integer.MIN_VALUE + " hasta " + Integer.MAX_VALUE);
//----------------------------------------long--------------------------------------------//
//La variable de tipo long (tipo de dato primitivo) es más grande que la de tipo int y ocupa el doble de espacio en memoria, y para poder poner un número más grande que el int hay que asignarle el sufijo L
		long numeroLongPositivo = 9223372036854775807L;				//Hay que indicar que el valor corresponde al tipo long y no a un int con sufijo L
		long numeroLongNegativo = -9223372036854775808L;			//Hay que indicar que el valor corresponde al tipo long y no a un int con sufijo L
		System.out.println(numeroLongPositivo);
		System.out.println(numeroLongNegativo);
		System.out.println("La variable de tipo log en bytes ocupa " + Long.BYTES);
		System.out.println("la variable de tipo long en bites ocupa " + Long.SIZE);
		System.out.println("La variable de tipo long solo puede almacenar desde "+ Long.MIN_VALUE + " hasta " + Long.MAX_VALUE);
//----------------------------------------var--------------------------------------------//
//La variable de tipo var es una variable dinámica la cual se le asigna automáticamente la clase la cual contenga su asignación (Integer, String, boolean, etc)
		var valor1 = 1000;
		var valor2 = "Hola";
		var valor3 = true;
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
	}
}
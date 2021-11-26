public class PrimitivosFloat {
	public static void main(String[] args){
//----------------------------------------float--------------------------------------------//
//La variable de tipo float (tipo de dato primitivo) puede almacenar un número decimal, ocupa un espacio en memoria de 32 bites o 4 Bytes, también se puede escribir con notación científica. Hay que asignarle el sufijo de f
		float floatDecimalPositivo = 3.4028235E38f;
		float floatDecimalNegativo = 1.4E-45f;
		System.out.println(floatDecimalNegativo);				//La variable float hay que ponerle el sufijo f para que no marque un error
		System.out.println(floatDecimalPositivo);				//La variable float hay que ponerle el sufijo f para que no marque un error
		System.out.println("La variable de tipo float ocupa en bytes " + Float.BYTES);
		System.out.println("La variable de tipo float ocupa en bites " + Float.SIZE);
		System.out.println("La variable de tipo float puede almacenar desde " + Float.MIN_VALUE + " hasta "+ Float.MAX_VALUE);
//----------------------------------------double--------------------------------------------//
//La variable de tipo double (tipo de dato primitivo) puede almacenar decimales y ocupa el doble de espacio en memoria que float, no hace falta ponerle un sufijo. También se puede escribir en notación científica
		double doubleDecimalPositivo = 1.7976931348623157E308;
		double doubleDecimalNegativo = 4.9E-324;
		System.out.println(doubleDecimalPositivo);
		System.out.println(doubleDecimalNegativo);
		System.out.println("La variable de tipo double ocupa en bytes " + Double.BYTES);
		System.out.println("La variable de tipo double ocupa en bites " + Double.SIZE);
		System.out.println("La variable de tipo double puede almacenar desde " + Double.MIN_VALUE + " hasta " + Double.MAX_VALUE);
	}
}

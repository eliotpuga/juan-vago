
public class clases01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadena= "Un viejo y una vieja van pa Albacete";


System.out.println("Obtener una subcadena dentro de una cadena: "+cadena.substring(3, 15));
System.out.println("Indique el índice donde aparece una subcadena: "+cadena.indexOf("viej"));
System.out.println("Indique si la cadena termina con una subcadena: "+cadena.endsWith("etE"));
System.out.println("Indique si la cadena empieza con una subcadena: "+cadena.startsWith("Un"));
System.out.println("Reemplace un carácter dentro de la cadena: "+cadena.replace('e', 'i'));
System.out.println("Devuelva la cadena en mayúsculas: "+cadena.toUpperCase());
System.out.println("Devuelva la cadena en minúsculas: "+cadena.toLowerCase());
System.out.println("Pase la cadena a un array de caracteres: "+cadena.toCharArray());


	}

}


public class clases01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadena= "Un viejo y una vieja van pa Albacete";


System.out.println("Obtener una subcadena dentro de una cadena: "+cadena.substring(3, 15));
System.out.println("Indique el �ndice donde aparece una subcadena: "+cadena.indexOf("viej"));
System.out.println("Indique si la cadena termina con una subcadena: "+cadena.endsWith("etE"));
System.out.println("Indique si la cadena empieza con una subcadena: "+cadena.startsWith("Un"));
System.out.println("Reemplace un car�cter dentro de la cadena: "+cadena.replace('e', 'i'));
System.out.println("Devuelva la cadena en may�sculas: "+cadena.toUpperCase());
System.out.println("Devuelva la cadena en min�sculas: "+cadena.toLowerCase());
System.out.println("Pase la cadena a un array de caracteres: "+cadena.toCharArray());


	}

}

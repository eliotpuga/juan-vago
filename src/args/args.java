package args;

public class args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean correcto=true;
		int n1=0;
		int n2=0;
		
		if (args.length<2){
			correcto=false;
			System.out.println("No debe haber menos de n�meros");
		}
		else if (args.length>2){
			correcto=false;
			System.out.println("No puede haber m�s de dos n�meros");
		}
		
		if (correcto==true){
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
		int suma=n1+n2;
		int multi=n1*n2;
		int resta=n1-n2;
		float divi=n1/n2;
		System.out.println("La suma de "+args[0]+" y "+args[1]+ " es igual a "+(suma));
		System.out.println("La multiplicaci�n de "+args[0]+" y "+args[1]+ " es igual a "+(multi));
		System.out.println("La resta de "+args[0]+" y "+args[1]+ " es igual a "+(resta));
		System.out.println("La divisi�n de "+args[0]+" y "+args[1]+ " es igual a "+(divi));

		}
		
	}

}

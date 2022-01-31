import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa las ventas realizadas");
		double ventas =sc.nextDouble();
		
		System.out.println(ventas>0&&ventas<=1000? "no aplica comisión, tu venta fue menor de 1000$" : 
			ventas>1000&&ventas<=5000?"tu venta fue de "+ventas+"$ tu comision es de 10% "+ventas*0.1+"$":
			ventas>5000&&ventas<=9999?"tu venta fue de "+ventas+"$ tu comision es de 20% "+ventas*0.2+"$":
			ventas>=10000?"tu venta fue de "+ventas+"$ tu comision es de 30% "+ventas*0.3+"$":"Numero no valido");
	}

}

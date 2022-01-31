import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("bienvenido a Cinepolis");
		Scanner sc =new Scanner(System.in);
		System.out.println("Cual es tu edad?");
		int edad =sc.nextInt();
		double boleto=7;
		System.out.println(edad>0&&edad<6?"tienes "+edad+" años, tienes un 60% de descuento, pagaras "+boleto*0.4+"$":
			edad>=6&&edad<60?"tienes "+edad+" años, pagas boleto a precio normal "+boleto+"$" :
				edad>=60&&edad<150?"tienes "+edad+" años, tienes un 60% de descuento, pagaras "+boleto*0.45+"$":"Dato invalido");
		if (edad>=6&&edad<60) {
			System.out.println("Cuantos boletos quieres comprar?");
			int boletos =sc.nextInt();
			double subtotal =boletos *boleto;
			System.out.println(boletos>=2?"Compraste "+boletos+", tienes un 30% de descuento, pagaras "+subtotal*0.7+"$":
				"Solo compraste un boleto, son "+boleto+"$");
		}
	}

}

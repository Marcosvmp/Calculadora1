package classe;

import java.util.Scanner;

public class calculadora2 {public static void main(String[] args) {

		
		Scanner entrada = new Scanner (System.in);
		
		Calculadora res = new Calculadora();
		
		System.out.println("Digite o primeiro valor:");
		res.v1 = entrada.nextDouble();
		
		System.out.println("Digite o operador: + , - , * , /");
		String operador = entrada.next();
		
		System.out.println("Digite o segundo valor:");
		res.v2 = entrada.nextDouble();
		
		
		switch (operador) {
		case "+":
			double resultado1 = res.somar() ;
			System.out.println(res.v1 + " + "+res.v2+" = " + resultado1);
			break;
		case "-":
			double resultado2 = res.subitrair();
			System.out.println(res.v1 + " - "+res.v2+" = " + resultado2);
			break;
		case "*":
			double resultado3 = res.multiplicar();
			System.out.println(res.v1 + " * "+res.v2+" = " + resultado3);
			break;
		case "/":
			double resultado4 = res.dividir();
			System.out.println(res.v1+ " / "+res.v2+" = " + resultado4);
			break;
		
		default:
		
			System.out.println("operador nao encontrado!");
			break;}
		
		entrada.close();
		
		
		
		
		
	
				}

}



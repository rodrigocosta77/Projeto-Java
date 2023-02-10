package Laços_Condicionais;

import java.util.Scanner;

public class exercicio_lacocondicional01 {

	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);

	System.out.println("Digite o primeiro numero:");
	int a = leitor.nextInt();
	System.out.println("Digite o segundo numero:");
	int b = leitor.nextInt();
	System.out.println("Digite o terceiro numero:");
	int c = leitor.nextInt();
	
	int resultado = a+b;
	
	if((a+b)>c) {
		System.out.println(a + "+" + b + "=" + resultado + ">" + c);
		System.out.println("A Soma de A + B é Maior do que C");
	}
	else if((a+b)<c){
		System.out.println(a + "+" + b + "=" + resultado + "<" + c);
		System.out.println("A Soma de A + B é Menor do que C");

	}
	else {
		System.out.println(a + "+" + b + "=" + resultado + "=" + c);
		System.out.println("A Soma de A + B é Igual a C");

	};
	
	
	}
	
	}
	

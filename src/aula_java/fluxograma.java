package aula_java;

import java.util.Scanner;

public class fluxograma {

	public static void main(String[] args) {
// exercicio 1
		
		Float Salario,Abono,NovoSalario;


        Scanner leia = new Scanner (System.in);


        System.out.println("\nEntre com o Salario:");
        Salario= leia.nextFloat();

        System.out.println("\nEntre com o Abono:");
        Abono= leia.nextFloat();

        NovoSalario= Salario+Abono;


        System.out.printf("\nNovo Salário foi de: %.2f ",NovoSalario);

	}

}

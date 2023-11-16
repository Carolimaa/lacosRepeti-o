package LacodeRepeticao;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		
		int num, menorVin = 0, maiorCin = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = input.nextInt();


		while (num > 0) {
			if (num <= 20) {
				menorVin++; 
			}
			else if (num >= 50 ) {
				maiorCin++;
			}
			System.out.println("\nEntre com outro número: ");
            num = input.nextInt();
		}

		System.out.println("\nQuantidade de pessoas com menos de 21 anos: " + menorVin);
        System.out.println("\nQuantidade de pessoas com mais de 51: " + maiorCin);
	}

}
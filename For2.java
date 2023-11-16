package LacodeRepeticao;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		 int num, pares = 0, impares = 0;
	        Scanner input = new Scanner(System.in);
	        
	        for (int x = 1; x <= 10; x++) {
	            System.out.println("\nDigite o " + x + "º número: ");
	            num = input.nextInt();

	            if (num % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        System.out.println("\nQuantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);
	    }
	}

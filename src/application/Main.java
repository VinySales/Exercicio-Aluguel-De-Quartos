package application;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import entities.Hotel;

public class Main {

	public static void main(String[] args) {
		int numero, quantidadeDeQuartos, quantidadeDeQuartosExistentes;
		String nome, email;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantidade de quartos existentes: ");
		quantidadeDeQuartosExistentes = scan.nextInt();
		
		System.out.print("Quantidade de quartos a alugar: ");
		quantidadeDeQuartos = scan.nextInt();
		
		Hotel[] h = new Hotel[quantidadeDeQuartos];
		
		for (int i = 0; i < h.length; i++) {
			System.out.print("Nome: ");
			nome = scan.next();
			
			System.out.print("Email: ");
			email = scan.next();
			
			System.out.print("Numero: ");
			numero = scan.nextInt();
			
			
			h[i] = new Hotel(nome, email, numero);
			System.out.println("");
		}
		
		Arrays.sort(h, (a, b) -> Integer.compare(a.getNumero(), b.getNumero()));
		
		for (int i = 0; i < h.length; i++) {
			System.out.println("Nome: " + h[i].getNome());
			System.out.println("Email: " + h[i].getEmail());
			System.out.println("Numero: " + h[i].getNumero());
			System.out.println("");
		}
		
		scan.close();
	}

}

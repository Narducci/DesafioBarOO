package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill pay;
		pay = new Bill();
		
		System.out.print("Sexo: ");
		pay.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		pay.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		pay.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		pay.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", pay.feeding());
		
		if (pay.cover() > 0.0) {
			System.out.printf("Couvert = R$ %.2f\n", pay.cover());			
		}
		else {
			System.out.println("Isento de Couvert");
		}
		
		System.out.printf("Ingresso = R$ %.2f\n", pay.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f\n", pay.total());
		
		sc.close();
		
	}

}

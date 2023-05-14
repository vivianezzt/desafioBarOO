package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class BarOO {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		int ingresso = 0;
		
		System.out.print("QUAL O SEXO (F/M): ");
		bill.gender = sc.next().charAt(0);
		
		
		while ((bill.gender != 'F') & (bill.gender != 'M')) {
				System.out.print("VALOR INVÁLIDO, FAVOR DIGITE M OU F: ");	
				bill.gender = sc.next().charAt(0);
		}
		
		System.out.print("QUAL A QUANTIDADE DE CERVEJAS: ");
		bill.beer = sc.nextInt();
		
		while (bill.beer < 0) {
				System.out.print("VALOR INVÁLIDO! FAVOR DIGITE UM VALOR CORRETO:: ");	
				bill.beer = sc.nextInt();
		}
		
		System.out.print("QUAL A QUANTIDADE DE REFRIGERANTES: ");
		bill.softDrink = sc.nextInt();
		
			while (bill.softDrink < 0) {
				System.out.print("VALOR INVÁLIDO, FAVOR DIGITE UM VALOR CORRETO:");	
				bill.softDrink = sc.nextInt();
			}
		
		System.out.print("QUAL A QUANTIDADE DE ESPETINHOS: ");
		bill.barbecue = sc.nextInt();
		while (bill.barbecue < 0) {
				System.out.print("VVALOR INVÁLIDO, FAVOR DIGITE UM VALOR CORRETO: ");	
				bill.barbecue = sc.nextInt();
		}
			
		System.out.print(bill);
		sc.close();
	}

}
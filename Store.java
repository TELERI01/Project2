package Bookstore;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Store {

	int x = 0,  y=0, z=0;
	String a, b, c;
	double tax = 0.825;
	double stotal;
	double total;
	double answer;
	
	void menu() {
		
		System.out.println("Your cart contains " + x + " Textbook(s) " + y+ " T-shirt(s) " + z + " Mug(s)");
		Scanner scan = new Scanner(System.in);
		
		byte ch;
		
		System.out.println("==== Online Bookstore ===="+"\n");
		System.out.println("Options" + "\n");
		System.out.println("1. Browse Products\n2. Checkout\n3. Cancel");
		
		ch = scan.nextByte();
		
		if(ch==1) {
			pro();
		}
		else if(ch==2) {
			check();
		}
		else if ( ch == 3) {
			System.exit(0);
		}
		else if (ch ==0 || ch > 3) {
			System.out.println("Invalid Input");
			menu();
		}
		
		
	}
	
	void pro() {
		Scanner scan = new Scanner(System.in);
		System.out.println("==== Products ====\n");
		System.out.println("1. Textbooks - $49.99\n2. T-Shirts - $29.99\n3. Mugs - $12.99");
		
		byte ans = scan.nextByte();
		
		if(ans==1) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Would you like to purchase this item?");
			String a1 = scan1.nextLine();
			
			char a2 = a1.charAt(0);
			
			if(a2 == 'y' || a2 == 'Y') {
				System.out.println("How many items do you wish to buy?");
				x = scan1.nextInt();
				menu();
			}	
			else if (a2 =='n' || a2 == 'N') {
				pro();
			}
			else {
				System.out.println("Invalid Input");
				pro();
			}
		}
		if(ans==2) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Would you like to purchase this item?");
			String a1 = scan1.nextLine();
			
			char a2 = a1.charAt(0);
			
			if(a2 == 'y' || a2 == 'Y') {
				System.out.println("How many items do you wish to buy?");
				y = scan1.nextInt();
				menu();
			}
			else if (a2 =='n' || a2 == 'N') {
				pro();
			}
			else {
				System.out.println("Invalid Input");
				pro();
			}
		}
		if(ans==3) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Would you like to purchase this item?");
			String a1 = scan1.nextLine();
			
			char a2 = a1.charAt(0);
			
			if(a2 == 'y' || a2 == 'Y') {
				System.out.println("How many items do you wish to buy?");
				z = scan1.nextInt();
				menu();
			}
			else if (a2 =='n' || a2 == 'N') {
				pro();
			}
			else {
				System.out.println("Invalid Input");
				pro();
			}
		}
		//Checking
		else if(ans==2) {
			check();
		}
		//Exit
		else if (ans == 3) {
			System.exit(0);
		}
		//Invalid Input
		else if (ans ==0 || ans > 3) {
			System.out.println("Invalid Input");
			menu();
		}
	}
	
	void check() {
		Scanner scan2 = new Scanner(System.in);
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		
		char choice1;
		
		
		
		if(x > 0 && y==0 && z ==0) {
			
			total = x * 49.99;
			stotal = total* tax;
			
			answer = stotal+total;
			
			System.out.println("Would you like to use 1.Cash/2.Credit/3.Debit?");
			choice1 = scan2.next().charAt(0);
			
			if(choice1 == '1') {
				a = "Payment Type: Cash";
			}
			else if(choice1 =='2') {
				a = "Payment Type: Credit";
			}
			else if(choice1 == '2') {
				a = "Payment Type: Debit";
			}
			else {
				System.out.println("Invalid Option");
			}
			
			System.out.println("You've purchased " + x + " textbook(s) " + f1.format(answer) + " Inclusing tax" + "\n" +a );
			
			menu();
		}
		else if(y > 0 && x==0 && z==0) {
			
			total = y * 29.99;
			stotal = total* tax;
			
			answer = stotal+total;
			
			System.out.println("Would you like to use 1.Cash/2.Credit/3.Debit?");
			choice1 = scan2.next().charAt(0);
			
			if(choice1 == '1') {
				a = "Payment Type: Cash";
			}
			else if(choice1 =='2') {
				a = "Payment Type: Credit";
			}
			else if(choice1 == '2') {
				a = "Payment Type: Debit";
			}
			else {
				System.out.println("Invalid Option");
			}
			
			System.out.println("You've purchased " + y + " T-shirt(s) " + f1.format(answer) + " Inclusing tax");
			menu();
		}
		else if(z > 0 && y==0 && x==0) {
			
			total = z * 12.99;
			stotal = total* tax;
			
			answer = stotal+total;
			
			System.out.println("Would you like to use 1.Cash/2.Credit/3.Debit?");
			choice1 = scan2.next().charAt(0);
			
			if(choice1 == '1') {
				a = "Payment Type: Cash";
			}
			else if(choice1 =='2') {
				a = "Payment Type: Credit";
			}
			else if(choice1 == '2') {
				a = "Payment Type: Debit";
			}
			else {
				System.out.println("Invalid Option");
			}
			
			System.out.println("You've purchased " + z + " mug(s) " + f1.format(answer) + " Inclusing tax");
			menu();	
		}
		else if (y>0 || x > 0 || z > 0) {
			
			total = x * 49.99;
			stotal = total* tax;
			
			answer = stotal+total;
			
			total = y * 29.99;
			stotal = total* tax;
			
			double answer2 = stotal+total;
			
			total = z * 12.99;
			stotal = total* tax;
			
			double answer3 = stotal+total;
			
			double answer4 = answer + answer2 + answer3;
			System.out.println("Would you like to use 1.Cash/2.Credit/3.Debit?");
			choice1 = scan2.next().charAt(0);
			
			if(choice1 == '1') {
				a = "Payment Type: Cash";
			}
			else if(choice1 =='2') {
				a = "Payment Type: Credit";
			}
			else if(choice1 == '2') {
				a = "Payment Type: Debit";
			}
			else {
				System.out.println("Invalid Option");
			}
			
			System.out.println("You've purchased: " + x + " textbook(s) " + y + " T-shirt(s) " + z + " mug(s) for " + f1.format(answer4) + "\n" + a);
			System.out.println("Thabks for shopping with us!");
			menu();
		}
		else {
			System.out.println("You did not purchase anything!");
			menu();
		}
	}
	
	
	public static void main(String[] args) {
		
		Store f = new Store();
		f.menu();
		
	}
	//"1. Textbook - $49.99\n2.Shirt = $29.99\n3.Mug - 12.99"
}

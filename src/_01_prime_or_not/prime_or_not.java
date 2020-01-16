package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
int x;
	
	String number = JOptionPane.showInputDialog(null, "Prime-or-not-meter", "Enter a number");
	x = Integer.parseInt(number);
	boolean prime = false;
	for(int i = 2; i < x; i++) {
			
			if(x % i == 0) {
				
				prime = false;
				break;
			}
			else {
				prime=true;
				
			}
	}
	
	if (prime == false) {
		JOptionPane.showMessageDialog(null, "This is NOT a prime number");
	}
	else {
		JOptionPane.showMessageDialog(null, "This IS a prime number");
		
	}

	}
}


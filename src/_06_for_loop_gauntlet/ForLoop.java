package _06_for_loop_gauntlet;

public class ForLoop {public static void main(String[] args) {
	for(int i = 0; i <= 100; i ++) {
		System.out.println(i);
	}
	for(int i = 100; i >= 0; i --) {
		System.out.println(i);
	}
	for(int i = 2; i <= 100; i ++) {
		
		if(i%2==0) {
			System.out.println(i);
		}
	}
		
		for(int i = 0; i <= 100; i ++) {
			
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		for(int i = 0; i <= 500; i ++) {
			
			if(i%2==0) {
				System.out.println(i + " is EVEN");
			}
			
			else {
				System.out.println(i + " is ODD");
			}
		}
		
		for(int i = 0; i <= 77; i ++) {
			
			if(i%7==0) {
				System.out.println(i);
			}
		}
		
	int year = 2005;
	int age = -1;
		for(int i = 0; i <= 14; i ++) {
			year = year + 1;
			age = age+1;
			System.out.println("In November of "+ year + ", I am " + age);
		}
		
		for(int i = 0; i <= 2; i ++) {
			for(int j = 0 ; j<= 2; j++) {
				System.out.print(i);
				System.out.print(" " + j);
			System.out.println();
			}
		}
		 
		//for(int i = 1; i <= 3; i ++) {
		
	 
			//for(int j = 1 ; j<= 3; j++) {
			
				for(int a  = 1; a<=9; a ++) {
	
				System.out.print(a + " ");
				if (a % 3  == 0 ) {
					System.out.println();
				}
			//
			}
			String b = "*";
				for(int a  = 1; a<=6; a ++) {
					for(int r = 1; r <= a; r++) {
					System.out.print(b );
			
					}
				System.out.println();
				}
		

	
}

}

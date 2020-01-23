package _02_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	
	int a = 0;
	int b = 1;
	int sum;
	System.out.print(a);
	System.out.print(b);
	for(int i = 0; i<=12; i++) {
sum=a+b;
a = b;
b=sum;
System.out.print(sum);
	}
}
}

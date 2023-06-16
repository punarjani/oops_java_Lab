import java.util.Scanner;

class Odd_Even {
	public static void main(String args[]) {
		int even = 0, odd = 0;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 elemnts : ");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.print("\n");
		System.out.print("Number of even digits even: " + even + "\nNumber of even digits odd: " + odd);
		System.out.print("\n");

	}
}

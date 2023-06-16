
class InvalidNumberException extends Exception {
	InvalidNumberException(String str) {
		super(str);
	}
}

class ExceptionHandling {
	public static void main(String args[]) {
		int[] a = new int[10];
		float sum=0;int count=0;
		try {
			for (int i = 0; i < args.length; i++) {
				a[i] = Integer.parseInt(args[i]);
				if (a[i] <= 0) {
					throw new InvalidNumberException(a[i]+" is an invalid number");
				}
				else{
					count++;
					sum+=a[i];
				}
			}
			System.out.println("Average of numbers : "+sum/count);
		} catch (InvalidNumberException e) {
			System.out.println(e);
		} finally {
			System.out.println("Executed Successfully");
		}
	}
}

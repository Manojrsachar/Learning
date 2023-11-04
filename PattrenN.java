public class PattrenN {

	public static void main(String[] args) {
		for (int m = 1; m <= 11; m++) {
			for (int n = 1; n <= 11; n++) {
				if (n == 1 || n == 11 || n == m ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println("  ");
		}

	}

}
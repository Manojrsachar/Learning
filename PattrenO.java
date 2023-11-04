public class PattrenO {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 1 && j != 1 && j != 2 && j != 9 && j != 8 
						|| i == 2 && j == 2 || i == 2 && j == 8
						|| i == 10 && j == 2 || i == 10 && j == 8
						|| i == 11 && j != 1 && j != 2 && j != 9 && j != 8
						|| j == 1 && i != 1 && i != 2  && i != 10  && i != 11
						|| j == 9 && i != 1 && i != 2   && i != 10 && i != 11) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
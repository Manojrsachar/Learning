public class PattrenJ {

	public static void main(String[] args) {
		for(int i=1;i<=11;i++) 
		{
			for (int j = 1; j <= 9; j++) {
				if (i == 1 || i == 11 && j!=5 &&j<=5 && j!=1
						   || j ==1 && i!=11 && i>=9
						   || j == 5 && i!=11) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}

}
public class PattrenAlphabet {

	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) 
		{
			for (int j = 1; j <= 6; j++) 
			{
				if (i == 1 && j != 1 && j != 6 || i == 6 || j == 1 && i != 1 || j == 6 && i != 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
				for (int j = 1; j <= 6; j++) {
					if (j == 1 || i == 1 && j != 6  
							   || i == 6 && j != 6 
							   || i == 11&& j != 6 
							   || j == 6 && i != 1 && i != 6 && i != 11) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for (int j = 1; j <= 6; j++) {
					if (j == 1 && i != 1 && i!=11 
							|| i == 1 && j != 6 && j != 1 
							|| i == 11 && j != 6 && j!=1 
							|| j == 6 && i != 1 && i != 11 && i<=3 
							|| j == 6 && i != 1 && i != 11 && i>=9) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for (int j = 1; j <= 6; j++) {
					if (j == 1 
							|| i == 1 && j != 6  
							|| i == 11 && j != 6
							|| j == 6 && i != 1  && i != 11) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for (int j = 1; j <= 6; j++) {
					if (j == 1 
							|| i == 1  
							|| i == 6  
							|| i == 11 ) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				for (int j = 1; j <= 6; j++) {
					if (j == 1 || i == 1   
							   || i == 6) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
			for (int j = 1; j <= 8; j++) {
				if (   i == 1 && j != 1 && j != 8 
					|| i == 11 && j != 1 && j != 8 
					|| j == 1 && i != 1 && i != 11
					|| j == 8 && i != 1 && i != 11 && i<=2
					|| j == 8 && i != 1 && i != 11 && i>=7
					|| i == 6 && j != 2 && j != 3 && j!=8) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int k = 1; k <= 8; k++) 
			{
				if (k == 1 || k == 8 || i == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 11    
						   || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 9; j++) {
				if (i == 1 || i == 11 && j!=5 &&j<=5 && j!=1
						   || j ==1 && i!=11 && i>=9
						   || j == 5 && i!=11) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int l = 1; l <= 11; l++) {
				if (l == 1 || (i + l) == 7 || (i - l) == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 1; j <= 7; j++) {
				if (i == 11 || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int n = 1; n <= 11; n++) {
				if (n == 1 || n == 11 || (n + i) == 12 && i <= 6 || n == i && i <= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print("  ");
			for (int n = 1; n <= 11; n++) {
				if (n == 1 || n == 11 || n == i ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print("  ");
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
			System.out.print("  ");
			for (int j = 1; j <= 6; j++) {
				if (j == 1 || i == 1 && j != 6  
						   || i == 6 && j != 6  
						   || j == 6 && i != 1 && i != 6 && i<=6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 10; j++) {
				if (i == 1 && j != 1 && j != 2 && j != 9 && j != 8 && j!=10 
						|| i == 9 && j == 7
						|| i == 2 && j == 2 || i == 2 && j == 8
						|| i == 10 && j == 2 || i == 10 && j == 8
						|| i == 11 && j != 1 && j != 2  && j != 8
						|| j == 1 && i != 1 && i != 2  && i != 10  && i != 11
						|| j == 9 && i != 1 && i != 2   && i != 10 && i != 11) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 6; j++) {
				if (j == 1 || i == 1 && j != 6  
						   || i == 6 && j != 6  
						   || j == 6 && i != 1 && i != 6 && i<=6
						   ||(i-j) == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 6; j++) {
				if (j == 1 && i !=1 && i !=7 && i !=8 && i !=9 && i !=6 && i !=11|| i == 1 && j != 6 && j !=1  
						   || i == 6 && j != 6 && j != 1 
						   || i == 11&& j != 6 && j != 1
						   || j == 6 && i !=6 && i != 1 && i != 6 && i != 11 && i !=3 && i !=4 && i !=5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 11; j++) {
				if (i == 1 || j == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 9; j++) {
				if (i == 1 && j != 2 && j != 3 && j != 4 && j != 5 && j != 6 && j != 7 && j != 8
						|| i == 10 && j == 2 || i == 10 && j == 8
						|| i == 11 && j != 1 && j != 2 && j != 9 && j != 8
						|| j == 1  && i != 10  && i != 11
						|| j == 9  && i != 10 && i != 11) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 11; j++) {
				if (      i==1&&j==1 || i==1 && j== 11
						||i==3&&j==2 || i==3 && j== 10
						||i==5&&j==3 || i==5 && j== 9
						||i==7&&j==4 || i==7 && j== 8
						||i==9&&j==5 || i==9 && j== 7
						||i==11&&j==6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int n = 1; n <= 11; n++) {
				if (n == 1 || n == 11 || (n + i) == 12 && i >= 6 || n == i && i >= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.print("  ");
			for (int j = 1; j <= 11; j++) {
				if ( i==j || i+j==12) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 11; j++) {
				if (i == j && i <= 6 || i + j == 12 && i <= 6 || j == 6 && i >= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 11; j++) {
				if ( i==1 || i+j==12 || i==11) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
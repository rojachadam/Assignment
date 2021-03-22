//Solution for 9th Question 
public class TwoDStringExample {

	public static void main(String[] args) {
		// String StringArray[][]=new String[2][3];
		String StringArray[][] = { { "This", "Is", "An" }, { "Example", "For", "2Dstring" } };
		/*
		 * System.out.println(StringArray[0][0]); System.out.println(StringArray[0][1]);
		 * System.out.println(StringArray[0][2]); System.out.println(StringArray[1][0]);
		 * System.out.println(StringArray[1][1]); System.out.println(StringArray[1][2]);
		 */
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(StringArray[i][j]);
				System.out.print(" ");
			}
		}

	}

}

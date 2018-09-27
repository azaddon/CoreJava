package pattern;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int l = 5; l >= 1; l--) {
			for (int m = 1; m <= l - 1; m++) {
				System.out.print(" ");
			}
			for (int n = 5; n >= l; n--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	}



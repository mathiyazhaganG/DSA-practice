public class patterns {

	public static void main(String[] args) {
		pattern1(4);
		pattern2(5);
		pattern3(6);
		pattern4(5);
		pattern5(5);
		pattern6(6);
		pattern7(6);
		pattern8(4);

	}

	static void pattern1(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for (int i = 0; i < n * 2; i++) {
			int col = i > n ? 2 * n - i : i;
			for (int j = 0; j < col; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	static void pattern5(int n) {
		for (int i = 0; i <= n * 2; i++) {
			int col = i > n ? 2 * n - i : i;
			int spc = n - col;
			for (int s = 0; s < spc; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {

			for (int s = 0; s < n - i; s++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

	static void pattern7(int n) {
		for (int i = 1; i <= n * 2; i++) {
			int c = i > n ? 2 * n - i : i;

			for (int s = 0; s < n - c; s++) {
				System.out.print("  ");
			}
			for (int j = c; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= c; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

	static void pattern8(int n) {
		int ogN=n;
		for (int i = 0; i <= n * 2; i++) {

			for (int j = 0; j <= n*2; j++) {
				int index=ogN-Math.min(Math.min(i,j), Math.min(2*n-i,2*n-j));
				System.out.print(index);
			}
			System.out.println();

		}
	}
}

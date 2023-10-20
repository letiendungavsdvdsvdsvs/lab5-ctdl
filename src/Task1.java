
public class Task1 {
	public static int[][] add(int[][] a, int[][] b) {
		if (!(a.length == b.length && a[0].length == b[0].length))
			System.out.println("Can't add 2 matrix");
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
				System.out.print(result[i][j]+"\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static int[][] subtract(int[][] a, int[][] b) {
		if (!(a.length == b.length && a[0].length == b[0].length))
			System.out.println("Can't subtract 2 matrix");
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
				System.out.print(result[i][j]+"\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static int[][] multiply(int[][] a, int[][] b) {
		if (!(a[0].length == b.length))
			System.out.println("Can't multiply 2 matrix");
		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				int temp = 0;
				for (int k = 0; k < a[0].length; k++) {
					temp += a[i][k] * b[k][i];
				}
				result[i][j] = temp;
				System.out.print(result[i][j]+"\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static int[][] transpose(int[][] a) {
		int[][] result = new int[a[0].length][a.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[j][i];
				System.out.print(result[i][j]+"\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] c = { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] b = { { 1, 2 }, { 1, 2 }, { 1, 2 } };
		
		transpose(b);
		System.out.println("-----------");
		add(a, c);
		System.out.println("-----------");
		subtract(a, c);
		System.out.println("-----------");
		multiply(a, b);
	}
}

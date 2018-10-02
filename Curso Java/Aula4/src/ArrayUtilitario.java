import java.util.Arrays;

public class ArrayUtilitario {

	public static void main(String[] args) {
		//utilitario();
		utilitario2();

	}

	public static void utilitario() {
		int[] array = { 8, 5, 7, 9, 10, 11, 85, 45, 12, 19, 20, 27, 21 };
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("array[" +Arrays.binarySearch(array, 5) + "]");
	}
	public static void utilitario2() {
		int[] array = {9,3,5,4,2,10,6,7,8,9 };
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("O menor número do array é " +array[0]);
		System.out.println("O mairo número do array é "+array[9]);
		
	}

}

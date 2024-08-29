package array;

public class Comparenumber {

	public void sortAnArray() {

		int[] arr = { 50, 10, 9, 4, 1 };
		System.out.println("Original Array elements:");
		for (int value : arr)
			System.out.println(value);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorting elements:");
		for (int value : arr)
			System.out.println(value);
	}

	public static void main(String[] args) {
		int[] arr1 = { 20, 10, 50, 2, 1 };
		int[] arr2 = new int[2];
		arr2 = arr1;
		System.out.println("Array of elements:");
		for (int a : arr2) {
			System.out.println(a);
		}
		Comparenumber obj = new Comparenumber();
		obj.sortAnArray();

	}

}

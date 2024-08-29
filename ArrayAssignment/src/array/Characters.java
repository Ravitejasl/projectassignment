package array;

public class Characters {

	
		public void sortAnArray() {

			char[] arr = { 'A', 'C','D', 'E','F' };
			System.out.println("Original Array elements:");
			for (char value : arr)
				System.out.println(value);
			for (char i = 'A'; i < arr.length; i++) {
				for (char j = i; j < arr.length; j++) {

					if (arr[i] > arr[j]) {
						char temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Sorting elements:");
			for (char value : arr)
				System.out.println(value);
		}

		public static void main(String[] args) {
			char[] arr1 = { 'H', 'E', 'R', 'A', 'W' };
			char[] arr2 = new char[2];
			arr2 = arr1;
			System.out.println("Array of elements:");
			for (char a : arr2) {
				System.out.println(a);
			}
			Comparenumber obj = new Comparenumber();
			obj.sortAnArray();

	}

}

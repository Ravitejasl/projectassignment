package array;

public class DuplicateValue {
	public static void main(String[]args) {
		
		int []arr= {23,45,23,56,88,99,55,34,45,67,11,88,99,11,34};
		System.out.println("Duplicate Elemnts in array is:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j])
				System.out.println(arr[j]);
		}
	}

	}
}

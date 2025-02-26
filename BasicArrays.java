import java.util.*;
import java.util.Arrays;

public class BasicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declare and initialize an array
        int[] numbers = {50, 10, 30, 20, 40};
        
        // or 
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the values:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Access elements
        System.out.println("First Element: " + numbers[0]);

        // Update an element
        numbers[1] = 15;

        // Get array length
        System.out.println("Array Length: " + numbers.length);

        // Loop through the array
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        //or
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        // Sort the array
        Arrays.sort(numbers);
        
        // To print the elemnts in the array without using for loop.
        System.out.println("\nSorted Array: " + Arrays.toString(numbers));

        // Reverse the array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
        
        // Copying the array elemnts into a new array 
        int arr2[] = Arrays.copyOf(arr, (arr.length)+2);
        arr2[n] = 1000;
        arr2[n+1] = 2000;
        
        for(int val : arr2){
            System.out.print(val+" ");
        }
        
        System.out.println();
        System.out.print(Arrays.toString(arr2));
        
    }
}

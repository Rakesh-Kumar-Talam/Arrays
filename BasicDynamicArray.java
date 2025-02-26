import java.util.*;
public class BasicDynamicArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // For Dynamic size array we used ArrayList 
        ArrayList<Integer> arr = new ArrayList<>();
        
        System.out.println("Enter the number if elements:");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());              // to add elements into array we use add()
        }
        
        for(int i=0 ;i<n; i++){
            System.out.print(arr.get(i)+" ");   // to access the elements from array we use get()
        }
        System.out.println();
        
        arr.add(100);                           // as size is not fixed we can add any number of arrays.
        arr.add(1,2000);                        // adding the element at specific position at index 1 i.e 2nd position.
        
        System.out.println("Array size or length:");
        System.out.println(arr.size());         // size() is used to find the length of the array 
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        
        System.out.println("Updating the array");
        arr.set(2,5000);                        // value at index 2 is noe set to 5000.
        
        System.out.println("Using enhanced for loop");
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
        
        //removing an element from the array 
        arr.remove(1);                          // the element at index 1 is removed 
        arr.remove(Integer.valueOf(5000));      // the element with value 2000 is removed 
        System.out.println("After removing elements from array:");
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
        
        // to check whether the element is present in the array or not 
        System.out.println(arr.contains(Integer.valueOf(4)));
        
        // to check the array is empty or not 
        System.out.print(arr.isEmpty());
        
        // Arrays.toString is not applicable in ArrayList
    }
}
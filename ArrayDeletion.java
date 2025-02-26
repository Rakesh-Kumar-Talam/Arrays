import java.util.*;
class ArrayDeletion{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //Deleting the first element 
        System.out.println("Deleting the first element");
        int a1[] = new int[n-1];
        for(int i=0; i<n-1; i++){
            a1[i] = arr[i+1];
        }
        for(int i:a1){
            System.out.print(i + " ");
        }
        System.out.println();
        
        //Deleting the specific index
        System.out.println("Deleting the specific index element");
        System.out.println("Enter the index");
        int in = sc.nextInt();
        int a2[] = new int[n-1];
        for(int i=0; i<in; i++){
            a2[i] = arr[i];
        }
        for(int i=in+1; i<n; i++){
            a2[i-1] = arr[i];
        }
        System.out.println(Arrays.toString(a2));
        
        //Deleting the last element
        System.out.println("Deleting the last element");
        int a3[] = new int[n-1];
        for(int i=0; i<n-1; i++){
            a3[i] = arr[i];
        }
        for(int i=0; i<a3.length; i++){
            System.out.print(a3[i] + " ");
        }
    }
}
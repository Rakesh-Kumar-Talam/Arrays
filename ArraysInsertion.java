import java.util.*;
class ArraysInsertion{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(arr));
        
        //inserting at first
        System.out.println("Inserting at first");
        System.out.println("Enter the inserting element");
        int arr2[] = new int[n+1];
        int ele = sc.nextInt();             // 1 2 3 4  
        for(int i=0; i<n; i++){          // 1000 1 2 3 4
            arr2[i+1] = arr[i];   
        }
        arr2[0] = ele;
        
        for(int i : arr2){
            System.out.print(i + " ");
        }
        System.out.println();
        
        //inserting at specific position
        System.out.println("Inserting at specific position");
        int arr3[] = new int[n+1];
        System.out.println("Enter the inserting element");
        int e1 = sc.nextInt(); 
        System.out.println("Enter the index position");
        int ind = sc.nextInt();
        for(int i=ind; i<n; i++){
            arr3[i+1] = arr[i];   
        }
        arr3[ind] = e1;
        for(int i=0; i<ind; i++){
            arr3[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr3));
        
        //inserting at last 
        int arr4[] = new int[n+1];
        System.out.println("Inserting at last");
        System.out.println("Enter the inserting element");
        int e2 = sc.nextInt(); 
        for(int i=0; i<n; i++){
            arr4[i] = arr[i];
        }
        arr4[n] = e2;
        for(int i : arr4){
            System.out.print(i + " ");
        }
    }
}
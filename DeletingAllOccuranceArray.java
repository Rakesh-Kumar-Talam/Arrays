import java.util.*;
class DeletingAllOccuranceArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to remove");
        int e = sc.nextInt();
        int c = 0;                          //to count the number of elements
        for(int i=0; i<n; i++){
            if(arr[i] == e){
                c++;
            }
        }
        
        int a1[] = new int[n-c];
        int c1 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != e){
                a1[c1] = arr[i];
                c1++;
            }
        }
        
        System.out.println(Arrays.toString(a1));
    }
}
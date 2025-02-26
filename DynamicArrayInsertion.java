import java.util.*;
class DynamicArrayInsertion{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        System.out.println("Enter the values: ");
        int n = 5;
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        
        //inserting at first
        arr.add(0,1000);
        
        //inserting at position 5
        arr.add(4, 2000);
        
        //inserting at last 
        arr.add(3000);
        
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
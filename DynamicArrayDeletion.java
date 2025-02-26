import java.util.*;
class DynamicArrayDeletion{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the values ");
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n != -1){
                arr.add(n);
            }
            else break;
        }
        
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        
        //deleting at first
        System.out.println("Deleting first element");
        arr.remove(0);
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        
        //Deleting the specific index value 
        System.out.println("Enter the index to be deleted");
        int in = sc.nextInt();
        arr.remove(in);
        for(int j : arr){
            System.out.print(j + " ");
        }
        System.out.println();
        
        //Deleting the element by its value 
        System.out.println("Enter the value to be deleted");
        int v = sc.nextInt();
        arr.remove(Integer.valueOf(v));
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        
        //Deleting the last value 
        System.out.println("Deleting the last element");
        arr.remove(arr.size()-1);
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
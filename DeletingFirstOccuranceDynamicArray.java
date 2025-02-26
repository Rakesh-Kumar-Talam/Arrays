import java.util.*;
class DeletingFirstOccuranceDynamicArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n != -1){
                arr.add(n);
            }
            else break;
        }
        
        // removing the first occurance of the element 
        System.out.println("Enter the element to be removed");
        int e = sc.nextInt();
        System.out.println("The first occurance of " + e + " will be removed");
        arr.remove(Integer.valueOf(e));
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
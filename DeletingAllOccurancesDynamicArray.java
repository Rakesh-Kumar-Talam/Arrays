import java.util.*;
class DeletingAllOccurancesDynamicArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        
        System.out.println("Enter the value to remove");
        int v = sc.nextInt();
        /*for(int i=0; i<n; i++){
            if(arr.get(i) == v){
                arr.remove(i);
            }
        }
        There is an issue with removing elements inside a loop while iterating over the ArrayList.
        When you remove an element using arr.remove(i), the size of the list decreases, but i keeps 
        increasing, which can skip elements.*/
        
        // Use Iterator to safely remove elements
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            if (it.next() == v) {
                it.remove();
            }
        }
        
       /* After calling arr.iterator(), the iterator starts before the first element and can be moved using .next().
        Iterator<Integer> it = arr.iterator();
        Now, we can use:
        it.hasNext() → Checks if there is another element.
        it.next() → Moves to the next element and returns it.
        it.remove() → Removes the last returned element from the collection.*/
        
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
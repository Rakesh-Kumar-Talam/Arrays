class DeletingFirstOccuranceArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 20, 30 };
        int n = arr.length;
        int ele = 20;

        System.out.println("Array before deletion");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
          
            // If the element has been found previously,
            // shift the current element to the left
            if (found) {
                arr[i - 1] = arr[i];
            }
          
            // check if the current element is equal to
            // the element to be removed
            else if (arr[i] == ele) {
                found = true;
            }
        }
      
        // If element was found, reduce the size of array
        if (found == true)
            n--;
        
        System.out.println("\nArray after deletion");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

class SelectionSort {
    /**
     * Prints the sorted array.
     *
     * @param arr the sorted array
     */
    public static void printSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sorts the array using selection sort.
     *
     * @param arr the array to sort
     */
    public static void sortArray(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // or throw an exception, depending on your requirements
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[smallest];
            arr[smallest] = temp; // corrected swap logic
            arr[i] = arr[smallest];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};
        sortArray(arr);
        printSortedArray(arr);
    }
}
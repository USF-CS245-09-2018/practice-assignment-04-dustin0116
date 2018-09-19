public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                // Traverse through rest of the elements in array and find the minimum value.
                if (a[min] > a[j]) {
                    min = j;
                }
                int temp = a[j];
                a[i] = a[min];
                a[min] = temp;
                // Swap minimum value element with the first element.
            }
        }
    }
}

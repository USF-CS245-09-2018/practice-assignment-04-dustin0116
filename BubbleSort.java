public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    // Swap with the first element of "i" loop if the array index of "j" is smaller.
                }
            }
        }
    }
}
package ut;

public class QuickSort {

    public static void Sort(int [] arr) {
        int n = arr.length;
        quicksortUtil(arr, 0, n-1);
    }

    public static boolean IsSorted(int [] arr) {
        int n = arr.length;

        if(n <= 0) {
            System.out.println("ERROR: Empty/Invalid Array!");
        }

        for(int i = 1; i < n; ++i) {
            if(arr[i-1] > arr[i]) {
                System.out.println("WARNING: Not sorted.");
                return false;
            }
        }

        return true;
    }

    private static void quicksortUtil(int [] arr, int lo, int hi) {
        int n = hi-lo+1;

        if(n <= 1) return;
        if(n == 2) {
            if(arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            return;
        }

        if(lo < hi) {
            int piv = partitionUtil(arr, lo, hi);

            quicksortUtil(arr, lo, piv - 1);
            quicksortUtil(arr, piv + 1, hi);
        }
    }

    private static int partitionUtil(int [] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = (lo-1); // index of smaller element
        for (int j=lo; j < hi; ++j) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[hi];
        arr[hi] = temp;

        return i+1;
    }
}

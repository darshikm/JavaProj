package ut;

public class SingularMain {

    public  static void main(String args[]) {

        RandomArrayGenerator rA = new RandomArrayGenerator(30);
        int [] arr = rA.GetNewArray();
        int n = rA.GetSize();

        if(n < UtGlobalIf.mPrintLim) {
            System.out.println("Before sorting ..\n");
            for(int i = 0; i < n; ++i) {
                System.out.println("MainThread::mArr[" + i + "] := " + arr[i]);
            }
        }

        QuickSort.Sort(arr);

        if(n < UtGlobalIf.mPrintLim) {
            System.out.println("\nAfter sorting ..\n");
            for(int i = 0; i < n; ++i) {
                System.out.println("MainThread::mArr[" + i + "] := " + arr[i]);
            }
        }

        if(!QuickSort.IsSorted(arr)) {
            System.out.println("Flawed process of sorting the input.. \n");
        }
    }
}

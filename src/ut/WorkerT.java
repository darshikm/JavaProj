package ut;

public class WorkerT extends Thread {
    int    threadId;
    int [] mData;

    WorkerT(int tId) {
        threadId = tId;
    }

    void AssignWork(int [] arr, int lo, int hi) {
        int n = hi-lo+1;
        mData = new int[n];

        for(int i = lo; i <= hi; ++i) {
            mData[i-lo] = arr[i];
        }
    }

    public void run() {
        System.out.println("ThreadId : " + threadId);
        QuickSort.Sort(mData);

        if(mData.length < UtGlobalIf.mPrintLim) printData();
    }

    public void  printData() {
        for(int i = 0; i < mData.length; ++i) {
            System.out.println("tId (" + threadId + ") :: mData[" + i + "] := " + mData[i]);
        }
    }
}

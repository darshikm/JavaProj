package ut;

import java.util.Random;

public class JavaThreadMain {

    public  static void main(String args[]) {

        RandomArrayGenerator rA = new RandomArrayGenerator();
        int [] arr = rA.GetNewArray();
        int n = rA.GetSize();

        WorkerT [] vWorker = new WorkerT[8];

        int lowLim = 0, highLim = 0;

        for(int i = 0; i < 8; ++i) {
            vWorker[i] = new WorkerT(i);

            lowLim  = i*(n/8);
            highLim = (i+1)*(n/8) - 1;
            vWorker[i].AssignWork(arr, lowLim, highLim);
        }

        for(int i = 0; i < 8; ++i) {
            vWorker[i].start();
        }



    }


}

package ut;

import java.util.Random;

public class RandomArrayGenerator implements UtGlobalIf {
    int   mSize;
    int[] mArr;

    RandomArrayGenerator() {
        mSize = UtGlobalIf.mDefSize;
        mArr = new int[mSize];
    }

    RandomArrayGenerator(int size) {
        mSize = size;
        mArr = new int[mSize];
    }

    int [] GetNewArray() {
        Random rand = new Random();

        for(int i = 0; i < mSize; ++i) {
            mArr[i] = rand.nextInt(10000000);
        }
        return mArr;
    }

    int GetSize() {
        return mSize;
    }
}

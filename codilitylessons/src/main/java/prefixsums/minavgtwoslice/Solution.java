package prefixsums.minavgtwoslice;

/**
 * 100% correctness and performance
 */
public class Solution {

    private int startPosition = 0;
    private float currentLowestAvg = Float.MAX_VALUE;

    public int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            // slice with two elements
            setStartingPositionForSliceWithMinAverage(A, i, 2);

            // slice with three elements
            setStartingPositionForSliceWithMinAverage(A, i, 3);
        }
        return startPosition;
    }

    private void setStartingPositionForSliceWithMinAverage(int[] array, int index, int sliceSize) {
        float sliceAvg = 0;
        if (sliceSize == 2 && index + 1 < array.length) {
            sliceAvg = (float) (array[index] + array[index + 1]) / sliceSize;
            setLastMinimumAvgPosition(index, sliceAvg);
        } else if (sliceSize == 3 && index + 2 < array.length) {
            sliceAvg = (float) (array[index] + array[index + 1] + array[index + 2]) / sliceSize;
            setLastMinimumAvgPosition(index, sliceAvg);
        }
    }

    private void setLastMinimumAvgPosition(int index, float sliceAvg) {
        if (sliceAvg < currentLowestAvg) {
            currentLowestAvg = sliceAvg;
            startPosition = index;
        }
    }
}

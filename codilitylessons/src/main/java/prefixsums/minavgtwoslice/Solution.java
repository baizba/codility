package prefixsums.minavgtwoslice;

/**
 * 100% correctness and performance
 */
public class Solution {

    public int solution(int[] A) {
        int startPosition = 0;
        float currentLowestAvg = Float.MAX_VALUE;

        int length = A.length;
        for (int i = 0; i < length; i++) {
            // slice with two elements
            if (i + 1 < length) {
                float twoMembersAvg = (float) (A[i] + A[i + 1]) / 2;
                if (twoMembersAvg < currentLowestAvg) {
                    currentLowestAvg = twoMembersAvg;
                    startPosition = i;
                }
            }

            // slice with three elements
            if (i + 2 < length) {
                float threeMembersAvg = (float) (A[i] + A[i + 1] + A[i + 2]) / 3;
                if (threeMembersAvg < currentLowestAvg) {
                    currentLowestAvg = threeMembersAvg;
                    startPosition = i;
                }
            }
        }

        return startPosition;
    }

}

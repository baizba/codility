package prefixsums.genomicrangequery;

public class Solution2 {

    //100% correct 33% performance
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int from = P[i];
            int to = Q[i];
            String nucleotideSubstring = S.substring(from, to + 1);
            if (nucleotideSubstring.contains("A")) {
                result[i] = 1;
            } else if (nucleotideSubstring.contains("C")) {
                result[i] = 2;
            } else if (nucleotideSubstring.contains("G")) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }

}
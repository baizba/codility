package prefixsums.genomicrangequery;

public class Solution {

    //100% correct and 0% performance
    public int[] solution(String S, int[] P, int[] Q) {
        //length of P and Q is equal according to assignment
        //resulting array should also have the length like P and Q
        int[] result = new int[P.length];
        int numberOfQueries = P.length;

        for (int i = 0; i < numberOfQueries; i++) {
            int minImpactFactor = Integer.MAX_VALUE;
            int from = P[i];
            int to = Q[i];
            for (int j = from; j <= to; j++) {
                char nucleotide = S.charAt(j);
                int impactFactor = getImpactFactor(nucleotide);
                if (minImpactFactor > impactFactor) {
                    minImpactFactor = impactFactor;
                    //if we reach impact factor of 1 we can stop - because that is the minimum anyway
                    if (minImpactFactor == 1) {
                        break;
                    }
                }
            }
            result[i] = minImpactFactor;
        }

        return result;
    }

    private int getImpactFactor(char nucleotide) {
        int nucleotideImpactFactor = 0;
        switch (nucleotide) {
            case 'A':
                nucleotideImpactFactor = 1;
                break;
            case 'C':
                nucleotideImpactFactor = 2;
                break;
            case 'G':
                nucleotideImpactFactor = 3;
                break;
            case 'T':
                nucleotideImpactFactor = 4;
        }
        return nucleotideImpactFactor;
    }
}
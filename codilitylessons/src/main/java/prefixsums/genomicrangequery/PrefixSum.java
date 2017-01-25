package prefixsums.genomicrangequery;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by baizb on 24.01.2017.
 */
public class PrefixSum {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] prefixSum = new int[a.length];

        prefixSum[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(prefixSum));
    }
}

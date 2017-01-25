package prefixsums.genomicrangequery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by baizb on 24.01.2017.
 */
public class SolutionTest {

    private Solution2 solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution2();
    }

    @Test
    public void testSolution() throws Exception {
        String s = "CAGCCTA";
        int[] p = new int[]{2, 5, 0};
        int[] q = new int[]{4, 5, 6};
        int[] result = solution.solution(s, p, q);
        Assert.assertArrayEquals(new int[]{2, 4, 1}, result);
    }

    @Test
    public void testSolution2() throws Exception {
        String s = "A";
        int[] p = new int[]{0};
        int[] q = new int[]{0};
        int[] result = solution.solution(s, p, q);
        Assert.assertArrayEquals(new int[]{1}, result);
    }

}
package prefixsums.minavgtwoslice;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by baizb on 01.02.2017.
 */
public class SolutionTest {

    private Solution solution;

    @Test
    public void solution() throws Exception {
        solution = new Solution();
        int result = this.solution.solution(new int[]{4, 2, 2, 5, 1, 5, 8});
        assertEquals(1, result);
    }

}
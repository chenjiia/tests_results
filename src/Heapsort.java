import de.tum.in.jmoped.annotation.Bits;
import de.tum.in.jmoped.annotation.Range;

/**
 * A heapsort implementation.
 * 
 * Taken from:
 * http://www.bagley.org/~doug/shootout/
 */
public class Heapsort {

	/**
	 * The sort method.
	 */
    public static void heapsort(int n, int ra[]) {
    int l, j, ir, i;
    int rra;

    l = (n >> 1) + 1;
    ir = n;
    for (;;) {
        if (l > 1) {
        rra = ra[--l];
        } else {
        rra = ra[ir];
        ra[ir] = ra[1];
        if (--ir == 1) {
            ra[1] = rra;
            return;
        }
        }
        i = l;
        j = l << 1;
        while (j <= ir) {
        if (j < ir && ra[j] < ra[j+1]) { ++j; }
        if (rra < ra[j]) {
            ra[i] = ra[j];
            j += (i = j);
        } else {
            j = ir + 1;
        }
        }
        ra[i] = rra;
    }
    }
    
    /**
     * A jMoped's test method.
     * 
     * Suggested bits/heap: 4/15
     * 
     * Result: OK, if array.length > 1 and isSorted starts from index 1.
     */
    @Bits({ "array[]=1" })
    @Range({ "array=[0,3]" })
    static void test(int[] array) {
    	heapsort(array.length, array);
    	assert(isSorted(array));
    }
    
	static boolean isSorted(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}
}

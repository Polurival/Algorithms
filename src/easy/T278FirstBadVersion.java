package easy;

/**
 * Related Topics: Binary Search
 *
 * Time complexity O(ln(n))
 * Space complexity O(1)
 */
class T278FirstBadVersion {

    /**
     * My solution
     */
    int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int middle = (int) (((long) left + right) / 2);

        while (right - left > 1) {
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle;
            }
            middle = (int) (((long) left + right) / 2);
        }
        if (left == 1) {
            return isBadVersion(left) ? left : right;
        } else {
            return right;
        }
    }

    /**
     * Not My, better solution
     */
    public int firstBadVersionBetter(int n) {
        int start = 1, end = n;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    /**
     * mock method
     */
    private boolean isBadVersion(int version) {
        return version >= 1702766719;
    }
}

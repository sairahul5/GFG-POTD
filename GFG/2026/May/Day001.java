package gfg.potd.y2026.may;

public class Day001 {
    boolean isSumOfConsecutive(int n) {
        // code here
        return (n&(n-1)) != 0;
    }
}

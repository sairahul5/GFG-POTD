package GFG.2026.May;

public class Day002 {
    class Solution {
    public String profession(int level, int pos) {
        return Integer.bitCount(pos-1)%2 == 0 ? "Engineer" : "Doctor";
    }
}
}

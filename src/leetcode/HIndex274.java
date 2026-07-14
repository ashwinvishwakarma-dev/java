package leetcode;

public class HIndex274 {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{1, 3, 1}));

    }

    public static int hIndex(int[] citations) {

        int count = 0;
        int len = citations.length;
        int[] newCitations = new int[len + 1];

        for (int i = 0; i < len; i++) {
            if (citations[i] < len) {
                newCitations[citations[i]] = newCitations[citations[i]] + 1;
            } else {
                newCitations[len] = newCitations[len] + 1;
            }
        }
        for (int i = newCitations.length - 1; i >= 0; i--) {
            count = count + newCitations[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }
}

package leetcode.array;

public class LastWordCount58 {
    public static void main(String[] args) {
        System.out.println(lastWordCount("    "));

    }

    private static int lastWordCount(String str) {

        int end = str.length() - 1;
        int count = 0;

        while (end >= 0) {
            char c = str.charAt(end);

            if (isBalnkChar(c)) {
                if (count != 0) {
                    return count;
                }
                end--;
            } else {
                end--;
                count++;
            }
        }

        return count;
    }

    public static boolean isBalnkChar(char c) {
        return c == 32;
    }

}

package leetcode;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World"));
    }

    private static String reverseWords(String s) {

        String[] strArr = s.trim().split("\\s+");

        StringBuilder str = new StringBuilder();

        for (int i = strArr.length - 1; i >= 0; i--) {

            str.append(strArr[i]);

            if (i != 0) {
                str.append(" ");
            }

        }

        return str.toString();
    }

}

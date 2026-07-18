package leetcode.array;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefixOptimize(str));

    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        String str = strs[0];
        int len = 0;
        int start = 0;
        boolean allDone;
        boolean allWell = true;
        StringBuilder sb = new StringBuilder();

        while (len < str.length()) {
            if (!allWell) {
                break;
            }
            sb.append(str.charAt(start));
            allDone = false;

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() > len) {
                    if (strs[i].startsWith(sb.toString())) {
                        if (i == strs.length - 1) {
                            allDone = true;
                            len++;
                            start++;
                        }
                    } else {
                        allWell = false;
                        break;
                    }
                } else {
                    allWell = false;
                    break;
                }
            }
        }

        return str.substring(0, len);
    }

    public static String longestCommonPrefixOptimize(String[] strs) {

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j <strs.length ; j++) {

                if (i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }


        return strs[0];
    }
}

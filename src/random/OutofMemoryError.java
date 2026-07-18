package random;

import java.util.ArrayList;
import java.util.List;

public class OutofMemoryError {
    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();

        // Continuously allocate memory blocks (1 MB each)
        while (true) {
            int[] num = new int[100 * 100];
            list.add(num);
        }
    }
}

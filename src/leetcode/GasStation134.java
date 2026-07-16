package leetcode;

public class GasStation134 {
    public static void main(String[] args) {

        int[] gas = {3, 1, 1};
        int[] cost = {1, 1, 2};

        System.out.println(canCompleteCircuit(gas, cost));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int start = 0;
        int tank = 0;

        int totalCost = 0;
        int totalGas = 0;

        for (int i = 0; i < gas.length; i++) {

            totalGas = totalGas + gas[i];
            totalCost = totalCost + cost[i];

            tank = tank + gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (totalCost > totalGas) {
            return -1;
        }

        return start;
    }
}

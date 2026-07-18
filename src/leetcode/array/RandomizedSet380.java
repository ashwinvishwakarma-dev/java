package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet380 {

    public static void main(String[] args) {

        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(0));
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.remove(0));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
    }

}

class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    Random random;


    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;

    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int value = map.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(value, lastElement);
        map.put(lastElement, value);

        list.remove(list.size() - 1);
        map.remove(val);

        return true;

    }

    public int getRandom() {
        int randomIndex= random.nextInt(list.size());
        return list.get(randomIndex);
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    private HashMap<Integer, Integer> map; // Maps value to its index in the array
    private ArrayList<Integer> list; // Stores the elements
    private Random rand; // Random number generator

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Element already in the set
        }
        map.put(val, list.size()); // Add value to map with its index in the list
        list.add(val); // Add value to the list
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Element not present in the set
        }
        int index = map.get(val); // Get index of the element to be removed
        int lastElement = list.get(list.size() - 1); // Get the last element in the list

        list.set(index, lastElement); // Move the last element to the index of the element to be removed
        map.put(lastElement, index); // Update the moved element's index in the map

        list.remove(list.size() - 1); // Remove the last element from the list
        map.remove(val); // Remove the element from the map
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size())); // Return a random element from the list
    }
}

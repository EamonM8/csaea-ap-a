import java.util.ArrayList;
import java.util.*;

public class ArrayLists {
    
    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Donkey");
        animals.add("Pangolin");
        animals.add("Blobfish");
        return animals;
    }
    
    public static void showIndex(ArrayList<String> animals) {
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
        System.out.println("Last element: " + animals.get(animals.size() - 1));
    }

    // linear search: returns the index of target, or -1 if not found
    // -1 is a good signal meaning not found

    public static int findIndex(ArrayList<String> list, String target) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }

}


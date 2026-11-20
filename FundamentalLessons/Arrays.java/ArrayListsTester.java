import java.util.*;
public class ArrayListsTester {
    
public static void main(String[] args) {
        
        ArrayList<String> animals = ArrayLists.createList();
        System.out.println(animals);

        ArrayLists.showIndex(animals);
        
        ArrayLists.findIndex(animals, "blobfish");

        ArrayLists.modifyAnimals(animals);

        ArrayLists.numberUtilities();
    }
}

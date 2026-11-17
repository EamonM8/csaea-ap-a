import java.util.Arrays;
public class NativeArrays {

    public static void main(String[] args) {
        int[] scores = new int[5];
        System.out.println("Default Values: " + Arrays.toString(scores));

        int[] nums = {3, 7, 1, 9, 4};

        System.out.println("Initializer List: " + Arrays.toString(nums));

        String[] names = new String[3];
        boolean[] flags = new boolean[3];
        double[] prices = new double[3];

        System.out.println("String defaults:  " + Arrays.toString(names));
        System.out.println("boolean defaults: " + Arrays.toString(flags));
        System.out.println("double defaults:  " + Arrays.toString(prices));
        

        System.out.println("\nFirst element nums[0]: " + nums[0]);
        System.out.println("Length (a field, no parentheses): " + nums.length);
        System.out.println("Last element nums[nums.length - 1]: " + nums[nums.length - 1]);
        
        nums[2] = 6;
       // Out of Bounds
       // System.out.println(nums[5]); Out of bounds exception
       // System.out.println(nums[-1]);

        // ===== 4. PARTS OF A FOR LOOP =====
        //   for (initialization; condition; update)
        //   initialization -> runs once, sets the starting index
        //   condition      -> checked before every pass; loop stops when false
        //   update         -> runs after every pass

        for (int i = 0; i < nums.length; i++) {
            System.out.println(" Index "+ i + "-> value " + nums[i]);

        }
        // ENHANCED FOR LOOP
        // Gives you each VALUE, no index. Good for reading, not for changing

        for (int i : nums) {
            System.out.println(" Enhanced value " + i);
        }
        // Challenge 1: Double It
        // Multiply every element by 2, then print the array.
        int[] challengeOne = {3, 7, 1, 9, 4};
        // TODO: your loop here

        // Modified for loop that prints only evens

        for (int i = 0; i < challengeOne.length; i += 2) {
            System.out.println(" Index "+ i + "-> value " + (2 * nums[i]));
        }
        // Challenge 2: Every Other
        // Use i += 2 to add 10 to only the elements at even indexes, then print.
        int[] challengeTwo = {3, 7, 1, 9, 4};
        // TODO: your loop here
        for (int i = 0; i < challengeOne.length; i += 2) {
            System.out.println(" Index "+ i + "-> value " + (10 + nums[i]));
        }

          // Challenge 3: Replace Negatives
        // Change every negative number to 0, then print.
        int[] temps = {5, -3, 8, -1, 0, -7};
        // TODO: your loop her

        for (int i = 0; i < challengeOne.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
            System.out.println(" Index "+ i + "-> value " + nums[i]);
        }
        // Challenge: Curve the Scores
         int[] scores2 = {85, 62, 97, 45, 70, 99};
        // Add 5 to every score, but no score can go above 100. 
        for (int i = 0; i < scores2.length; i++) {
            if ((scores2[i] += 5) >= 100) {
                scores2[i] = 100;
            } else {
                scores2[i] = (scores2[i] +=5);
            }
            System.out.println("Scores: " + scores2[i]);
        }
        // Challenge: Random Fill
        int[] numbers = new int[10];
        // Loop 10 times. Each time, use Math.random() to get a random number from 1 to 100 and a random index from 0 to 9, then put the number at that index. Print the array. 
        // Then answer: why are some spots still 0?
        for (int i = 0; i < 10; i++) {
            int val = (int) (Math.random() * 101);
            int index = (int) (Math.random() * 9);
            numbers[index] = val;
            System.out.println(numbers[i]);
        }
        // some are still zero because there is no guarentee that each index gets hit by the program.
}
}
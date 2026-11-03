// TESTER CLASS: seperate class, holds main

public class robotTester {

    public static void main(String[] args) {

        // OBJECT: an instance of the class
        // INSTANTIATION: new + constructor call
        // ARGUMENTS: Rover, RX-77-B, 8.0)
        robot r1 = new robot("Rover","RX-77-B",8.0);
        robot r2 = new robot("Unit", "TK-21", 3.0);

        System.out.println(r1); //returns? Memory Address

        // ALIASING
        robot r3 = r1;
        System.out.println(r3); //returns? Values of r1

        r3.setName("Scout");
        System.out.println(r1.getName()); //prints "Scout"

        // == compares objects
        System.out.println(r1 == r3); //true

        // == vs .equals() on Strings
        String s1 = "RX-77-B";
        String s2 = new String("RX-77-B");
        System.out.println(s1 == s2); // false, not the same object.

        System.out.println(r1.serialContains("77")); //Should be true
        System.out.println(r1.serialContains("rx")); //false, case sensitive
}

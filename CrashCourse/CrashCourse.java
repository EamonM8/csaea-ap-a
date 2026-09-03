package CrashCourse;
// If your java file isn't running, you might need to add the following line and uncomment
// package CrashCourse (the name of the dolder that includes CrashCourse.java)
public class CrashCourse {     // class header

    public static void main(String[] args) {

        // comments - also can use cntrl forward slash
        
        /*  
        Multiline 
         Comment
         Here
         */

         System.out.print("Hello");
         System.out.println("World"); //auto prints on new line
         System.out.println("Hello World!");

         // variable declarations
         // PRIMITIVE VARIABLES
         int a; //integer
         double b; //decimal
         boolean c; //True or false

         a = 4;
         b = 5.5;
         c = false; //lowercase

         // Arithmetic operators
         // + - / * %
         // += -= /= %=


         int d = 3;
         d += 7;

         // incrament and decrament by 1:
         // ++ --
         d--;
         d++;
         d++;
         System.out.println("d = " + d);
         //COMPARISONS (always returns true or false)
         // < > <= >= == !=
         System.out.println(4 < 5);
         System.out.println(7 == 4);
         System.out.println(1 != 2);

         // LOGICAL OPERATORS
         // In order of prescedence: NOT:! AND:&& OR:||

         boolean f = false; boolean t = true;
         // predict output: true or false?
         System.out.println(!f); //True?
         System.out.println(f && t); //false?
         System.out.println(f || t); //True?
         System.out.println(f || t && !f); //True?
         //Got it! (changing to t and f broke it somehow)

         System.out.println(f && t); //Short circuits after checking e. Doesn't need to check f
         System.out.println(t || (f && t)); //short circuits after the first t.

         // CASTING (converting)
         int g = (int)5.5;  
         System.out.println(g);
         double h = (double)5/6;
         System.out.println(h);

         // STRINGS
         String s1 = "goodnight";
         String s2 = " and ";
         String s3 = "Goodbye";
         String result = s1 + s2 + s3;
         result += ", Cowboy";
         System.out.println(result + "\n");

        //  Arrays
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

            arry1[0] = 11;
            arry1[1] = 2;

            System.out.println("Remainder: " + arry1[0] % arry1[1]);

            int[] arry2 = {34, 52, 3, 64, 32};
            System.out.println("arry2: " + arry2);

            // 2d Arrays (grid or a table)

            int[][] arryGrid1 = new int[4][3]; // [rows] [columns]
            // 0 0 0
            // 0 0 0
            // 0 0 0
            // 0 0 0

            System.out.println("Rows: " + arryGrid1.length);
            System.out.println("Columns: " + arryGrid1[0].length);
    }
}

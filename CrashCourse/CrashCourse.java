package CrashCourse;
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

         boolean e = false; boolean f = true;
         // predict output: true or false?
         System.out.println(!e); //True?
         System.out.println(e && f); //false?
         System.out.println(e || f); //True?
         System.out.println(e || f && !e); //True?
         //Got it!

         System.out.println(e && f); //Short circuits after checking e. Doesn't need to check f
    }
}

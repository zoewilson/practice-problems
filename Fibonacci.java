/* Fibonacci */

import java.lang.Integer;

public class Fibonacci {

  public static void main(String[] args) {

    if (args.length != 1) {
        System.err.println("Must provide 1 maximum value for the Fibonacci series.");
        System.exit(1);
    }

    int max = 0;
    try {
        max = Integer.parseInt(args[0]);   
    } catch (Exception e) {
        System.err.println("Must provide 1 maximum value for the Fibonacci series.");
        System.exit(1);
    }

    int a = 1;
    int b = 1;
    int result;
 
    System.out.print(a + ", " + b);

    while (true) { 
        result = a + b;
        a = b;
        b = result; 
 
        if (result > max) {
            break;
        }

        System.out.print(", " + result);
     }
     System.out.println();
  }
}

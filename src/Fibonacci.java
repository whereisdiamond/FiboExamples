public class Fibonacci {

    /**
     * @param n
     * this is the Recursion Method
     */


    //fiboRecur allows for the fibonacci sequence to be generated using the recursion method
    public static int fiboRecur(int n) {
        if (n <= 1)
            return n;


        return fiboRecur(n - 1) + fiboRecur(n - 2);
    }
    /**
     * @param n
     * this Method prints the recursion outputs
     */
    //When I try to print using fiboRecur, it always prints a 1 between each number, so I used this to filter it out.
    public static void printFiboRecur(int n) {
        for (int i = 0; i < n; i++) {
            long startTime = System.nanoTime();
            System.out.print(fiboRecur(i) + " ");
            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            System.out.println("Execution time: " + executionTime + " nanoseconds");
        }
    }

    //This method generates the fibonacci sequence iteratively
    /**
     * @param n
     * this is the Iterative method
     */
    public static void printFiboIterative(int n) {
        int fibPrev = 0;
        int fibCurr = 1;

        System.out.print(fibPrev + " ");
        long startTime = System.nanoTime();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibCurr + " ");

            int temp = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = temp;
            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            System.out.println("Execution time: " + executionTime + " nanoseconds");
        }
    }
    /**
     * @param args
     * this is the Main Method
     */
    //This is the main function
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Recursive Fibonacci: ");
        printFiboRecur(n);
        System.out.println();

        System.out.print("Iterative Fibonacci: ");
        printFiboIterative(n);
        System.out.println();

        System.out.println("hello world");

    }

}

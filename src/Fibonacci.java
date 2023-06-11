public class Fibonacci {

    /**
     *
     * @param n
     * @return
     */

    //fiboRecur allows for the fibonacci sequence to be generated using the recursion method
    public static int fiboRecur(int n){
        if (n <= 1)
            return n;


        int fibCurr = fiboRecur(n - 1) + fiboRecur(n - 2);
        return fibCurr;
    }
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
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int fibPrev = 0;
        int fibCurr = 1;

        System.out.print(fibPrev + " " + fibCurr + " ");

        for (int i = 2; i <= n; i++) {
            int temp = fibPrev + fibCurr;
            System.out.print(temp + " ");
            fibPrev = fibCurr;
            fibCurr = temp;
        }

        return fibCurr;
    }
//This is the main function
    public static void main(String args[]) {
        //Recursive Method
        int n = 10;
        System.out.print("Recursive Fibonacci: ");
        printFiboRecur(n);
        System.out.println();

        //Iterative Method
        long startTime = System.nanoTime();
        int fibIterative = fibonacciIterative(n);
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Iterative Fibonacci: " + fibIterative);
    }
}
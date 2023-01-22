import java.util.Scanner;

public class StopWatch {
    static long startTime;
    static long endTime;

    static void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started!");
    }

    static void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped!");
    }

    static void getElapsedTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to start the stopwatch.");
        int choice = sc.nextInt();
        if (choice == 1) {
            start();
        }
        System.out.println("Press 2 to stop the stopwatch.");
        choice = sc.nextInt();
        if (choice == 2) {
            stop();
        }
        getElapsedTime();
    }
}

import java.util.Arrays;

public class VendingMachine {
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
    static int[] notesCount = new int[8];

    static void findNotes(int change) {
        if (change == 0) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (change >= notes[i]) {
                change -= notes[i];
                notesCount[i]++;
                findNotes(change);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int change = 8888;
        findNotes(change);
        System.out.println("Change: " + change);
        System.out.println("Minimum number of notes needed to give the change: " + Arrays.stream(notesCount).sum());
        for (int i = 0; i < 8; i++) {
            if (notesCount[i] != 0) {
                System.out.println(notes[i] + " x " + notesCount[i]);
            }
        }
    }
}

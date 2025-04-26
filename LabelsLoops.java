public class LabelsLoops {
    public static void main(String[] args) {
        int i, j = 0; // Initialize j with a default value
        outerLoop: 
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break outerLoop;
                }
            }
        }
        System.out.println("i=" + i + " j=" + j);
    }
}

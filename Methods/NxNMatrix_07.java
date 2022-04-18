import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);

    }
    public static void printMatrix (int n){
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

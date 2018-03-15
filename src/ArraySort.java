import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = 10;
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = rand.nextInt(10);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < N - 1; i++) {
            for (int x = N - 2; x >= i; x--) {
                if (A[x] > A[x + 1]) {
                    int y = A[x];
                    A[x] = A[x + 1];
                    A[x + 1] = y;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

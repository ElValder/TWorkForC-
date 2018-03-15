import java.util.Random;

public class SumOfEvenNum {
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
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
        }
        System.out.println(sum);
    }
}

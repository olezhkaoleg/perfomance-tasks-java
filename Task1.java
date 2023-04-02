import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a length: ");
        int n = in.nextInt();
        System.out.print("Input a walk interval: ");
        int m = in.nextInt();
        in.close();
        int[] array = new int[n];
        int i = 1;
        do {
            System.out.println(i);
            i = i + m - 1;
            if (i > n) {
                i = i % n;
            }
        } while(i != 1);


    }
}

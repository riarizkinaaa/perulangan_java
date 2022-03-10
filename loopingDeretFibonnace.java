import java.util.Scanner;

public class loopingDeretFibonnace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fn, fn_1, fn_2, n;
        System.out.print("masukkan nilai fibonnace ke - ");
        n = input.nextInt();
        fn_1 = 0;
        fn_2 = 1;
        fn = 1;
        int i = 1;
        while (i <= n) {
            System.out.println("nilai ke- " + i + " hasil " + fn);
            i++;
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        // for (int i = 1; i <= n; i++) {
        // System.out.println("nilai ke- " + i + " hasil " + fn);
        // fn = fn_1 + fn_2;
        // fn_2 = fn_1;
        // fn_1 = fn;
        // }

    }

}

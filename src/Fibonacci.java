// Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0, n2 = 1, total;

        System.out.println();
        System.out.print("Serinin Eleman Sayisini Giriniz : ");
        int number = input.nextInt();
        System.out.println();

        for (int i = 1; i <= number; i++) {
            System.out.print(n1 + " ");
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
        System.out.println();
    }
}
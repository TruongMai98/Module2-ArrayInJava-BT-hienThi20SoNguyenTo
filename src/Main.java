import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" nhaap so nguyen n");
    int n = scanner.nextInt();
    int i, prime, num, countPrime;
    System.out.printf("'%d' so nguyen to la \n", n);
    num = 2;
    countPrime = 0;
    while (countPrime < n) {
        prime = 1;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 1) {
            System.out.println(num);
            countPrime++;
        }
        num++;
    }
    }
}
//    static void checkPrime(int i) {
//        if (i < 2) {
//            System.out.println(false);
//        } else if (i == 2) {
//            System.out.println(true);
//        } else if (i > 2) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    System.out.println(false);
//                    break;
//                } else {
//                    System.out.println(true);
//                }
//            }
//        }
//    }
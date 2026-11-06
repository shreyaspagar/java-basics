import java.util.Scanner;

public class Zoom5Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int oddSum = 0, evenSum = 0;

        for (int idx = 0; idx < N; idx++) {
            int element = sc.nextInt();

            if(element % 2 == 1) oddSum += element;
            else evenSum += element;
        }

        System.out.println(oddSum + " " + evenSum);
    }
}

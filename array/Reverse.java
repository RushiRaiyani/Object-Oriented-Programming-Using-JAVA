import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element:");
        byte n = sc.nextByte();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element [" + i + "] ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse order of array is:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
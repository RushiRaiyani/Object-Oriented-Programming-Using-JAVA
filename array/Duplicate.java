
/* Java Array Program to Remove Duplicate Elements From an Array */
import java.util.Scanner;
import java.util.Arrays;

class Duplicate {
    public static void main(String[] args) {
        System.out.println("Enter number of terms:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        int[] ans = new int[n - count];
        int temp = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            temp = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    temp = 1;
                    break;
                }
            }
            if (temp != 1) {
                ans[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ",");
        }
    }
}

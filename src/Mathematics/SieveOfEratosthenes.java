package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimesInRange(n);
        sc.close();
    }
    /***********************************************
    public static void findPrimesInRange(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i)
                    arr[j] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i])
                System.out.println(i);
        }
    }
    ***********************************************/
    public static void findPrimesInRange(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        for(int i = 2; i <= n; i++){
            if(arr[i]){
                System.out.println(i);
                for(int j = i * i; j <= n; j += i){
                    arr[j] = false;
                }
            }
        }
    }
}
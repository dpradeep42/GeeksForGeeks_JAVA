package Mathematics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
    public static boolean isPalindrome(int n){
        int temp = n;
        int newNum = 0;
        while(n != 0){
            newNum = (newNum * 10) + (n % 10);
            n /= 10;
        }
        if(temp == newNum)
            return true;
        return false;
    }
}
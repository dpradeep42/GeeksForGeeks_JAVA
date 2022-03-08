package Mathematics;

import java.util.Scanner;

public class Finding_Number_of_Digits_in_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        sc.close();
    }
    public static int countDigit(long n){
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
}

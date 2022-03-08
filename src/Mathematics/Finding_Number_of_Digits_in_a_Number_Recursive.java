package Mathematics;

import java.util.Scanner;

public class Finding_Number_of_Digits_in_a_Number_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        sc.close();
    }
    public static int countDigit(long n){
        if(n == 0)
            return 0;
        return 1 + countDigit(n / 10);
    }
}

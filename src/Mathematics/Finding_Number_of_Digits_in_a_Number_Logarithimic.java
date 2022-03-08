package Mathematics;

import java.util.Scanner;

public class Finding_Number_of_Digits_in_a_Number_Logarithimic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        sc.close();
    }
    public static int countDigit(long n){
        return (int)Math.floor(Math.log10(n) + 1);
    }
}

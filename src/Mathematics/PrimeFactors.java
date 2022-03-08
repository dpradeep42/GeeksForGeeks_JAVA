package Mathematics;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFacors(n);
        sc.close();
    }
    public static void primeFacors(int n){
        if(n <= 1){
            System.out.println(n);
            return;
        }
        for(int i = 2; i * i < n; i++){
            while(n % i == 0){
                System.out.println(i);
                n /= i;
            }
        }
        if(n > 1)
            System.out.println(n);
    }
}

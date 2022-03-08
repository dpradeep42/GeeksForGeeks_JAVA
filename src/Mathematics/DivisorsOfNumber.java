package Mathematics;

import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findDivisors(n);
        sc.close();
    }
    /****************************************
    //Unsorted order
    public static void findDivisors(int n){
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
                if(i != n / i)
                System.out.println(n / i);
            }
        }
    }
    ****************************************/
    public static void findDivisors(int n){
        int i;
        for(i = 1; i * i < n; i++)
            if(n % i == 0)
                System.out.println(i);
        for( ; i >= 1; i--){
            if(n % i == 0)
                System.out.println(n / i);
        }
    }
}

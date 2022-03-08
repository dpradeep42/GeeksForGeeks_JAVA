package Mathematics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLCM(a, b));
        sc.close();
    }
    public static int findLCM(int a, int b){
        return (a * b)/findGCD(a, b);
    }
    public static int findGCD(int a, int b){
        if(b == 0)
            return a;
        return findGCD(b, a % b);
    }
}

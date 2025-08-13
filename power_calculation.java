import java.util.Scanner;

public class power_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();
        double result = Math.pow(e,b);
        System.out.println(result);
    }
}

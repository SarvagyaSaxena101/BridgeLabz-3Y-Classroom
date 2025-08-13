import java.util.Scanner;

public class volume_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(Math.PI*a*a*h);
    }
}

import java.util.Scanner;

public class odev23 {
    public static void main(String[] args) {
        int i, n;
        double b = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Harmonik Seri icin N Degerini Giriniz : ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            b += (1.0 / i);
        }
        System.out.println(b);
    }
}

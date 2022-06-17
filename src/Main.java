import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ticket = sc.nextDouble();
        int mile = (int) (ticket / 20);
        System.out.println(mile);
    }
}

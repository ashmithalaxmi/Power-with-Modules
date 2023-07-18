import java.util.Scanner;

public class PowerWithModules {
    public static int calculate(int a, int b, int c){
        int result = 1;
        for(int i=1;i<=b;i++){
            result *= a;
        }
        return result%c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int rem = calculate(a, b, c);
        System.out.println(rem);
    }
}

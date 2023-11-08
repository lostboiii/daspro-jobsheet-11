import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("N harus minimal 3.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i == 1 || i == n) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(n + " ");
                    }
                } else {
                    System.out.print(n + " ");
                    for (int j = 2; j < n; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(n + " ");
                }
                System.out.println();
            }
        }
        sc.close(); 
    }
}

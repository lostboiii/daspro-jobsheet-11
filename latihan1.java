import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("N harus minimal 3.");
        } else {
            for (int i = 1; i <= n; i++) {
             
                for (int j = 1; j < i; j++) {
                    System.out.print(""); 
                }

                
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}

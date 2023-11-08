import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
            System.out.println("Tebak angka (1-10):");
            int answer = sc.nextInt();
            sc.nextLine();
            success = (answer == number); 
            if (answer == number) {
                System.out.println("Angka Benar");
                
            } 
            else if(answer < number) {
                System.out.println("Angka lebih besar dari " + answer);
            }
            else{
                 System.out.println("Angka lebih kecil dari " + answer);
            }
            } while (!success);
            System.out.println("Apakah anda ingin mengulang permainan (y/Y)?");
            menu = sc.nextLine().charAt(0);
        } while (menu=='y'||menu=='Y');
        
        sc.close();
    }
}

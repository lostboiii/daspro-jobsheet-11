import java.util.Scanner;

public class NestedLoop_2341720125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double array[][] = new double [5][7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Hari ke-" + (j+1)+ ": ");
                array[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ":");
            double totalTemp = 0.0;
            for (double temp : array[i]) {
                System.out.print(temp + " ");
                totalTemp += temp;
            }
            double averageTemp = totalTemp / array[i].length;
            System.out.println("\nRata-rata suhu: " + averageTemp);
        }
        sc.close();
    }
}
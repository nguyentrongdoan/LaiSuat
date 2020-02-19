import java.util.Scanner;

public class laiSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: "); // Nhap so tien gui.
        double money = sc.nextDouble();

        System.out.print("Enter a number of month: "); // Nhap so thang gui.
        int month = sc.nextInt();

        System.out.println("Enter annual interest rate in percentage: "); // Nhap lai suat.
        double interset_rate = sc.nextDouble();

        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rate / 100) / 12 * month;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}

package manager_number;

import java.util.Scanner;

public class MainNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("QUản lý mảng số");
            System.out.println("1. Hiển thị số");
            System.out.println("2. Thêm số");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManagerNumber.show();
                    break;
                case 2:
                    System.out.println("Nhập số cần thêm");
                    int num = scanner.nextInt();
                    ManagerNumber.add(num);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

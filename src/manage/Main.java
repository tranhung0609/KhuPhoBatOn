package manage;

import java.awt.*;
import java.util.Scanner;

public class Main {
    Scanner a = new Scanner(System.in);
    HoFamily hoFamily = new HoFamily();

    public void Menu() {
        int choice;
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1. Thêm thành viên");
            System.out.println("2. Xóa thành viên");
            System.out.println("3. Sửa thành viên");
            System.out.println("4. Hiển thị");
            System.out.println("0. Thoát");
            System.out.println("=====Enter your choice=====");
            choice = a.nextInt();

            switch (choice) {
                case 1:
                    hoFamily.add();
                    break;
                case 2:
                    hoFamily.delete();
                    System.out.println();
                    break;
                case 3:
                    hoFamily.edit();
                    break;
                case 4:
                    hoFamily.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }

    public static void main(String[] args) {
//        ManageHuman manageHuman = new ManageHuman();
//        System.out.println(manageHuman.human());
        Main menu = new Main();
        menu.Menu();
//        manageHuman.display();
    }
}

package manage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageHuman extends Human {
    ArrayList<Human> humans = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Human human() {
        System.out.println("------------Nhập thông tin thành viên------------");
        System.out.println("Nhập tên thành viên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi thành viên");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập công việc");
        String job = sc.nextLine();
        System.out.println("Nhập căn cước công dân");
        long id = Long.parseLong(sc.nextLine());
        System.out.println("--------------------------------------------------");

        Human human = new Human(name, age, job, id);
        return human;
    }
//    public void display(){
//        for(int i = 0; i<humans.size();i++){
//            System.out.println(humans.get(i));
//        }
//    }
}

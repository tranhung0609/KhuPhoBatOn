package manage;

import java.util.ArrayList;

public class HoFamily extends ManageHuman {
    private String address;
    private int number;

    public HoFamily() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public HoFamily(String address, int number, ArrayList<Human> humans) {
        this.address = address;
        this.number = number;
        this.humans = humans;
    }


    ArrayList<Human> humans = new ArrayList<>();

    public void add() {
        Human hm = human();
        humans.add(hm);
    }


    public void display() {
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }
    }

    public int findByName(String name) {
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    public void delete() {
        int viTri = findByName(sc.nextLine());
        if (viTri != 1) {
            humans.remove(viTri);
        } else {
            System.out.println("Không có bé ơiiii");
        }
    }


    public void edit() {
        int indexOfHuman = findByName(sc.nextLine());
        if (indexOfHuman == -1) {
            System.out.println("Không có để sửa bé ơiiio");
        } else {
            humans.set(indexOfHuman, human());
        }
    }
}


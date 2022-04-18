package manage;

public class Human {
    private String name;
    private int age;
    private String job;
    private long id;

    public Human() {
    }

    public Human(String name, int age, String job, long id) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Thành viên (" +
                "Tên : " + name +
                ", Tuổi : " + age +
                ", Nghề nghiệp : " + job +
                ", CCCD : " + id +
                ')';
    }
}

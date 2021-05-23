package be.ehb.multec;

public class DriverClass implements Driver {
    private int id;
    private String name;
    private double age;
    private String gender;
    private double skill;

    public DriverClass(int id, String name, double age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skill = skill;

    }

    public DriverClass() {

    }



    @Override
    public String getDescription() {

        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public double getSkill() {
        return 10;
    }


}

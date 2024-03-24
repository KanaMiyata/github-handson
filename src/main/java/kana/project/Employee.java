package kana.project;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String job;

    public Employee(String name, int age, String gender, String job) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    public void getAllInfo() {
        System.out.println(name + ", " + age + ", " + gender);
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}



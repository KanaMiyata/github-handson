package kana.project;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String job;
    private String livingplace;

    public Employee(String name, int age, String gender, String job,String livingplace) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.livingplace=livingplace;
    }

    public void getAllInfo() {
        System.out.println(name + ", " + age + ", " + gender+job+livingplace);
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
    public String getlivingplace(){
        return livingplace;

    }
}



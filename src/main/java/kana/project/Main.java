package kana.project;
public class Main {
    public static void main(String[] args) {

        Employee person = new Employee("Kana", 31, "Female", "police","tokyo");
        Employee person2 = new Employee("Tarou", 30, "Male", "teacher","nagoya");

        person2.getAllInfo();

        System.out.println(person.getGender());
        System.out.println(person.getName());
        System.out.println(person2.getJob());
        System.out.println(person.getlivingplace());


    }
}

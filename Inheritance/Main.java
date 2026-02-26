package Inheritance;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setGender("Male");
        person.getFirstName();
        person.getLastName();
        person.getGender();
        System.out.println(person.toString());

        System.out.println("");

        Person person1 = new Person();
        person1.setFirstName("Joshua");
        person1.setLastName("Doe");
        person1.setGender("Male");
        person1.getFirstName();
        person1.getLastName();
        person1.getGender();
        System.out.println(person1.toString());

        System.out.println(person.equals(person1));

        Teacher teacher = new Teacher();
        teacher.setFirstName("John");
        teacher.setLastName("Doe");
        teacher.setGender("Male");
        teacher.setCourse("Java");
        teacher.setDepartment("IT");
        teacher.getCourse();
        teacher.getDepartment();
        teacher.getFirstName();
        teacher.getLastName();
        teacher.getGender();
        System.out.println(teacher.toString());

        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Joshua");
        teacher1.setLastName("Doe");
        teacher1.setGender("Male");
        teacher1.setCourse("Java");
        teacher1.setDepartment("IT");
        teacher1.getCourse();
        teacher1.getDepartment();
        teacher1.getFirstName();
        teacher1.getLastName();
        teacher1.getGender();
        System.out.println(teacher1.toString());

        System.out.println(teacher.equals(teacher1));
    }
}

package Inheritance;

public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public void getFirstName() {
        System.out.println("First name: " + firstName);
    }

    public void getLastName() {
        System.out.println("Last name: " + lastName);
    }

    public void getGender() {
        System.out.println("Gender: " + gender);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "First name: " + firstName + "\nLast name: " + lastName + "\nGender: " + gender;
    }

    public boolean equals(Person person) { //
        return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName) && this.gender.equals(person.gender);
    }
}

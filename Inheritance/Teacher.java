package Inheritance;

public class Teacher extends Person {

    private String department;
    private String course;

    public void getCourse() {
        System.out.println("Course: " + course);
    }

    public void getDepartment() {
        System.out.println("Department: " + department);
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher other = (Teacher) obj;
        return super.equals(other)
                && java.util.Objects.equals(department, other.department)
                && java.util.Objects.equals(course, other.course);
    }
}

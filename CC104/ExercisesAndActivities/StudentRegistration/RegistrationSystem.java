import java.util.ArrayList;

public class RegistrationSystem {
    // Keep the ArrayList outside the method and in a class
    // to allow for each instance to have its own list
    private ArrayList<Student> students;

    public RegistrationSystem() {
        students = new ArrayList<>();
    }

    // In: Student Object (name, id, gpa)
    // Out: True or False
    public boolean addStudent(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    // In: Student ID
    // Out: True or False
    public boolean removeStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    // In: void
    // Out: void
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // In: Student ID
    // Out: object or null
    public Student findStudent(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                return s;
            }
        }
        return null;
    }
}

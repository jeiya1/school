public class Student {
    private final String name;
    private final int studentId;
    private final double gpa;

    public Student(String name, int studentId, double gpa  ) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    // Removed @Override as per the requirement
    @SuppressWarnings("override")
    // When an objects gets called a string,
    // java will try and use toString automatically
    public String toString() {
        return String.format("""
                
                Student ID: %d
                Student Name: %s
                Student GPA: %.2f""",
                studentId, name, gpa);
    }
}

public class Student {

    private int studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;

    private static String universityName = "Jamhuriya University";

    public Student(int studentId, String name, int age, String department, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        setAge(age);
        setGpa(gpa);
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static void setUniversityName(String uniName) {
        universityName = uniName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age for " + name + ". Defaulting to 18.");
            this.age = 18;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA for " + name + ". Defaulting to 0.0.");
            this.gpa = 0.0;
        }
    }

    public String checkPass() {
        if (gpa >= 2.0) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public void displayInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("Result: " + checkPass());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        Student student1 = new Student(101, "Ahmed", 20, "Networking and Security", 3.5);
        Student student2 = new Student(102, "Amina", 21, "Computer Science", 2.8);
        Student student3 = new Student(103, "Mohamed", 19, "Software Engineering", 1.8);
        Student student4 = new Student(104, "Fatima", 22, "Networking and Security", 3.2);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}
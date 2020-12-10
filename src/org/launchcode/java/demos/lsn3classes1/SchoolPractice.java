package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student kirsti = new Student();
        kirsti.setName("Kirsti");
        kirsti.setStudentId(1);
        kirsti.setNumberOfCredits(6);
        kirsti.setgpa(4.0);

        Course java = new Course(101, "Intro to Java");

        java.addStudent(kirsti);
        System.out.println(java.getStudents());
    }
}

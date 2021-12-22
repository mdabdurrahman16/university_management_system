package university_management_system;

import java.util.List;


/*
    Many Teachers,Many Students
 */
public class University {

    private List<Teacher> teachers;
    private  List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    /*
        new university object is created.
        list of the teacher in university.
        list of the student of the university;
     */

    public University(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpend=0;
    }

    /*
        return the list of teachers in the university
     */

    public List<Teacher> getTeacher() {
        return teachers;
    }
    /*
        Add a teacher to the university
        teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    /*
        return the list of the students in university
     */
    public List<Student> getStudent() {
        return students;
    }

    /*
        adds a students to the university
        The student to be added
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /*
        Total money earned by the university
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /*
        Adds the total Money Earned by the university
        money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned+=MoneyEarned;
    }

    /*
        return the total money spent by the university
     */
    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }
    /*
        update the money is spent by the university which
        is the salary given by the university to adds teachers.
        MoneySpent by the university
     */

    public static void updateTotalMoneySpend(int MoneySpend) {
        totalMoneyEarned-=MoneySpend;
    }
}

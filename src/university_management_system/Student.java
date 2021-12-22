package university_management_system;
/*
    This class is responsible for keep the
    track of Students name , fess, grade
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int fessPaid;
    private int fessTotal;

    /*
        To create a new student by initializing.
        fess for every student is $30,000.
        fess paid initially = 0...
        id for the student unique ..
        name for the student ..
        grade of student...
     */

    public Student(int id,String name,int grade){
        this.fessPaid = 0;
        this.fessTotal = 30000;
        this.id = id;
        this.name =name;
        this.grade = grade;

    }

    /*
        used to update the student's grade.
        new grade of the Student.

     */

    public void setGrade(int grade){
            this.grade = grade;
    }
    /*
        keep adding the fess to fessPaid field.
        fessPaid  = 10000+ 5000;
        Add the fess to the fess paid.
        The university going to receive the found.
        The fess that the  student pays

     */
    public void payFees(int fess){
        fessPaid+=fess;
        University.updateTotalMoneyEarned(fessPaid);
    }
    /*
        return id of the student.

     */

    public int getId() {
        return id;
    }
    /*
     return name of the student;
     */

    public String getName() {
        return name;
    }
    /*
     return the Grade of the Student
     */

    public int getGrade() {
        return grade;
    }

    /*
    return fessPaid by the student.
     */

    public int getFessPaid() {
        return fessPaid;
    }
    /*
        return the total fess of the studnet.
     */
    public int getFessTotal() {
        return fessTotal;
    }
    /*
        return the reamingFess.

     */
    public int getReamingFees(){
        return fessTotal - fessPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+
                " Total fees paid so far $"+fessPaid;
    }
}

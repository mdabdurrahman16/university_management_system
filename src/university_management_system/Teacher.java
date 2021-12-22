package university_management_system;
/*
    This class is responsible for keeping the track
    of teacher's name,id,salary;
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /*
        Created a new Teacher object
        id for the teacher.
        name of teacher.
        salary of the teacher
     */
    public Teacher(int id, String name,int salary){
        this.id =id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }
    /*
        return the id of teacher.
     */
    public int getid(){
        return id;
    }
    /*
        return name of the teacher.
     */
    public String getName(){
        return name;
    }
    public int getSalary(){
        return  salary;
    }
    /*
        set the salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }
    /*
        Adds to salaryEarned.
        Removes from the total money Earned from the university.
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        University.updateTotalMoneySpend(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+name+
                " Total Salary earned so far $"+salaryEarned;
    }
}

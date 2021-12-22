package university_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Teacher george = new Teacher(1,"George",1000);
        Teacher carton = new Teacher(2,"Carton",1200);
        Teacher mellisa = new Teacher(3,"Mellisa",1500);

        List<Teacher> teacherasList = new ArrayList<>();
        teacherasList.add(george);
        teacherasList.add(carton);
        teacherasList.add(mellisa);


        Student noah = new Student(1,"Noah",4);
        Student oliva = new Student(2,"Oliva",3);
        Student william = new Student(3,"william",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(noah);
        studentList.add(oliva);
        studentList.add(william);

        University su = new University(teacherasList,studentList);

        noah.payFees(5000);
        oliva.payFees(10000);
        System.out.println("SU has earned : $"+su.getTotalMoneyEarned());

        System.out.println("------MAKING UNIVERSITY PAY SALARY-------");

        george.receiveSalary(george.getSalary());
        System.out.println("SU has spent for salary to "+george.getName()+
                " and now has : $"+su.getTotalMoneyEarned());


        carton.receiveSalary(carton.getSalary());
        System.out.println("SU has spent for salary to "+carton.getName()+
                " and now has : $"+su.getTotalMoneyEarned());

        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println("SU has spent for salary to "+mellisa.getName()+
                " and now has : $"+su.getTotalMoneyEarned());
        System.out.println(noah);
        System.out.println(george);
    }
}

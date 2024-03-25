package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher liza = new Teacher(1,"Liza",  2500);
        Teacher rita = new Teacher(2,"Rita", 3000);
        Teacher evandro = new Teacher(3,"Evandro", 3500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(liza);
        teacherList.add(rita);
        teacherList.add(evandro);

        Student vinicius = new Student(1,"Vinicius", 3);
        Student duda = new Student(2,"Eduarda", 1);
        Student vitoria = new Student(3,"Vitoria", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(vinicius);
        studentList.add(duda);
        studentList.add(vitoria);

        School ghs = new School(teacherList,studentList);
        System.out.println("GHS has earned "+ ghs.getTotalMoneyEarned());

        vinicius.payTaxas(2000);
        duda.payTaxas(1500);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("--------Making SCHOOL PAY SALARY------");
        liza.rebeceSalario(liza.getSalario());
        System.out.println("GHS has spent for salary to " + liza.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(vitoria);

        rita.rebeceSalario(rita.getSalario());

        System.out.println(rita);

    }
}

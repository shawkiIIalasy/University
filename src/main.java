import sun.awt.UNIXToolkit;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class main {


    public static void main(String[] args) {
        University university=new University("AABU");

        university.addFacultie("IT");
        university.addFacultie("Engineering");

        university.getFacultie("IT").addDepartment("CIS");
        university.getFacultie("IT").addDepartment("CS");
        university.getFacultie("Engineering").addDepartment("Electrical");
        university.getFacultie("Engineering").addDepartment("Mechanical");
        university.getFacultie("Engineering").addDepartment("Civil");

        /*Enrolment e=new Enrolment();

        for (int i = 0; i < 1000; i++) {
            Random rand=new Random();
            e.enrol("student"+i,all.get(rand.nextInt(all.size())));
        }


        e.Display();
        */









    }
}

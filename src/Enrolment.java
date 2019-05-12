import java.util.HashMap;
import java.util.List;

public class Enrolment {
    private HashMap<Student,Department> enrolment;
    public Enrolment()
    {
        enrolment=new HashMap<>();


    }

    public void enrol(String name,Department department)
    {
        Student student=new Student(name);
        enrolment.put(student,department);
    }
    
    public void Display(){
        System.out.println(enrolment);
    }

}

import java.util.LinkedList;
import java.util.List;

public class Faculties {
    private String name;
    private List<Department> departments;
    public Faculties(String name)
    {
        this.name=name;
        this.departments=new LinkedList<>();
    }
    public Faculties(Faculties f)
    {
        this.name=f.name;
        this.departments=f.departments;
    }
    public void addDepartment(String name)
    {
        Department department=new Department(name);
        this.departments.add(department);
    }
    public String getName()
    {
        return this.name;
    }
    public List<Department> getDepartments()
    {
        return this.departments;
    }

}



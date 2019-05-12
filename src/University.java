import java.util.LinkedList;
import java.util.List;

public class University {

    private String name;
    private List<Faculties> faculties;
    public University(String name){
        this.name=name;
        faculties=new LinkedList<>();
    }

    public void addFacultie(String name) {
        Faculties facultie=new Faculties(name);
        this.faculties .add(facultie);
    }
    public Faculties getFacultie(String name)
    {
        Faculties f = null;
        for (Faculties facultie:faculties)
        {
            if(facultie.getName().equals(name))
            {
                 f=new Faculties(facultie);
            }
        }
        return f;
    }

    public List<Faculties> getFaculties()
    {
        return this.faculties;
    }
}

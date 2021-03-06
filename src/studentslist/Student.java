package studentslist;

/*
 * Justin Fong
 * Student ID: 991503432
 */

/**
 *
 * @author USER
 */
public class Student {
    
    private String name;
    private int id;
    private String DoB;
    
    public Student()
    {
        name = "Not Set";
        id = 0;   
    }
    
    public Student(String givenName, int givenId)
    {
        name= givenName;
        id = givenId;
    }
    
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setId(int givenId)
    {
        id = givenId;
    }
    
    public int getId()
    {
        return id;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
}

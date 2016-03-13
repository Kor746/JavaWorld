//Name: Daniel Lee
//This file contains all the necessary methods required to run the program
import java.util.Objects;



public class Course implements Comparable<Course>{
    //These are the 4 instance variables with private access modifier
    private String id;
    private String title;
    private int credit;
    private String category;
    //This constructor initializes all instance variables
    public Course()
    {
        set("", "", 0, "");
        
    }
    //This constructor takes 4 arguments
    public Course(String id, String title, int credit, String category)
    {
        set(id,title,credit,category);
    }
    //These are all the getters and setters for each instance variable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void set(String id, String title, int credit, String category)
    {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.category = category;
    }
    //This method translates to hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }
    //if 2 courses have the same id, they are equal
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Course)
        {
            
            return this.id.equals(((Course)obj).getId());
        }
        else 
        {
            
            return this == obj;
        }
    }
    //Override toString method to return a string in a specific format
    @Override
    public String toString() {
        return "Course(" + id + ", " + title + ")";
    }
    
    //Overrides the compareTo method in Comparable interface to compare id's
    @Override
    public int compareTo(Course obj)
    {
        return this.id.compareTo(obj.getId());
    }
    
}

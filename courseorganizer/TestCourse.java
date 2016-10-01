//Name: Daniel Lee
//This file contains the main method to execute the program
//This file creates and fills an ArrayList, then sorts elements by Id and Title
import java.util.*;


public class TestCourse {
    
    public static void main(String[] args)
    {
        //Creates ArrayList with Course type
        ArrayList<Course> courses = new ArrayList<>();
        //Stores 5 course elements into ArrayList
        courses.add(new Course("SYST10199","Web Programming",3, "SYSTEM"));
        courses.add(new Course("SYST15892","Interaction Design",3, "System"));
        courses.add(new Course("MEDA14099","Introduction to Art of Cinema",
                3,"MEDIA"));
        courses.add(new Course("PROG24178","Object Oriented Programming 2 - Java"
                ,6,"PROGRAMMING"));
        courses.add(new Course("SYST13416","Linux/UNIX-Operating Systems",3,
                "SYSTEM"));
        
        //Prints ArrayList elements before sorting
        System.out.println("************BEFORE SORTING*************");
        for(int i = 0; i < courses.size(); ++i)
        {
            System.out.println(i + ": " + courses.get(i));
        }
        //Prints and sorts ArrayList elements by id in descending order
        System.out.println("************SORT BY ID*************");
        
        Collections.sort(courses, Collections.reverseOrder());
        
        for(int i = 0; i < courses.size(); ++i)
        {
            System.out.println(i + ": " + courses.get(i));
        }
        //Prints and sorts ArrayList elements by title in descending order
        System.out.println("************SORT BY TITLE*************");
        //implements Comparator interface using anonymous inner class
        Collections.sort(courses, new Comparator<Course>() 
        {
            
            @Override
            public int compare(Course x,Course y)
            {
                return y.getTitle().compareTo(x.getTitle());
            } 
        });
        for(int i = 0; i < courses.size(); ++i)
        {
            System.out.println(i + ": " + courses.get(i));
        }
       
    }
    
}

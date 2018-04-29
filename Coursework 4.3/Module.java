import java.util.*;

class Module
{
    private ArrayList<Student> people = new ArrayList<>();
    private int passingMark = 40;
    private int passing = 0;
    private int failing = 0;
    private int top = 0;
    private int sum = 0;
    private String topName;

    /**
     * Add a student
     * @param student A students details
     */
    public void add( Student student )
    {
        people.add( student );

        if(student.getMark() > top) {
            top = student.getMark();
            topName = student.getName();
        }

    }

    /**
     * Return the number of students who pass this module
     * @return Number of students who have passed
     */
    public int pass()
    {
        // Fill in code for the metho
        int count = 0;
        for ( int i=0; i < people.size(); i++)
        {
            int mark = people.get(i).getMark();
            if (mark >= 40){
                count = count + 1;
            }
        }
        return count;
    }

    /**
     * Return the number of students who fail this module
     * @return Number of students who have failed
     */
    public int fail()
    {
        // Fill in code for the method
        int count = 0;
        for ( int i=0; i < people.size(); i++)
        {
            int mark = people.get(i).getMark();
            if (mark < 40){
                count = count + 1;
            }
        }

        return count;

    }

    /**
     * Return the name of the student with the highest mark
     *  There will only be 1 students who has the highest mark
     * @return Name of the student with the highest mark.
     */
    public String top()
    {
        return topName;
    }

    /**
     * Return the average mark of students on the module
     * @return The average mark
     */
    public double average()
    {
        // Fill in code for the method
        double average = 0.0;
        for (int i = 0; i < people.size(); i++)  {
            average += people.get(i).getMark() ; 
        }
        return average/people.size();
    }
}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Classroom {
    private String id;
    private Course course;
    private List<Student> participants = new ArrayList<>();
    private String room;
    private String term;

    public Classroom(Course course, String room) {
        this.course = course;
        this.room = room;
        Date date = new Date();
        this.setTerm(date);
        this.id = course.getID() + "-" + this.term;
    }

    public Classroom(Course course, String room, Date date) {
        this.course = course;
        this.room = room;
        this.setTerm(date);
        this.id = course.getID() + "-" + this.term;        
    }

    public Course getCourse() { return this.course; }

    public String getRoom() { return this.room; }
    
    public void setRoom(String room) { this.room = room; }

    public String getTerm() { return this.term; }
    private void setTerm(Date date) {
        //Getting month from date
        date = new Date();
        DateFormat df = new SimpleDateFormat("yy");
        Calendar cal = Calendar.getInstance();
        //get formatted year for WS
        int formattedYear = Integer.parseInt( df.format(cal.getTime()) );
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        //setting term
        if ( month >= 3 && month <=9 ) {
            this.term = "SS"+cal.get(Calendar.YEAR); 
        } else {
            this.term = "WS"+cal.get(Calendar.YEAR) + "/" + (formattedYear + 1);
        }
    }

    public String getID() { return this.id; }

    public void addStudent(Student student) { this.participants.add(student); }

    public String getParticipantsEmail() {
        // Using Iterator to iterate through participants list of objects i.e Students
        Iterator<Student> iter = this.participants.iterator();
        String allEmails = "";
        while(iter.hasNext()) {
            Student stu = iter.next();
            allEmails = allEmails + stu.getFQUN() + (iter.hasNext() ? ", " : ""); 
        }
        return allEmails;
    }

    public int getTotalParticipants() { return this.participants.size(); }

    // public static void main(String[] args) {
    //     Professor prof1 = new Professor("xye", "X", "Ye");
    //     Course oop = new Course("EL-2309", "Object Oriented Programming", prof1, 5);
    //     Classroom oop_class = new Classroom(oop, "Webex");
    //     System.out.println(prof1.getFQUN());
    //     System.out.println(oop_class.getTerm());
    //     System.out.println(oop_class.getID());
    //     Student student1 = new Student("A", "B");
    //     student1.setStudyCourse(StudyCourse.ME);
    //     System.out.println(student1.getFQUN());
    //     // oop_class.addStudent(student1);
    //     List<Student> par = new ArrayList<>();
    //     par.add(student1);
        
        
    //     while (iter.hasNext()) {
    //         Student stu = iter.next();
    //         System.out.println(stu.getFQUN());
    //     }
        

        
    // }
}

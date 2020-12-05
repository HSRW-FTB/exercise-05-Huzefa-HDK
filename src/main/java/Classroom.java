import java.util.*;

public class Classroom {
    private String id;
    private Course course;
    private List<Student> participants;
    private String room;
    private String term;

    public Classroom(Course course, String room) {
        this.course = course;
        this.room = room;
    }

    public Classroom(Course course, String room, Date date) {
        this.course = course;
        this.room = room;
    }

    public Course getCourse() { return this.course; }

    public String getRoom() { return this.room; }
    
    public void setRoom(String room) { this.room = room; }

    public String getTerm() { return this.term; }

    public String getID() { return this.id; }

    public void addStudent(Student student) { this.participants.add(student); }

    public String getParticipantsEmail() {  return this.id + "@student.hsrw"; }

    public int getTotalParticipants() { return this.participants.size(); }
}

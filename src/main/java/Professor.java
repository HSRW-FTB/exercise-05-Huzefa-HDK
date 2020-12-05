import java.util.Date;


enum Faculty { TUB, LS, GO, KU }
enum Campus { KLE, KL }

public class Professor extends User {
    private Faculty faculty;
    private Campus campus;
    private int phone;

    public Professor(String id, String firstname, String lastname){
        super(id, Domain.STAFF, firstname, lastname);
        this.faculty = Faculty.TUB;
    }

    public Professor(String id, String firstname, String lastname, Date birthdate){
        super(id, Domain.STAFF, firstname, lastname, birthdate);
        this.faculty = Faculty.TUB;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
        if (this.faculty == Faculty.KU) {
            this.campus = Campus.KL;
        } else {
            this.campus = Campus.KLE;
        }
    }
    public Faculty getFaculty() {
        return this.faculty;
    }

    public String getFacultyString() {
        switch (this.faculty) {
            case TUB:
                return "Technology and Bionics";
            case LS:
                return "Life Sciences";
            case GO:
                return "Society and Economics";
            case KU:
                return "Communication and Environment";
            default:
                return "-";
        }
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getPhone() {
        if (this.campus == Campus.KLE) {
            return "+49 2821 806 73 " + this.phone;
        } else {
            return "+49 2842 908 " + this.phone;
        }
    }


}

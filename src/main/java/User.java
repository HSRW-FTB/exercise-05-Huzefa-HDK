import java.util.Date;

enum Domain {
    STAFF,
    STUDENT
}

public class User {
    private String id;
    private String lastname;
    private String firstname;
    private Date birthdate;
    private Domain domain;
    
    protected User (String id, Domain domain, String firstname, String lastname) {
        this.id = id;
        this.domain = domain;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    protected User (String id, Domain domain, String firstname, String lastname, Date birthdate) {
        this.id = id;
        this.domain = domain;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String getFirstName() { return this.firstname; }
    public void setFirstName(String fname) { this.firstname = fname; }

    public String getLastName() { return this.lastname; }
    public void setLastName(String lname) { this.lastname = lname; }
    
    public String getID() { return this.id; } 
    
    public Date getBirthDate() { return this.birthdate; } 
    public void setBirthDate(Date bdate) { this.birthdate = bdate; } 
    
    public Domain getDomain() { return this.domain; }

    public String getFQUN() {
        if (this.domain == Domain.STUDENT) {
            return this.id + "@student.hsrw";            
        } else {
            return this.id + "@staff.hsrw";
        }
    }
}

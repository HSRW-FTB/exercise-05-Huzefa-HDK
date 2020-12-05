    // Implement your Student class here

    import java.util.Date;



    public class Student extends User {
        // int id;
        private static int idGen = 10000;
        // String lastname;
        // String firstname;
        // Date birthdate;
        private Course studycourse;
         
        
        public Student(String fname, String lname) {
            super(Integer.toString(idGen), Domain.STUDENT, fname, lname);
            idGen++;
        }

        public Student(String fname, String lname, Date bdate) {
            super(Integer.toString(idGen), Domain.STUDENT, fname, lname, bdate);
            idGen++;
        }
        
        // String getID() { return Integer.toString(this.id); } 
        
        public Course getStudyCourse() { return studycourse; }
        public String getStudyCourseDescription() {
            studycourse = getStudyCourse();
            switch(studycourse) {
                case ME:
                    return "Mechanical Engineering, B.Sc.";
                case MSE:
                    return "Mechatronic Systems Engineering, B.Sc.";
                case IE:
                    return "Industrial Engineering, B.Sc.";
                case EL:
                    return "Electrical Engineering, B.Sc.";
                case BMS:
                    return "Biomaterials Science, B.Sc.";    
                case SCB:
                    return "Science Communication & Bionics, B.Sc.";
                case MME: 
                    return "Mechanical Engineering, M.Sc.";
                case MBB:
                    return "Bionics/Biomimetics, M.Sc.";
                default:
                    return "-";
            }   
        } 

        public void setStudyCourse(Course sc) {
            studycourse = sc;
        } 
        public void setStudyCourse(String scStr) {
            studycourse =  Course.valueOf(scStr);
        }
        // public static void main(String[] args){
        //     // Create a student object
        //     Student std1 = new Student();
        //     std1.setFirstName("Huzefa");
        //     std1.setLastName("Mustafa");
        //     // Date date = new Date();
        //     // SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        //     // date = dateFormat.parse("08.12.1994");
        //     // std1.setBirthDate(date);
        //     // std1.setStudyCourse("MSE");
        //     // Getting the object details
        //     System.out.println("ID: " + std1.getID() );
        //     System.out.println("First Name: " + std1.getFirstName());
        //     System.out.println("Last Name: " + std1.getLastName());
        //     // System.out.println("DoB: " + std1.getBirthDate());
        //     // System.out.println("Study Course: " + std1.getStudyCourseDescription());
            
        // }
    }
    
    
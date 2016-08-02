
public class Candidate {

    private String firstName;
    private String lastName;
    private String name;
    private String status;
    private String email;
    private String phone;
    private String primarySkills;
    private String comments;
    private String educationDegree;
    private String employeeType;
    private String businessSectors;
    private String header = "firstName,lastName,name,status,email,phone,primarySkills.name,comments,educationDegree,employeeType,businessSectors.Name";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();

    public Candidate(){

        this.firstName = "Test";
        this.lastName = "Candidate";
        this.name = firstName+" "+lastName;
        this.status = constants.candidateStatus[rand.randInt(0,7)];
        this.email = "test@example.com";
        this.phone = rand.randString(100,999)+"-"+rand.randString(100,999)+"-"+rand.randString(1000,9999);
        this.primarySkills = constants.candidatePrimarySkills[rand.randInt(0,constants.candidatePrimarySkills.length-1)];
        this.comments = "This is a comment about a Candidate";
        this.educationDegree = constants.educationDegree[rand.randInt(0,constants.educationDegree.length-1)];
        this.employeeType = constants.employeeType[rand.randInt(0,constants.employeeType.length-1)];
        this.businessSectors = constants.businessSectors[rand.randInt(0,constants.businessSectors.length-1)];
    }

    public String getHeader(){
        return header;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getPhone() {
        return phone;
    }

    public String getPrimarySkills() {
        return primarySkills;
    }

    public String getComments() {
        return comments;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public String getBusinessSectors() {
        return businessSectors;
    }
}

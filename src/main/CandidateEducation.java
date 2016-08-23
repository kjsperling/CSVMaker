package main;



public class CandidateEducation {

    private String candidateID;
    private String startDate;
    private String endDate;
    private String graduationDate;
    private String comments;
    private String school;
    private String cityState;
    private String gpa;
    private String degree;
    private String header = "candidate.id,startDate,endDate,graduationDate,comments,school,city,state,gpa,degree";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();
    int educationDate = rand.randInt(1970,2010);

    public CandidateEducation() {

        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.startDate = "9/"+Integer.toString(rand.randInt(1,10))+"/"+Integer.toString(educationDate)+" 00:00";
        this.endDate = "5/"+rand.randString(20,31)+"/"+Integer.toString(educationDate+rand.randInt(4,5))+" 00:00";
        this.graduationDate = endDate;
        this.comments = "This is a Candidate Education comment";
        this.school = constants.schools[rand.randInt(0,constants.schools.length-1)];
        this.cityState = constants.cityStates[rand.randInt(0,constants.cityStates.length-1)];
        this.gpa = rand.randString(2,3)+"."+rand.randString(10,99);
        this.degree = constants.collegeDegree[rand.randInt(0,constants.collegeDegree.length-1)];
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getComments() {
        return comments;
    }

    public String getSchool() {
        return school;
    }

    public String getCityState() {
        return cityState;
    }

    public String getGpa() {
        return gpa;
    }

    public String getDegree() {
        return degree;
    }

    public String getHeader() {
        return header;
    }
}

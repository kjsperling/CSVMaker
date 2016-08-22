package main;


public class Placement {

    private String jobOrderID;
    private String candidateID;
    private String dateBegin;
    private String payrate;
    private String employmentType;
    private String header = "jobOrder.id,candidate.id,dateBegin,payRate,employmentType";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();

    public Placement() {
        this.jobOrderID = constants.jobOrderIDs[rand.randInt(0,constants.jobOrderIDs.length-1)];
        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length-1)];
        this.dateBegin = rand.randDate();
        this.payrate = rand.randString(10000,100000);
        this.employmentType = constants.employmentType[rand.randInt(0,constants.employmentType.length-1)];
    }

    public String getJobOrderID() {
        return jobOrderID;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public String getPayrate() {
        return payrate;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getHeader() {
        return header;
    }
}

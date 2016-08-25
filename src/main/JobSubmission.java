package main;


public class JobSubmission {
    private String candidateID;
    private String jobOrderID;
    private Integer payRate;
    private Integer billRate;
    private String source;
    private String status;
    private String dateAdded;
    private String header = "candidate.id,jobOrder.id,payRate,billRate,source,status,dateAdded";

    RandomNumberGen rand = new RandomNumberGen();
    Constants constants = new Constants();

    public JobSubmission() {

        this.candidateID = constants.candidateIDs[rand.randInt(0,constants.candidateIDs.length - 1)];
        this.jobOrderID = constants.jobOrderIDs[rand.randInt(0,constants.jobOrderIDs.length-1)];
        this.payRate = rand.randInt(1, 100);
        this.billRate = payRate+rand.randInt(1, 50);
        this.source = constants.submissionSource[rand.randInt(0,constants.submissionSource.length-1)];
        this.status = constants.submissionStatus[rand.randInt(0,constants.submissionStatus.length-1)];
        this.dateAdded = rand.randDate();
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getJobOrderID() {
        return jobOrderID;
    }

    public Integer getPayRate() {
        return payRate;
    }

    public Integer getBillRate() {
        return billRate;
    }

    public String getSubmissionSource() {
        return source;
    }

    public String getSubmissionStatus() {
        return status;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public String getHeader() {
        return header;
    }
}
